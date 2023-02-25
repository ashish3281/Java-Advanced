<%@ page language="java" contentType="text/html; charset=UTF-8"
  import="java.util.*"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int run=20; %>
<%! int run1=30; %>
<% out.print(run); %>
<%= run+run1 %>
<%= new java.util.Date() %>
</body>
</html>