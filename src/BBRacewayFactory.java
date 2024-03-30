class BBRacewayFactory implements TrackFactory {
    public void trackInfo(int racingType) {
        System.out.println("Track: BB Raceway (Japan)");
        if (racingType == 1) {
            System.out.println("Starting Sprint Racing....");
            System.out.println("Crossing the start line on BBRaceway (Japan)");
        } else {
            System.out.println("Starting Circuit Racing....");
            System.out.println("Crossing the finish line on BBRaceway (Japan)");
        }
    }
}