

public class SessaoJediMain {
    public static void main(String[] args) {

        IniciadoJedi iniciado = new IniciadoJedi("luke Skywalker", "Humano", -19);
        System.out.println(iniciado.getDescricao());
        TreinadorJedi treinador = new TreinadorJedi("Mestre", "Yoda");
        System.out.println(treinador.getDescricao());
        SessaoJedi sessao = new SessaoJedi("Instruções de Uso da Força", treinador);
        sessao.addIniciado(iniciado);
        System.out.println(sessao.getDescricao());
        System.out.println("Média do ano de nascimento: " + sessao.getMediaAnoNascimento());

    }
}