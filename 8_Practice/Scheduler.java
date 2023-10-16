import java.util.Scanner;
import java.util.InputMismatchException;
public class Scheduler {
    Scanner sc = new Scanner(System.in);
    private double temp = 0.0;
    public Scheduler(){
        Team alpha = new Team("Alpha");
        Team beta = new Team("Beta");
        Team charlie = new Team("Charlie");
        Team delta = new Team("Delta");
        int tooCold = 0;
        while(tooCold < 3){
            System.out.println("Please give a temperature to play at");
            try{
                temp = sc.nextDouble();
                if(temp < 32.0){
                    System.out.println("It is too cold");
                    tooCold++;
                } else{
                    Game game = new Game(temp);
                    tooCold = 0;
                }
            } catch (InputMismatchException e) {
                System.out.println("This is not a valid temperature");
                sc.next();
            }
        }
        for (Team team : Team.teams) {
            team.displayTeam();
        }
        for (Game game : Game.games) {
            game.displayGame();
        }
        
    }
}
