

public class Carro {

    //Atributos

    String marca;
    String modelo;
    Proprietario proprietario;
    Placa placa;
    Motor motor;    

    //Metodos

    public Carro(String marca, String modelo, Proprietario proprietario, Placa placa, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.proprietario = proprietario;
        this.placa = placa;
        this.motor = motor;
    }

    public String getDescricao() {
        return "Carro " + this.marca + "/" + this.modelo + ". " + this.proprietario.getDescricao() + " " + this.placa.getDescricao() + " " + this.motor.getDescricao();
    }
}
