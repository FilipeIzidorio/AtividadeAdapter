import Adapter.*;

public class Main {
    public static void main(String[] args) {

        var tecladoPS2 = new TecladoPS2();
        var adaptador = new Adapter(tecladoPS2);

        System.out.println(adaptador.connectorUSB());

    }
}
