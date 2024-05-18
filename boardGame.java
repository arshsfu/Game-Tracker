class boardGame{
    private String gameName;
    private double gameWeight;
    private int gamePlayed = 0 ;

    boardGame(){};

    boardGame(String gameName, double gameWeight, int gamePlayed){
        this.gameName = gameName;
        this.gameWeight = gameWeight;
        this.gamePlayed = gamePlayed;
    }

    public String getGameName(){
        return gameName;
    }

    public double getGameWeight(){
        return gameWeight;
    }

    public int getGamePlayed(){
        return gamePlayed;
    }

    public void setGameName(String gameName){
        this.gameName = gameName;
    }

    public void setGameWeight(double gameWeight){
        this.gameWeight = gameWeight;
    }

    public void setGamePlayed(int gamePlayed){
        this.gamePlayed = gamePlayed;
    }

    @Override
    public String toString(){
        return "Game Name: " + gameName + "\nGame Weight: " + gameWeight + "\nGame Played: " + gamePlayed;
    }   

}