/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filter;

import Model.Customer;
import constants.UserType;
import java.io.IOException;
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
@WebFilter(filterName = "CuLoginFilter", urlPatterns = {"/customer/login"})
public class CuLoginFilter implements Filter {
    
   

   
    private FilterConfig filterConfig = null;
    
    public CuLoginFilter() {
    }    
    
   
    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
        HttpServletRequest httpServlet = (HttpServletRequest) request;
        HttpSession session = httpServlet.getSession();
        
        if( session == null){
              ((HttpServletResponse) response).sendRedirect("/"); 
        }else{
         UserType uType = (UserType) session.getAttribute("uType");
          if (uType == UserType.CU) {
                request.setAttribute("user", (Customer) session.getAttribute("user"));
                chain.doFilter(request, response);
          }else{
          ((HttpServletResponse) response).sendRedirect("/");
          }
        }
        
    }
    /**
     * Set the filter configuration object for this filter.
     *
     * @param filterConfig The filter configuration object
     */
public void setFilterConfig(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }

    /**
     * Destroy method for this filter
     */
    @Override
    public void destroy() {        
    }

    /**
     * Init method for this filter
     */
    @Override
    public void init(FilterConfig filterConfig) {        
        this.filterConfig = filterConfig;
        
        }
    }

    /**
     * Return a String representation of this object.
     */
   
    

