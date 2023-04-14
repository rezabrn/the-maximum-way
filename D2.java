import java.util.Arrays;
import java.util.Scanner;

public class D2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of faculties");
        int n = Integer.parseInt(in.nextLine());
        boolean[][] graph = new boolean[n][n];
        String[] edges = new String[n - 1];
        System.out.println("enter the ways like this: (number of faculty_1) space (number of faculty_2)");
        for (int i = 0; i < n - 1; i++) {
            System.out.println("enter the way " + (i + 1));
            edges[i] = in.nextLine();
        }
        in.close();
        for (int i = 0; i < n - 1; i++) {
            graph[Integer.parseInt(edges[i].split(" ")[0]) - 1][Integer.parseInt(edges[i].split(" ")[1]) - 1] = true;
            graph[Integer.parseInt(edges[i].split(" ")[1]) - 1][Integer.parseInt(edges[i].split(" ")[0]) - 1] = true;
        }
        System.out.println("the max way is " + findTheLongestWay(n, graph) + "AM");
    }

    static int findTheLongestWay(int n, boolean graph[][]) {
        int maxWay = 0;
        int counter = 0;
        int temp = 0;
        int newStart = 0, newFinish = 0;
        int currentStart = 0;
        boolean flag = false;
        boolean[][] newGraph = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newGraph[i][j] = graph[i][j];
            }
        }
        for (int start = 0; start < n; start++) {
            for (int finish = 0; finish < n; finish++) {
                if (finish == temp) {
                    continue;
                }
                if (newGraph[start][finish]) {
                    newStart = start;
                    newFinish = finish;
                    counter++;
                    temp = start;
                    start = finish;
                    finish = -1;
                }
                if (finish == n - 1 || (temp == n - 1 && finish == n - 2)) {
                    for (int i = 0; i < n; i++) {
                        if (newGraph[currentStart][i] == true) {
                            break;
                        }
                        if (i == n - 1) {
                            currentStart++;
                            for (int h = 0; h < n; h++) {
                                for (int k = 0; k < n; k++) {
                                    newGraph[h][k] = graph[h][k];
                                }
                            }
                            flag = true;
                            break;
                        }
                    }
                    if (maxWay < counter) {
                        maxWay = counter;
                    }
                    if (flag) {
                        flag = false;
                        break;
                    }
                    start = currentStart;
                    if (currentStart == n - 1) {
                        return maxWay;
                    }
                    finish = -1;
                    temp = -1;
                    newGraph[newStart][newFinish] = false;
                    counter = 0;
                }
            }
        }
        return maxWay;
    }
}