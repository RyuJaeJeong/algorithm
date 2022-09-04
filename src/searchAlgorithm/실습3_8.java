package searchAlgorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//binary Search test with Comparable<T>
public class 실습3_8 {
    static class PhyscData{
        //field
        private String name;
        private int height;
        private Double vision;
        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        //cons
        public PhyscData(String name, int height, Double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        //method
        @Override
        public String toString() {
            return "PhyscData{" +
                    "name='" + name + '\'' +
                    ", height='" + height + '\'' +
                    ", vision='" + vision + '\'' +
                    '}';
        }


        private static class HeightOrderComparator implements Comparator<PhyscData> {
            @Override
            public int compare(PhyscData o1, PhyscData o2) {
                return (o1.height>o2.height)?1:(o1.height<o2.height)?-1:0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhyscData[] x = {
                new PhyscData("류재정", 170, 0.8),
                new PhyscData("류우정", 175, 1.8),
                new PhyscData("류의정", 185, 2.0),
        };

        System.out.print("키가 몇 cm인 사람을 찾고있나요? ");
        int key = sc.nextInt();
        int idx = Arrays.binarySearch(x, new PhyscData("", key, 0.0), PhyscData.HEIGHT_ORDER);
        if(idx<0) System.out.println("그런 사람 없습니다.");
        else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
            System.out.println("그 값은 " + x[idx].toString() + "입니다.");
        }
    }

}
