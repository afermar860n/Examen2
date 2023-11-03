import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {

        System.out.println("introduce numero:");
        Scanner s = new Scanner(System.in);

        int i;
        int j = s.nextInt();

        if (j == 0)
            for (i = 10; i <= j; i+=5)
           System.out.println(i +", ");
// nada, fatal
    }
}
