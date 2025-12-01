package fabric2;

public class Main {
    public static void main(String[] args) {
        Avtovaz avtovaz = new Avtovaz();
        try {
            Lada lada = avtovaz.produce("Vesta");
            lada.drive();
            Lada lada2 = avtovaz.produce("Iskra");
            lada2.drive();
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
