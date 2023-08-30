public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        int person1 = 10;
        int person2 = 12;
        int person3 = 9;
        int person4 = 8;
        int person5 = 7;
        int person6 = 15;
        int person7 = 11;
        int person8 = 30;
        double tip = 0.15;
        double tax = 1.05;
        System.out.println(person1 * (tax + tip));
        System.out.println(person2 * (tax + tip));
        System.out.println(person3 * (tax + tip));
        System.out.println(person4 * (tax + tip));
        System.out.println(person5 * (tax + tip));
        System.out.println(person6 * (tax + tip));
        System.out.println(person7 * (tax + tip));
        System.out.println(person8 * (tax + tip));
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        
    }    
}
