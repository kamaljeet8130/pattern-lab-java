package patternlabjava;

import util.InputUtil;
/*
 Enter::
3
1 1 1
2 2 2
3 3 3
*/

public class Pattern2 {
    public static void main(String[] args) {
        int n = InputUtil.nextInt();
        for (int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
