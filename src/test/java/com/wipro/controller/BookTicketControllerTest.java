package com.wipro.controller;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import junit.framework.Assert;

public class BookTicketControllerTest extends Mockito {

	@Mock
	 HttpServletRequest request;
	 @Mock
	 HttpServletResponse response;
	 @Mock
	 RequestDispatcher rd;
	 @InjectMocks
	 BookTicketController bookTicketController;
	 
	 @Before
	 public void setUp() throws Exception {
	  MockitoAnnotations.initMocks(this);
	 }
	 
	 @Test
	   public void testSuccessTicketBook() throws Exception {
		   
		   Mockito.when(request.getParameter("firstname")).thenReturn("Williams");
		   Mockito.when(request.getParameter("lastname")).thenReturn("henry");
		   Mockito.when(request.getParameter("journeyDate")).thenReturn("22-07-2017");
		   Mockito.when(request.getParameter("email")).thenReturn("abc@gmail.com");
		   Mockito.doNothing().when(request).setAttribute("abc", "abc");
		   Mockito.doNothing().when(request).setAttribute("lastName", "lastName");
		   Mockito.doNothing().when(request).setAttribute("journeyDate", "journeyDate");
		   Mockito.doNothing().when(request).setAttribute("email", "email");
		   Mockito.when(request.getRequestDispatcher("/bookingSuccess.jsp")).thenReturn(rd); 
	       StringWriter stringWriter = new StringWriter();
	       PrintWriter writer = new PrintWriter(stringWriter);
	       Mockito.when(response.getWriter()).thenReturn(writer);
	       bookTicketController.doPost(request, response);
	       
	       String result = stringWriter.getBuffer().toString().trim();
	       Assert.assertNotNull(result);
		   
	   }
}
