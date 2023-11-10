package Adapter;

public class TecladoPS2 extends PS2Connector{
    @Override
    public String connectorPS2() {
        return "Adaptando conexão PS2 para USB...";
    }
}
