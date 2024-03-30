class ResonacNOS extends Car {
    private Car car;

    public ResonacNOS(Car car) {
        super(car.getCarName(), car.getEngineBehavior(), car.getTurbochargerBehavior());
        this.car = car;
    }

    @Override
    public void applyNitrousOxide() {
        System.out.println("Selecting Resonac for " + getCarName());
        System.out.println("Applying Resonac Nitrous Oxide System");
    }

    @Override
    public void carInfo() {
        car.carInfo();
        applyNitrousOxide();
    }
}
