package Adapter;

public class Adapter extends USBConnector{
    private PS2Connector ps;

    public Adapter(PS2Connector ps) {
        this.ps = ps;
    }


    @Override
    public String connectorUSB() {
        return ps.connectorPS2().concat(" \nConexão adaptada para USB.");
    }
}

