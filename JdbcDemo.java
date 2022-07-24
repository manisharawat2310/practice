import java.sql.*;
import java.io.*;
class JdbcDemo
{
public static void main(String[] args)
{
try{
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/youtube";
String username="root";
String password="root$12";
Connection con = DriverManager.getConnection(url,username,password);
String q ="insert into images(pic) values(?)";
PreparedStatement pst =con.prepareStatement(q);
FileInputStream fis = new FileInputStream("pic1.jpg"); 
pst.setBinaryStream(1,fis, fis.available());
pst.executeUpdate();
System.out.println("values are inserted");
con.close();
}
catch(Exception e)
{
e.printStackTrace();
}
} 
}