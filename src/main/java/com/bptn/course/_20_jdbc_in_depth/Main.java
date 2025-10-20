package com.bptn.course._20_jdbc_in_depth;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        StudentAppClass jdbc = new StudentAppClass();
        Connection conn = jdbc.createConnection();
//        jdbc.getAllStudents(conn);
//        jdbc.getStudentById(conn,  37);
        jdbc.addStudent(conn, 3, "Nic Smith", "nic@example.com", "123493");
        jdbc.closeConnection(conn);
    }
}