public class TestMain {

	public static void main(String[] args) {

		Superior superior = new Superior();
		Boss boss = new Boss();
		CEO ceo = new CEO();

		superior.setSuccessor(boss);
		boss.setSuccessor(ceo);

		for (int i = 10; i <= 60; i += 5) {
			superior.processRequest(new PayRaiseRequest((double) i / 10));
		}
	}

}