package hashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 학급회장 {

    //field
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //cons
    public 학급회장() {

    }

    //method
    public static void main(String[] args) {
        try{
            int studentCnt = Integer.parseInt(br.readLine());
            String[] voteList = br.readLine().split("");
            solution(studentCnt, voteList);
        }catch (IOException ioException){
            ioException.printStackTrace();
        }catch (Exception exception){
            exception.printStackTrace();
        }

    }



    /**
     * @param studentCnt 학생 수
     * @param voteList 득표목록
     */
    public static void solution(int studentCnt, String[] voteList){
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < studentCnt; i++) {
            /*if(map.containsKey(voteList[i])){
               map.put(voteList[i], map.get(voteList[i]) + 1);
            }else{
               map.put(voteList[i], 1);
            }*/
            map.put(voteList[i], map.getOrDefault(voteList[i], 0) + 1);
        }

        Set<String> keySet =  map.keySet();
        Iterator<String> keySetIterator = keySet.iterator();
        int max = 0;
        String chief = "";
        while (keySetIterator.hasNext()){
            String key = keySetIterator.next();
            int voteCnt = map.get(key);
            if(max < voteCnt){
                max = voteCnt;
                chief = key;
            }
        }
        System.out.printf("%s\n", chief);
    }
}
