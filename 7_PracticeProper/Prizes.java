public class Prizes {
    private int prizeCost = 0;
    private String prizeName = "";

    public int getPrizeCost() {
        return prizeCost;
    }

    public void setPrizeCost(int prizeCost) {
        this.prizeCost = prizeCost;
    }

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    public Prizes(int prizeCost, String prizeName){
        this.prizeCost = prizeCost;
        this.prizeName = prizeName;
    }
}
