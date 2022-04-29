package dto;

public class Member {
	
	private int mnum;
	private String mid;
	private String mpassword;
	private String mname;
	
	
	public Member() {
		// TODO Auto-generated constructor stub
	}


	public Member(int mnum, String mid, String mpassword, String mname) {
		super();
		this.mnum = mnum;
		this.mid = mid;
		this.mpassword = mpassword;
		this.mname = mname;
	}
	
	






	public int getMnum() {
		return mnum;
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


	public void setMnum(int mnum) {
		this.mnum = mnum;
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
	
	
}
