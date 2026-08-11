public class TreinadorJedi {

    //Atributos

    String titulacao;
    String nome;
    
    //Metodos

    public TreinadorJedi() {
        this.titulacao = "";
        this.nome = "";
    }

    public TreinadorJedi(String titulacao, String nome) {
        this.titulacao = titulacao;
        this.nome = nome;
    }

    public String getDescricao() {
        return this.titulacao + " " + this.nome;
    }
}