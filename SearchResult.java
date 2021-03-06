import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class SearchResult
 */
@WebServlet("/SearchResult")
public class SearchResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchResult() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		HttpSession session =request.getSession(false);
		if (session == null)
		{
			response.sendRedirect("Login");
			
		}
		Connection con = ConnectDB.connect();
		
		try
		{
		String fetch_students="select * from Student";
				String count_student = "select count(*) from Student";
				String active_student = "select count(*) from Student where status = 'Active'";
				PreparedStatement pst =con.prepareStatement(fetch_students);
				
				ResultSet rs = pst.executeQuery();
				
				PreparedStatement pst2 = con.prepareStatement(count_student);
				ResultSet rs2 = pst2.executeQuery( count_student);
				rs2.next();
				
				PreparedStatement pst3 = con.prepareStatement(active_student);
				ResultSet rs3 = pst3.executeQuery( active_student);
				rs3.next();
				
				String q;
				if(request.getParameter("Fetch").equals("Active"))
				{
					q= "select * from Student where status ='Active'";
					
				}
				else if (request.getParameter("Fetch").equals("Deactive"))
				{
					q= "select * from Student where status ='Deactive'";
					
					}
				else
				{
					q = "select * from Student where name like '%"+ request.getParameter("Fetch") +"%'";
				}
				
				PreparedStatement pst1 = con.prepareStatement(q);
				
				ResultSet rs4 = pst1.executeQuery();
				pw.print("<html>"
				+"<head><title>Student Result</title>"
				+"<script>"
				+"td,th(padding:14 px:30px)"
				+"body(font-family:arial;)"
				+"table(border:12px solid black;padding:20px;)"
				+"a:(text-decoration:none;border:1px solid black;padding:10px 10px;)"
				+"a:hover(color:red;)"
				
	+"</style>"
	+"</head>"
	+ "<body>"
	+ "<center>"
	+ "<h2>Hii Admin</h2>"
	+"<br>"
	
	+"<div style='float:left;color:orange;border:1px solid black;padding:5px 5 px;'>Total student<h3>"+ rs2.getInt(1) +"</h3></div>"
	+"<div style='float:left;margin-left:10px;color:blue;border:1px solid black;padding:5px 5 px;'>Total Active student<h3><a href='SearchResult?Fetch=Active' style='border:none;'>"+rs3.getInt(1) +"</a></h3></div>"
	+"<div style='float:left;margin-left:10px;color:green;border:1px solid black;padding:5px 5 px;'>Total Deactive student<h3><a href='SearchResult?Fetch=Deactive' style='border:nome;'>"+ (rs2.getInt(1)-rs3.getInt(1)) +"</a></h3></div>"
	+ "<div style='clear:both;'></div><div style='float:right;'><a href='operationForm?Id=Add'>Add Student</a>"
	+ "<a href='Logout' style='margin-left:10px;'>Log Out</a></div>"
	+ "<br><br><br>"
	
	+ "<div style='float:left;'><form action='SearchResult'><input type='text' name='Fetch' placeholder='Search Student' required><input type='submit' value='Search' style='margin-left:10px;'></form><br></div>"
	+ "<div style='float:right;'><form action='GeneratePDF'><select name ='status'><option>Active</option><option>Deactive</option></select><input type='submit' value= 'Generate Report' style='margin-left:10px;'></form></div>"
	
	+"<br><br>"
	+"<h2>Result</h2><br><br>");
				
				pw.print("<table margin-top:-50px;><tr><th>ID</th>"
						+ "<th>Student</th>"
						+ "<th>Enrollment</th>"
						+ "<th>DOB</th>"
						+ "<th>Gender</th>"
						+ "<th>Phone</th>"
						+ "<th>Status</th>"
						+ "<th>Update</th>"
						+ "<th>Delete</th></tr>");
				
				while(rs4.next())
				{
					
					pw.print("<tr><td>"+ rs4.getInt(1)+ "</td>"
							
						    +"<td>"+ rs4.getString(2)+ "</td>"
							+"<td>"+ rs4.getString(3)+ "</td>"
							+"<td>"+ rs4.getString(4)+ "</td>"
							+"<td>"+ rs4.getString(5)+ "</td>"
							+"<td>"+ rs4.getString(6)+ "</td>"
						    +"<td>"+ rs4.getString(7)+ "</td>"
						
							+"<td><a href='OpoerationForm?ID=" + rs4.getInt(1)+ "'>Update</a></td>"
									+ "<td><a href='OperationWithDatabase?OperationType=Delete&Id=" + rs4.getInt(1) + "'>Delete</a></td>"
																																	
									+"</tr><br><br>");
				}
						
			pw.print("</table></body></html>");	
			
			con.close();
}
catch(Exception ex)
{
	pw.print(ex);
}
				
		}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
