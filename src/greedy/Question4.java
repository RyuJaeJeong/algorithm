package greedy;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.IntStream;

class Schedule implements Comparator<Schedule> {
    //field
    private int day;
    private int pay;

    //cons
    public Schedule(int day, int pay) {
        this.day = day;
        this.pay = pay;
    }

    public Schedule() {

    }

    //method
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }


    @Override
    public int compare(Schedule o1, Schedule o2) {
        int result = 0;
        if(o1.getDay() > o2.getDay()){
            result = -1;
        }else if(o1.getDay() == o2.getDay()){
            if(o1.getPay() > o2.getPay()){
                result = -1;
            }else if(o1.getPay() == o2.getPay()){
                result = 0;
            }else{
                result = 1;
            }
        }else {
            result = 1;
        }

        return result;

    }

    @Override
    public String toString() {
        return "Schedule{" +
                "day=" + day +
                ", pay=" + pay +
                '}';
    }
}

public class Question4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int corpNumber = Integer.parseInt(sc.nextLine());
        List<Schedule> list = new ArrayList<>();
        for (int i = 0; i < corpNumber; i++) {
            String input = sc.nextLine();
            String[] inputArray = input.split(" ");
            list.add(new Schedule(Integer.parseInt(inputArray[1]), Integer.parseInt(inputArray[0])));
        }

        list.sort(new Schedule());
        int endDate = list.get(0).getDay();
        int result = 0;
        while (endDate > 0){
            PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
            for (int i = 0; i < list.size(); i++) {
                Schedule schedule = list.get(i);
                if(endDate > schedule.getDay()) break;
                pQ.offer(schedule.getPay());
            }

            if(!pQ.isEmpty()){
                int maxValue = pQ.poll();
                for (int i = 0; i < list.size(); i++) {
                    if(list.get(i).getPay() == maxValue){
                        list.remove(i);
                        break;
                    }
                }
                result += maxValue;

            }

            endDate--;
        }
        System.out.println(result);

    }

}
