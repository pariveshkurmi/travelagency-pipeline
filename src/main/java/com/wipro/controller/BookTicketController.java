package com.wipro.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class BookTicketController extends HttpServlet {

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String journeyDate = request.getParameter("journeyDate");
		String email = request.getParameter("email");
		request.setAttribute("firstName", firstName);
		request.setAttribute("lastName", lastName);
		request.setAttribute("journeyDate", journeyDate);
		request.setAttribute("email", email);
		RequestDispatcher rd = request.getRequestDispatcher("/bookingSuccess.jsp");
		rd.forward(request, response);

	}

}
