package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Wrestler {

    //field
    public static class Player implements Comparable<Player>{
        //field
        private int height;
        private int weight;

        //cons
        public Player(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        //method
        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        @Override
        public int compareTo(Player o) {
            return o.height - this.height;
        }
    }

    //cons
    public Wrestler() {

    }


    //method
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String total = br.readLine();
        int loopSize = Integer.parseInt(total);
        Player[] players = new Player[loopSize];
        for (int i = 0; i < loopSize; i++) {
            String[] playerArray = br.readLine().split(" ");
            int height = Integer.parseInt(playerArray[0]);
            int weight = Integer.parseInt(playerArray[1]);
            Player player = new Player(height, weight);
            players[i] = player;
        }

        // 내가 푼 방식, 이중 반복문
        /*for (int i = 0; i < loopSize; i++) {
            Player playerA = players[i];
            int compareCount = 0;
            for (int j = 0; j < loopSize; j++) {
                if(i == j) continue;
                Player playerB = players[j];
                if(compare(playerA, playerB)) compareCount++;
            }
            if(compareCount == (loopSize-1)) answer++;
        }*/
        
        //강사가 푼 방식
        Arrays.sort(players);
        int maxWeight = players[0].weight;
        int answer = 1; //자기보다 키도 크고, 몸무게도 많이 나가는 사람이 있을때, 선발에서 제외됨. 키가 제일 큰 사람은 무조건 선발
        for (int i = 1; i < loopSize; i++) {
            Player player = players[i];
            if(player.weight > maxWeight){
                maxWeight = player.weight;
                answer++;
            }
        }
        
        System.out.println(answer);
    }


    /**
     * 첫번째 인자와 두번째 인자를 비교해 첫번째 인자가 클 경우 true를 반환
     * @param playerA
     * @param playerB
     * @return
     */
    public static boolean compare(Player playerA, Player playerB){
        return playerA.getHeight() > playerB.getHeight() || playerA.getWeight() > playerB.getWeight();
    }
}
