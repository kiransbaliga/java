import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "root");
            Statement stmnt = con.createStatement();
            ResultSet rs = stmnt.executeQuery("select * from student where cgpa>7;");
            while(rs.next()){
                int id=rs.getInt("roll");
                String name=rs.getString("name");
                float cgpa=rs.getFloat("cgpa");
                System.out.println(id+" "+name+" "+cgpa);
            }
            con.close();
        } catch (Exception e) {
            System.out.print(e);
        }

    }
}
