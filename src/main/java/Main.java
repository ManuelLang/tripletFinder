import model.TripletFinder;

public class Main {

    public static void main(String[] args) {

        int[] array = {75, 3, 34, 25, 89, 45, 9, 12};

        long startTime = System.currentTimeMillis();
        boolean tripletFound = TripletFinder.findTripletInArray(array, 209);
        long stopTime = System.currentTimeMillis();
        long elapsed = stopTime - startTime;
        System.out.println(String.format("Triplet found: %s, elapsed time: %s", tripletFound, elapsed));

        startTime = System.currentTimeMillis();
        tripletFound = TripletFinder.findTripletInArrayOptimized(array, 209);
        stopTime = System.currentTimeMillis();
        elapsed = stopTime - startTime;
        System.out.println(String.format("Triplet found: %s, elapsed time: %s", tripletFound, elapsed));

    }
}
