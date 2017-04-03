package web.filters;

import repositories.DummyConferenceApplicationRepository;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by zolto on 03.04.2017.
 */
@WebFilter({"/", "/add"})
public class RegistrationClosedFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

        if(new DummyConferenceApplicationRepository().count()>5){
            servletResponse.getWriter().print("Rejestracja nie konferencje zakonczyla sie.");
            return;
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy(){
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }
}
