public class Main {

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Ford");
        Carro meuCarro1 = new Carro("BMW");
        Carro meuCarro2 = new Carro("Mitsubishi");

        meuCarro2.acelerar();
        meuCarro.acelerar();
    }
}