package Chap22;

import org.w3c.dom.ls.LSOutput;

import java.sql.PreparedStatement;

public class DB2 {
    String sql = "INSERT INTO USERS(ID_USER, NM_USER, ID_PASWD, NB_AGE, ID_EMAIL)"
            + " VALUES(?,?,?,?,?)";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    pstmt.setString(1, "test1");
    pstmt.setString(2,"홍길동");
    pstmt.setStrong(3,"test1");
    pstmt.setInt(4, 25);
    pstmt.setString(5, "test1@test.com");

    int rows = pstmt.executeUpdate();
    System.out.println("저장된 행 수:"+rows);

    pstmt.close();
}
