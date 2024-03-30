import java.text.SimpleDateFormat;
import java.util.Random;

public class Race {

    private boolean isCircuitRace;

    public Race(boolean isCircuitRace) {
        this.isCircuitRace = isCircuitRace;
    }

    public final void race(Car car) {
        car.carInfo();
        startCar(car);
        startLine();
        accelerateCar(car);
        Car nosCar = pitStop(car);
        applyNos(nosCar);
        finishLine();
        stopCar(nosCar);
        lapTime();
    }

    private void startCar(Car car) {
        System.out.println("Starting the race with " + car.getCarName());
    }

    private void startLine() {
        System.out.println("Crossing the start line");
    }

    private void accelerateCar(Car car) {
        System.out.println("Accelerating " + car.getCarName());
    }

    private Car pitStop(Car car) {
        System.out.println("Performing Pit Stop");
        return new NOS(car);
    }

    private void applyNos(Car nosCar) {
        System.out.println("Applying NOS to " + nosCar.getCarName());
    }

    private void finishLine() {
        if (isCircuitRace) {
            System.out.println("Crossing the start line (Circuit Race)");
        } else {
            System.out.println("Crossing the finish line (Sprint Race)");
        }
    }

    private void stopCar(Car nosCar) {
        System.out.println("Stopping " + nosCar.getCarName());
    }

    private void lapTime() {
        Random random = new Random();
        int minutes = random.nextInt(3) + 1; // 1 to 3 minutes
        int seconds = random.nextInt(60); // 0 to 59 seconds

        SimpleDateFormat dateFormat = new SimpleDateFormat("mm:ss.SSS");
        System.out.println("Calculating lap time...");
        System.out.println("Lap time: " + String.format("%02d:%02d.%03d", minutes, seconds, 0));
    }
}
