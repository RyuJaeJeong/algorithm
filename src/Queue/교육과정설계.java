package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 교육과정설계 {

    //field
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //method
    /**
     * 메인메서드
     * @param args
     */
    public static void main(String[] args) {
        try {
            String mustCourse = br.readLine();
            String myCourse = br.readLine();
            solution(mustCourse, myCourse);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 필수과목과, 내가짠 커리큘럼 비교하여 YES, NO 출력
     * @param mustCourse 필수 과목
     * @param myCourse 내가짠 커리큘럼
     */
    public static void solution(String mustCourse, String myCourse){
        int mustSize = mustCourse.length();
        int mySize = myCourse.length();
        Queue<Character> mustQueue = new LinkedList<>();
        Queue<Character> myQueue = new LinkedList<>();

        for (int i = 0; i < mustSize; i++) {
            mustQueue.add(mustCourse.charAt(i));
        }

        for (int i = 0; i < mySize; i++) {
            myQueue.add(myCourse.charAt(i));
        }

        for (int i = 0; i < mySize; i++) {
            if(mustQueue.size() == 0) break;

            char nowMust = mustQueue.peek();
            char nowMy = myQueue.peek();
            if(nowMust == nowMy){
                mustQueue.poll();
            }

            myQueue.poll();
        }

        String ans = (mustQueue.size()==0)?"YES":"NO";
        System.out.println(ans);
       

    }
}
