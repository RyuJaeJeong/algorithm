package Greedy;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MeatingRoot {

    //field
    public static class Time implements Comparable<Time>{
        //field
        private int startTime;
        private int endTime;

        //cons
        public Time(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
        
        //내가 푼 방법
        /*@Override
        public int compareTo(@NotNull Time o) {
            return (o.startTime - this.startTime);
        }*/

        //강사가 푼 방법

        /**
         * 끝난시간 오름 차순 정렬
         * 빨리끝난 회의를 기준으로 해야, 최대한 많이 수용 할 수 있다.
         * 시작시간, 끝시간 같을 수 있음으로, 같은경우를 감안해야한다.
         */
        @Override
        public int compareTo(Time o) {
            int result;
            if(this.startTime == o.startTime){
                result = (this.endTime - o.endTime);
            }else{
                result = (this.startTime - o.startTime);
            }

            return result;
        }

        public int getStartTime() {
            return startTime;
        }

        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }

        public int getEndTime() {
            return endTime;
        }

        public void setEndTime(int endTime) {
            this.endTime = endTime;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int loopSize = Integer.parseInt(bufferedReader.readLine());
        Time[] timeArray = new Time[loopSize];
        for (int i = 0; i < loopSize; i++) {
            String [] times = bufferedReader.readLine().split(" ");
            Time time = new Time(Integer.parseInt(times[0]), Integer.parseInt(times[1]));
            timeArray[i] = time;
        }
        System.out.println(solution(timeArray));
    }

    public static int solution(Time[] array){
        Arrays.sort(array);
        int availableStartTime = array[0].getEndTime();
        int cnt = 1;
        for (int i = 1; i < array.length; i++) {
            Time time = array[i];
            if(availableStartTime <= time.startTime){
                cnt++;
                availableStartTime = time.getStartTime();
            }
        }
        return cnt;
    }


}
