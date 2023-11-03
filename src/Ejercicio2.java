import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

       System.out.println("introduce notas:");

        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int contador = 0;

            if (i == -1){
                System.out.println("No se han introducido calificaciones");
                }else if (i != -1){
                System.out.println(i);
                }else if (i == -1) {
                System.out.println("la media es "+ i / contador); //tambien mal

            }
        contador++;
    }
}
