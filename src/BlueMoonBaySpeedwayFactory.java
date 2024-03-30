class BlueMoonBaySpeedwayFactory implements TrackFactory {
    public void trackInfo(int racingType) {
        System.out.println("Track: Blue Moon Bay Speedway (USA)");
        if (racingType == 1) {
            System.out.println("Starting Sprint Racing....");
            System.out.println("Crossing the start line on Blue Moon Bay Speedway (USA)");
        } else {
            System.out.println("Starting Circuit Racing....");
            System.out.println("Crossing the finish line on Blue Moon Bay Speedway (USA)");
        }
    }
}