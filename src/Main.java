import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un Numero: ");

        String valor = scanner.nextLine();
        int n = Integer.parseInt(valor);
        Numero num = new Numero(n);
        if (num.esPar())
            System.out.println("Es Par");
        else
            System.out.println("Es Impar");
        if (num.esPrimo())
            System.out.println("Es Primo");
        else
            System.out.println("No es Primo");


    }
}



