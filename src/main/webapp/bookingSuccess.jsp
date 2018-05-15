<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Thanks you for booking a ticket</h1>
	<p>Your Details are as follows:</p>
	<table>
	
        <TR>
            <TD>First Name: </TD>
            <TD><%=request.getAttribute("firstName") %></TD>
        </TR>
        
        <TR>
            <TD>Lastname: </TD>
            <TD><%=request.getAttribute("lastName") %></TD>
        </TR>
         <TR>
            <TD>Journey Date: </TD>
            <TD><%=request.getAttribute("journeyDate") %></TD>
        </TR>
        <TR>
            <TD>Email: </TD>
            <TD><%=request.getAttribute("email") %></TD>
        </TR>
        </table>

</body>
</html>