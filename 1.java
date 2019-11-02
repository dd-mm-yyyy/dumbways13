import java.util.Scanner;
import java.util.Arrays;

public class satu {
  public static void main(String[] args) {  
    int[] angka = new int[5];
    int[] jumlah = new int[5];

    Scanner scanner = new Scanner(System.in);

    System.out.print("Angka pertama: \t");
    angka[0] = scanner.nextInt();

    System.out.print("Angka kedua: \t");
    angka[1] = scanner.nextInt();

    System.out.print("Angka ketiga: \t");
    angka[2] = scanner.nextInt();

    System.out.print("Angka keempat: \t");
    angka[3] = scanner.nextInt();

    System.out.print("Angka kelima: \t");
    angka[4] = scanner.nextInt();
    scanner.close();

    jumlah[0] = angka[1] + angka[2] + angka[3] + angka[4];
    jumlah[1] = angka[0] + angka[2] + angka[3] + angka[4];
    jumlah[2] = angka[0] + angka[1] + angka[3] + angka[4];
    jumlah[3] = angka[0] + angka[1] + angka[2] + angka[4];
    jumlah[4] = angka[0] + angka[1] + angka[2] + angka[3];
      
    Arrays.sort(jumlah);
      
    System.out.println("Maka angka terkecilnya adalah " + jumlah[0] + " dan terbesarnya adalah " + jumlah[4]);
  }
}