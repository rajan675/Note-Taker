

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
 * Servlet implementation class updateservlet
 */
public class updateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public updateservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		int id = Integer.parseInt(request.getParameter("id"));
		Session s = FactoryProvider.getFactory().openSession();
		Note note = (Note)s.get(Note.class, id);
		Transaction tx = s.beginTransaction();
		note.setTitle(title);
		note.setContent(content);
		tx.commit();
		s.close();
		response.sendRedirect("allNotes.jsp");

		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
