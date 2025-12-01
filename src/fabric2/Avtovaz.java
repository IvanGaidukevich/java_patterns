package fabric2;

public class Avtovaz {

    public Lada produce(String model) {
        if (model.equals("Niva")) {
            return new Niva();
        } else if (model.equals("Vesta")) {
            return new Vesta();
        }
        else {
            throw new IllegalArgumentException("Нет такой модели");
        }
    }
}
