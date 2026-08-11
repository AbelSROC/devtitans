// De forma semelhante às questões anteriores, crie uma classe para representar uma SessaoJedi.
// Implemente os métodos:
// addIniciado: adiciona um IniciadoJedi na lista de iniciados que farão parte da sessão. Caso já exista um iniciado com o mesmo nome, o iniciado não deve ser adicionado.
// getIniciado: retorna um IniciadoJedi da lista de iniciados da sessão que possui o nome especificado. Retorna nulo caso o iniciado não pertença à sessão.
// getMediaAnoNascimento: retorna a média do ano de nascimento dos iniciados.
// getDescricao: retorna uma String contendo a descrição completa da sessão, incluindo as informações (getDescricao) do treinador e dos iniciados participantes, de acordo com o exemplo abaixo:
// --> SESSÃO Instruções de Uso da Força (Treinador: Grão-Mestre Fae Coven)
//   - Iniciado 1: Katooni (especie=Tholothian, nascimento=23 ABY)
//   - Iniciado 2: Byph (especie=Ithorian, nascimento=21 ABY)
//   - Iniciado 3: Gungi (especie=Wookiee, nascimento=23 ABY)
//   - Iniciado 4: Petro (especie=Human, nascimento=22 ABY)
// Para testar a classe, modifique a classe SessaoJediMain, criada nas questões anteriores, para criar um ou mais objetos da classe SessaoJedi. Adicione iniciados às sessões e, em seguida, imprima o resultado da execução do método getDescricao dos objetos criados.

import java.util.ArrayList;

public class SessaoJedi {
    
    //Atributos

    String nome;
    TreinadorJedi treinador;
    ArrayList<IniciadoJedi> iniciados;
    
    //Metodos

    public SessaoJedi(String nome, TreinadorJedi treinador) {
        this.nome = nome;
        this.treinador = treinador;
        this.iniciados = new ArrayList<IniciadoJedi>();
    }

    public void addIniciado(IniciadoJedi iniciado) {
        if (this.iniciados.contains(iniciado)) {
            System.out.println("Iniciado já está na sessão.");
        } else {
            this.iniciados.add(iniciado);
        }
    }

    public IniciadoJedi getIniciado(String name) {
        for (IniciadoJedi iniciado : this.iniciados) {
            if (iniciado.nome.equals(name)) {
                return iniciado;
            }
        }
        return null;
    }

    public double getMediaAnoNascimento() {
        double soma = 0;
        for (IniciadoJedi iniciado : this.iniciados) {
            soma += iniciado.anoNascimento;
        }
        return soma / this.iniciados.size();
    }

    public String getDescricao() {

        String descricao = "--> SESSÃO " + this.nome + " (Treinador: " + this.treinador.getDescricao() + ")\n";
        for (int i = 0; i < this.iniciados.size(); i++) {
            descricao += "  - Iniciado " + (i + 1) + ": " + this.iniciados.get(i).getDescricao() + "\n";
        }
        return descricao;
    }

}
