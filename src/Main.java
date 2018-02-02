import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Ingrese un Numero: ");
        Scanner scanner = new Scanner(System.in);
        String valor = scanner.nextLine();
        int n = Integer.parseInt(valor);
        Numero num = new Numero(n);
        if (num.esPar())
            System.out.println("Es Par");
        else
            System.out.println("Es Impar");
    }
}



