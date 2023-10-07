import java.util.*;

public class _2104394_07a {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
       
        int numElements = 10000;

        long arrayListFrontInsertionTime = measureFrontInsertionTime(arrayList, numElements);
        long linkedListFrontInsertionTime = measureFrontInsertionTime(linkedList, numElements);

        long arrayListMiddleInsertionTime = measureMiddleInsertionTime(arrayList, numElements);
        long linkedListMiddleInsertionTime = measureMiddleInsertionTime(linkedList, numElements);

        long arrayListEndInsertionTime = measureEndInsertionTime(arrayList, numElements);
        long linkedListEndInsertionTime = measureEndInsertionTime(linkedList, numElements);

        long arrayListFrontDeletionTime = measureFrontDeletionTime(arrayList, numElements);
        long linkedListFrontDeletionTime = measureFrontDeletionTime(linkedList, numElements);

        long arrayListMiddleDeletionTime = measureMiddleDeletionTime(arrayList, numElements);
        long linkedListMiddleDeletionTime = measureMiddleDeletionTime(linkedList, numElements);

        long arrayListEndDeletionTime = measureEndDeletionTime(arrayList, numElements);
        long linkedListEndDeletionTime = measureEndDeletionTime(linkedList, numElements);

        System.out.println("ArrayList Front Insertion Time: " + arrayListFrontInsertionTime + " milliseconds");
        System.out.println("LinkedList Front Insertion Time: " + linkedListFrontInsertionTime + " milliseconds");

        System.out.println("ArrayList Middle Insertion Time: " + arrayListMiddleInsertionTime + " milliseconds");
        System.out.println("LinkedList Middle Insertion Time: " + linkedListMiddleInsertionTime + " milliseconds");

        System.out.println("ArrayList End Insertion Time: " + arrayListEndInsertionTime + " milliseconds");
        System.out.println("LinkedList End Insertion Time: " + linkedListEndInsertionTime + " milliseconds");

        System.out.println("ArrayList Front Deletion Time: " + arrayListFrontDeletionTime + " milliseconds");
        System.out.println("LinkedList Front Deletion Time: " + linkedListFrontDeletionTime + " milliseconds");

        System.out.println("ArrayList Middle Deletion Time: " + arrayListMiddleDeletionTime + " milliseconds");
        System.out.println("LinkedList Middle Deletion Time: " + linkedListMiddleDeletionTime + " milliseconds");

        System.out.println("ArrayList End Deletion Time: " + arrayListEndDeletionTime + " milliseconds");
        System.out.println("LinkedList End Deletion Time: " + linkedListEndDeletionTime + " milliseconds");
    }

    private static long measureFrontInsertionTime(List<Integer> list, int numElements) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numElements; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long measureMiddleInsertionTime(List<Integer> list, int numElements) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numElements; i++) {
            int middleIndex = list.size() / 2;
            list.add(middleIndex, i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long measureEndInsertionTime(List<Integer> list, int numElements) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numElements; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long measureFrontDeletionTime(List<Integer> list, int numElements) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numElements; i++) {
            list.remove(0);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long measureMiddleDeletionTime(List<Integer> list, int numElements) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numElements; i++) {
            int middleIndex = list.size() / 2;
            list.remove(middleIndex);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long measureEndDeletionTime(List<Integer> list, int numElements) {
        long startTime = System.currentTimeMillis();
        for (int i = numElements - 1; i >= 0; i--) {
            list.remove(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}