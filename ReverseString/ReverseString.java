
public class ReverseString {
    public static String reverseString(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();
        if(sentence == null){
            return null;
        }

        String[] words = sentence.split(" ");
        for(int i = words.length -1; i >= 0; i--){
            stringBuilder.append(words[i]);
            stringBuilder.append(" ");
        }
        String reversedString = stringBuilder.toString().trim().replaceAll("\\s+", " ");
        System.out.println(reversedString);
        return reversedString;
    }

    
    public static void main(String[] args) {
        reverseString(" This string needs         to get reversed ");
    }
}
