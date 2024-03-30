abstract class Car {
    private String carName;
    private EngineBehavior engineBehavior;
    private TurbochargerBehavior turbochargerBehavior;

    public Car(String carName, EngineBehavior engineBehavior, TurbochargerBehavior turbochargerBehavior) {
        this.carName = carName;
        this.engineBehavior = engineBehavior;
        this.turbochargerBehavior = turbochargerBehavior;
    }

    public void start() {
        System.out.println("Starting " + carName);
    }

    public void accelerate() {
        System.out.println("Accelerating " + carName);
    }

    public void stop() {
        System.out.println("Stopping " + carName);
    }

    public void performPitStop() {
        System.out.println("Performing Pit Stop");
    }

    public abstract void applyNitrousOxide();

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setEngineBehavior(EngineBehavior engineBehavior) {
        this.engineBehavior = engineBehavior;
    }

    public void setTurbochargerBehavior(TurbochargerBehavior turbochargerBehavior) {
        this.turbochargerBehavior = turbochargerBehavior;
    }

    public void carInfo() {
        System.out.println("Car Name: " + carName);
        System.out.print("Engine: ");
        engineBehavior.engineInfo();
        System.out.print("Turbocharger: ");
        turbochargerBehavior.turbochargerInfo();
    }

    public EngineBehavior getEngineBehavior() {
        return engineBehavior;
    }

    public TurbochargerBehavior getTurbochargerBehavior() {
        return turbochargerBehavior;
    }
}