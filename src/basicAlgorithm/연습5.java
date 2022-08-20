package basicAlgorithm;

//세 수의 중간 값을 구하기.
/***
처음 if 문의 판단
　　  if ((b >= a && c<= a) || (b <= a && c >= a)
 에 주목합니다.
  여기서 b >= a 및 b <= a의 판단을 뒤집은 판단
  (실질적으로 동일한 판단)이, 계속하여  else 이후에서
　　 else if ((a > b && c < b) || (b <= a && c > b)
  로 수행됩니다. 즉, 처음 if가 성립하지 않는 경우,
  2번째 if에서도 (실질적으로 ) 같은 판단을 수행하므로,
  효율이 나빠집니다.
* * */
public class 연습5 {
    public static void main(String[] args) {
        System.out.println("세 수의 중간값은 " + med3(3, 2, 1) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(3, 2, 2) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(3, 1, 2) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(3, 2, 3) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(2, 1, 3) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(3, 3, 2) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(3, 3, 3) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(2, 2, 3) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(2, 3, 1) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(2, 3, 2) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(1, 3, 2) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(2, 3, 3) + "입니다.");
        System.out.println("세 수의 중간값은 " + med3(1, 2, 3) + "입니다.");
    }

    public static int med3(int a, int b, int c){
        if((c<=a&&a<=b)||(b<=a&&a<=c))
            return a;
        else if((c<=b&&b<=a)||(a<=b&&b<=c))
            return b;
        else
            return c;
    }
}
