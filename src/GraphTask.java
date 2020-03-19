import java.util.*;

/** Container class to different classes, that makes the whole
 * set of classes one class formally.
 */
public class GraphTask {

   /** Main method. */
   public static void main (String[] args) {
      GraphTask a = new GraphTask();
      a.run();
   }

   /** Actual main method to run examples and everything. */
   public void run() {
      // Graph G0
      Graph g0 = new Graph("G0");
      g0.createVertex("v0");

      System.out.println(g0);
      System.out.println("Graph " + g0.id + " is strongly connected: " + g0.isStronglyConnected());

      // Graph G1.
      Graph g1 = new Graph("G1");
      int n = 3;
      Vertex[] varray = new Vertex[n];

      for (int i = 0; i < n; i++) {
         Vertex v = g1.createVertex("v" + i);
         varray[i] = v;
      }

      g1.createArc("a" + varray[0].toString() + "_" + varray[1].toString(), varray[0], varray[1]);
      g1.createArc("a" + varray[1].toString() + "_" + varray[2].toString(), varray[1], varray[2]);
      g1.createArc("a" + varray[2].toString() + "_" + varray[0].toString(), varray[2], varray[0]);

      System.out.println(g1);
      System.out.println("Graph " + g1.id + " is strongly connected: " + g1.isStronglyConnected());

      // Graph G2
      Graph g2 = new Graph("G2");
      n = 6;
      varray = new Vertex[n];

      for (int i = 0; i < n; i++) {
         Vertex v = g2.createVertex("v" + i);
         varray[i] = v;
      }

      g2.createArc("a" + varray[0].toString() + "_" + varray[1].toString(), varray[0], varray[1]);
      g2.createArc("a" + varray[0].toString() + "_" + varray[2].toString(), varray[0], varray[2]);
      g2.createArc("a" + varray[2].toString() + "_" + varray[3].toString(), varray[2], varray[3]);
      g2.createArc("a" + varray[2].toString() + "_" + varray[4].toString(), varray[2], varray[4]);
      g2.createArc("a" + varray[4].toString() + "_" + varray[5].toString(), varray[4], varray[5]);

      System.out.println(g2);
      System.out.println("Graph " + g2.id + " is strongly connected: " + g2.isStronglyConnected());

      // Graph G3
      Graph g3 = new Graph("G3");
      n = 6;
      varray = new Vertex[n];

      for (int i = 0; i < n; i++) {
         Vertex v = g3.createVertex("v" + i);
         varray[i] = v;
      }

      g3.createArc("a" + varray[0].toString() + "_" + varray[2].toString(), varray[0], varray[2]);
      g3.createArc("a" + varray[2].toString() + "_" + varray[1].toString(), varray[2], varray[1]);
      g3.createArc("a" + varray[1].toString() + "_" + varray[0].toString(), varray[1], varray[0]);
      g3.createArc("a" + varray[1].toString() + "_" + varray[3].toString(), varray[1], varray[3]);
      g3.createArc("a" + varray[3].toString() + "_" + varray[1].toString(), varray[3], varray[1]);
      g3.createArc("a" + varray[3].toString() + "_" + varray[4].toString(), varray[3], varray[4]);
      g3.createArc("a" + varray[4].toString() + "_" + varray[5].toString(), varray[4], varray[5]);
      g3.createArc("a" + varray[5].toString() + "_" + varray[3].toString(), varray[5], varray[3]);

      System.out.println(g3);
      System.out.println("Graph " + g3.id + " is strongly connected: " + g3.isStronglyConnected());

      // Graph G4
      Graph g4 = new Graph("G4");
      n = 5;
      varray = new Vertex[n];

      for (int i = 0; i < n; i++) {
         Vertex v = g4.createVertex("v" + i);
         varray[i] = v;
      }

      g4.createArc("a" + varray[0].toString() + "_" + varray[1].toString(), varray[0], varray[1]);
      g4.createArc("a" + varray[1].toString() + "_" + varray[2].toString(), varray[1], varray[2]);
      g4.createArc("a" + varray[2].toString() + "_" + varray[3].toString(), varray[2], varray[3]);
      g4.createArc("a" + varray[2].toString() + "_" + varray[4].toString(), varray[2], varray[4]);
      g4.createArc("a" + varray[3].toString() + "_" + varray[0].toString(), varray[3], varray[0]);
      g4.createArc("a" + varray[4].toString() + "_" + varray[2].toString(), varray[4], varray[2]);

      System.out.println(g4);
      System.out.println("Graph " + g4.id + " is strongly connected: " + g4.isStronglyConnected());

      // Graph G5
      Graph g5 = new Graph("G5");
      n = 5;
      varray = new Vertex[n];

      for (int i = 0; i < n; i++) {
         Vertex v = g5.createVertex("v" + i);
         varray[i] = v;
      }

      g5.createArc("a" + varray[0].toString() + "_" + varray[1].toString(), varray[0], varray[1]);
      g5.createArc("a" + varray[1].toString() + "_" + varray[2].toString(), varray[1], varray[2]);
      g5.createArc("a" + varray[2].toString() + "_" + varray[3].toString(), varray[2], varray[3]);
      g5.createArc("a" + varray[3].toString() + "_" + varray[0].toString(), varray[3], varray[0]);
      g5.createArc("a" + varray[4].toString() + "_" + varray[2].toString(), varray[4], varray[2]);

      System.out.println(g5);
      System.out.println("Graph " + g5.id + " is strongly connected: " + g5.isStronglyConnected());

      // Random directed graph G6
      Graph g6 = new Graph("G6");
      n = 2000;
      int m = 2500;
      g6.createRandomDirectedGraph(n, m);
      System.out.println();
      System.out.println("Graph " + g6.id + " is with " + n + " vertices and " + m + " edges.");

      // Check execution time of G6
      long startTime = System.currentTimeMillis();
      g6.isStronglyConnected();
      long estimatedTime = System.currentTimeMillis() - startTime;
      System.out.println("Execution time of graph " + g6.id + ": " + estimatedTime + "ms");

      // Random undirected graph G7
      Graph g7 = new Graph("G7");
      n = 2000;
      m = 2500;
      g7.createRandomSimpleGraph(n, m);
      System.out.println();
      System.out.println("Graph " + g7.id + " is with " + n + " vertices and " + m + " edges.");

      // Check execution time of G7
      startTime = System.currentTimeMillis();
      g7.isStronglyConnected();
      estimatedTime = System.currentTimeMillis() - startTime;
      System.out.println("Execution time of graph " + g7.id + ": " + estimatedTime + "ms");
   }

