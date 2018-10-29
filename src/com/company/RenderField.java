package com.company;

public class RenderField
{
    public void checkSymbol(int [] [] arr){
        String  [][] renderArr = {{"*","*","*"},{"*","*","*"},{"*","*","*"}};
        for (int i = 0; i < 3; i++){
            for(int j = 0;j < 3; j++)
                switch (arr[i][j]) {
                    case 0 : renderArr[i][j] = "*";
                             break;
                    case 1 : renderArr[i][j] = "x";
                             break;
                    case 2 : renderArr[i][j] = "0";
                             break;

                }

        }
        for (int i = 0; i < 3; i++){
            System.out.println();
            for (int j = 0; j < 3; j++){
           System.out.print(renderArr[i][j]);

            }
        }
    }
}
