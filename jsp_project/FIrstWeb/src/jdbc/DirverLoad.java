package jdbc;

import java.util.StringTokenizer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class DirverLoad extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {

		String drivers = config.getInitParameter("jdbcdriver");
		StringTokenizer st = new StringTokenizer(drivers, ",");
		try {
			while (st.hasMoreTokens()) {
				String jdbcDriver = st.nextToken();
				Class.forName(jdbcDriver);
			}
			System.out.println("드라이버 로드가 완료되었습니다.");
		} catch (ClassNotFoundException cne) {
			System.out.println("드라이버 로드에 실패했습니다.");
		}

	}

//	@Override
//	public void init() throws ServletException {
//		
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("드라이버 로드 완료");
//		} catch ( ClassNotFoundException e) {
//			System.out.println("드라이버 클래스를 로드하지 못했습니다.");
//		}
//		
//	}

}
