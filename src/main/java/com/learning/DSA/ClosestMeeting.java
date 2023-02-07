package com.learning.DSA;

import java.util.*;

class Pair {
    int node ;
    int dis ;
    Pair(int node , int dis){
        this.node = node;
        this.dis = dis;
    }
}

public class ClosestMeeting {

    /*
        Resturns the distance from node
     */
    private void findDist(int node , int[] dist , List<List<Integer>> adjList){

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.dis - b.dis);
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[node] = 0 ;
        pq.add(new Pair(node,dist[node]));
        while(!pq.isEmpty()) {
            Pair top = pq.poll();
            int curNode = top.node;
            int curDis = top.dis;
            for (int adjNode : adjList.get(curNode)) {
                if (curDis + 1 < dist[adjNode]) {
                    dist[adjNode] = curDis + 1;
                    pq.add(new Pair(adjNode, dist[adjNode]));
                }
            }
        }
    }
    public void sortColors(int[] nums) {

        int len = nums.length ;
        int low = 0 ;
        int mid = 0 ;
        int high = len - 1 ;

        while(mid <= high){

            if(nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;

            }


        }


    }

    public int closestMeetingNode(int[] edges , int node1 , int node2) {

        int len = edges.length;
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0 ; i < len ; i++){
            adjList.add(new ArrayList<>());
        }
        int u = 0 ;
        for(int edge : edges){
            int v = edge;
            if(v != -1){
                adjList.get(u).add(v);
            }
            u++;
        }

        int[] dist1 = new int[len];
        int[] dist2 = new int[len];
        findDist(node1,dist1,adjList);
        findDist(node2,dist2,adjList);
        int answer = -1 ;
        int currentMax = Integer.MAX_VALUE;
        for(int i = 0 ; i < len ; i++){
            if(dist1[i] != Integer.MAX_VALUE && dist2[i] != Integer.MAX_VALUE){
                if(Math.max(dist1[i] , dist2[i]) < currentMax ){
                    answer = i ;
                    currentMax = Math.max(dist1[i] , dist2[i]);
                }
            }
        }
        return answer;

    }

}
