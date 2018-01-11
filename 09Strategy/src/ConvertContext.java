import java.util.List;

public class ConvertContext {
	private ConvertStrategy strategy;

	public void setCompressionStrategy(ConvertStrategy strategy) {
		this.strategy = strategy;
	}

	public void convertSubStrings(List<String> list) {
		strategy.listToString(list);
	}
}