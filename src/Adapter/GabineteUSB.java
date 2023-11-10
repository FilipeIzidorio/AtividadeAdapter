package Adapter;

public class GabineteUSB extends USBConnector{
    @Override
    public String connectorUSB() {
        return "Conectado via USB.";
    }
}
