package Generic;

public class UtilExample {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("홍길동", 35);
        Integer age  = Util.getValue(pair, "홍길동");

        System.out.printf("리턴 이스 %d\n", age);

        ChildPair<String, Integer> childPair = new ChildPair<>("김민수", 25);
        Integer age2  = Util.getValue(childPair, "홍길동");

        System.out.printf("리턴 이스 %d\n", (age2 != null)?age2:0);
    }
}
