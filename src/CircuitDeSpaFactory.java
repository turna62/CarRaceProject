class CircuitDeSpaFactory implements TrackFactory {
    public void trackInfo(int racingType) {
        System.out.println("Track: Circuit de Spa-Francorchamps (Germany)");
        if (racingType == 1) {
            System.out.println("Starting Sprint Racing....");
            System.out.println("Crossing the start line on Circuit de Spa-Francorchamps (Germany)");
        } else {
            System.out.println("Starting Circuit Racing....");
            System.out.println("Crossing the finish line on Circuit de Spa-Francorchamps (Germany)");
        }
    }
}