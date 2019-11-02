import java.util.Scanner;

public class empat {
    public static void main(String[] args) {  
        String barang;
        int jumlah;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jenis barang (A, B, C): \t");
        barang = scanner.next();
        System.out.print("Masukkan jumlah: \t\t\t");
        jumlah = scanner.nextInt();
        scanner.close();

        hitungBarang(barang, jumlah);
    }

    private static void hitungBarang(String barang , int jumlah) {
        int harga = 0;
        int potongan = 0;
        int bayar = 0;
        if (barang == "A" && jumlah <= 10) {
            harga = jumlah * 3000;
            bayar = jumlah * 3000;
        } else if (barang == "A" && jumlah > 10) {
            harga = jumlah * 3000;
            potongan = jumlah * 500;
            bayar = jumlah * 2500;
        } else if (barang == "B" && jumlah < 5) {
            harga = jumlah * 3500;
            bayar = jumlah * 3500;
        } else if (barang == "B" && jumlah > 5) {
            harga = jumlah * 3500;
            potongan = (jumlah * 3500) / 2;
            bayar = (jumlah * 3500) / 2; 
        } else if (barang == "C" && jumlah != 0) {
            harga = jumlah * 5000;
        }        
        System.out.println("Output: \t");
        System.out.println("- Total harga barang: \t\t" + harga);
        System.out.println("- Potongan: \t\t\t" + potongan);
        System.out.println("- Total yang harus dibayar: \t" + bayar);
    }
}