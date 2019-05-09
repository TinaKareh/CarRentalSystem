/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Customer;
import Model.RentCar;
import Service.CustomerFacade;
import Service.RentCarFacade;
import java.io.IOException;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GraceTina
 */
@WebServlet(name = "BookingContoller", urlPatterns = {"/book/trip"})
public class BookingContoller extends HttpServlet {
    
    @EJB
    private RentCarFacade rentFacade;
    @EJB
    private CustomerFacade customerFacade;

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext()
                .getRequestDispatcher("/WEB-INF/Customer/Renting-car.jsp")
                .forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String[] pickVals = request.getParameter("pickDate").split("-");
        String[] dropVals = request.getParameter("dropDate").split("-");
        
        Customer customer = customerFacade.find(1L);
        RentCar newBook = new RentCar();
        newBook.setCounty(request.getParameter("county"));
        newBook.setDistrict(request.getParameter("district"));
        newBook.setDropLocation(request.getParameter("dropLocation"));
        newBook.setPickLocation(request.getParameter("pickLocation"));
        newBook.setDropTime(request.getParameter("dropTime"));
        newBook.setPickTime(request.getParameter("pickTime"));
        newBook.setPassCount(Short.parseShort(request.getParameter("passCount")));
        newBook.setPickDate(new Date(Integer.parseInt(pickVals[0]),
                Integer.parseInt(pickVals[1]), Integer.parseInt(pickVals[2])));
        newBook.setDropDate(new Date(Integer.parseInt(dropVals[0]),
                Integer.parseInt(dropVals[1]), Integer.parseInt(dropVals[2])));
        newBook.setAppliedBy(customer);
        
        rentFacade.create(newBook);
        
        response.sendRedirect("/view/booking");
    }
}
