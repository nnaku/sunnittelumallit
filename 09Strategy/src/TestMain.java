import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "0123456789";
		List<String> list = new ArrayList<String>(Arrays.asList(s.split("")));
		ConvertContext converter = new ConvertContext();
		
		converter.setCompressionStrategy(new SingleChar());
		converter.convertSubStrings(list);
		
		converter.setCompressionStrategy(new DoubleChar());
		converter.convertSubStrings(list);
		
		converter.setCompressionStrategy(new TripleChar());
		converter.convertSubStrings(list);
	}

}
;