import java.util.List;

public class TripleChar implements ConvertStrategy {

	public void listToString(List<String> list) {
		//String listAsString = String.join("", list).replaceAll("(.{3})", "$1\n");
		
		String listAsString = "";
		for (int i = 1; i <= list.size(); i++) {
			listAsString += list.get(i-1);
			if(i%3 == 0) {
				listAsString += "\n";
			}
		}
				
		System.out.println(listAsString);
	}

}