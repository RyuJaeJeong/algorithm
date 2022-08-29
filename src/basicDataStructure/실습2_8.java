package basicDataStructure;

import java.util.Arrays;

public class 실습2_8 {
    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;  // 2는 소수임

        for (int i = 3; i < 1001; i+=2) {
            int j;
            for (j = 1; j < ptr; j++) {
                counter++;
                if(i%prime[j] == 0) break;
            }

            if(j == ptr) prime[ptr++] = i;

        }

        System.out.println(Arrays.toString(prime));
        System.out.println("연산횟수 : " + counter);
    }
}
