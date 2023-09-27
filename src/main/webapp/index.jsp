<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Login Form</title>
    <link rel="stylesheet" href="styles.css" />
    <script defer src="signin.js"></script>
  </head>
  <body>
    <div class="login-card">
      <h2>Login</h2>
      	<div style="padding: 0.25rem;"><label style="color: brown;">${message}</label></div>
      <form action="login" id="loginForm" method="POST">
        <div class="form-group">
          <label for="email">Email:</label>
          <input type="email" id="email" name="email" value="${email}"/>
        </div>
        <div class="form-group">
          <label for="password">Password:</label>
          <input type="password" id="password" name="password" value="${password}"/>
        </div>
        <div class="form-actions">
          <a href="admission.jsp">Create Account</a> |
          <a href="resetPwd.jsp">Forgot Password?</a>
        </div>
        <button type="submit">Login</button>
      </form>
    </div>
  </body>
</html>