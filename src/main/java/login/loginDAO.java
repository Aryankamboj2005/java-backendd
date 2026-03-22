package login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class loginDAO {
	String sql = "select * from login where name=? and passwrod=?";
	String url = "jdbc:mysql://localhost:3306/username";
    String user = "root";
    String password = "Aryan2005@";
	
	
    public boolean check(String name, String pass) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection(url, user, password);
            st = con.prepareStatement(sql);

            st.setString(1, name);
            st.setString(2, pass);

            rs = st.executeQuery();

            return rs.next(); // ✅ this is enough

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) try { rs.close(); } catch(Exception e) {}
            if (st != null) try { st.close(); } catch(Exception e) {}
            if (con != null) try { con.close(); } catch(Exception e) {}
        }
        return false;
    }
}