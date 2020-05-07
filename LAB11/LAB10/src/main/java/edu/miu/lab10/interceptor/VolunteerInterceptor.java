package edu.miu.lab10.interceptor;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class VolunteerInterceptor extends HandlerInterceptorAdapter {

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		String userMessage = "Welcome Guest";
		Principal principal = request.getUserPrincipal();

		if (principal != null) {
			if (request.isUserInRole("ROLE_ADMIN"))
				userMessage = "Welcome Admin, you can add a new employee.";
		}
		request.setAttribute("userMessage", userMessage);
	}

}
