//Section 7, Lesson 4 Starter for Exercise 2 - Slide 14

public class Prisoner3 {
    //Fields 
    public String name;
    public double height;
    public int sentence;
    
    //Constructor
    public Prisoner3(String name, double height, int sentence){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    }
    public Prisoner3(){
        name = null;
        height = 0.0;
        sentence = 0;
    }
    public void displayPrisoner(){
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Years sentenced: " + sentence);
        }
    public void displayPrisoner(boolean angy){
        displayPrisoner();
        if(angy == true){
            think();
        }
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    
    
    
}
