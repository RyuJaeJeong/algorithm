package greedy;

import java.util.Comparator;

public class Meeting implements Comparator<Meeting> {

    //field
    int startTime;
    int endTime;

    //cons
    public Meeting(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Meeting() {

    }

    //method
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

    @Override
    public String toString() {
        return "Meeting{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    @Override
    public int compare(Meeting o1, Meeting o2) {
        if(o1.getEndTime() > o2.getEndTime()){
            return 1;
        }else if(o1.getEndTime() == o2.getEndTime()){
            if(o1.getStartTime() > o1.getStartTime()){
                return 1;
            }else{
                return -1;
            }
        }else if(o1.getEndTime() < o2.getEndTime()){
            return -1;
        }

        return 0;
    }
}
