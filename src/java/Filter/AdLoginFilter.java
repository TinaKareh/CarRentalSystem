/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filter;

import Model.Owner;
import constants.UserType;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author GraceTina
 */
@WebFilter(filterName = "AdLoginFilter", urlPatterns = {"/admin/login"})
public class AdLoginFilter implements Filter {
 
    private FilterConfig filterConfig = null;
    
    public AdLoginFilter() {
    }    
    
   
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
        HttpServletRequest httpServlet = (HttpServletRequest)request;
        HttpSession session = httpServlet.getSession();
        
        if(session == null){
            ((HttpServletResponse) response).sendRedirect("/");
        }else{
        UserType uType = (UserType) session.getAttribute("uType");
          if (uType == UserType.AD) {
                request.setAttribute("user", (Owner) session.getAttribute("user"));
                chain.doFilter(request, response);
        }else{
             ((HttpServletResponse) response).sendRedirect("/"); 
          }}
        
        
    }
    public void setFilterConfig(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }

    /**
     * Destroy method for this filter
     */
    public void destroy() {        
    }

    /**
     * Init method for this filter
     */
    public void init(FilterConfig filterConfig) {        
        this.filterConfig = filterConfig;
            }

}
