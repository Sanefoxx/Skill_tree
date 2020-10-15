package com.sanefox;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class BFSInfo {
    public BFSInfo() {
        this.distance = -1;
        this.predecessor = -1;
    }

    public BFSInfo(int distance, int predecessor) {
        this.distance = distance;
        this.predecessor = predecessor;
    }

    public int distance;
    public int predecessor;
};

class BFS {
    public static void main(String[] args) {
        doBFS(graph, 3);
    }
    // [[1], [0, 4, 5], [3, 4, 5], [2, 6], [1, 2], [1, 2, 6], [3, 5], []]

    public static int[][] graph = new int[][] {
            new int[] {1},
            new int[] {0,4,5},
            new int[] {3,4,5},
            new int[] {2,6},
            new int[] {1,2},
            new int[] {1,2,6},
            new int[] {3,5},
            new int[] {}
    };

    public static BFSInfo[] doBFS(int[][] graph, int source) {
        System.out.println(graph.length);
        BFSInfo[] bfsInfo = new BFSInfo[graph.length];

        bfsInfo[source] = new BFSInfo();
        bfsInfo[source].distance = 0;

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(source);
        int dist = 1;
        int pred = source;
        boolean isEnqueued = false;
        while (!q.isEmpty()) {
            q.remove();
            for (int j = 0; j < graph[pred].length; j++) {
                if (bfsInfo[graph[pred][j]] == null) {
                    q.add(graph[pred][j]);
                    bfsInfo[graph[pred][j]] = new BFSInfo(dist, pred);
                    isEnqueued = true;
                }
            }
            if (!q.isEmpty()) {
                pred = q.element();
            }
            if (isEnqueued) {
                dist++;
                isEnqueued = false;
            }
        }

        for (int i = 0; i < bfsInfo.length; i++) {
            if (bfsInfo[i] == null) {
                bfsInfo[i] = new BFSInfo();
            }
        }
        return bfsInfo;
    }
}











