package Linanda;

import java.util.Arrays;

public class dragonKnight {
    public static void main(String[] args) {
        
        //Inputan Ksatria        
        int[] ksatria = { 7,8,4};
        Arrays.sort(ksatria);
        int b = 0;

        //Inputan Dragon
        int[] dragon = { 5, 4 };
        Arrays.sort(dragon);
        int indeksdragon  = 0;
        for (int a : ksatria ){
            if (indeksdragon < dragon.length){
                if (a >= dragon[indeksdragon]){
                    b += a;
                    indeksdragon++;
        
                }
            }
        }
        if (indeksdragon == dragon.length){
            System.out.println( b);
        } 
        else {
            System.out.println("Knight Fall");
        }
    }

}
