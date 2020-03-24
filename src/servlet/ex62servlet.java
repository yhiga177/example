package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RedirectServlet")

public class ex62servlet extends HttpServlet {

	private static final long serealVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

			int rand = (int)(Math.random() * 10);
			if(rand%2 == 1) {
				response.sendRedirect("/ex62/redirect.jsp");
			} else {
				RequestDispatcher d = request.getRequestDispatcher("/forwarded.jsp");
				d.forward(request, response);
			}

		}
}

