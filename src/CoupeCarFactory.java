class CoupeCarFactory implements CarFactory {
    public Car createCar(String carName, EngineBehavior engineBehavior, TurbochargerBehavior turbochargerBehavior) {
        return new CoupeCar(carName, engineBehavior, turbochargerBehavior);
    }

}