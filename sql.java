import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class sql{
  static Connection connection =null;
  static String databasename="";
  static String url="jdbc:mysql://localhost:3306/" + databasename;
  static String username="root";
  static String password="root";
  
  public static void main(String[] args) throws InstantiationException,IllegalAccessException,ClassNotFoundException,SQLException{
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    connection =DriverManager.getConnection(url,username,password);
    PreparedStatement ps= connection.prepareStatement("insert into student (name) values ('kiran');");
    int status=ps.executeUpdate();
    if (status!=0){
      System.out.println("Process worked");
    }

  }
}