package edu.miu.cs.cs545.controller;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ValidatorServlet", urlPatterns = {"/validateInput"})
public class ValidatorServlet extends HttpServlet {
    public ValidatorServlet() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> missingFieldsMsg = new ArrayList<String>();
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        String num3 = request.getParameter("num3");
        String num4 = request.getParameter("num4");

        if (StringUtils.isBlank(num1)) {
            missingFieldsMsg.add("Num1 is missing.");
        }
        if (StringUtils.isBlank(num2)) {
            missingFieldsMsg.add("Num2 is missing.");
        }
        if (StringUtils.isEmpty(num3)) {
            missingFieldsMsg.add("Num3 is missing.");
        }
        if (StringUtils.isBlank(num4)) {
            missingFieldsMsg.add("Num4 is missing.");
        }

        if (missingFieldsMsg.size() > 0) {
            request.setAttribute("errMsgs", missingFieldsMsg);
            request.setAttribute("num1", num1);
            request.setAttribute("num2", num2);
            request.setAttribute("num3", num3);
            request.setAttribute("num4", num4);
            request.getRequestDispatcher("/calculator").forward(request, response);
        } else {
            String sum = "" + (Integer.parseInt(num1) + Integer.parseInt(num2));
            String product = "" + (Integer.parseInt(num3) * Integer.parseInt(num4));
            System.out.println(sum);
            response.sendRedirect(request.getContextPath() + "/result?sum=" + sum + "&product=" + product);
        }
    }
}
