package repository.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JdbcLoginRepository implements LoginRepository{

  private static String dburl = "jdbc:mysql://localhost:3306/mydb";
  private static String dbUser = "root";
  private static String dbpassword = "1234";

  ResultSet rs = null;
  PreparedStatement pstmt = null;

  private Connection getConnection() throws SQLException, ClassNotFoundException {
    Class.forName("com.mysql.jdbc.Driver");
    return DriverManager.getConnection(dburl,dbUser,dbpassword);
  }


  public int login(String id, String password) {
    String SQL = "SELECT password FROM USER WHERE id=?";
    try (Connection conn = getConnection()){
      pstmt = conn.prepareStatement(SQL);
      pstmt.setString(1, id);
      rs = pstmt.executeQuery();
      if (rs.next()) {
        if(rs.getString(1).equals(password)) {
          return 1;//로그인 성공
        }else {
          return 0; //비밀번호 불일치
        }
      }
      return -1; //아이디가 없음
    }catch(Exception e){
      e.printStackTrace();
    }
    return -2; //데이터베이스오류의미
  }
}


