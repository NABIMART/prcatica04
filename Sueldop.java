import java.util.Scanner;
/**
 * @author Silvia Martinez
 */
public class Sueldop {
    private Scanner scanner;
    private int[] sueldos;
    //constructor
    public Sueldop() {
        scanner = new Scanner(System.in);
        sueldos = new int [5];
    }

    private void capturar() {

        for (int i = 0; i < 5 ; i++) {
            System.out.print("Ingrese sueldo " +(i+1) +":");
            sueldos[i] = scanner.nextInt();
        }
       
    }
     private void imprimir() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Sueldo ingresado en la posicion " +(i + 1) +": "+ sueldos[i]);
            }
        }
    public static void main(String[] args) {
        Sueldop sueldo = new Sueldop();
        sueldo.capturar();
        sueldo.imprimir();
    }
}
