package sortingAlgorithm;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 좌표정렬 {
    //field
    /*
    public static class Data{
        private int x;
        private int y;
        public static Comparator<Data> dataComparator = new Comparator<Data>() {
            @Override
            public int compare(Data o1, Data o2) {
                int result = 0;
                if(o1.getX()>o2.getX()){
                    result = 1;
                }else if(o1.getX() == o2.getX()){
                    if(o1.getY()>o2.getY()){
                        result = 1;
                    }else if(o1.getY() == o2.getY()){

                    }else{
                        result = -1;
                    }
                }else{
                    result = -1;
                }
                return result;
            }
        };

        //cons
        public Data(int x, int y) {
            this.x = x;
            this.y = y;
        }

        //method
        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    */

    public static class Data implements Comparable<Data>{
        private int x;
        private int y;

        //cons
        public Data(int x, int y) {
            this.x = x;
            this.y = y;
        }

        //method
        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public int compareTo(Data o) {
            if(this.getX()==o.getX()){
                return this.getY() - o.getY();
            }else {
                return this.getX() - o.getX();
            }
        }
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(br.readLine());
            List<Data> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                String[] arr = br.readLine().split(" ");
                list.add(new Data(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])));
            }
            Collections.sort(list);
            for (int i = 0; i < N; i++) {
                Data data = list.get(i);
                System.out.printf("%d %d\n", data.getX(), data.getY());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
