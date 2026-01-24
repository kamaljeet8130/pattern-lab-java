package patternlabjava;

import util.InputUtil;

public class Pattern13 {
    public static void main(String[] args) {
        int n = InputUtil.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1;j<=n;j++){
                int start = (j - 1) * n + 1;
                int val;
                if (j % 2 != 0) {
                    val = start + (i - 1);
                } else {
                    val = start + (n - i);
                }

                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}


/*
1 10 11 20 21
2 9 12 19 22
3 8 13 18 23
4 7 14 17 24
5 6 15 16 25
*/