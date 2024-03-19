package SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 모든_아나그램_찾기 {

    //field
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //cons
    public 모든_아나그램_찾기() {
    }

    //method

    public static void main(String[] args) {
        try {
            String S = br.readLine();
            String T = br.readLine();
            solution(S, T);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void solution(String S, String T){
        int front = 0;
        int rear = T.length() - 1;

        Map<Character, Integer> TString = new HashMap<>();
        Map<Character, Integer> anagramSeeker = new HashMap<>();
        for (int i = front; i <= rear; i++) {
            TString.put(T.charAt(i), TString.getOrDefault(T.charAt(i), 0) + 1);
        }
        Set<Character> keys = TString.keySet();
        for (int i = front; i < rear; i++) {
            anagramSeeker.put(S.charAt(i), anagramSeeker.getOrDefault(S.charAt(i), 0) + 1);
        }
        int answer = 0;
        while (rear <= S.length() - 1){
            anagramSeeker.put(S.charAt(rear), anagramSeeker.getOrDefault(S.charAt(rear++), 0) + 1);
            int counter = 0;
            Iterator<Character> keyIterator = keys.iterator();
            while (keyIterator.hasNext()){
                Character key = keyIterator.next();
                if(TString.get(key) == anagramSeeker.getOrDefault(key, 0)) counter++;
            }
            if(counter == TString.size()) answer++;
            anagramSeeker.put(S.charAt(front), anagramSeeker.get(S.charAt(front)) - 1);
            if(anagramSeeker.get(S.charAt(front)) == 0) anagramSeeker.remove(S.charAt(front));
            front++;
        }
        System.out.println(answer);
    }

}
