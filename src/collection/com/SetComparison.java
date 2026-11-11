package collection.com;
import java.util.*;
public class SetComparison {
	 public static void main(String[] args) {
	        Set<String> hashSet = new HashSet<>(Arrays.asList("adam", "Ananas", "orange"));
	        Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList("adam", "Ananas", "orange"));
	        Set<String> treeSet = new TreeSet<>(Arrays.asList("adam", "Ananas", "orange"));
	        
	        System.out.println("HashSet (non ordonné) : " + hashSet);
	        System.out.println("LinkedHashSet (ordre d'insertion) : " + linkedHashSet);
	        System.out.println("TreeSet (trié alphabétiquement) : " + treeSet);
	    }
}
