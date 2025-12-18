package patternlabjava;

import util.InputUtil;

public class Pattern8 {
    public static void main(String[] args) {
        int n = InputUtil.nextInt();
        int count = 2;
        for(int i = 1;i<=n;i++){
            for (int j = 1;j<=n;j++){
                System.out.print(count + " ");
                count+=2;
            }
            System.out.println();
        }
    }
}
/*
 Enter::
5
2 4 6 8 10
12 14 16 18 20
22 24 26 28 30
32 34 36 38 40
42 44 46 48 50
 */