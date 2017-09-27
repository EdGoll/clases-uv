try {
	//Oracle
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:base_datos","user","password");
	//PostgreSQL
	Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos","user","password");
	//MySQL
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/base_datos","user","password");
} catch (SQLException e) {
   System.out.println(e);
}