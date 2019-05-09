/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Vehicle;
import Service.VehicleFacade;
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
@WebServlet(name = "RegisterVehicleController", urlPatterns = {"/register/vehicle"})
public class RegisterVehicleController extends HttpServlet {

    @EJB
     private VehicleFacade vehicleFacade; 
   
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
                .getRequestDispatcher("/WEB-INF/Admin/register_vehicle.jsp")
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
       
        Vehicle newVehicle = new Vehicle();
        newVehicle.setPlateNo(request.getParameter("plateNo"));
        newVehicle.setModel(request.getParameter("model"));
        newVehicle.setMake(request.getParameter("make"));
        newVehicle.setColor(request.getParameter("color"));
        newVehicle.setYearMake(request.getParameter("yearMake"));
        newVehicle.setPassCount(Short.parseShort(request.getParameter("passCount")));
        
        vehicleFacade.create(newVehicle);
        
        response.sendRedirect("/register/vehicle");
    }

   
}
