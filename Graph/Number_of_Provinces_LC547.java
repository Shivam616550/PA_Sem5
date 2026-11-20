package Graph;

public class Number_of_Provinces_LC547 {
    public static int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;
        for (int city = 0; city < n; city++) {
            if (!visited[city]) {
                provinces++;
                dfs(isConnected, visited, city);
            }
        }
        return provinces;
    }

    private static void dfs(int[][] graph, boolean[] visited, int city) {
        visited[city] = true;
        for (int next = 0; next < graph.length; next++) {
            if (graph[city][next] == 1 && !visited[next]) dfs(graph, visited, next);
        }
    }

    public static void main(String[] args) {
        int[][] connected = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(findCircleNum(connected));
    }
}
