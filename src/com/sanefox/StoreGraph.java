package com.sanefox;

public class StoreGraph {

    public static int[][] edgeList = new int[][] {
            new int[] {0, 2},
            new int[] {1, 3},
            new int[] {2, 3},
            new int[] {2, 4},
            new int[] {3, 5},
            new int[] {4, 5}
    };

    // Fill in this adjMatrix to represent the graph
    public static int[][] adjMatrix = new int[][] {
            new int[] {0, 0, 1, 0, 0, 0},
            new int[] {0, 0, 0, 1, 0, 0},
            new int[] {0, 0, 0, 1, 1, 0},
            new int[] {0, 0, 0, 0, 0, 1},
            new int[] {0, 0, 0, 0, 0, 1},
            new int[] {0, 0, 0, 0, 0, 0}
    };

    public static int[][] edgeList2 = new int[][] {
            new int[] {0, 2},
            new int[] {1, 3},
            new int[] {2, 3},
            new int[] {2, 4},
            new int[] {3, 5},
            new int[] {4, 5}
    };

    // Fill in this adjList to represent the graph
    public static int[][] adjList = new int[][] {
            new int[] {2},
            new int[] {3},
            new int[] {3,4},
            new int[] {5},
            new int[] {5},
            new int[] {},
    };

//    int dist = 1;
//    while (!q.isEmpty()) {
//        for (int j = 0; j < graph[q.element()].length; j++) {
//            q.add(graph[q.element()][j]);
//            bfsInfo[graph[q.element()][j]] = new BFSInfo(dist, q.element());
//        }
//        dist++;
//        q.remove();
//    }
}
