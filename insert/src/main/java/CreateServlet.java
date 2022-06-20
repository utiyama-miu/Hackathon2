

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateServlet
 */
@WebServlet("/CreateServlet")
public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	

	@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
			// TODO 自動生成されたメソッド・スタブ
			super.doPost(request, resp);
			String url = "jdbc:postgresql://localhost:5432/sampledb";
			String user = "postgres";
			String password = "Abematvdaisuki1";
			
			
		try {
			Class.forName("org.postgresql.Driver");
		
			try (Connection con = DriverManager.getConnection(url, user, password);
					PreparedStatement preStatement = con.prepareStatement("INSERT into team_list(name,hometown) values( ?,?);")) {
				
				
				//String id = request.getParameter("id");
				
				//int id1 = Integer.parseInt(id);
				
				String name = request.getParameter("name");
				
				String hometown = request.getParameter("hometown");

				//preStatement.setInt(1, id1);
				preStatement.setString(1, name);
				preStatement.setString(2,hometown);
				int count = preStatement.executeUpdate();
				
			}catch (SQLException e) {
				e.printStackTrace();
			}finally {
				System.out.println("追加しました。");
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
}
}
