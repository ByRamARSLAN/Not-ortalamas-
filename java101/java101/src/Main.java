import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = inp.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6.0;

        System.out.print("Ortalamanız : " + sonuc);
        System.out.print(sonuc >= 60? " Geçtiniz" : " Kaldınız");

    }
}
