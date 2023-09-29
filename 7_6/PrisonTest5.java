//Section 7, Lesson 6 Starter for Exercise 2 - Slide 16

public class PrisonTest5 {
    public static void main(String[] args){
        Cell2 cellA1 = new Cell2("A1", false, 1234);
        Cell2 cellB1 = new Cell2("B1", false, 1234);
        Cell2 cellC1 = new Cell2("C1", false, 1234);
        Cell2 cellD1 = new Cell2("D1", false, 1234);

        System.out.println(Prisoner5.getPrisonerCount());
        
        Prisoner5 bubba = new Prisoner5("Bubba", 2.08, 4, cellA1);
        Prisoner5 johnnyJohnny = new Prisoner5("Johnny Johnny", 2.03, 25, cellB1);
        Prisoner5 billyBobJoe = new Prisoner5("Billy Bob Joe", 1.89, 20, cellC1);
        Prisoner5 papaAucachala = new Prisoner5("Papa Aucahala", 2.10, 1, cellD1);
        bubba.display();
        johnnyJohnny.display();
        billyBobJoe.display();
        papaAucachala.display();
        
        System.out.println(Prisoner5.getPrisonerCount());
        
    }
}
