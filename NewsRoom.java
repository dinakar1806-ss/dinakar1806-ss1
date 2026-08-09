import java.util.Scanner;

public class NewsRoom {

    public static String[] findShortestAndLongestWord(String text) {

        
        text = text.replaceAll("[^a-zA-Z0-9 ]", "");

        
        String[] words = text.trim().split("\\s+");

        String shortest = word 
        String longest = words[0];

        for (String word : words) {

            if (word.length() < shortest.length()) {
                shortest = word;
            }

            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return new String[]{
                "Shortest: \"" + shortest + "\" (" + shortest.length() + ")",
                "Longest: \"" + longest + "\" (" + longest.length() + ")"
        };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String text = sc.nextLine();

        String[] result = findShortestAndLongestWord(text);

        System.out.println(result[0]);
        System.out.println(result[1]);

        sc.close();
    }
}