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
	String username = request.getParameter("username");
	String pass = request.getParameter("password");
	

	if (username.length() >= 10 && username.length() <= 40 && pass.length() >= 8) {
		request.setAttribute("success", "Đăng nhập thành công");
		request.getRequestDispatcher("ShowLab5_2.jsp").forward(request, response);
		return;
	}

	request.setAttribute("dataUsername", username);
	request.setAttribute("dataPassword", pass);
	
	if (username.equals("") || pass.equals("")) {
		if (username.equals("")) {
			request.setAttribute("name", "Vui lòng nhập username");
		} else if (username.length() < 10 || username.length() > 40) {
			request.setAttribute("name", "Username phải từ 10 đến 40 ký tự");
		}

		if (pass.equals("")) {
			request.setAttribute("password", "Vui lòng nhập password");
		} else if (pass.length() < 8) {
			request.setAttribute("password", "Password phải từ 8 ký tự trở lên");
		}
		request.getRequestDispatcher("Lab5_2.jsp").forward(request, response);

	} else {
		
		if(username.length() < 10 || username.length() > 40){
			request.setAttribute("name", "Username phải từ 10 đến 40 ký tự");
		}
		if(pass.length() < 8){
			request.setAttribute("password", "Password phải từ 8 ký tự trở lên");
		}
		
		request.getRequestDispatcher("Lab5_2.jsp").forward(request, response);
	}
	
	%>
</body>

</html>