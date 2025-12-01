package bridge;

public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower(){
        if (device.isEnabled()) {
            device.powerOff();
        }
        else{
            device.powerOn();
        }
    }

    public void setDevice(Device device){
        this.device = device;
    }

}
