<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<html>  
<head>  
    <title>Spring 3 MVC Series - Contact Manager</title>  
</head>  
<body>   
<h2>Contact Manager</h2>  
<form:form method="post" action="addContact.html">    
    <table>    
    <tr>       
        <td><form:label path="name">First Name</form:label></td>       
        <td><form:input path="name" /></td>     
    </tr>      
    <tr>       
        <td><form:label path="email">Last Name</form:label></td>     
        <td><form:input path="email" /></td>   
    </tr>       
    <tr>     
        <td colspan="2">        
            <input type="submit" value="Add Contact"/>    
        </td>      
    </tr>  
    </table>   
</form:form>  
</body>  
</html>