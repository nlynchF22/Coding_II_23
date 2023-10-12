import java.util.ArrayList;
public class Team {
    ArrayList<Team> teams = new ArrayList<Team>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;
    private int totalGoalsScored = 0;
    private int totalGoals = 0;
    private String teamName = "";
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public int getTotalWins() {
        return totalWins;
    }
    public void setTotalWins(int totalWins) {
        this.totalWins = totalWins;
    }
    public int getTotalLoses() {
        return totalLosses;
    }
    public void setTotalLoses(int totalLoses) {
        this.totalLosses = totalLoses;
    }
    public int getTotalTies() {
        return totalTies;
    }
    public void setTotalTies(int totalTies) {
        this.totalTies = totalTies;
    }
    public int getTotalGoalsScored() {
        return totalGoalsScored;
    }
    public void setTotalGoalsScored(int totalGoalsScored) {
        this.totalGoalsScored = totalGoalsScored;
    }
    public int getTotalGoals() {
        return totalGoals;
    }
    public void setTotalGoals(int totalGoals) {
        this.totalGoals = totalGoals;
    }
    public Team(String teamName){
        this.teamName = teamName;
        teams.add(this);
    }

    public void displayTeam(){
        System.out.println("Name: " + teamName);
        System.out.println("Wins: " + totalWins + ", Losses: " + totalLosses + ", Ties: " + totalTies);
        System.out.println("Points Scored: " + totalGoalsScored + ", Points Allowed: " + totalGoals);
    }
}
