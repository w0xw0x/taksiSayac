import java.util.Scanner;
public class Sayac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mesafe;
        double min = 20;

        System.out.println("w0xw0x Taksicilik hizmetlerini sunar. Taksi açılış ücretimiz 10 TL'dir. Bundan sonra gideceğiniz her kilometre başına sizden 2.2 TL fiyat biçilecek ve minimum ödenilmesi gereken miktar 20 TL'dir aksi taktirde sizden bu ücret yine de alıncaktır.");
        System.out.println("Lütfen gideceğiniz yolu kilometre uzunluğunca giriniz : ");
        mesafe = input.nextDouble();

        double sonuc = (mesafe>5) ? mesafe*2.2+10 : min;

        System.out.println("Ödemeniz gereken tutar : " +sonuc);
    }
}
