package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/pa")
public class PAServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PAServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("portoAlegre.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		float area = Float.parseFloat(request.getParameter("areaTotal"));
		float garagem = Float.parseFloat(request.getParameter("areaGaragem"));
		PAController pa = new PAController(area, garagem);
		String retorno = pa.calcularImposto();
		request.setAttribute("saida", retorno);
		RequestDispatcher rd = request.getRequestDispatcher("portoAlegre.jsp");
		rd.forward(request, response);
	}

}
