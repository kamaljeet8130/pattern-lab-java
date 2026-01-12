package patternlabjava;

import util.InputUtil;

public class Pattern11 {
    public static void main(String[] args) {
        int n = InputUtil.nextInt();
        for(int i = 1;i<=n;i++){
            int count = 1;
            for(int j = 1;j<=n;j++){
                if(j%2!=0){
                    System.out.print(i+ " ");
                }
                else{
                    System.out.print(count++ + " ");
                }
            }

            System.out.println();
        }
    }
}

/*
Enter::
5
1 1 1 2 1
2 1 2 2 2
3 1 3 2 3
4 1 4 2 4
5 1 5 2 5
* */