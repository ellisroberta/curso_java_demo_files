package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {
    public static void main(String[] args) {
        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
        String path = "out.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path , true))) { // true para não reacriar o arquivo e sim adicionar ao final
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace(); // Call to 'printStackTrace()' should probably be replaced with more robust logging
        }
    }
}