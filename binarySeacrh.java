package Linanda;

import java.util.Arrays;
import java.util.Scanner;

public class binarySeacrh {
    
    public static void main(String[] args) {
        
        Scanner inputUser = new Scanner(System.in);
        String input;
        String[] nama = {"adi","ade","adudu","bela","burhan","caca","cimong","diki","dora"};
    
        System.out.print("Cari Nama = ");
        input = inputUser.next();
        
        int hasil = Arrays.binarySearch(nama, input);
        if(hasil < 0){
            System.out.println("Nama Tidak Ditemukan");
        }else{
            System.out.println("Nama Ditemukan pada nomor "+(hasil+1));
        }
    }
    
}
