class Player {
    private static Player instance = new Player();
    private boolean isSinglePlayer;

    private Player() {
        System.out.println("Player created");
        isSinglePlayer = true;
    }

    public static Player getInstance() {
        return instance;
    }

    public boolean isSinglePlayer() {
        return isSinglePlayer;
    }
}

