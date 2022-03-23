package Day15;

public class User1 extends Thread {
	// ÇĘľĺ
	private Calculator calculator;
	// ¸ŢźŇľĺ 
	public void setCalculator( Calculator calculator) {
		this.setName("user1");
		this.calculator = calculator;
	}
	// ş´ˇÄĂł¸Ž 
	@Override
	public void run() {
		calculator.setMemory(100);
	}
	
}