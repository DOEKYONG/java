package controller.board;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.BoardDao;
import dao.MemberDao;
import dto.Board;

/**
 * Servlet implementation class bupdate
 */
@WebServlet("/board/bupdate")
public class bupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bupdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1.개발중인 프로젝트경로
				//String uploadpath = "C:/Users/504/git/java/jspweb/src/main/webapp/board/upload";
					// 2.서버 폴더 경로
				// 서버 경로 찾기 : request.getSession().getServletContext().getRealPath( 경로 ) ;
				System.out.println("서버의 경로찾기 : " +request.getServletContext().getRealPath("/upload"));
				
				String uploadpath =request.getServletContext().getRealPath("/board/upload");
				// 첨부파일 업로드
				MultipartRequest multi = new MultipartRequest(
						request,  // 1.요청방식
						uploadpath, // 2.파일 저장 경로
						1024*1024*10, // 3.파일최대 용량 허용 범위 [10mb]
						"UTF-8", // 4.인코딩타입
						new DefaultFileRenamePolicy()); // 4.보안방식 : 동일한 파일명이 있을경우 자동 이름 변환
		
		request.setCharacterEncoding("UTF-8");
		int bno = Integer.parseInt( request.getParameter("bno") );
		String btitle = multi.getParameter("btitle");
		String bcontent = multi.getParameter("bcontent");
		String bfile = multi.getFilesystemName("bfile"); // 첨부파일 : getFilesystemName
		
		// 기존파일
		Board temp = BoardDao.getBoardDao().getboard(bno);
		String oldfile = temp.getBfile();
		
		if(bfile==null) { // 새로운 첨부파일 없다.
			bfile = oldfile;
		} else { // 새로운 첨부파일 있다.
			// * 기존파일은 서버 내에서 삭제처리
			String upload = request.getSession().getServletContext().getRealPath("/board/upload/"+oldfile);
			File file = new File(upload);
			file.delete();
		}
		
		Board board = new Board(bno,btitle,bcontent,0,bfile,0,null,null);
		System.out.println(board.toString());
		boolean result = BoardDao.getBoardDao().update(board);
		
		if(result) {
			response.sendRedirect("/jspweb/board/boardview.jsp?bno="+bno);
		}
		else {
			response.sendRedirect("/jspweb.board.bupdate.jsp");
		}
	}

}
