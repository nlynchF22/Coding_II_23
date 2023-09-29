public class StringProject {
    
    private String myString;

    public StringProject(String str){
        myString = str;
    }
    public String toString() {
        return myString;
    }
    //Reverse Case
    public String reverseCase(){
        String reversedCase = myString;
        String newString = "";
        for(int i = 0; i < reversedCase.length(); i++){
            if(Character.isUpperCase(reversedCase.charAt(i))){
                newString += Character.toLowerCase(reversedCase.charAt(i));
            }else if(Character.isLowerCase(reversedCase.charAt(i))){
                newString += Character.toUpperCase(reversedCase.charAt(i));
            }else {
                newString += reversedCase.charAt(i);
            }
        }
        return newString;
    }
    //Character Count
    public int characterCount(String character){
        String currentString = myString;
        int totalCount = 0;
        char letter = character.charAt(0);
        for(int i = 0; i < currentString.length(); i++){
            boolean correctChar = (currentString.charAt(i) == letter);
            if(correctChar == true){
                totalCount++;
            }
        }
        return totalCount;
    }
    //Reverse String
    public String reverseString(){
        String stringToReverse = myString;
        String newString = "";
        for(int i = stringToReverse.length() - 1; i >= 0; i--){
            newString += stringToReverse.charAt(i);
        }
        return newString;
    }
    //Each word on a line
    public String eachWordOnALine(){
        String wordsToSeperate = myString;
        String newString = "";
        newString = wordsToSeperate.replaceAll(" ", " \n");
        return newString + "\n";
    }
    //Word Count
    public int wordCount(){
        String countingString = myString;
        int wordCounter = 1; 
        for(int i = 0; i < countingString.length(); i++){
            boolean correctChar = (countingString.charAt(i) == ' ');
            if(correctChar == true){
                wordCounter += 1;
            }
        }
        return wordCounter;
    }
    //Character Count
    public int characterCount(){
        String stringToBeCounted = myString;
        int charCounter = 0;
        for(int i = 0; i < stringToBeCounted.length(); i++){
            boolean correctChar = (stringToBeCounted.charAt(i) == ' ');
            if(correctChar == false){
                charCounter += 1;
            }
        }
        return charCounter;
    }
    //Average word length
    public double avgWordLength(){
        return (double)characterCount() / wordCount();
    }
    //Vowel count
    public int vowelCount(){
        String stringToBeCounted = myString;
        int vowelCounter = 0;
        for(int i = 0; i < stringToBeCounted.length(); i++){
            if(stringToBeCounted.charAt(i) == 'a' || stringToBeCounted.charAt(i) == 'e' || stringToBeCounted.charAt(i) == 'i' || stringToBeCounted.charAt(i) == 'o' || stringToBeCounted.charAt(i) == 'u' || stringToBeCounted.charAt(i) == 'A' || stringToBeCounted.charAt(i) == 'E' || stringToBeCounted.charAt(i) == 'I' || stringToBeCounted.charAt(i) == 'O' || stringToBeCounted.charAt(i) == 'U'){
                vowelCounter += 1;
            }
        }
        return vowelCounter;
    }
    //Sub-string Count
    public int substrCount(String str){
        int count = 0;
        int currentIdx = 0;
        while (currentIdx != -1){
            currentIdx = myString.indexOf(str, currentIdx + 1);
            if(currentIdx != -1){
                count++;
            }
        }
        return count;
    }
    //Palindrome
    /*public boolean isPalindrome(){
        String str = "";
        for(int i = 0; i < myString.length(); i++){
            if(Character.isLetter(myString.charAt(i))){
                str += Character.toLowerCase(myString.charAt(i));
            }
        }
        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt((str.length(i) - 1))){
                
            }
        }
    }*/
}