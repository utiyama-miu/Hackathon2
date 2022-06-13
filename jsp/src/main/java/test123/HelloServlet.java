package test123;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String url = "jdbc:postgresql://localhost:5432/sampledb" ;
	        String user = "postgres" ;
	        String password = "Abematvdaisuki1" ;

	        // SELECT文の作成・実行
	        String sql = "SELECT * from team_list" ;

	        // PostgreSQLに接続
	        try (Connection con = DriverManager.getConnection ( url, user, password );
	                Statement stmt = con.createStatement();
	                ResultSet result = stmt.executeQuery ( sql ); ) {

	            // 実行結果の取得
	            while ( result.next() ) {
	                String col1 = result.getString ( 1 ) ;
	                String col2 = result.getString ( 2 ) ;
	                String col3 = result.getString ( 3 ) ;
	                System.out.println ( col1 + " " + col2 + " " + col3 ) ;
	            }
	        } catch ( SQLException e ) {
	          e.printStackTrace() ;
	      }
	    }
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
