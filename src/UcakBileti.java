import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        int yas, mesafe, yolculukTipi;
        double mesafeUcreti = 0.10;
        double OnIkıdenKucukse = 0.50;
        double OnikiYirmiDortArasi = 0.10;
        double AltmısBestenBuyuk = 0.30;
        double yolculukTipi2 = 0.20;
        double toplamTutar;
        double indirimTutari;
        double normalTutar;
        double gidisGelisIndirimi;
        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz :");
        mesafe = inp.nextInt();
        System.out.print("Yaşınızı giriniz :");
        yas = inp.nextInt();
        System.out.println("Yolculuk tipini giriniz:");
        System.out.println("1-Tek Yön\n2-Gidiş Geliş");
        yolculukTipi = inp.nextInt();

        if (yas > 0 && yas < 12 && yolculukTipi == 1) {
            normalTutar = (mesafe * mesafeUcreti);
            indirimTutari = (normalTutar * OnIkıdenKucukse);
            toplamTutar = (normalTutar - indirimTutari);
            System.out.print("Toplam Tutar:" + toplamTutar);
        } else if ((yas >= 12 && yas <= 24) && yolculukTipi == 1) {
                normalTutar = (mesafe * mesafeUcreti);
                indirimTutari = (normalTutar * OnikiYirmiDortArasi);
                toplamTutar = (normalTutar - indirimTutari);
                System.out.print("Toplam Tutar:" + toplamTutar);
        } else if( (yas > 65 && yolculukTipi == 1)) {
            normalTutar = (mesafe * mesafeUcreti);
            indirimTutari = (normalTutar * AltmısBestenBuyuk);
            toplamTutar = (normalTutar - indirimTutari);
            System.out.print("Toplam Tutar:" + toplamTutar);
        } else if(yas > 0 && yolculukTipi ==1){
            normalTutar = (mesafe * mesafeUcreti);
            System.out.print("Toplam Tutar:" + normalTutar);
        } else if(yas > 0 && yas <12 && yolculukTipi == 2){
            normalTutar = (mesafe * mesafeUcreti);
            indirimTutari = (normalTutar * OnIkıdenKucukse);
            toplamTutar = (normalTutar - indirimTutari);
            gidisGelisIndirimi = toplamTutar * yolculukTipi2;
            toplamTutar = (toplamTutar - gidisGelisIndirimi) * 2;
            System.out.print("Toplam Tutar:" + toplamTutar);
        } else if(((yas >= 12 && yas <= 24) && yolculukTipi == 2)){
            normalTutar = (mesafe * mesafeUcreti);
            indirimTutari = (normalTutar * OnikiYirmiDortArasi);
            toplamTutar = (normalTutar - indirimTutari);
            gidisGelisIndirimi = toplamTutar * yolculukTipi2;
            toplamTutar = (toplamTutar - gidisGelisIndirimi) * 2;
            System.out.print("Toplam Tutar:" + toplamTutar);
        } else if( (yas > 65 && yolculukTipi == 2)){
            normalTutar = (mesafe * mesafeUcreti);
            indirimTutari = (normalTutar * AltmısBestenBuyuk);
            toplamTutar = (normalTutar - indirimTutari);
            gidisGelisIndirimi = toplamTutar * yolculukTipi2;
            toplamTutar = (toplamTutar - gidisGelisIndirimi) * 2;
            System.out.print("Toplam Tutar:" + toplamTutar);
        } else if (yas > 0 && yolculukTipi ==2) {
            normalTutar = (mesafe * mesafeUcreti);
            gidisGelisIndirimi = normalTutar * yolculukTipi2;
            toplamTutar = (normalTutar - gidisGelisIndirimi) * 2;
            System.out.print("Toplam Tutar: " + toplamTutar);
        } else{
            System.out.print("Hatalı veri girdiniz");
        }

        }
    }






