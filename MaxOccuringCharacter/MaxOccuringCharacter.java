public class MaxOccuringCharacter {
    private static int MAX_INT = 1000;

    public static char getMaxOccuringChar(String sentence) { 
        sentence = sentence.replaceAll("[0-9\s.!?\\-]+", "").toLowerCase();
        int count[] = new int[MAX_INT]; 
        int max = count[0];   
        char result = ' ';  
        char[] charArray = sentence.toCharArray();

        for (int i=0; i<charArray.length; i++){
            count[charArray[i]]++; 
        }
       
        for (int i = 0; i < sentence.length(); i++) { 
            if (max < count[charArray[i]]) { 
                max = count[charArray[i]]; 
                result = charArray[i]; 
            } 
        } 
        System.out.printf("Max Occurring Char is \"%c\".",result);
        return result; 
    } 
    public static void main(String[] args){
        getMaxOccuringChar("    abcDFxx   z.!?SDDdffs   ");
    }
}
