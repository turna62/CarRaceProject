class RoadsterCar extends Car {
    public RoadsterCar(String carName, EngineBehavior engineBehavior, TurbochargerBehavior turbochargerBehavior) {
        super(carName, engineBehavior, turbochargerBehavior);
    }

    @Override
    public void applyNitrousOxide() {
        // No specific implementation for RoadsterCar
    }
}