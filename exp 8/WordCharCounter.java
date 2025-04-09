import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class WordCharCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = input.nextLine();
        
        int wordCount = 0;
        int charCount = 0;
        
        try (FileReader reader = new FileReader(fileName);
             Scanner fileScanner = new Scanner(reader)) {
            
            while (fileScanner.hasNext()) {
                String word = fileScanner.next();
                wordCount++;
                charCount += word.length(); // Excluding whitespace characters
            }
            
            System.out.println("Total words: " + wordCount);
            System.out.println("Total characters (excluding whitespace): " + charCount);
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (IOException e) {
            System.out.println("Error: An IO exception occurred while reading the file.");
        }
        
        input.close();
    }
}
