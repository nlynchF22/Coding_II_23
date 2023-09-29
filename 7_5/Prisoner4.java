//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class Prisoner4 {
    //Fields 
    private String name;
    private double height;
    private int sentence;
    private Cell prisonCell;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getSentence() {
        return sentence;
    }

    public void setSentence(int sentence) {
        this.sentence = sentence;
    }

    public Cell getPrisonCell() {
        return prisonCell;
    }

    public void setPrisonCell(Cell prisonCell) {
        this.prisonCell = prisonCell;
    }

    //Constructor
    public Prisoner4(String name, double height, int sentence, Cell prisonCell){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    this.prisonCell = prisonCell;
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(boolean b){
        System.out.println("Name: " +name);
        System.out.println("Height: " +height);
        System.out.println("Sentence: " +sentence);
        System.out.println("Cell: " + prisonCell.getNameOfCell());
    }
    /*public void openDoor(){
        if(prisonCell.doorIsOpen == true){
            prisonCell.doorIsOpen = false;
            System.out.println("Door has closed");
        } else if(prisonCell.doorIsOpen == false){
            prisonCell.doorIsOpen = true;
            System.out.println("Door has opened");
        }
    }*/
}
