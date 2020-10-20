
package kalkulator;
import java.util.Scanner;
/**
 *
 * @author MOKLET-1
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("<<<KODE OPERASI>>>");
        
        String[] operasi = {" ", "Penambahan", "Pengurangan", "Perkalian", "Pembagian", "Modulus"};
            for (int i = 1; i < operasi.length; i++)  
            System.out.println(i+"."+operasi[i]);
       
        Scanner input = new Scanner(System.in);
        
        int a, b, kode, hasil;
        
        System.out.print("Masukkan Bilangan I : ");
        a = input.nextInt();
        System.out.print("Masukkan Bilangan II : ");
        b = input.nextInt();
        
        System.out.print("Masukkan Kode  : ");
        kode = input.nextInt();
        switch(kode){
            case 1 :
                hasil = a += b;
                break;
            case 2 :
                hasil = a -= b;
                break;
            case 3 :
                hasil = a *= b;
                break;
            case 4 :
                hasil = a /= b;
                break;
            case 5 :
                hasil = a %= b;
                break;
            default:
                hasil = 0;
                System.out.println("EROR");
                break;
        }
        System.out.println("Hasil: " + hasil);
        
        
    }
    
}
