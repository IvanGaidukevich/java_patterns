package fabric;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logistics logistics;
        Scanner sc = new Scanner(System.in);
        System.out.println("Как отправить товар? Фура или ЖД?");
        String choice = sc.nextLine();
        switch(choice) {
            case "Фура":
                logistics = new RoadLogistics();
                logistics.planDelivery();
                break;
            case "ЖД":
                logistics = new RailroadLogistics();
                logistics.planDelivery();
                break;
            default:
                break;
        }


    }
}
