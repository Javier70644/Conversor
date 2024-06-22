import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.MatchResult;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EXTERNA:
            while (true){
                System.out.println("CONVERSOR DE MONEDAS");
                System.out.println("1 - soles peruanos a dolare\n"
                + "2 - pesos mexicanos a dolares\n"
                + "3 - pesos colombianos a dolares\n"
                + "4 - salir");
                System.out.println("INGRESE UNA OPCION");
                Scanner leer = new Scanner(System.in);
                char opcion = leer.next().charAt(0);

                switch (opcion){
                    case '1' :
                        convertir(3.58, "soles peruanos");
                        break;
                    case '2' :
                        convertir(22.15, "pesos mexicanos");
                        break;
                    case '3' :
                        convertir(3851.90, "pesos colombianos");
                        break;
                    case '4' :
                        System.out.println("CERRANDO EL PROGRAMA");
                        break EXTERNA;
                    default:
                        System.out.println("Opcion Incorrecta");
                        break;
                }
            }

        }
        static void convertir(double valorDolar, String pais){
            Scanner leer= new Scanner(System.in);

            System.out.println("Ingrese la cantidad de %s :" + pais);
            double cantidadDeMoneda = leer.nextDouble();

            double dolares = cantidadDeMoneda/valorDolar;

            dolares = (double) Math.round(dolares * 100d)/100;

            System.out.println("|-------------------------------------|");
            System.out.println("|   Tienes :$" + dolares + "dolares  |");
            System.out.println("|-------------------------------------|");
    }
}