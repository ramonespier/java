package java_pack;

public class Carro {
    String marca;

    public static void main(String[] args) {
        System.out.println("testeee");
    }

    public Carro(String marca) {
        this.marca = marca;
    }

    protected void acelerar() {
        System.out.println("Acelerando o " + this.marca);
    }
}

class Rodas {
    public Rodas () {
        Carro carro = new Carro("Renault");
        carro.acelerar();
    }
}
