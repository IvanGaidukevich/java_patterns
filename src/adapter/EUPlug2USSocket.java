package adapter;

public class EUPlug2USSocket implements USSocket{
    private EUPlug europeanDevice;

    EUPlug2USSocket(EUPlug europeanDevice){
        this.europeanDevice = europeanDevice;

    }

    @Override
    public void provide() {
        System.out.println("Преобразует из 110 вольт в 220 вольт");
        europeanDevice.plugIn();
    }

}
