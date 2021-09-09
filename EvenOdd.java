package Linanda;

public class EvenOdd {
    
    public static void main(String[] args) {
        
        int[] angka = {1,2,3,4,5,1616161,17152535,1324653241,124243546,251253331,397683146};
        
        for(int i = 0; i < angka.length; i++){
            if(angka[i]%2 == 0){
                System.out.println(angka[i] +" = genap");
            } else {
                System.out.println(angka[i] +" = ganjil");
            }
        }
        
    }
    
}
