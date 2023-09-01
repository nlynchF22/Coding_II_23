public class TestClass {

    public static void main(String args[]) {
        
        //Create an instance of ComputeMethods, 
        ComputeMethods compute = new ComputeMethods();
        //invoke the 3 methods and dispay their results
        System.out.println(compute.fToC(70.0));
        System.out.println(compute.hypotenuse(5, 9));
        System.out.println(compute.roll());
    }
}
