<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Reset Password</title>
    <link rel="stylesheet" href="styles.css" />
  </head>
  <body>
    <div class="reset-password-form">
      <h2>Reset Password</h2>
      <form action="#" method="POST">
        <div class="form-group">
          <label for="email">Email:</label>
          <input type="email" id="email" name="email" required />
        </div>
        <div class="form-actions">
          <a href="index.jsp">Login to your account</a>
        </div>
        <button type="submit">Reset Password</button>
      </form>
    </div>
  </body>
</html>