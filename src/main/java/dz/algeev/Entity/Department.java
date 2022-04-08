package dz.algeev.Entity;

import jdk.nashorn.internal.scripts.JD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Department {
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:~/test";

    static final String USER = "sa";
    static final String PASS = "";
    Connection conn = null;
    Statement stmt = null;

    int id;
    String name;
    public List<Department> getAll() throws SQLException, ClassNotFoundException {
        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
        stmt = conn.createStatement();

        String sql = "SELECT id, name FROM Department";
        ResultSet rs = stmt.executeQuery(sql);
        List<Department> list = new ArrayList<>();
        while(rs.next()){
            Department dep = new Department();
            dep.id = rs.getInt("id");
            dep.name = rs.getString("name");
            list.add(dep);
            }
        return list;
    }
}
