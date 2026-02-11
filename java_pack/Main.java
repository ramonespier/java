package java_pack;

// public = acessivel de todo lugar
// default = quando nao defino, ele segue esse
// private = acessivel somente dentro da classe que foi definido
// protected = acessivel por todas classes dentro do mesmo pacote

public class Main {

    public static void main(String[] args) {
        Carro meuCarro = new Pajero();
        SerVivo meuSer = new Humano();
        Moto motocicleta = new Moto("Yamaha", "Preto", 2015, "FDM5I13");

        // DTOs = data transfer objects
        // POJOs = plain old java objects

        meuSer.respirar();
        meuCarro.acelerar();

    }
}
