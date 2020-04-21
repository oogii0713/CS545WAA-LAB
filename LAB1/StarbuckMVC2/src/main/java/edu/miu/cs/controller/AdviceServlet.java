package edu.miu.cs.controller;

import edu.miu.cs.data.DataFacade;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class AdviceServlet
 */
@WebServlet(value = "/AdviceServlet")
public class AdviceServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AdviceServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String roast = request.getParameter("roast");

        DataFacade data = (DataFacade) getServletContext().getAttribute("dataSource");
        List<String> advice = data.getAdvice(roast);
        request.setAttribute("roast", roast);
        request.setAttribute("advice", advice);
        request.getRequestDispatcher("/WEB-INF/views/display.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

}
