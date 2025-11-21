package patternlabjava;

import util.InputUtil;
/*
Enter::
4
 *  *  *  *
 *  *  *  *
 *  *  *  *
 *  *  *  *

 */

public class Pattern1 {
    public static void main(String[] args) {
        int n = InputUtil.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
