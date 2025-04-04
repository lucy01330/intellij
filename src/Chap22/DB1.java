package Chap22;

import java.sql.SQLException;

public class DB1 {
    Connection conn = null;

    try{
        Class.forName("oracle.jdbc.OracleDriver");

        String dbUrl = "jdbc:oracle:thin:@localhost:1521/xe";
        String dbUser = "oracletest";
        String dbPaswd = "oraclepaswd";

        conn = DriverManager.getConnection(dbUrl, dbUser, dbPaswd);
        System.out.println("연결 성공");
    } catch(ClassNotFoundException e) {
        System.out.println("Oracle JDBC 드라이버를 찾을 수 없습니다.");
        e.printStackTrace();
    }catch(SQLException e) {
        e.printStackTrace();
    } finally {
        if(conn != null) {
            try {

                conn.close();
            } catch(SQLException e){
                e.printStackTrace();
            }
        }
    }


