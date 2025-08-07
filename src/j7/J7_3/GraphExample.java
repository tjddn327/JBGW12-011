package j7.J7_3;

import java.util.ArrayList;

public class GraphExample {
    static class Graph {
        private ArrayList<ArrayList<Integer>> adjacencyList;
        private int vertices;

        // TODO: 생성자를 작성하세요
        public Graph(int vertices) {
            this.vertices = vertices;
            this.adjacencyList = new ArrayList<>(vertices);
            for (int i = 0; i < vertices; i++) {
                adjacencyList.add(new ArrayList<>());
            }
        }

        // TODO: 간선 추가 메서드를 작성하세요 (무방향 그래프)
        public void addEdge(int source, int destination) {
            adjacencyList.get(source).add(destination);
            adjacencyList.get(destination).add(source); // 무방향 그래프
        }

        // TODO: 그래프 출력 메서드를 작성하세요
        public void printGraph() {
            for (int i = 0; i < vertices; i++) {
                System.out.print("정점 " + i + "의 인접 정점: ");
                for (int neighbor : adjacencyList.get(i)) {
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }

        // TODO: 특정 정점의 차수 반환 메서드를 작성하세요
        public int getDegree(int vertex) {
            return adjacencyList.get(vertex).size();
        }
    }

    public static void main(String[] args) {
        // TODO: 5개 정점을 가진 그래프를 생성하세요
        Graph graph = new Graph(5);

        // TODO: 다음 간선들을 추가하세요
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // TODO: 그래프를 출력하세요
        graph.printGraph();

        // TODO: 각 정점의 차수를 출력하세요
        System.out.println("\n각 정점의 차수:");
        for (int i = 0; i < 5; i++) {
            System.out.println("정점 " + i + ": " + graph.getDegree(i));
        }
    }
}