public class Motor {

    //Atributos
    int tipo;
    double  capacidade ;
    int potencia;

    //Metodos

    public Motor(int tipo, double capacidade, int potencia) {
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.potencia = potencia;
    }

    public Motor(){
        this.tipo = 0;
        this.capacidade = 0.0;
        this.potencia = 0;
    }

    //getTipoString: retorna uma String de acordo com o tipo do motor: 1=Gasolina, 2=Alcool, 3=Flex, 4=Diesel, 5=Eletrico, qualquer outro=Outros

    public String getTipoString () {
        return switch (tipo) {
            case 1 -> ("Gasolina");
            case 2 -> ("Alcool");
            case 3 -> ("Flex");
            case 4 -> ("Diesel");
            case 5 -> ("Eletrico");
            default -> ("outros");
        };
    }

    //getDescricao: retorna uma String contendo a descrição do motor de acordo com a linha a seguir:
    //Motor: tipo=Gasolina, capacidade=2.85L, potencia=130CV.
    
    public String getDescricao(){
        return "Motor: tipo=" + this.getTipoString() + ", capacidade=" + this.capacidade + "L, potencia=" + this.potencia + "CV.";
    }
    
}
