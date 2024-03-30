interface CarFactory {

    Car createCar(String carName, EngineBehavior engineBehavior, TurbochargerBehavior turbochargerBehavior);
}