package basicAlgorithm;

public class 연습1 {

    public static void main(String[] args) {

        //1. 네 수를 비교한다.
        System.out.println("최댓값은 " + max4(1,3,2,4) + "입니다.");
        System.out.println("최댓값은 " + max4(3,3,4,4) + "입니다.");
        System.out.println("최댓값은 " + max4(1,3,5,4) + "입니다.");
        System.out.println("최댓값은 " + max4(1,3,1,4) + "입니다.");
        System.out.println("최댓값은 " + max4(1,3,6,4) + "입니다.");
        System.out.println("최댓값은 " + max4(1,3,7,4) + "입니다.");
        System.out.println("최댓값은 " + max4(1,3,8,4) + "입니다.");
        System.out.println("최댓값은 " + max4(1,3,9,4) + "입니다.");
        System.out.println("최댓값은 " + max4(1,3,0,4) + "입니다.");
        System.out.println("최댓값은 " + max4(1,3,1,4) + "입니다.");
        System.out.println("최댓값은 " + max4(1,3,2,4) + "입니다.");
        System.out.println("최댓값은 " + max4(1,3,3,4) + "입니다.");

    }

    //method
    public static int max4(int a,int b,int c, int d){
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;
        return max;
    }

}
