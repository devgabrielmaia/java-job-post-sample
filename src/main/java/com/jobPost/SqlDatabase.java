package com.jobPost;

import java.sql.*;

public class SqlDatabase {
    private Connection conn;

    public SqlDatabase(String driver, String url, String database, String user, String pass, Integer port) throws SQLException {
        String urlConnection = String.format(
            "jdbc:%s://%s:%s/%s",
            driver, url, port, database
        );
        this.conn = DriverManager.getConnection(
            urlConnection, user, pass
        );
        if (this.conn == null) {
            throw new SQLException("Error when trying to connect on database");
        }
    }

    public ResultSet query() throws SQLException {
        PreparedStatement stmt = this.conn.prepareStatement("select * from jobs where id = ?");
        stmt.setInt(1, 1);
        ResultSet resutl = stmt.executeQuery();
        stmt.close();
        return resutl;
    }

    public Integer delete() throws SQLException {
        PreparedStatement stmt = this.conn.prepareStatement("select * from jobs where id = ?");
        stmt.setInt(1, 1);
        Integer resutl = stmt.executeUpdate();
        stmt.close();
        return resutl;
    }
}
