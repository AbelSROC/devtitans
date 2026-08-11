

import java.util.Scanner;

public class ContaEnergia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float consumo = scan.nextFloat();
        char tipo = scan.next().charAt(0);

        float preco = 0.0f;
        
        if (consumo < 0) {
            System.out.printf("-1.00\n");
            return;
        }


        switch (tipo) {
            case 'R':
                if (consumo <= 500) {
                    preco = (float) (consumo * 0.40);
                } else {
                    preco = (float) (consumo * 0.65);
                }
                break;
            case 'C':
                if (consumo <= 1000) {
                    preco = (float) (consumo * 0.55);
                } else {
                    preco = (float) (consumo * 0.60);
                }
                break;
            case 'I':
                if (consumo <= 5000) {
                    preco = (float) (consumo * 0.55);
                } else {
                    preco = (float) (consumo * 0.60);
                }
                break;
            default:
                System.out.printf("-1.00\n");
                return;
        }

        System.out.printf("%.2f\n", preco);
    }
}