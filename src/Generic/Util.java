package Generic;

public class Util<O, K> {

    //method
    public static  <K, V, O extends Pair<K, V>>  V getValue(O pair, K key){
        V result = null;
        if(pair.getKey().equals(key)) result = pair.getValue();
        return result;
    }
}
