public class App {

    
    public static double calculatePrice(double baseFare, int demand, int drivers) {

        double surge = 1.0;

    
        if (drivers <= 0) {
            return baseFare * 3;
        }

        double ratio = (double) demand / drivers;

        if (ratio > 2) {
            surge = 2.5;
        } else if (ratio > 1) {
            surge = 1.5;
        } else {
            surge = 1.0;
        }

        return baseFare * surge;
    }

    public static void main(String[] args) {

        double baseFare = 100;

        
        for (int i = 1; i <= 5; i++) {

            int demand = i * 10;     
            int drivers = 20;        

            double price = calculatePrice(baseFare, demand, drivers);

            System.out.println("Ride " + i + " Price: " + price);
        }

        while (true) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}

