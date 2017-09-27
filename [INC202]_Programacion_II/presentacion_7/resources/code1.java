try {
    //Ejemplo para Oracle
    DriverManager.registerDriver(new oracle.jdbc.driver.Oracledriver());
    //Ejemplo para PostgreSQL
    Class.forName("org.postgresql.Driver");
    //Ejemplo para MySQL
    Class.forName("com.mysql.jdbc.Driver");
} catch (ClassNotFoundException ex) {
    System.out.println("Error en la carga del driver JDBC");
}