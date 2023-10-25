<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String username = request.getParameter("username").trim();
	String password = request.getParameter("password").trim();

	String name = "";
	String pass = "";

	if (username.equals("")) {
		name = "Vui lòng nhập tên đăng nhập";
	} else {
		if (!(username.length() >= 10 || username.length() >= 40)) {
			name = "tên đăng nhập từ 10 đến 40 ký tự";
		}
	}

	if (password.equals("")) {
		pass = "Vui lòng nhập mật khẩu";
	} else {
		if (password.length() < 8) {
			pass = "Mật khẩu phải có trên 8 ký tự";
		}
		
	}

	request.setAttribute("pcUsername", name);
	request.setAttribute("pcPassword", pass);

	RequestDispatcher rd = request.getRequestDispatcher("ShowLab5_2.jsp");
	rd.forward(request, response);
	%>

</body>

</html>