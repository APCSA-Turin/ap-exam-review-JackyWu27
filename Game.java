public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    private boolean isBonus;
    private int playCounter;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public Game(Level level1, Level level2, Level level3, boolean isBonus) {
        levelOne = level1;
        levelTwo = level2;
        levelThree = level3;
        this.isBonus = isBonus;
        playCounter = 0;
    }

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public boolean isBonus() {
        return isBonus;
    }

    public int getScore(){ 
        int sc = 0;
        if (levelOne.goalReached()) {
            sc += levelOne.getPoints();
            if (levelTwo.goalReached()) {
                sc += levelTwo.getPoints();
                if (levelThree.goalReached()) {
                    sc += levelThree.getPoints();
        }
        }
        }
                if (isBonus()) {
                    sc *= 3;
        }
        return sc;
        }
        

        public int playManyTimes(int num){ 
            play();
            int max = getScore();
            for (int c = 1; c < num; c ++) {
            play();
            int tst = getScore();
                if (tst > max) {
                    max = tst;
            }
            }
            return max;
            }
            
            
        

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public void play() {
        if (playCounter == 0) {
            levelOne = new Level(true, 10);
            levelTwo = new Level(true, 20);
            levelThree = new Level(true, 45);
        } else if (playCounter == 1) {
            levelOne = new Level(true, 15);
            levelTwo = new Level(true, 35);
            levelThree = new Level(false, 25);
        } else if (playCounter == 2) {
            levelOne = new Level(true, 90);
            levelTwo = new Level(false, 35);
            levelThree = new Level(false, 25);
        } else if (playCounter == 3) {
            levelOne = new Level(true, 5);
            levelTwo = new Level(true, 5);
            levelThree = new Level(true, 10);
        } else if (playCounter == 4) {
            levelOne = new Level(true, 50);
            levelTwo = new Level(true, 15);
            levelThree = new Level(true, 35);
        } else if (playCounter == 5) {
            levelOne = new Level(true, 110);
            levelTwo = new Level(false, 50);
            levelThree = new Level(true, 10);
        }
        playCounter++;
    }
}