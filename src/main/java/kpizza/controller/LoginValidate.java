package kpizza.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginValidate extends HttpServlet {

	 public LoginValidate() {
	    	System.out.println("LoginValidate 생성자-------");
	    }
	   
		

		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("LoginValidate doPost()");
			process(request, response);
		}

		protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String id = request.getParameter("id"); 
			String pw = request.getParameter("pw");
			
			if(id != null && id.equals("tester")) {
				System.out.println("tester 맞다 ----------");
		
				request.setAttribute("name", "반철준");
//				request.getRequestDispatcher("success").forward(request, response);
				request.getRequestDispatcher("success");
			}else {
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out = response.getWriter();
				out.println("\"<script>alert('아이디와 비밀번호를 확인해주세요'); history.go(-1);</script>");
				out.close();
				
			}
			
			if(pw != null && pw.equals("11")) {
				System.out.println(" 비밀번호 맞다 ----------");
		
				request.setAttribute("name", "반철준");
				request.getRequestDispatcher("success").forward(request, response);
				
			}else {
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out = response.getWriter();
				out.println("\"<script>alert('아이디와 비밀번호를 확인해주세요'); history.go(-1);</script>");
				out.close();
				
			}
		}

}