   class Vertex {

      private String id;
      private Vertex next;
      private Arc first;
      private int info = 0;

      Vertex (String s, Vertex v, Arc e) {
         id = s;
         next = v;
         first = e;
      }

      Vertex (String s) {
         this (s, null, null);
      }

      @Override
      public String toString() {
         return id;
      }

   }


   /** Arc represents one arrow in the graph. Two-directional edges are
    * represented by two Arc objects (for both directions).
    */
   class Arc {

      private String id;
      private Vertex target;
      private Arc next;
      private int info = 0;

      Arc (String s, Vertex v, Arc a) {
         id = s;
         target = v;
         next = a;
      }

      Arc (String s) {
         this (s, null, null);
      }

      @Override
      public String toString() {
         return id;
      }
   }


   class Graph {

      private String id;
      private Vertex first;
      private int info = 0;

      Graph (String s, Vertex v) {
         id = s;
         first = v;
      }

      Graph (String s) {
         this (s, null);
      }

      @Override
      public String toString() {
         String nl = System.getProperty ("line.separator");
         StringBuffer sb = new StringBuffer (nl);
         sb.append (id);
         sb.append (nl);
         Vertex v = first;
         while (v != null) {
            sb.append (v.toString());
            sb.append (" -->");
            Arc a = v.first;
            while (a != null) {
               sb.append (" ");
               sb.append (a.toString());
               sb.append (" (");
               sb.append (v.toString());
               sb.append ("->");
               sb.append (a.target.toString());
               sb.append (")");
               a = a.next;
            }
            sb.append (nl);
            v = v.next;
         }
         return sb.toString();
      }

      public Vertex createVertex (String vid) {
         Vertex res = new Vertex (vid);
         res.next = first;
         first = res;
         return res;
      }

      public Arc createArc (String aid, Vertex from, Vertex to) {
         Arc res = new Arc (aid);
         res.next = from.first;
         from.first = res;
         res.target = to;
         return res;
      }

      /**
       * Create a connected undirected random tree with n vertices.
       * Each new vertex is connected to some random existing vertex.
       * @param n number of vertices added to this graph
       */
      public void createRandomTree (int n) {
         if (n <= 0)
            return;
         Vertex[] varray = new Vertex [n];
         for (int i = 0; i < n; i++) {
            varray [i] = createVertex ("v" + String.valueOf(n-i));
            if (i > 0) {
               int vnr = (int)(Math.random()*i);
               createArc ("a" + varray [vnr].toString() + "_"
                  + varray [i].toString(), varray [vnr], varray [i]);
               createArc ("a" + varray [i].toString() + "_"
                  + varray [vnr].toString(), varray [i], varray [vnr]);
            } else {}
         }
      }

      /**
       * Create an adjacency matrix of this graph.
       * Side effect: corrupts info fields in the graph
       * @return adjacency matrix
       */
      public int[][] createAdjMatrix() {
         info = 0;
         Vertex v = first;
         while (v != null) {
            v.info = info++;
            v = v.next;
         }
         int[][] res = new int [info][info];
         v = first;
         while (v != null) {
            int i = v.info;
            Arc a = v.first;
            while (a != null) {
               int j = a.target.info;
               res [i][j]++;
               a = a.next;
            }
            v = v.next;
         }
         return res;
      }

