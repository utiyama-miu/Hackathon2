


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import java.io.IOException;

/**
 * Servlet implementation class sample1
 */
@WebServlet("/sample1")
public class sample1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sample1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8"); // 文字化け防止
		String name1 = "";    // 苗字を格納する変数
		String name2 = "";    // 名前を格納する変数
		String fullName = ""; // フルネームを格納する変数
		int age = 0;          // 年齢を格納する変数
		
		// jspから送られてきた値を受け取る
		name1 = request.getParameter("lastName");            // 苗字の受け取り
		name2 = request.getParameter("firstName");           // 名前の受け取り
		age = Integer.parseInt(request.getParameter("age")); // 年齢の受け取り
		fullName = name1 + " " + name2;
		
		// 次の画面(jsp)に値を渡す
		request.setAttribute("fullName", fullName);
		request.setAttribute("age", age);
		
		// 次の画面に遷移
		request.getRequestDispatcher("WEB-INF/SelfIntroduction.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

	}

}
