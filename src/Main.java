import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un Numero: ");

        String valor = scanner.nextLine();
        int n = Integer.parseInt(valor);
        Numero num = new Numero(n);
        System.out.print("MENU \n 1. Par o Impar \n 2. Primo o no Primo \n Que deseas hacer? :  ");
        String valorm = scanner.nextLine();
        int m = Integer.parseInt(valorm);
        switch(m) {
            case 1:
                if (num.esPar())
                    System.out.println("Es Par");
                else
                    System.out.println("Es Impar");
                break;
            case 2:
                if (num.esPrimo())
                    System.out.println("Es Primo");
                else
                    System.out.println("No es Primo");
                break;
        }
    }
}



