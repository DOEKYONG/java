package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDao;
import dao.MemberDao;
import dto.Reply;

/**
 * Servlet implementation class rereplyupdate
 */
@WebServlet("/board/rereplyupdate")
public class rereplyupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public rereplyupdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("통신");
		request.setCharacterEncoding("UTF-8");
    	int rno = Integer.parseInt(request.getParameter("rno") );
    	int bno = Integer.parseInt(request.getParameter("bno") );
    	String updatecontent2 = request.getParameter("updatecontent2");
    	String mid = (String)request.getSession().getAttribute("login");
		int mno = MemberDao.getmemberDao().getmno(mid);
    	Reply rereply = new Reply(rno,updatecontent2,null,0,bno,mno,null);
		boolean result = BoardDao.getBoardDao().replyupdate(rereply);
		System.out.println(rereply.toString());
    	
		
		if( result ) {
			System.out.println(rereply.toString());
			response.getWriter().print(1); }
		else { response.getWriter().print(2); }
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
