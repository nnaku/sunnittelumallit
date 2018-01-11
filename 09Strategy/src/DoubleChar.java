import java.util.Iterator;
import java.util.List;

public class DoubleChar implements ConvertStrategy {


	public void listToString(List<String> list) {
		// String listAsString = String.join("", list).replaceAll("(.{2})", "$1\n");
		String print ="";
		Iterator<String> listIterator = list.iterator();
		while(listIterator.hasNext()) {
			print += listIterator.next();
			print += listIterator.next();
			print += "\n";
		}
		System.out.println(print);
	}

}