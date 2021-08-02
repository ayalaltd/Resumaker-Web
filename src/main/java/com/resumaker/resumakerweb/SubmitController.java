package com.resumaker.resumakerweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

//@Controller
public class SubmitController {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    static final String USER = "program";
    static final String PASS = "1234";

//    @PostMapping("/submit")
//    public void submit(@RequestParam String[] contactPOST, @RequestParam String[] skillPOST, @RequestParam String[] workPOST, @RequestParam String[] educationPOST) {
//        contactSubmit(contactPOST);
//    }

    public static void contactSubmit(String[] contactPOST) {
        String values = "("+ contactPOST[0] + ", " + contactPOST[1] + ", " + contactPOST[2] + ")";

        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ) {
            String sql = "INSERT INTO public.\"Contact\"(\n" +
                    "\tname, email, phone)\n" +
                    "\tVALUES" + values + ";";
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
