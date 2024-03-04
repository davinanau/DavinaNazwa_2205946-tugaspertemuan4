import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();
        
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();
        
        int jumlahGenap = 0;
        
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                jumlahGenap += i;
            }
        }
        
        System.out.println("Jumlah deret bilangan genap dari " + batasAwal + " sampai " + batasAkhir + " adalah: " + jumlahGenap);
        
        input.close();
    }
}
