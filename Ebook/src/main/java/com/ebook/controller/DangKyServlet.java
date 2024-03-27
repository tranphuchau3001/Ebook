package com.ebook.controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/dang-ky", "/ket-qua"})
public class DangKyServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("views/dangky.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String[] hobbies = req.getParameterValues("hobbies");
		req.setAttribute("hobbies", hobbies);
		
		
		String username = req.getParameter("username");
		boolean gender = Boolean.parseBoolean(req.getParameter("gender"));
		boolean married = (req.getParameter("married") != null);
		String country = req.getParameter("country");
		System.out.println(">>username: " + username);
		System.out.println(">>gender: " + gender);
		System.out.println(">>married: " + married);
		System.out.println(">>country: " + country);
		System.out.println(">>hobbies: " + Arrays.toString(hobbies));

		
		req.getRequestDispatcher("views/result.jsp").forward(req, resp);
	}
}
