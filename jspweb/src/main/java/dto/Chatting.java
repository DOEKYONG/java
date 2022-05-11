package dto;

public class Chatting {

	
	private int cno; 
	private String cname;   
	private String ccontent;
	
	public Chatting() {
		// TODO Auto-generated constructor stub
	}

	public Chatting(int cno, String cname, String ccontent) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.ccontent = ccontent;
	}

	public int getCno() {
		return cno;
	}

	public String getCname() {
		return cname;
	}

	public String getCcontent() {
		return ccontent;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public void setCcontent(String ccontent) {
		this.ccontent = ccontent;
	}

	@Override
	public String toString() {
		return "Chatting [cno=" + cno + ", cname=" + cname + ", ccontent=" + ccontent + "]";
	}
	
	
	
}
