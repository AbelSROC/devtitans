


public class Placa {

    //Atributos

    String placa;
    int tipo;

    //Metodos

    public Placa() {

        this.placa = " ";
        this.tipo = 0;
    
    }

    public Placa (String placa, int tipo){

        this.placa = placa;
        this.tipo = tipo;

    }

 
    public  String getTipoString () {

        return switch (tipo) {
            case 1 -> ("Normal");
            case 2 -> ("Servico");
            case 3 -> ("Oficial");
            case 4 -> ("Auto Escola");
            case 5 -> ("Prototipo");
            case 6 -> ("Colecionador");
            default -> ("outros");
        };
    }
    
    public boolean temEstacionamentoLivre() {

        return switch (tipo) {
            case 2 -> (true);
            case 3 -> (true);
            default -> (false);
        };
            
    }

    public String getDescricao() {
        return "Placa: placa=" + this.placa + ", tipo=" + this.getTipoString() + ", estacionamentoLivre=" + this.temEstacionamentoLivre() + ".";
    }



}