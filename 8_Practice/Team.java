import java.util.ArrayList;
public class Team {
    public static ArrayList<Team> teams = new ArrayList<Team>();
    private int totalWins;
    private int totalLosses;
    private int totalTies;
    private int totalGoalsScored;
    private int totalGoalsAllowed;
    private String teamName;
    public Team(String teamName){
        this.teamName = teamName;
        totalWins = 0;
        totalLosses = 0;
        totalTies = 0;
        totalGoalsScored = 0;
        totalGoalsAllowed = 0;
        teams.add(this);
    }

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
    public int getTotalGoalsAllowed() {
        return totalGoalsAllowed;
    }
    public void setTotalGoalsAllowed(int totalGoals) {
        this.totalGoalsAllowed = totalGoals;
    }
    

    public void displayTeam(){
        System.out.println("Name: " + teamName);
        System.out.println("Wins: " + totalWins + ", Losses: " + totalLosses + ", Ties: " + totalTies);
        System.out.println("Points Scored: " + totalGoalsScored + ", Points Allowed: " + totalGoalsAllowed);
    }
}
