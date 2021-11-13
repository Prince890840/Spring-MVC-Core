package springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Interceptor extends HandlerInterceptorAdapter{

	/* implements HandlerInterceptor
	(If you want to use only preHandler not posthandle) */
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("This IS PreHandler");
		
		String name = request.getParameter("firstname");
		if(name.startsWith("P")) {
			System.out.println("Request Handle");
			response.setContentType("text/html");
			response.getWriter().println("<h1>Invalid Name</h1>");
			return false;
		}		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("This is post handle");
		
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("This is After Completion Method");
		
		super.afterCompletion(request, response, handler, ex);
	}

}