import java.util.List;

public class SingleChar implements ConvertStrategy {

	public void listToString(List<String> list) {
		String listAsString = String.join("", list).replaceAll("(.{1})", "$1\n");
		System.out.println(listAsString);
	}

}
