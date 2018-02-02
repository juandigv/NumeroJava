
public class Numero {
    int num;

    public Numero(int num)

    {
        this.num = num;
    }

    public boolean esPar() {
        if (this.num % 2 == 0)
            return true;
        else
            return false;
    }


    public boolean esPrimo() {
        boolean primo = true;
        int cont = 2;
        while (cont != this.num) {
            if (this.num % cont == 0)
            {primo = false;}
            if (primo ==false)
                break;
            cont = cont + 1;


        }
        return primo;
    }
}



