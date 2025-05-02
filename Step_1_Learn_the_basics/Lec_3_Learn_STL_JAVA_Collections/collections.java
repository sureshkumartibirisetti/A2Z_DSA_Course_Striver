package Step_1_Learn_the_basics.Lec_3_Learn_STL_JAVA_Collections;

import java.util.*;
import java.util.Collections;

public class collections {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("ArrayList: " + arrayList);

        List<String> linkedList = new LinkedList<>(arrayList);
        linkedList.add("Mango");
        System.out.println("LinkedList: " + linkedList);

        // Set - HashSet, LinkedHashSet, TreeSet
        Set<String> hashSet = new HashSet<>(arrayList);
        hashSet.add("Banana"); // Duplicate won't be added
        System.out.println("HashSet: " + hashSet);

        Set<String> linkedHashSet = new LinkedHashSet<>(arrayList);
        linkedHashSet.add("Pineapple");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        Set<String> treeSet = new TreeSet<>(arrayList);
        treeSet.add("Grapes");
        System.out.println("TreeSet (Sorted): " + treeSet);

        // Queue - PriorityQueue and LinkedList
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(20);
        priorityQueue.add(5);
        priorityQueue.add(15);
        System.out.println("PriorityQueue (Natural Order): " + priorityQueue);

        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        System.out.println("Queue: " + queue);
        System.out.println("Queue Poll: " + queue.poll());
        System.out.println("Queue After Poll: " + queue);

        // Map - HashMap, LinkedHashMap, TreeMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Three");
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        System.out.println("HashMap: " + hashMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        System.out.println("LinkedHashMap (Insertion Order): " + linkedHashMap);

        Map<Integer, String> treeMap = new TreeMap<>(hashMap);
        System.out.println("TreeMap (Sorted by Key): " + treeMap);

        // Iteration
        System.out.print("For-each loop (ArrayList): ");
        for (String fruit : arrayList) {
            System.out.print(fruit + " ");
        }

        System.out.print("\nIterator (HashSet): ");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.print("\nLambda (TreeSet): ");
        treeSet.forEach(item -> System.out.print(item + " "));

        // Sorting
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 2, 5, 3, 9));
        Collections.sort(numbers);
        System.out.println("\nSorted Numbers (Natural): " + numbers);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted Numbers (Descending): " + numbers);
    }
}
