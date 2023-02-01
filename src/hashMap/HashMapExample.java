package hashMap;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    //method
    public static void main(String[] args) {

        // Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();

        // 객체저장
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 100);
        map.put("홍길동", 95);

        /**
         * HashMap은 Key.hashcode() 의 값이 같고, equals() 메서드가 true값을 리턴 할 경우 동일 키로 보고 중복저장을 허용하지 않는다.
         */
        System.out.printf("총 Entry 수 : %d\n\n", map.size());
        
        //키로 값 얻기
        System.out.printf("%s : %d\n\n", "홍길동", map.get("홍길동"));

        //키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){
            String k = keyIterator.next();
            int v = map.get(k);
            System.out.printf("%s : %d\n", k, v);
        }
        System.out.println();

        //엔트리 Set 컬렉션 얻어와서 반복해서 키와 값을 얻어 올 수도 있다.
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()){
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            int v = entry.getValue();
            System.out.printf("%s : %d\n", k, v);
        }
        
        //키로 엔트리 삭제
        map.remove("홍길동");
        System.out.printf("\n총 Entry 수 : %d\n", map.size());

    }


}
