import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;

public class _2104394_007b {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java TextComparison <file1> <file2>");
            System.exit(1);
        }

        String file1 = args[0];
        String file2 = args[1];

        try {
            ArrayList<String> wordsList1 = readWords(file1);
            ArrayList<String> wordsList2 = readWords(file2);

            System.out.println("Total words in " + file1 + ": " + wordsList1.size());
            System.out.println("Total words in " + file2 + ": " + wordsList2.size());

            long startTime = System.currentTimeMillis();
            int commonWordsArrayList = findCommonWordsArrayList(wordsList1, wordsList2);
            long endTime = System.currentTimeMillis();
            System.out.println("Common words with ArrayLists: " + commonWordsArrayList);
            System.out.println("Time taken with ArrayLists: " + (endTime - startTime) + " ms");

            startTime = System.currentTimeMillis();
            int commonWordsLinkedList = findCommonWordsLinkedList(wordsList1, wordsList2);
            endTime = System.currentTimeMillis();
            System.out.println("Common words with LinkedLists: " + commonWordsLinkedList);
            System.out.println("Time taken with LinkedLists: " + (endTime - startTime) + " ms");

            startTime = System.currentTimeMillis();
            int commonWordsHashSet = findCommonWordsHashSet(wordsList1, wordsList2);
            endTime = System.currentTimeMillis();
            System.out.println("Common words with HashSets: " + commonWordsHashSet);
            System.out.println("Time taken with HashSets: " + (endTime - startTime) + " ms");

            startTime = System.currentTimeMillis();
            int commonWordsTreeSet = findCommonWordsTreeSet(wordsList1, wordsList2);
            endTime = System.currentTimeMillis();
            System.out.println("Common words with TreeSets: " + commonWordsTreeSet);
            System.out.println("Time taken with TreeSets: " + (endTime - startTime) + " ms");

        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
    }

    private static ArrayList<String> readWords(String filename) throws IOException {
        ArrayList<String> wordsList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                    if (!word.isEmpty()) {
                        wordsList.add(word);
                    }
                }
            }
        }
        return wordsList;
    }

    private static int findCommonWordsArrayList(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> commonWords = new ArrayList<>(list1);
        commonWords.retainAll(list2);
        return commonWords.size();
    }

    private static int findCommonWordsLinkedList(ArrayList<String> list1, ArrayList<String> list2) {
        LinkedList<String> commonWords = new LinkedList<>(list1);
        commonWords.retainAll(list2);
        return commonWords.size();
    }

    private static int findCommonWordsHashSet(ArrayList<String> list1, ArrayList<String> list2) {
        HashSet<String> commonWords = new HashSet<>(list1);
        commonWords.retainAll(list2);
        return commonWords.size();
    }

    private static int findCommonWordsTreeSet(ArrayList<String> list1, ArrayList<String> list2) {
        TreeSet<String> commonWords = new TreeSet<>(list1);
        commonWords.retainAll(list2);
        return commonWords.size();
    }
}