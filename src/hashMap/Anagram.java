package hashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Anagram {

    //field
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //cons
    public Anagram() {

    }

    //method
    public static void main(String[] args) {
        try {
            String firstRow = br.readLine();
            String secondRow = br.readLine();
            solution(firstRow, secondRow);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void solution(String firstRow, String secondRow){
        int size = firstRow.length();
        char[] firstArr = firstRow.toCharArray();
        char[] secondArr = secondRow.toCharArray();
        Map<Character, Integer> firstMap = new HashMap<>();
        Map<Character, Integer> secondMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            firstMap.put(firstArr[i], firstMap.getOrDefault(firstArr[i],0) + 1);
            secondMap.put(secondArr[i], secondMap.getOrDefault(secondArr[i],0) + 1);
        }

        Set<Character> keys = firstMap.keySet();
        Iterator<Character> keysIterator = keys.iterator();
        int count = 0;
        while (keysIterator.hasNext()){
            char key = keysIterator.next();
            if(firstMap.get(key) == secondMap.get(key)) count++;

        }
        if(count == firstMap.size()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

}
