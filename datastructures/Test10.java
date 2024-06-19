package datastructures;
import java.util.Iterator;
import java.util.LinkedList;

public class Test10 {
public static void main (String[] args) {
	LinkedList<String> LL = new LinkedList<String>();
	LL.add("Robin");
	LL.add("Vincent");
	LL.add("Robert");
	LL.add("Alex");
	Iterator<String> itr = LL.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
