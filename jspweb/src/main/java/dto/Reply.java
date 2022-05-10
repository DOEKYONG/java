package dto;

import dao.MemberDao;

public class Reply {

	private int rno ;
	private String rcontent ;
	private String rdate; 
	private int rindex; 
	private int bno;  
	private int mno;
	private String mid;

	public Reply() {
		// TODO Auto-generated constructor stub
	}

	public Reply(int rno, String rcontent, String rdate, int rindex, int bno, int mno, String mid) {
		super();
		this.rno = rno;
		this.rcontent = rcontent;
		this.rdate = rdate;
		this.rindex = rindex;
		this.bno = bno;
		this.mno = mno;
		this.mid = mid;
	}

	public int getRno() {
		return rno;
	}

	public String getRcontent() {
		return rcontent;
	}

	public String getRdate() {
		return rdate;
	}

	public int getRindex() {
		return rindex;
	}

	public int getBno() {
		return bno;
	}

	public int getMno() {
		return mno;
	}

	public String getMid() {
		return MemberDao.memberDao.getmid(mno);
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}

	public void setRindex(int rindex) {
		this.rindex = rindex;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	@Override
	public String toString() {
		return "Reply [rno=" + rno + ", rcontent=" + rcontent + ", rdate=" + rdate + ", rindex=" + rindex + ", bno="
				+ bno + ", mno=" + mno + ", mid=" + mid + "]";
	}
	
	
	
}


