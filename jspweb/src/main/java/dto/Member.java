package dto;



public class Member {
	
	
	
	
	@Override
	public String toString() {
		return "Member [mno=" + mno + ", mid=" + mid + ", mpassword=" + mpassword + ", mname=" + mname + ", mphone="
				+ mphone + ", memail=" + memail + ", maddress=" + maddress + ", mpoint=" + mpoint + ", mdate=" + mdate
				+ "]";
	}

	private int mno;
	private String mid;
	private String mpassword;
	private String mname;
	private String mphone;
	private String memail;
	private String maddress;
	private int mpoint;
	private String mdate;
	
	public Member() {}

	public Member(int mno, String mid, String mpassword, String mname, String mphone, String memail, String maddress,
			int mpoint, String mdate) {
		super();
		this.mno = mno;
		this.mid = mid;
		this.mpassword = mpassword;
		this.mname = mname;
		this.mphone = mphone;
		this.memail = memail;
		this.maddress = maddress;
		this.mpoint = mpoint;
		this.mdate = mdate;
	}

	public int getMno() {
		return mno;
	}

	public String getMid() {
		return mid;
	}

	public String getMpassword() {
		return mpassword;
	}

	public String getMname() {
		return mname;
	}

	public String getMphone() {
		return mphone;
	}

	public String getMemail() {
		return memail;
	}

	public String getMaddress() {
		return maddress;
	}

	public int getMpoint() {
		return mpoint;
	}

	public String getMdate() {
		return mdate;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	public void setMemail(String memail) {
		this.memail = memail;
	}

	public void setMaddress(String maddress) {
		this.maddress = maddress;
	}

	public void setMpoint(int mpoint) {
		this.mpoint = mpoint;
	}

	public void setMdate(String mdate) {
		this.mdate = mdate;
	}
	
	
	
	

}
