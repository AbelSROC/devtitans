
import java.util.Scanner;

public class PorcentagemAcerto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] respostas = new int[100]; // Vetor para armazenar as respostas do candidato
        int[] gabarito = new int[100]; // Vetor para armazenar o gabarito

        // Leitura das respostas do candidato
        int i = 0;
        while (true) {
            int resposta = scan.nextInt();
            if (resposta == -1) {
                break;
            }
            respostas[i] = resposta;
            i++;
        }
        int tamanhoRespostas = i; // Tamanho do vetor de respostas

        // Leitura do gabarito
        i = 0;
        while (true) {
            int respostaGabarito = scan.nextInt();
            if (respostaGabarito == -1) {
                break;
            }
            gabarito[i] = respostaGabarito;
            i++;
        }
        int tamanhoGabarito = i; // Tamanho do vetor do gabarito
    

        // Cálculo da porcentagem de acerto
        int acertos = 0;
        for (i = 0; i < tamanhoRespostas; i++) {
            if (respostas[i] == gabarito[i]) {
                acertos++;
            }
        }

        double porcentagemAcerto = ((double) acertos / tamanhoGabarito) * 100;

        System.out.printf("%.2f\n", porcentagemAcerto);
    }
}