
//Para testar esta segunda classe, modifique a classe CarroMain, 
//criada na questão anterior para criar um ou mais objetos da classe Placa e, 
//em seguida, 
//imprimir o resultado da execução do método getDescricao dos objetos criados.


public class CarroMain {
    public static void main(String[] args) {
        Motor motor1 = new Motor(1, 2.3, 300);
        Motor motor2 = new Motor(2, 2.3,26);
        Motor motor3 = new Motor(3,2.8, 139);
        System.out.println(motor1.getDescricao());
        System.out.println(motor2.getDescricao());
        System.out.println(motor3.getDescricao());
        System.out.println(motor1.getTipoString());
        System.out.println(motor2.getTipoString());
        System.out.println(motor3.getTipoString());
}

}