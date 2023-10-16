import java.util.ArrayList;
import java.util.Random;
public class Game {
    public static ArrayList<Game> games = new ArrayList<Game>();
    private Random rndNum = new Random();
    private static int iD = 0;
    public int gameNumber;
    private double temp = 0.0;
    private Team a;
    private Team b;
    private int pointsScoredTeamB = 0;
    private int pointsScoredTeamA = 0;
    private int teamsAmount = Team.teams.size();
    public Game(double temp){
        this.temp = temp;
        for(int i = 0; i < 2; i++){
            int teamA = rndNum.nextInt(teamsAmount);
            int teamB;
            do{
                teamB = rndNum.nextInt(teamsAmount);
            } while(teamA == teamB);
            a = Team.teams.get(teamA);
            b = Team.teams.get(teamB);
            if(48.0 < temp && temp < 70.0){
                pointsScoredTeamB = rndNum.nextInt(8);
                pointsScoredTeamA = rndNum.nextInt(8);
            } else if(temp < 48.0){
                pointsScoredTeamA = rndNum.nextInt(6);
                pointsScoredTeamB = rndNum.nextInt(6);
            } else if(temp > 70.0){
                pointsScoredTeamA = rndNum.nextInt(10);
                pointsScoredTeamB = rndNum.nextInt(10);
            }
            if(pointsScoredTeamA < pointsScoredTeamB){
                int currentWins = b.getTotalWins();
                int currentLoses = a.getTotalLoses();
                a.setTotalLoses(currentLoses + 1);
                b.setTotalWins(currentWins + 1);
            } else if(pointsScoredTeamB < pointsScoredTeamA){
                int currentWins = b.getTotalWins();
                int currentLoses = a.getTotalLoses();
                a.setTotalLoses(currentLoses + 1);
                b.setTotalWins(currentWins + 1);
            } else if(pointsScoredTeamA == pointsScoredTeamB){
                int currentTiesA = a.getTotalTies();
                int currentTiesB = b.getTotalTies();
                a.setTotalTies(currentTiesA + 1);
                b.setTotalTies(currentTiesB + 1);
            }
            a.setTotalGoalsScored(pointsScoredTeamA);
            a.setTotalGoalsAllowed(pointsScoredTeamB);
            b.setTotalGoalsScored(pointsScoredTeamB);
            b.setTotalGoalsAllowed(pointsScoredTeamA);

            games.add(this);
            iD++;
            gameNumber = iD;
        }
    }

    public void displayGame(){
        System.out.println("Game #" + gameNumber);
        System.out.println("Tempature: " + temp);
        System.out.println("Away Team: " + b.getTeamName() + ", " + pointsScoredTeamB);
        System.out.println("Home Team: " + a.getTeamName() + ", " + pointsScoredTeamA);
    }
}
