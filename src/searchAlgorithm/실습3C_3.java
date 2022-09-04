package searchAlgorithm;

//제네릭 클래스 예시
public class 실습3C_3 {
    static class GenericClass<T>{
        private T xyz;

        public GenericClass(T xyz) {
            this.xyz = xyz;
        }

        public T getXyz() {
            return xyz;
        }

        public void setXyz(T xyz) {
            this.xyz = xyz;
        }
    }

    public static void main(String[] args) {
        GenericClass<String> a = new GenericClass<>("abc");
        GenericClass<Integer> b = new GenericClass<>(15);
        System.out.println(a.getXyz());
        System.out.println(b.getXyz());
    }

}
