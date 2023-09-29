//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class PrisonTest4 {
    public static void main(String[] args){
        Cell cell1 = new Cell("A1", false, 1234);
        Prisoner4 bubba = new Prisoner4("Bubba", 2.08, 4, cell1);
        bubba.display(false);
        cell1.openDoor(1234);
        cell1.openDoor(1234);
        cell1.openDoor(1234);
    }
}
