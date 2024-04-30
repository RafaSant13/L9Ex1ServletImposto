package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/sp")
public class SPServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SPServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("saoPaulo.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		float area = Float.parseFloat(request.getParameter("areaTotal"));
		int comodos = Integer.parseInt(request.getParameter("comodos"));
		SPController sp = new SPController(area, comodos);
		String retorno = sp.calcularImposto();
		request.setAttribute("saida", retorno);
		RequestDispatcher rd = request.getRequestDispatcher("saoPaulo.jsp");
		rd.forward(request, response);
	}

}