      /**
       * Create a connected simple (undirected, no loops, no multiple
       * arcs) random graph with n vertices and m edges.
       * @param n number of vertices
       * @param m number of edges
       */
      public void createRandomSimpleGraph (int n, int m) {
         if (n <= 0)
            return;
         if (n > 2500)
            throw new IllegalArgumentException ("Too many vertices: " + n);
         if (m < n-1 || m > n*(n-1)/2)
            throw new IllegalArgumentException 
               ("Impossible number of edges: " + m);
         first = null;
         createRandomTree (n);       // n-1 edges created here
         Vertex[] vert = new Vertex [n];
         Vertex v = first;
         int c = 0;
         while (v != null) {
            vert[c++] = v;
            v = v.next;
         }
         int[][] connected = createAdjMatrix();
         int edgeCount = m - n + 1;  // remaining edges
         while (edgeCount > 0) {
            int i = (int)(Math.random()*n);  // random source
            int j = (int)(Math.random()*n);  // random target
            if (i==j) 
               continue;  // no loops
            if (connected [i][j] != 0 || connected [j][i] != 0) 
               continue;  // no multiple edges
            Vertex vi = vert [i];
            Vertex vj = vert [j];
            createArc ("a" + vi.toString() + "_" + vj.toString(), vi, vj);
            connected [i][j] = 1;
            createArc ("a" + vj.toString() + "_" + vi.toString(), vj, vi);
            connected [j][i] = 1;
            edgeCount--;  // a new edge happily created
         }
      }

      /**
       * Create a random directed graph with n vertices and m edges.
       * @param n number of vertices
       * @param m number of edges
       */
      private void createRandomDirectedGraph(int n, int m) {
         Vertex[] varray = new Vertex[n];

         for (int i = 0; i < n; i++) {
            Vertex v = createVertex("v" + i);
            varray[i] = v;
         }

         int[][] adjMatrix = createAdjMatrix();

         while (m > 0) {
            int i = (int)(Math.random() * n);
            int j = (int)(Math.random() * n);
            if (i == j) continue;
            if (adjMatrix[i][j] != 0 || adjMatrix[j][i] != 0) continue;
            Vertex vi = varray[i];
            Vertex vj = varray[j];
            createArc ("a" + vi + "_" + vj, vi, vj);
            m--;
         }
      }

      private int getTotalVertices() {
         return createAdjMatrix().length;
      }

      /**
       * Transpose adjacency matrix of this graph.
       * @return transposed adjacency matrix
       */
      public int[][] createTransposedAdjMatrix() {
         int[][] matrix = createAdjMatrix();
         int[][] transposedMatrix = new int[matrix.length][matrix.length];
         for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
               transposedMatrix[i][j] = matrix[j][i];
            }
         }

         return transposedMatrix;
      }

      /**
       * Create transposed graph of this graph.
       * @return transposed graph
       */
      private Graph transposeGraph() {
         Graph transposedGraph = new Graph(id + " Transposed");
         Vertex[] vertices = new Vertex[getTotalVertices()];

         Vertex v = first;
         int c = 0;

         while (v != null) {
            vertices[c++] = transposedGraph.createVertex(v.id);
            v = v.next;
         }

         int[][] adjMatrix = createTransposedAdjMatrix();

         for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix.length; j++) {
               if (adjMatrix[i][j] == 1) {
                  Vertex vi = vertices[i];
                  Vertex vj = vertices[j];
                  transposedGraph.createArc("a" + vi + "_" + vj, vi, vj);
               }
            }
         }

         return transposedGraph;
      }

      /**
       * Create Depth-first search (DFS) algorithm.
       * @param v Vertex
       * @return list of visited vertices.
       */
      private ArrayList<Vertex> depthFirstSearch(Vertex v) {
         ArrayList<Vertex> visited = new ArrayList<>();
         Stack<Vertex> stack = new Stack<>();

         stack.push(v);

         while (!stack.isEmpty()) {
            v = stack.pop();

            if (!visited.contains(v)) {
               visited.add(v);
               Arc a = v.first;

               while (a != null) {
                  stack.push(a.target);
                  a = a.next;
               }
            }
         }

         return visited;
      }

      /**
       * Create method that checks whether graph is strongly connected or not.
       * @return boolean true or false
       */
      public boolean isStronglyConnected() {
         int totalVertices = getTotalVertices();
         Vertex v = first;

         while (v != null) {
            if (depthFirstSearch(v).size() != totalVertices) return false;
            v = v.next;
         }

         Graph transposedGraph = transposeGraph();
         v = transposedGraph.first;

         while (v != null) {
            if (depthFirstSearch(v).size() != totalVertices) return false;
            v = v.next;
         }

         return true;
      }
   }
} 
