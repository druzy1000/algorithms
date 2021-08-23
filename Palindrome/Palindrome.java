public class Palindrome {

    public static boolean isPalindrome(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        word = word.replaceAll("\\s+", "").toLowerCase();
        if(word == " "){   //Empty string 
            return true;
        }

        for(int i = word.length() -1; i >= 0; i--){
            stringBuilder.append(word.charAt(i));
        }
        boolean palindrome = stringBuilder.toString().equals(word);
        System.out.println(palindrome);
        return palindrome;
    }
    
    public static void main(String[] args) {
        isPalindrome("racecar");
    }
}
