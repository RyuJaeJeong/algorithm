package searchAlgorithm;

public class 연습문제4 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 6, 8, 9};
        System.out.print("   |");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.print("---+");
        for (int i = 0; i < a.length; i++) {
            System.out.print("---");
        }

        int pl = 0;
        int pr = a.length - 1;
        do{
            int pc = (pl + pr)/2;
            System.out.println();
            System.out.print(" |");

            for (int i = 0; i < a.length; i++) {
                if(i==pl) System.out.printf("%3S", "<-");
                else if(i==pr) System.out.printf("%3S", "->");
                else if (i==pc) System.out.printf("%3S", "+");
                else System.out.printf("%3S", " ");
            }
            System.out.println();
            System.out.printf("%d|", pc);
            for (int i = 0; i < a.length; i++) {
                System.out.printf("%3d", a[i]);
            }
            System.out.println();
            if(a[pc] == 9){
                System.out.println("키값은 a["+ pc + "]에 있습니다.");
                break;
            } else if(a[pc]>9){
                pr = pc - 1;
            } else {
                pl = pc + 1;
            }
        }while(pl<=pr);
    }
}
