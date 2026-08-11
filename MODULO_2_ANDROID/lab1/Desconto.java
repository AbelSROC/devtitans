import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        float preco = scan.nextFloat(); // Preço original
        if (preco < 200) {
            System.out.printf("%.2f\n", preco);
            return;
        }

        float desconto = 0.05f; // Desconto de 5%

        float precoComDesconto = preco - (preco * desconto);
        System.out.printf("%.2f\n", precoComDesconto);
    }
}
