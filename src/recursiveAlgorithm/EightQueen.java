package recursiveAlgorithm;

public class EightQueen {

    static boolean[] flag_a = new boolean[8];
    static boolean[] flag_b = new boolean[15];
    static boolean[] flag_c = new boolean[15];
    static int[] pos = new int[8];

    static void print(){
        for (int i = 0; i < 8; i++)
            System.out.printf("%2d", pos[i]);
        System.out.println();
    }

    static void set(int i){
        for (int j = 0; j < 8; j++) {
            if(flag_a[j] == false &&
               flag_b[i + j] == false &&
               flag_c[i - j + 7] == false){
                pos[i] = j;
                if(i == 7){
                    print();
                }else{
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
                    set(i + 1);
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
                }
            }
        }
    }

    static void set2(int i){
       int j;
       int[] jstk = new int[8];

        Start : while (true){
            j = 0;
            while (true){
                while (j<8){
                    if(flag_a[j] == false &&
                       flag_b[i + j] == false &&
                       flag_c[i - j + 7] == false){
                        pos[i] = j;
                        if(i == 7){
                            print();
                        }else{
                            flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
                            jstk[i++] = j;
                            continue Start;
                        }
                    }   //end if
                    j++;
                }   //end while(j<8)
                if(--i == -1) return;
                j = jstk[i];
                flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
                j++;
            }   //end while(true)
        }   //end Start
    }

    public static void main(String[] args) {
        set2(0);
    }

}
