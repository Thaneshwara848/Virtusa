package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayRecord")
public class DisplayRecord extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DisplayRecord() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Employee Records</title>");
        out.println("<style>");
        out.println("body {"
                + "font-family: 'Poppins', sans-serif;"
                + "background-image: url('https://images.unsplash.com/photo-1521791136064-7986c2920216?auto=format&fit=crop&w=1500&q=80');"
                + "background-size: cover;"
                + "background-repeat: no-repeat;"
                + "background-attachment: fixed;"
                + "color: #333;"
                + "text-align: center;"
                + "padding: 0;"
                + "margin: 0;"
                + "}");
        out.println("h1 {"
                + "color: white;"
                + "text-shadow: 2px 2px 6px rgba(0,0,0,0.6);"
                + "margin-top: 40px;"
                + "}");
        out.println("table {"
                + "margin: 50px auto;"
                + "border-collapse: collapse;"
                + "width: 80%;"
                + "background-color: rgba(255,255,255,0.9);"
                + "border-radius: 10px;"
                + "overflow: hidden;"
                + "box-shadow: 0px 4px 12px rgba(0,0,0,0.3);"
                + "}");
        out.println("th, td {"
                + "padding: 15px;"
                + "text-align: center;"
                + "border-bottom: 1px solid #ddd;"
                + "font-size: 18px;"
                + "}");
        out.println("th {"
                + "background-color: #007bff;"
                + "color: white;"
                + "}");
        out.println("tr:hover {background-color: #f1f1f1;}");
        out.println("a {text-decoration: none; color: white; background-color: #007bff; padding: 10px 25px; border-radius: 25px;}");
        out.println("a:hover {background-color: #0056b3;}");
        out.println("</style></head><body>");

        out.println("<h1>📋 Employee Records</h1>");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Virtusa", "root", "root");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");

            out.println("<table>");
            out.println("<tr><th>ID</th><th>Name</th><th>Age</th><th>Salary</th><th>Designation</th></tr>");

            boolean hasData = false;
            while (rs.next()) {
                hasData = true;
                out.println("<tr>");
                out.println("<td>" + rs.getInt(1) + "</td>");
                out.println("<td>" + rs.getString(2) + "</td>");
                out.println("<td>" + rs.getInt(3) + "</td>");
                out.println("<td>₹" + rs.getInt(4) + "</td>");
                out.println("<td>" + rs.getString(5) + "</td>");
                out.println("</tr>");
            }

            if (!hasData) {
                out.println("<tr><td colspan='5' style='color:red;'>No records found!</td></tr>");
            }

            out.println("</table>");
            out.println("<a href='Home.html'>🏠 Back to Home</a>");

            con.close();
            stmt.close();
        } catch (Exception e) {
            out.println("<p style='color:red;'>❌ Error fetching data: " + e.getMessage() + "</p>");
        }

        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
