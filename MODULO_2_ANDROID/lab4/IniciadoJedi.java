public class IniciadoJedi {

    //Atributos

    String nome;
    String especie;
    int anoNascimento;

    //Metodos
    public IniciadoJedi() {
            this.nome = "";
            this.especie = "";
            this.anoNascimento = 0;
    }

    public IniciadoJedi(String nome, String especie, int anoNascimento) {
        this.nome = nome;
        this.especie = especie;
        this.anoNascimento = anoNascimento;
    }

    public String getDescricao() {
        return this.nome + "(especie=" + this.especie + ", Nascimento=" + this.getAnoNascimento() + ")";
    }

    public String getAnoNascimento() {
        if (anoNascimento < 0) {
            int ano = -anoNascimento;
            return ano + " ABY";
        }
        return this.anoNascimento + " DBY";
    }
    
}
