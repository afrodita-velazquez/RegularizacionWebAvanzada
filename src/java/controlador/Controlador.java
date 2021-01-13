
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuarios;
import modeloDAO.PersonaDAO;
import modeloDAO.UsuarioDAO;


public class Controlador extends HttpServlet {
    
    String listar = "vistas/listar.jsp";
    String add = "vistas/add.jsp";
    String edit = "vistas/edit.jsp";
    Usuarios u = new Usuarios();
    UsuarioDAO dao = new UsuarioDAO();
    int usuario_id;
    PersonaDAO pdao = new PersonaDAO();
    int r;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion=request.getParameter("accion");
        if(accion.equals("Ingresar")){
            String nombre = request.getParameter("txtNombre");
            String contra = request.getParameter("txtContra");
            u.setNombre(nombre);
            u.setContra(contra);
            r = pdao.validar(u);
            if(r==1){
                request.getRequestDispatcher("principal.jsp").forward(request, response);
            }else{
                request.getRequestDispatcher("index,jsp").forward(request, response);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        String acceso = "";
        String action = request.getParameter("accion");
        if(action.equalsIgnoreCase("listar")){
            acceso = listar;
        }else if(action.equalsIgnoreCase("add")){
            acceso = add;
        }else if(action.equalsIgnoreCase("Agregar")){
            String nombre =request.getParameter("txtNombre");
            String apellido =request.getParameter("txtApellido");
            String documento =request.getParameter("txtDocumento");
            String iden =request.getParameter("txtIden");
            String visita =request.getParameter("txtVisita");
            String motivo =request.getParameter("txtMotivo");
            String contra =request.getParameter("txtContra");
            u.setNombre(nombre);
            u.setApellido(apellido);
            u.setDocumento(documento);
            u.setIden(iden);
            u.setVisita(visita);
            u.setMotivo(motivo);
            u.setContra(contra);
            dao.add(u);
            acceso=listar;
        }else if(action.equalsIgnoreCase("Editar")){
            request.setAttribute("usuarioid", request.getParameter("usuario_id"));
            acceso = edit;
        }else if(action.equalsIgnoreCase("Actualizar")){
            usuario_id = Integer.parseInt(request.getParameter("txtUsuario_id"));
            String nombre =request.getParameter("txtNombre");
            String apellido =request.getParameter("txtApellido");
            String documento =request.getParameter("txtDocumento");
            String iden =request.getParameter("txtIden");
            String visita =request.getParameter("txtVisita");
            String motivo =request.getParameter("txtMotivo");
            String contra =request.getParameter("txtContra");
            u.setUsuario_id(usuario_id);
            u.setNombre(nombre);
            u.setApellido(apellido);
            u.setDocumento(documento);
            u.setIden(iden);
            u.setVisita(visita);
            u.setMotivo(motivo);
            u.setContra(contra);
            dao.edit(u);
            acceso = listar;
        }else if(action.equalsIgnoreCase("Eliminar")){
            usuario_id = Integer.parseInt(request.getParameter("usuario_id"));
            u.setUsuario_id(usuario_id);
            dao.eliminar(usuario_id);
            acceso = listar;
        }
        
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
