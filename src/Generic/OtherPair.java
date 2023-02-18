package Generic;

public class OtherPair<K, V> {

    //field
    private K key;
    private V value;

    //cons
    public OtherPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    //getter&setter
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

}
