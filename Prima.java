package Linanda;
import java.util.Scanner;
public class Prima {
   
    public static void main (String[] args){
        
        Scanner inputUser = new Scanner(System.in);
        int input;
        
        System.out.print("Masukkan angka = ");
        input = inputUser.nextInt();
        
        for(int i = 2; i <= input; i++){
            if((input%i) == 0){
                System.out.println(input+" = bukan bilangan prima");break;
            }else{
                System.out.println(input+" = bilangan prima");break;
            }
        }
        
    }
}
