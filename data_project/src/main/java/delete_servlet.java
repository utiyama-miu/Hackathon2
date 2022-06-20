import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class project_servlet
 */
@WebServlet("/project_servlet")
public class delete_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public delete_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// 本のタイトルを格納するList
		List<String> members = new ArrayList<>();

		String path = "";
		// データベースに接続
		try{
			String url = "jdbc:postgresql://localhost:5432/sample_list";
			String user = "postgres";
			String password = "psTgr14oe";
			String sql = "delete from team_list where id = 3";
			
			Class.forName("org.postgresql.Driver");
			try (Connection con = DriverManager.getConnection(url, user, password);
					PreparedStatement pstmt = con.prepareStatement(sql)){
				
				int res = pstmt.executeUpdate();		
			}
		}catch (SQLException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		// 次の画面に遷移
		request.getRequestDispatcher("WEB-INF/list.jsp").forward(request, response);
	}	
}

//https://uha-blog.com/java/servlet-database-display/#toc1/