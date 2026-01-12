package patternlabjava;

import util.InputUtil;

public class Pattern13 {
    public static void main(String[] args) {
        int n = InputUtil.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int count = 2;
                if (j % 2 != 0) {
                    System.out.print(n * count + 2 + i  + " ");
                } else {
                    System.out.print("  *   ");
                }
            }
            System.out.println();
        }
    }
}

