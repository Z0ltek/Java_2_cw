package web;

import domain.ConferenceApplication;
import repositories.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Szymon on 2017-03-28.
 */
@WebServlet("/add")
public class AddApplicationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ConferenceApplication application = retriveApplicationFromRequest(req);
        ConferenceApplicationRepository repository = new DummyConferenceApplicationRepository();

        HttpSession session = req.getSession();
        session.setAttribute("conf", application);

        repository.add(application);
        resp.sendRedirect("success.jsp");
    }

    private ConferenceApplication retriveApplicationFromRequest(HttpServletRequest request){
        ConferenceApplication result = new ConferenceApplication();
        result.setName(request.getParameter("name"));
        result.setSurname(request.getParameter("surname"));
        result.setAdvertisement(request.getParameter("info"));
        result.setEmail(request.getParameter("email"));
        result.setEmployment(request.getParameter("employment"));
        return result;
    }
}
