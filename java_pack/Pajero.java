package java_pack;

public class Pajero implements Carro {

    final int limiteDeVelocidade = 150;
    public int velocidadeAtual = 0;

    @Override
    public void acelerar() {
        if (this.velocidadeAtual < limiteDeVelocidade) {
            this.velocidadeAtual += 10;
            System.out.println("Acelerando...");
        }
            System.out.println("Velocidade atual " + this.velocidadeAtual);
    }

    @Override
    public void freiar() {
        System.out.println("Freiando");

    }

    @Override
    public void parar() {
        System.out.println("Parado");

    }
}
