import java.util.Scanner;

public class tiga {
    public static void main(String[] args) {  
        int angka;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang dan lebar: ");
        angka = scanner.nextInt();
        scanner.close();
        
        cetak_gambar(angka);
    }

    private static void cetak_gambar(int angka) {
    for (int i = 0; i < angka; i++) {
        if (i % 2 == 0) {
            System.out.println("*    *    =    *    *\n");
        } else {
            System.out.println("*    =    *    =    *\n");

        }
    }
  }
}