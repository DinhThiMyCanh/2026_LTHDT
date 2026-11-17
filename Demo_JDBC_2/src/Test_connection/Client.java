package Test_connection;

import java.sql.*;

public class Client {
	static Connection con;
	static Statement stmt;
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		con =null;
		String url="jdbc:sqlserver://localhost:1433;databaseName=QLKhachSan;"
				+ "encrypt=true;trustServerCertificate=true";
		String username ="sa";
		String password ="123456";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(url,username,password);
			System.out.println("Ket noi thanh cong!");
			 
			//Lấy dữ liệu
			stmt = con.createStatement();
			String sql1 ="SELECT * FROM KHACHHANG";
			getInforKhachHang(sql1);
			
			//Thêm khách hàng
			String sql2 ="INSERT INTO KhachHang VALUES('KH06',N'Từ Minh Đức','2007-08-07','Nam')";
			updateInforKhachHang(sql2);
			
			//Cập nhật ngày sinh cho KH06
			String sql3 ="UPDATE...";
			updateInforKhachHang(sql3);
			
			//Xóa Khách hàng có mã 01
			String sql4 ="DELETE....";
			updateInforKhachHang(sql4);
			
			
		}catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}finally {
			if (con!=null) {
				con.close();
			}
		}
	}
	
	//Lấy dữ liệu
	public static void getInforKhachHang(String sql) throws SQLException {
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			//C1: String maKH = rs.getString("MaKH");
			//C2:
			String maKH = rs.getString(1);
			String tenKH = rs.getString(2);
			Date ns = rs.getDate(3);
			String gt = rs.getNString(4);
			System.out.println(maKH + "; "+tenKH+" ; "+ ns +" ; "+ gt);
		}
	}
	
	//Cập nhật dữ liệu
	public static void updateInforKhachHang(String sql) throws SQLException {
		stmt.executeUpdate(sql);
	}
	

}
