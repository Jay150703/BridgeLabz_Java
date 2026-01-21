package coreprogramming.programmingelements.level1;

public class VolumeOfEarth {
    public static void main(String[] args) {
        double radius = 6378;
        double pi = 3.14159;
        double volumeKm = (4.0 / 3) * pi * radius * radius * radius;
        double volumeMiles = volumeKm / (1.6 * 1.6 * 1.6);
        System.out.println("The volume of earth in cubic kulometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}


