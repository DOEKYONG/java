package dto;

public class Stock {
	
	private int sno;
	private String scolor;
	private String ssize;
	private int samount; 
	private String firstdate;  
	private String updatedate; 
	private int pno;

	public Stock() {
		// TODO Auto-generated constructor stub
	}

	public Stock(int sno, String scolor, String ssize, int samount, String firstdate, String updatedate, int pno) {
		super();
		this.sno = sno;
		this.scolor = scolor;
		this.ssize = ssize;
		this.samount = samount;
		this.firstdate = firstdate;
		this.updatedate = updatedate;
		this.pno = pno;
	}

	public int getSno() {
		return sno;
	}

	public String getScolor() {
		return scolor;
	}

	public String getSsize() {
		return ssize;
	}

	public int getSamount() {
		return samount;
	}

	public String getFirstdate() {
		return firstdate;
	}

	public String getUpdatedate() {
		return updatedate;
	}

	public int getPno() {
		return pno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public void setScolor(String scolor) {
		this.scolor = scolor;
	}

	public void setSsize(String ssize) {
		this.ssize = ssize;
	}

	public void setSamount(int samount) {
		this.samount = samount;
	}

	public void setFirstdate(String firstdate) {
		this.firstdate = firstdate;
	}

	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	@Override
	public String toString() {
		return "Stock [sno=" + sno + ", scolor=" + scolor + ", ssize=" + ssize + ", samount=" + samount + ", firstdate="
				+ firstdate + ", updatedate=" + updatedate + ", pno=" + pno + "]";
	}
	
	
	
}
