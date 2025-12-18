package patternlabjava;

import util.InputUtil;

public class Pattern5 {
    public static void main(String[] args) {
        int n = InputUtil.nextInt();
        for(int i = 1;i<=n;i++){
            int count = 1;
            for(int j=1;j<=n;j++){
                if(j%2!=0){
                    System.out.print(count + " ");
                    count++;
                }
                else{
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}

/*
Enter::
5
1 1 2 1 3
1 2 2 2 3
1 3 2 3 3
1 4 2 4 3
1 5 2 5 3
*/