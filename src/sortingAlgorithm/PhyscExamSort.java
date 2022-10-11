package sortingAlgorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhyscExamSort {

    //Data class like vo, dto...etc
    static class PhyscData{

        //field(클래스의 구성요소)
        String name;
        int height;
        double vision;
        
        //생성자
        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
        
        //toString(로깅용.. 생략하셔도 무방)
        @Override
        public String toString() {
            return "PhyscData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }

        static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData>{
            @Override
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ? 1 : (d1.height<d2.height)? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhyscData[] x = {
            new PhyscData("강민하", 162, 0.3),
            new PhyscData("김찬우", 174, 0.7),
            new PhyscData("박준서", 173, 2.0),
            new PhyscData("유서범", 171, 1.5),
            new PhyscData("이수연", 168, 0.4),
            new PhyscData("장경오", 152, 1.2),
            new PhyscData("황치안", 169, 0.8),
        };

        /* 정렬을 할 배열, 정렬조건  */
        Arrays.sort(x, PhyscData.HEIGHT_ORDER);
        System.out.println("■ 신체검사 리스트 ■");
        System.out.println("이름     키     시력");
        System.out.println("------------------");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
        }
    }
}
