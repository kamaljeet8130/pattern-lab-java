package patternlabjava;

import util.InputUtil;

public class Pattern12 {
    public static void main(String[] args) {
        int n = InputUtil.nextInt();
        for (int i = 1;i<=n;i++){
            int sum = i;
            for(int j = 1;j<=n;j++){
                System.out.print(sum + " ");
                sum+=n;
            }
            System.out.println();
        }
    }
}

/*
Enter::
5
1 6 11 16 21
2 7 12 17 22
3 8 13 18 23
4 9 14 19 24
5 10 15 20 25
* */