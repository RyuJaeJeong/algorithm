package Generic;

public class ContainerExample {

    //method
    public static void main(String[] args) {
        Container<String> container1 = new ContainerImpl1<>();
        container1.set("홍길동");
        String str = container1.get();
        System.out.printf("str is %s\n", str);

        Container<Integer> container2 = new ContainerImpl1<>();
        container2.set(19);
        int no = container2.get();
        System.out.printf("no is %d\n", no);


        ContainerImpl1<String, Integer> container3 = new ContainerImpl1<>();
        container3.set("홍길동", 19);
        System.out.printf("%s은 %d살입니다.\n", container3.getKey(), container3.getValue());

    }
}
