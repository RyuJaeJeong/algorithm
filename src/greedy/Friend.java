package greedy;

import java.util.Scanner;

public class Friend {

    //field
    static int[] input;

    //method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        input = new int[N+1];
        for (int i = 1; i <= N; i++) {
            input[i] = i;
        }

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            union(a, b);
        }

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (find(a) == find(b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public static int find(int a){
        if(a == input[a]){
            return a;
        }else{
            return input[a] = find(input[a]);
        }
    }

    public static void union(int a, int b){
        int fa = find(a);
        int fb = find(b);
        if(fa != fb) input[fa] = fb;
    }
}
