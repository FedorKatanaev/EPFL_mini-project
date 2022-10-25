import java.util.Scanner;
import java.util.Date;

public class age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int annee;

        System.out.println("vous etes née dans quelle année ?? " );
        annee=scanner.nextInt();
        Date d = new Date();
        System.out.println("votre age est :" + (1900+d.getYear()-annee));

    }

}
