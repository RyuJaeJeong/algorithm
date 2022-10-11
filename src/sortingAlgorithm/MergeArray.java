package sortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

//병합 정렬
public class MergeArray {
    static void merge(int[] a, int na, int[] b, int nb, int[] c){
        int pa = 0;
        int pb = 0;
        int pc = 0;

        while (pa < na && pb < nb)  // 현재의 포인터가 길이 보다 적은 위치에 있을때 작은 값을 C에 저장
            c[pc++] = (a[pa] <= b[pb]) ? a[pa++]: b[pb++];

        while (pa < na)  //a에 남아 있는 요소를 복사
            c[pc++] = a[pa++];

        while (pb < nb)  //b에 남아 있는 요소를 복사
            c[pc++] = b[pb++];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = {2, 4, 6, 8, 11, 13};
        int [] b = {1, 2, 3, 4, 9, 16, 21};
        int [] c = new int[13];

        System.out.println("두 배열을 병합");
        merge(a, a.length, b, b.length, c);

        System.out.println("배열 a와 b를 병합하여 배열 c에 저장했습니다.");
        System.out.println("배열 a: ");
        System.out.println(Arrays.toString(a));

        System.out.println("배열 b: ");
        System.out.println(Arrays.toString(b));

        System.out.println("배열 c: ");
        System.out.println(Arrays.toString(c));
    }

}
