//Section 7, Lesson 3 Starter for Exercise 1 - Slide 6

public class Prisoner2 {

    //Fields 
    public String name;
    public double height;
    public int sentence;
    /*public void setFields(String n,double h,int s){
        name = n;
        height = h;
        sentence = s;
    }*/
    //Constructor
    public Prisoner2(String name, double height, int sentence){
        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }//end constructor
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }   
}
