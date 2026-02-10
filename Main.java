import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // numeros inteiros
        //   byte => 8 bits => -128 a 127
        //   short => 16 bits => -32.768 a 32.767
        //   int => 32 bits => -2.147.483.648 a 2.147.483.647
        //   long => 64 bits => -9.223.372.036..854.775.808 a 9.223.372.036..854.775.807

        // numero decimais
        //      float => 32 bits => precisão simples => 5.50
        //      double => 64 bits => precisão dupla => 5.500987

        // char => representar um unico caracter = a, b, c

        byte b = 100;
        short s = 10000;
        // int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'c';
        String str = "Ramon";
        boolean bool = true;

//        int[] arrayInt = {1, 2, 3, 4, 5, 6};
//        System.out.println(arrayInt.length);
//
//        int[] arrayNumeros = new int[10];
//        System.out.println((arrayNumeros.length));
//
//        if (b > 99) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//
//        }

        ArrayList<String> lista = new ArrayList<>();
        lista.add("ramon");
        lista.add("ramones");
        lista.add("ramoncio");
        lista.add("ramongo");

        System.out.println(lista);

        lista.remove(1);
        lista.remove("ramoncio");
        System.out.println(lista);

        ArrayList<String> items = new ArrayList<>();
        items.add("bola");
        items.add("cubo");
        items.add("madeira");

        System.out.println(items);

        // loops

        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }

        for (String item : lista) {
            System.out.println(item);
        }

        int contador = 0;
        while (contador < 10) {
            System.out.println("estou no while " + (contador + 1));
            contador++;
        }

        // casting

        double resultado = 0.0;
        int resultadoInt = (int)resultado;

        int meuInt = 10;
        double meuDouble = meuInt;

        String minhaString = "10";
        int meuInt2 = Integer.parseInt(minhaString);

        String meuString = String.valueOf(meuInt2);
    }
}
