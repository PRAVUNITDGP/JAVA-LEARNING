package com.learning.DSA;



import javax.swing.*;
import java.util.*;
public class Twitter {
        // followee -> followers List
        Map<Integer, Set<Integer>> followers;
        // Pairs of <timeStamp , tweetId>
        PriorityQueue<List<Integer>> pq ;

        //tweetId -> userID
        Map<Integer,Integer> tweets ;
        Integer timeStamp = 0 ;
        public Twitter() {
            followers = new HashMap<Integer,Set<Integer>>();
            pq = new PriorityQueue<List<Integer>>((a,b) -> a.get(0) - b.get(0));
        }

        public void postTweet(int userId, int tweetId) {
            // set tweets
            // Insert Into Priority Queue
            timeStamp++;
            List<Integer> x = new ArrayList<>();
            x.add(timeStamp);
            x.add(tweetId);
            pq.add(x);
            tweets.put(tweetId,userId);
        }

        public List<Integer> getNewsFeed(int userId) {
            // Keep popping from pq and take only 10 tweets of followers or itself if not 10 than take till its empty
            List<Integer> answer = new ArrayList<>() ;
            int noOfTweets = 0 ;
            List<List<Integer>> keepTweets = new ArrayList<>();
            while(noOfTweets != 10 || !pq.isEmpty()){
                noOfTweets++;
                List<Integer> processedTweet = pq.poll();
                keepTweets.add(processedTweet);
                int twtId = processedTweet.get(1);
                int usrId = tweets.get(twtId);
                if(usrId == userId || (followers.containsKey(userId) && followers.get(userId).contains(usrId))){
                    answer.add(twtId);
                }
            }
            for(int i=0 ; i < keepTweets.size() ; i++){
                pq.add(keepTweets.get(i));
            }
            return answer;
        }

        public void follow(int followerId, int followeeId) {
            // add to the followers list
            if(!followers.containsKey(followeeId)){
                Set<Integer> temp = new LinkedHashSet<Integer>() ;
                temp.add(followerId);
                followers.put(followeeId,temp);
            }
            else{
                followers.get(followeeId).add(followerId);
            }
        }

        public void unfollow(int followerId, int followeeId) {
            if(followers.containsKey(followeeId)){
                followers.get(followeeId).remove(followerId);
            }
        }
}
