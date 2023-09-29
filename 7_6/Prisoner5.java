//Section 7, Lesson 6 Starter for Exercise 2 - Slide 16

public class Prisoner5 {
    //Fields 
    private String name;
    private double height;
    private int sentence;
    private Cell cell;
    private static int prisonerCount = 0;
    public int bookingNumber;

    //Constructor
    public Prisoner5(String name, double height, int sentence, Cell cell){
        this.name = name;
        this.height = height;
        this.sentence = sentence;
        this.cell = cell;
        prisonerCount++;
        bookingNumber = prisonerCount;
    }
    
    public Prisoner5(String name2, double height2, int sentence2, Cell2 cellA1) {
    }

    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(){
        System.out.println("Name: " +getName());
        System.out.println("Height: " +getHeight() +"m");
        System.out.println("Sentence: " +getSentence() +" yrs");
        System.out.println("Cell: " + getCell());
        System.out.println("Booking number: " + bookingNumber);
    }
    
    //Getters
    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public int getSentence() {
        return sentence;
    }
    public Cell getCell() {
        return cell;
    }
    public static int getPrisonerCount(){
        return prisonerCount;
    }
    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setSentence(int sentence) {
        this.sentence = sentence;
    }
    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
