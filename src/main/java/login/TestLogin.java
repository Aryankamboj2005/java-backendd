import login.loginDAO;

public class TestLogin {
    public static void main(String[] args) {
        loginDAO dao = new loginDAO();
        boolean result = dao.check("Aryan", "Aryan2005");
        System.out.println("Login check for Aryan returned: " + result);
    }
}
