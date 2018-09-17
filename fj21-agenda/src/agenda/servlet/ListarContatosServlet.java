package agenda.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ContatoDao;
import modelo.Contato;

@WebServlet("/listarContatos")
public class ListarContatosServlet extends HttpServlet{
     @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	 ContatoDao dao = new ContatoDao();
    	 List<Contato> contatos = dao.getLista();
    	 
    	 request.setAttribute("contatos", contatos);
    	 
         RequestDispatcher rd = request.getRequestDispatcher("Testando.jsp");
         rd.forward(request, response);
    }
}
