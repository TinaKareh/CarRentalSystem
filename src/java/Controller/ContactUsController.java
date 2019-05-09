/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ContactUs;
import Service.ContactUsFacade;
import java.io.IOException;
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
@WebServlet(name = "ContactUsController", urlPatterns = {"/contact/us"})
public class ContactUsController extends HttpServlet {
    
    @EJB
    private ContactUsFacade contactFacade;
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
                .getRequestDispatcher("/WEB-INF/Home/contact-us.jsp")
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
        
        ContactUs newContact = new ContactUs();
        newContact.setfName(request.getParameter("fName"));
        newContact.setlName(request.getParameter("lName"));
        newContact.setEmailAddress(request.getParameter("email"));
        newContact.setPhoneNo(request.getParameter("phoneNo"));
        newContact.setComments(request.getParameter("comments"));
        
        contactFacade.create(newContact);
        
        response.sendRedirect("/view/contact/us");
        
    }

   
}
