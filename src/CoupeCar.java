class CoupeCar extends Car {
    public CoupeCar(String carName, EngineBehavior engineBehavior, TurbochargerBehavior turbochargerBehavior) {
        super(carName, engineBehavior, turbochargerBehavior);
    }

    @Override
    public void applyNitrousOxide() {
        // No specific implementation for CoupeCar
    }
}