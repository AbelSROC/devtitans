

public class Proprietario {
    
    int cnh;
    String nome;
    int anoNascimento; 
    
    public Proprietario() {
        this.cnh = 0;
        this.nome = "";
        this.anoNascimento = 0; 
    }

    public Proprietario(String nome,int cnh,  int anoNascimento) {
        this.cnh = cnh; 
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }
    
    public int getIdade(int anoReferencia) {
        return anoReferencia - this.anoNascimento;
    }
    
    public String getDescricao() {
        return "Proprietario: nome=" + this.nome + ", cnh=" + this.cnh + ", anoNascimento=" + this.anoNascimento + ".";
    }

}
