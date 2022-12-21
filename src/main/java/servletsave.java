

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.todo.FactoryProvider;
import com.todo.Note;

/**
 * Servlet implementation class servletsave
 */
public class servletsave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletsave() {
        super();
        // TODO Auto-generated constructor stub
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
		try {
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
			
			Note note1 = new Note(0, title, content);
			System.out.println(note1.getTitle()+" "+note1.getContent()+" "+note1.getId());
			Session session = FactoryProvider.getFactory().openSession();
	        
	        Transaction tx= session.beginTransaction();
	        session.save(note1);
	        tx.commit();
	        session.close();
	        response.setContentType("text/html");
	        
	        PrintWriter out = response.getWriter();
	        out.println("<h1 style='text-align:center';>Note is added successfully</h1>");
	        out.println("<h1 style='text-align:center';><a href='allNotes.jsp'>See all notes </a></h1>");
	        


	        
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
