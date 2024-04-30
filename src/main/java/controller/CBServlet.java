package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cb")
public class CBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CBServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("curitiba.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		float area = Float.parseFloat(request.getParameter("areaTotal"));
		int idade = Integer.parseInt(request.getParameter("idade"));
		CBController cb = new CBController(area, idade);
		String retorno = cb.calcularImposto();
		request.setAttribute("saida", retorno);
		RequestDispatcher rd = request.getRequestDispatcher("curitiba.jsp");
		rd.forward(request, response);
	}

}
