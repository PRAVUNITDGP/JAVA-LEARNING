package com.learning.MultiThreadConcur.ThreadMemoryModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MagicDictionary {

    class TrieNode{
        Map<Character,TrieNode> children = new HashMap<>();
        boolean isEnd = false;
    }
    public TrieNode root;
    public MagicDictionary() {
        root = new TrieNode();
    }
    public void buildDict(String[] dictionary) {
        for(String s : dictionary){
            TrieNode node = this.root;
            for(char c : s.toCharArray()){
                if(!node.children.containsKey(c)){
                    node.children.put(c,new TrieNode());
                }
                node = node.children.get(c);
            }
            node.isEnd = true;
        }
    }

    public boolean search(String searchWord) {

        TrieNode node = this.root;

        return magicSearch(searchWord,node,1);

    }
    public boolean magicSearch(String SearchWord,TrieNode node,int diff){

        if(diff == 0 )
            return normalSearch(node,SearchWord);
        char[] currentWord = SearchWord.toCharArray();
        for(int i=0; i < currentWord.length ; i++){
            char x = currentWord[i];
            for(char y : node.children.keySet()){
                if(y != x){
                    if(magicSearch(SearchWord.substring(i+1),node.children.get(y),diff-1 ))
                        return true;
                }
            }
            if(!node.children.containsKey(x))
                break;
            node = node.children.get(x);

        }
        return false;

    }

    public boolean normalSearch(TrieNode node , String word){
        for(char c : word.toCharArray()){
            if(!node.children.containsKey(c))
                return false;
            node = node.children.get(c);
        }
        return true;
    }


}
