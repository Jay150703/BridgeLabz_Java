package dsa.linear.queue;

/*
 * Circular Tour (Petrol Pump Problem)
 */

public class CircularTour {

    static class PetrolPump {
        int petrol, distance;

        PetrolPump(int p, int d) {
            petrol = p;
            distance = d;
        }
    }

    public static int findStart(PetrolPump[] pumps) {
        int start = 0, deficit = 0, balance = 0;

        for (int i = 0; i < pumps.length; i++) {
            balance += pumps[i].petrol - pumps[i].distance;

            if (balance < 0) {
                deficit += balance;
                start = i + 1;
                balance = 0;
            }
        }
        return (balance + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
                new PetrolPump(6, 4),
                new PetrolPump(3, 6),
                new PetrolPump(7, 3)
        };

        System.out.println(findStart(pumps));
    }
}
