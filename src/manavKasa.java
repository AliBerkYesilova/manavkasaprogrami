import java.util.Scanner;
public class manavKasa {
    public static void main(String[] args) {
        double armutKg=2.14, elmaKg=3.67, domatesKg=1.11, muzKg=0.95, patlıcanKg=5.00, armut, elma, domates, muz, patlıcan;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo ? :");
        armut = input.nextDouble();

        System.out.print("Elma kaç kilo ? :");
        elma = input.nextDouble();

        System.out.print("domates kaç kilo ? :");
        domates = input.nextDouble();

        System.out.print("muz kaç kilo ? :");
        muz = input.nextDouble();

        System.out.print("patlıcan kaç kilo ? :");
        patlıcan = input.nextDouble();

        double toplamTutar;
        toplamTutar = (armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlıcan*patlıcanKg);
        System.out.print("Toplam tutar :"+toplamTutar+ "TL");
    }

}
