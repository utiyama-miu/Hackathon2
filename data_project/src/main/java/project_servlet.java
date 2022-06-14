import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class project_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public project_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// todoの一覧を保持する変数を宣言
		//ここから下は人によって変える
		String url = "jdbc:postgresql://localhost:5432/sampledb";
		String user = "postgres";
		String password = "Abematvdaisuki1";

		// 本のタイトルを格納するList
		List<String> books = new ArrayList<>();

		// データベースに接続する
		try {
			Class.forName("org.postgresql.Driver");

			try (Connection con = DriverManager.getConnection(url, user, password);
					Statement st = con.createStatement();){

				// SQLを実行して、テーブルから本のタイトルを取得する
				ResultSet res = st.executeQuery("SELECT name from team_list");

				// 取得した件数分繰り返す
				while(res.next()) {
					// リストに本のタイトルを追加
					books.add(res.getString("name"));
				}

			} catch(SQLException e) {
				e.printStackTrace();
			}
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		// リクエストスコープへオブジェクト設定する
		request.setAttribute("books", books);

		// 次の画面に遷移
		request.getRequestDispatcher("WEB-INF/list.jsp").forward(request, response);
		}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
//https://uha-blog.com/java/servlet-database-display/#toc1/