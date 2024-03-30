class RoadsterCarFactory implements CarFactory {
    public Car createCar(String carName, EngineBehavior engineBehavior, TurbochargerBehavior turbochargerBehavior) {
        return new RoadsterCar(carName, engineBehavior, turbochargerBehavior);
    }

}