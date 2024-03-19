package recursiveAlgorithm;

public class 부분집합_구하기 {

    //field
    public static int n;    // 1~n까지의 부분집합을 구함
    public static int[] ch;

    //method
    public static void main(String[] args) {
        n = 100;
        ch = new int[n+1];
        solution(1);
    }

    /**
     * 재귀적으로 부분집합을 구함
     */
    public static void solution(int l){
        if(l >= n + 1){
            StringBuilder str = new StringBuilder();
            for (int i = 1; i < l; i++) {
                if(ch[i] == 1) str.append(i).append(" ");
            }
            if(str.length() != 0){
                System.out.println(str);
            }
        }else{
            ch[l] = 1;
            solution(l+1);      //왼쪽
            ch[l] = 0;
            solution(l+1);      //오른쪽
        }
    }
}
