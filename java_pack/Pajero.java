package java_pack;

public class Pajero implements Carro{

    @Override
    public void acelerar() {
    System.out.println("Acelerando");
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
