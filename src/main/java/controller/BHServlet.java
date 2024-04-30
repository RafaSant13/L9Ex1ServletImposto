package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bh")
public class BHServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BHServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("beloHorizonte.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		float area = Float.parseFloat(request.getParameter("areaTotal"));
		int quartos = Integer.parseInt(request.getParameter("numQuarto"));
		BHController bh = new BHController(area, quartos);
		String retorno = bh.calcularImposto();
		request.setAttribute("saida", retorno);
		RequestDispatcher rd = request.getRequestDispatcher("beloHorizonte.jsp");
		rd.forward(request, response);
	}

}
