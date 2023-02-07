package com.learning.MultiThreadConcur.ThreadMemoryModel;

import java.util.HashMap;
import java.util.Map;

class AuthenticationManager {

    int timeToLive;
    Map<String,Integer> mp;
    public AuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
        mp = new HashMap<>();
    }

    public void generate(String tokenId, int currentTime) {
        mp.put(tokenId,currentTime+timeToLive);
    }

    public void renew(String tokenId, int currentTime) {
        if(mp.containsKey(tokenId) && (mp.get(tokenId) < currentTime) && (mp.get(tokenId) < currentTime+timeToLive) ){
            mp.put(tokenId,currentTime+timeToLive);
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        int answer = 0 ;
        for(Map.Entry<String,Integer> entry : mp.entrySet()){
            if(entry.getValue() >= currentTime)
                answer++;
        }
        return answer;
    }
}
