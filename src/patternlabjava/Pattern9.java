package patternlabjava;

import util.InputUtil;

public class Pattern9 {
    public static void main(String[] args) {
        int n = InputUtil.nextInt();
        for(int i = 1;i<n;i++){
            for(int j =1;j<n;j++){
                if(i+j<n){
                    System.out.print( "  ");
                }
                else{
                    System.out.print( " * ");

                }

            }
            System.out.println();
        }
    }
}

/*

Enter::
10
                 *
               *  *
             *  *  *
           *  *  *  *
         *  *  *  *  *
       *  *  *  *  *  *
     *  *  *  *  *  *  *
   *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *

* */
