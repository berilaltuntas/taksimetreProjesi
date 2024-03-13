import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kmYol,gidilenKmYolUcreti,sonUcret;
        Scanner input=new Scanner(System.in);
        System.out.print("Gidilen KM Mesafesi: " );
        kmYol=input.nextDouble();

        //Kullanıcıdan aldığımız km ile yol ücretini hesaplıyoruz.

        gidilenKmYolUcreti= kmYol*2.20;
        sonUcret=gidilenKmYolUcreti+10;

        boolean kosul1=sonUcret<20;
        String str = kosul1 ? ("Ödeyeceğiniz tutar: 20TL" ) : ("Ödeyeceğiniz tutar: " +sonUcret);
        System.out.println(str);
    }
}
