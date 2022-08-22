package basicAlgorithm;

public class 연습8 {
    public static void main(String[] args) {

        System.out.println("사이의 합은 " + sumof(1, 10) + "입니다.");
        System.out.println("사이의 합은 " + sumof(10, 1) + "입니다.");

    }

    public static int sumof(int a, int b){
        int sum = 0;
        int start = (a<b)?a:b;
        int end = (a>=b)?a:b;

        for (int i = start; i <=end ; i++) {
            sum += i;
        }

        return sum;
    }
}
