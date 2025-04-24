public class CombinedTable {
    private SingleTable s1;
    private SingleTable s2;
    private int seated = 0;

    public CombinedTable (SingleTable s1, SingleTable s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public boolean canSeat(int seating) {
        if (seated + seating <= s1.getNumSeats() + s2.getNumSeats()) {
            seated += seating;
            return true;
        }
        return false;
    }

    public double getDesirability() {
        if (s1.getHeight() == s2.getHeight()) {
            return (s1.getViewQuality() + s2.getViewQuality()) / 2;
        }
        return (s1.getViewQuality() + s2.getViewQuality()) / 2 - 10;
    }
}