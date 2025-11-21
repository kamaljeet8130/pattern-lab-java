package patternlabjava;

import util.InputUtil;

/*
 Enter::
5
5 5 5 5 5
4 4 4 4 4
3 3 3 3 3
2 2 2 2 2
1 1 1 1 1

* */
public class Pattern4 {
    public static void main(String[] args) {
        int n = InputUtil.nextInt();
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=n;j++){
                System.out.print(n-i+1 + " ");
            }
            System.out.println();
        }
    }
}
