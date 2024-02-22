import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //km yaş bilet  normalücret değişkenlerimizi tanımladık
        int km, age, ticket;
        double normalprice;
        //Kullanıcıdan bilgilerni aldık
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();
        System.out.println("Yolculuk tipini giriniz:  \n 1 => Tek yön \n 2 => Gidiş dönüş ");
        ticket = input.nextInt();

        //indirim oranlarına göre işlemlerimizi uyguladık
        if (km > 0 && age > 0 && (ticket == 1 || ticket == 2)) {
            normalprice = km * 0.10; 
            if (age < 12) {
                normalprice = normalprice -(normalprice*0.5);

            }
            else if (age >= 12 && age<24) {
                normalprice = normalprice -(normalprice*0.1);
            }
           else if (age >65) {
                normalprice = normalprice -(normalprice*0.3);
            }
           else if (ticket==2) {
                normalprice = (normalprice -(normalprice*0.2))*2;
            }
           else{
                System.out.println("Toplam tutar: "+ normalprice + "TL");
            }
            System.out.println("Bilet Fiyatınız " + normalprice);
        }
        else{
            System.out.println("Doğru değer giriniz ");
        }


    }
}