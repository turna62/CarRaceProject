// Decorator Pattern
class NOS extends Car {
    private Car car;

    public NOS(Car car) {
        super("NOS " + car.getCarName(), car.getEngineBehavior(), car.getTurbochargerBehavior());
        this.car = car;
    }

    @Override
    public void applyNitrousOxide() {
        System.out.println("Applying NOS to the car");
    }

    @Override
    public void carInfo() {
        super.carInfo();
        applyNitrousOxide();
    }

    @Override
    public void accelerate() {
        car.accelerate();
    }

    @Override
    public void start() {
        car.start();
    }

    @Override
    public void stop() {
        car.stop();
    }
}
