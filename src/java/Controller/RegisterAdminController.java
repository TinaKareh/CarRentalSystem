
package Controller;

import Model.Owner;
import Model.Users;
import Service.OwnerFacade;
import Service.UsersFacade;
import constants.UserType;
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
@WebServlet(name = "RegisterAdminController", urlPatterns = {"/register/admin"})
public class RegisterAdminController extends HttpServlet {
 
    @EJB
    private OwnerFacade adminFacade;
    @EJB
    private UsersFacade userFacade;

    

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
        
        Users newUser = new Users();
        newUser.setfName(request.getParameter("fName"));
        newUser.setlName(request.getParameter("lName"));
        newUser.setEmailAddress(request.getParameter("email"));
        newUser.setPhoneNo(request.getParameter("phoneNo"));
        newUser.setPwd(request.getParameter("password"));
        newUser.setConfirmPwd(request.getParameter("confirmPass"));
        newUser.setuType(UserType.AD);
        
        userFacade.create(newUser);
        newUser = userFacade.findByEmailAddress(newUser.getEmailAddress());
        Owner newAdmin = new Owner();
        newAdmin.setStakeholder(newUser);
        adminFacade.create(newAdmin);
    }

   

}
