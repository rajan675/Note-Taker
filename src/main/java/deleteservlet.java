

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.todo.FactoryProvider;
import com.todo.Note;

/**
 * Servlet implementation class deleteservlet
 */
public class deleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public deleteservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			int id = Integer.parseInt(request.getParameter("note1.id"));
			Session s = FactoryProvider.getFactory().openSession();
			Note note = (Note)s.get(Note.class, id);
			Transaction tx = s.beginTransaction();
			s.delete(note);
			tx.commit();
			s.close();
			response.sendRedirect("allNotes.jsp");
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}



}
