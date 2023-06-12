package sbms.dti;

import java.sql.*;
public class SQLtest {
    public static void main(String[] args) throws Exception {
        Connection con = null;

//        String server = "jdbc:mysql://localhost:3306/bbs"; // 서버 주소
        String server = "localhost"; // 서버 주소
        String user_name = "root"; //  접속자 id
        String password = "root"; // 접속자 pw

        // JDBC 드라이버 로드
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("There is a problem while loading JDBC Driver:" + e.getMessage());
            e.printStackTrace();
        }

        // 접속
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + server + "/" + "?useSSL=false", user_name, password);
            System.out.println("Connection is succeed!:)");

            String SQL = "SELECT * FROM XXSB_DTI_MAIN";
            PreparedStatement pstmt = con.prepareStatement(SQL);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
                String conversationId = rs.getString("CONVERSATION_ID");
                System.out.println("conversationId: "+conversationId);
            }

        } catch(SQLException e) {
            System.err.println("Connection is failed!:(" + e.getMessage());
            e.printStackTrace();
        }

        // 접속 종료
        try {
            if(con != null)
            con.close();
        } catch (SQLException e) {}
    }
}
