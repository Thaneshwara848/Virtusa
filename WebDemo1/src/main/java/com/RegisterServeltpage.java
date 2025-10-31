package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServeltpage")
public class RegisterServeltpage extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public RegisterServeltpage() {}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        int salary = Integer.parseInt(request.getParameter("salary"));
        String desig = request.getParameter("desig");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // HTML + CSS header
        out.println("<html><head><title>Registration Status</title>");
        out.println("<style>");
        out.println("body {"
                + "font-family: 'Poppins', sans-serif;"
                + "background: linear-gradient(135deg, #89f7fe, #66a6ff);"
                + "color: #333;"
                + "text-align: center;"
                + "margin: 0;"
                + "padding: 0;"
                + "}");
        out.println(".card {"
                + "background: white;"
                + "width: 500px;"
                + "margin: 100px auto;"
                + "padding: 30px;"
                + "border-radius: 20px;"
                + "box-shadow: 0px 4px 10px rgba(0,0,0,0.3);"
                + "}");
        out.println("h2 { color: #007bff; margin-bottom: 20px; }");
        out.println("p { font-size: 18px; line-height: 1.6; }");
        out.println("a { text-decoration: none; color: white; background-color: #007bff;"
                + "padding: 10px 25px; border-radius: 20px; display: inline-block; margin-top: 15px; }");
        out.println("a:hover { background-color: #0056b3; }");
        out.println("</style></head><body>");

        // HTML body content
        out.println("<div class='card'>");
        out.println("<h2> Employee Registered Successfully!</h2>");
        out.println("<p><b>ID:</b> " + id + "</p>");
        out.println("<p><b>Name:</b> " + name + "</p>");
        out.println("<p><b>Age:</b> " + age + "</p>");
        out.println("<p><b>Salary:</b> ₹" + salary + "</p>");
        out.println("<p><b>Designation:</b> " + desig + "</p>");
        out.println("<a href='Home.html'>🏠 Back to Home</a>");
        out.println("</div>");

        out.println("</body></html>");

        // Database logic
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Virtusa", "root", "root");
            PreparedStatement stmt = con.prepareStatement("INSERT INTO Employee VALUES (?, ?, ?, ?, ?)");
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setInt(3, age);
            stmt.setInt(4, salary);
            stmt.setString(5, desig);
            stmt.execute();
            stmt.close();
            con.close();
        } catch (Exception e) {
            out.println("<p style='color:red;'>❌ Error while inserting data: " + e.getMessage() + "</p>");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
