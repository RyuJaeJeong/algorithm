package Generic;

public class ContainerImpl1<K, V> implements Container<K> {

    //field
    private K key;
    private V value;


    //cons
    public ContainerImpl1() {

    }

    @Override
    public K get() {
        return key;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public void set(K key) {
        this.key = key;
    }

    public void set(K key, V value){
        this.key = key;
        this.value = value;
    }


}
