public class MiscStringOperations {

    public static int wordCount(String str) {
        if (str.isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }

    public static String arrayToString(char[] array) {
        return new String(array);
    }

    public static char mostFrequent(String str) {
        int[] freq = new int[256];
        for (char c : str.toCharArray()) {
            freq[c]++;
        }
        int max = 0;
        char result = ' ';
        for (char c : str.toCharArray()) {
            if (freq[c] > max) {
                max = freq[c];
                result = c;
            }
        }
        return result;
    }

    public static String replaceSubstring(String string1, String string2, String string3) {
        return string1.replace(string2, string3);
    }

    public static void main(String[] args) {
        System.out.println("Word Count: " + wordCount("Four score and seven years ago"));
        
        char[] array = {'H', 'e', 'l', 'l', 'o'};
        System.out.println("Array to String: " + arrayToString(array));
        
        System.out.println("Most Frequent Character: " + mostFrequent("gravity"));
        
        String modifiedString = replaceSubstring("the dog jumped over the fence", "the", "that");
        System.out.println("Replaced String: " + modifiedString);
    }
}
