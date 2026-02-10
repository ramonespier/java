public class Carro {
    String marca;

    public static void main(String[] args) {
        System.out.println("testeee");
    }

    public Carro(String marca) {
        this.marca = marca;
    }

    public void acelerar() {
        System.out.println("Acelerando o " + this.marca);
    }
}
