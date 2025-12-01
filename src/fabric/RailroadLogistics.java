package fabric;

public class RailroadLogistics extends Logistics{

    @Override
    public Transport createTransport() {
        return new Train();
    }
}
