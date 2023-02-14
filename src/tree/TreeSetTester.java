package tree;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTester {

    //method
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(7); //값 추가
        set.add(4); //값 추가
        set.add(9); //값 추가
        set.add(1); //값 추가
        set.add(5); //값 추가

        int size = set.size();
        System.out.printf("트리셋의 크기는 %d 입니다.\n", size);
        System.out.printf("트리셋은 %s 입니다.\n", set);
        System.out.printf("트리셋의 최댓값은 %s 입니다.\n", set.last());
        System.out.printf("트리셋의 최솟값은 %s 입니다.\n", set.first());
        System.out.printf("입력값보다 큰 데이터중 최솟값은 %s 입니다.\n", set.higher(3));
        System.out.printf("입력값보다 작은 데이터중 최댓값은 %s 입니다.\n", set.lower(3));

        Iterator iter = set.iterator();
        while(iter.hasNext()) {//값이 있으면 true 없으면 false
            System.out.println(iter.next());
        }

    }
}
