import java.io.*;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java FileWordCount inputFile.txt outputFile.txt");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        TreeMap<String, Integer> map = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        map.put(word, map.getOrDefault(word, 0) + 1);
                    }
                }
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                bw.write(entry.getKey() + " : " + entry.getValue());
                bw.newLine();
            }

            bw.close();

            System.out.println("Word count written to " + outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}