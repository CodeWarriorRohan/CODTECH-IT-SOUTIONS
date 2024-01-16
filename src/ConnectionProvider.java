import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider
{
    public static void main(String[] args) {
        getConnnection();
    }
    private static Connection conn;

    public static Connection getConnnection()
    {
        try
        {
//            String driver = "com.mysql.cj.jdbc.Driver";
//            String url = "jdbc:mysql://localhost:3306/testjdbc";
//            String url = "jdbc:mysql://localhost:3306/Photos";
//            String username = "root";
//            String password = "********";
            if(conn == null)
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
//                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","********");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_grade_management_system","root","********");
//                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Photos","root","********");

            }
            System.out.println("Database Connected..!");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return conn;
    }
}


