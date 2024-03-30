import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Singleton Pattern
        Player player = Player.getInstance();
        System.out.println("Is it single player? " + player.isSinglePlayer());

        // Factory Pattern
        System.out.println("Choose car type (1 for Coupe, 2 for Roadster): ");
        int carType = scanner.nextInt();
        CarFactory carFactory = null;

        if (carType == 1) {
            carFactory = new CoupeCarFactory();
            System.out.println("Choose Coupe Car:");
            System.out.println("1. ToyotaGR86\n2. SubaruBRZ");
        } else if (carType == 2) {
            carFactory = new RoadsterCarFactory();
            System.out.println("Choose Roadster Car:");
            System.out.println("1. PorscheBoxster\n2. Ferrari812");
        }

        int carModel = scanner.nextInt();

        String carName = "DefaultName";
        EngineBehavior engineBehavior = chooseEngine();
        TurbochargerBehavior turbochargerBehavior = chooseTurbocharger();

        Car chosenCar = carFactory.createCar(carName, engineBehavior, turbochargerBehavior);

        chosenCar.setEngineBehavior(engineBehavior);  // strategy pattern
        chosenCar.setTurbochargerBehavior(turbochargerBehavior); // strategy pattern

        if (carType == 1) {
            if (carModel == 1) {
                chosenCar.setCarName("ToyotaGR86");
            } else if (carModel == 2) {
                chosenCar.setCarName("SubaruBRZ");
            }
        } else if (carType == 2) {
            if (carModel == 1) {
                chosenCar.setCarName("PorscheBoxster");
            } else if (carModel == 2) {
                chosenCar.setCarName("Ferrari812");
            }
        }

        // Factory Pattern
        System.out.println("Choose track (1 for Blue Moon Bay Speedway, 2 for BB Raceway, 3 for Circuit de Spa-Francorchamps): ");
        int trackType = scanner.nextInt();
        TrackFactory trackFactory = null;

        if (trackType == 1) {
            trackFactory = new BlueMoonBaySpeedwayFactory();
        } else if (trackType == 2) {
            trackFactory = new BBRacewayFactory();
        } else if (trackType == 3) {
            trackFactory = new CircuitDeSpaFactory();
        }

        // Racing Type
        System.out.println("Choose the type of racing:\n1. Sprint Racing\n2. Circuit Racing");
        int racingType = scanner.nextInt();

        // Strategy Pattern (chooseNOS method)
        // Decorator Pattern (chooseNOS method)
        Car nosCar = chooseNOS(chosenCar);

        // Template Pattern (stop method in Race class)
        // Decorator Pattern (stop method in Race class)
        Race race = new Race(racingType == 2);
        race.race(nosCar);
    }

    private static EngineBehavior chooseEngine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an engine:\n1. V6\n2. V8\n3. V12");
        int engineType = scanner.nextInt();

        switch (engineType) {
            case 1:
                return new V6Engine();
            case 2:
                return new V8Engine();
            case 3:
                return new V12Engine();
            default:
                throw new IllegalArgumentException("Invalid engine type");
        }
    }

    private static TurbochargerBehavior chooseTurbocharger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a turbocharger:\n1. Alpine\n2. Cummins\n3. Honeywell");
        int turbochargerType = scanner.nextInt();

        switch (turbochargerType) {
            case 1:
                return new AlpineTurbocharger();
            case 2:
                return new CumminsTurbocharger();
            case 3:
                return new HoneywellTurbocharger();
            default:
                throw new IllegalArgumentException("Invalid turbocharger type");
        }
    }

    private static Car chooseNOS(Car car) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose NOS type (1 for Resonac, 2 for Sema): ");
        int nosType = scanner.nextInt();
        Car nosCar = null;

        if (nosType == 1) {
            nosCar = new ResonacNOS(car);
        } else if (nosType == 2) {
            nosCar = new SemaNOS(car);
        }

        return nosCar;
    }
}
