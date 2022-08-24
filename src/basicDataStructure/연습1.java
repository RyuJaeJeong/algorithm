package basicDataStructure;

import java.util.Random;

public class 연습1 {

    public static void main(String[] args) {
        //java.util.Random에서 생성하는 난수는 의사 난수이며 선형합동법을 사용한다.
        Random random = new Random();

        int size = 0 + random.nextInt(10);
        System.out.println("사람 숫자는 " + size + "명 입니다.");

        int [] height = new int[size];
        for(int i = 0; i<height.length; i++){
            height[i] = 100 + random.nextInt(90);
        }

        System.out.println("가장 키가 큰 사람은 " + maxof(height) + " 입니다.");

    }

    public static int maxof(int[] a){
        int max = a[0];
        for (int num : a){
            if(num>max) max = num;
        }
        return max;
    }

}
