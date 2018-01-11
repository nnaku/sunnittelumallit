import java.util.Scanner;

public class ProxyMain {
	public static void main(String[] args) {
		final Image images[] = new Image[10];
		boolean end = false;
		String input = "";
		int index = 0;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < images.length; i++) {
			images[i] = new ProxyImage("img" + i);
			images[i].showData();
		}
		do {
			System.out.println("- = previous, + = next, e = exit");
			input = scanner.nextLine();

			if (input.equals("e")) {
				end = true;
			} else if (input.equals("+") || input.equals("-")) {
				if (input.equals("+"))
					index++;
				if (input.equals("-"))
					index--;
				images[Math.floorMod(index, images.length)].displayImage();
			} else {
				System.out.println("?");
			}
		} while (!end);
	}
}