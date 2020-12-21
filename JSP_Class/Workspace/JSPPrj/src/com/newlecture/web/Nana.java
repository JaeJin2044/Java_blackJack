package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hi")
public class Nana extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		//사용자가 어떻게 해석할것인가?
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
	
		//입력값 파라미터가 무조건 문자열 형식으로 들어옴
		// 정수형으로 바꿔주고 cnt에 저장 
		// http://localhost:8080/hi?cnt=3
		String cnt_ = request.getParameter("cnt");
		
		
		int cnt = 100;
		if(cnt_!=null && !cnt_.equals("")) {
			cnt = Integer.parseInt(cnt_);
		}
		
		//null이 발생하지 않게 해줌
		
		for (int i = 0; i < cnt; i++) {
			out.println((i+1)+": 안녕 servlet <br >");
		}
		
	}
}
