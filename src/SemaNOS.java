class SemaNOS extends Car {
    private Car car;

    public SemaNOS(Car car) {
        super(car.getCarName(), car.getEngineBehavior(), car.getTurbochargerBehavior());
        this.car = car;
    }

    @Override
    public void applyNitrousOxide() {
        System.out.println("Selecting Sema for " + getCarName());
        System.out.println("Applying Sema Nitrous Oxide System");
    }

    @Override
    public void carInfo() {
        car.carInfo();
        applyNitrousOxide();
    }
}