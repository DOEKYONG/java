package controller.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import dto.Product;

/**
 * Servlet implementation class getproductlist
 */
@WebServlet("/admin/getproductlist")
public class getproductlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getproductlist() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		PrintWriter out= response.getWriter();
		String html =""; // 응답할 문자열~
		ArrayList<Product> productlist = ProductDao.getProductDao().getproductlist();
		for(Product product : productlist) {
			html += 
					"<td>"+product.getPno()+"</td>"
					+"<td>"+product.getPimg()+"</td>"
					+"<td>"+product.getPname()+"</td>"
					+"<td>"+product.getPdiscount()+"</td>"
							+"<td>"+product.getPprice()+"</td>"
					+"<td>"+product.getPprice()+"</td>"
					+"<td>"+product.getPactive()+"</td>"
					+"<td>"+product.getCno()+"</td> " +"<br>"
					
					;
		}
		out.print(html); 
	}

}
