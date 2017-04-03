package web.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by zolto on 03.04.2017.
 */
@WebFilter("/add")
public class ApplicationDataInSessionFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpSession session = httpRequest.getSession();
        if(session.getAttribute("conf")!= null){
            servletResponse.getWriter().print("Twoje zgloszenie zostalo juz przeslane.");
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
