package pintura;

public class Pintura <E extends Pintavel> {
    private E coisaQuePintar;
    private String tipo;
    private String marca;
    private double preco;

    public Pintura(E coisaQuePintar, String tipo, String marca, double preco) {
        this.coisaQuePintar = coisaQuePintar;
        this.tipo = tipo;
        this.marca = marca;
        this.preco = preco;
    }
}
