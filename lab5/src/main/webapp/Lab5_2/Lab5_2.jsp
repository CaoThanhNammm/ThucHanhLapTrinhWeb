<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign in</title>
<link rel="stylesheet" href="Lab5_2.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
</head>
<body>

	<div class="page">
		<div class="container">
			<form id="form" action = "ProcessLab5_2.jsp" method = "POST">
				<div>
					<h2 class="form__title">Sign In</h2>
				</div>

				<div class="form__group">
					<input type="text" placeholder="username or email" name = "username"> 
					<input type="password" placeholder="password" name = "password">
				</div>

				<div class="form__submit">
					<button>SIGN IN</button>
				</div>

				<div class="form__social">
					<span>Or login with</span>
					<div class="social__icon">
						<div>
							<i class="fa-brands fa-facebook-f"></i>
						</div>
						<div>
							<img
								src="https://colorlib.com/etc/lf/Login_v9/images/icons/icon-google.png"
								alt="">
						</div>
					</div>
				</div>

				<div class="form__footer">
					<a href="">Sign Up</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>