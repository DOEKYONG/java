package ½Å´ö¿ë_0323;

public class Movie {

	private String title;
	private String intime;
	private String outtime;
	private int money;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(String title, String intime, String outtime, int money) {
		super();
		this.title = title;
		this.intime = intime;
		this.outtime = outtime;
		this.money = money;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIntime() {//
		return intime;
	}

	public void setIntime(String intime) {
		this.intime = intime;
	}

	public String getOuttime() {
		return outtime;
	}

	public void setOuttime(String outtime) {
		this.outtime = outtime;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
