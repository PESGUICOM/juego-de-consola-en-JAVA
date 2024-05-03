import java.util.Scanner;

public class Juego {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la máquina expendedora de bebidas");
        System.out.println("Elegí una de las siguientes opciones");
        System.out.println("1: Café");
        System.out.println("2: Mate");
        System.out.println("3: Té");
        System.out.println("4: Gaseosa");
        System.out.println("5: Agua");

        int opcion = scanner.nextInt();
        
        switch (opcion){
            case 1: 
            System.out.println("Café Combina con el curso de JAVA");
            break;
            case 2:
            System.out.println("Mate La clásica argentino");
            break;
            case 3:
            System.out.println("Té Para relajarse un momento");
            break;
            case 4:
            System.out.println("Gaseosa Tiene bastante azúcar");
            break;
            case 5:
            System.out.println("Agua Es super natural");
            break;
            default:
            System.out.println("Opción no válida");
            break;
        }
        if (opcion <= 5){
            System.out.println("Disfrute de su bebida");
        }
        scanner.close();
    }
}            