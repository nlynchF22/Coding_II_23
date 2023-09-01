import java.util.Random;


public class ComputeMethods {
    public double fToC(double degreesF){
        double degreesC = ((5.0/9.0) * (degreesF - 32));
        return(degreesC);
    }
    public double hypotenuse(int a, int b){
        double h = Math.sqrt((a*a)+(b*b));
        return(h);
    }
    public int roll(){
        Random num = new Random();
        int dice1 = num.nextInt(6);
        int dice2 = num.nextInt(6);
        return(dice1 + dice2);
    }

    
}

