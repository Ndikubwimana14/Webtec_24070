<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Student Admission</title>
    <link rel="stylesheet" href="./styles.css" />
    <script defer src="scripts.js"></script>
  </head>
  <body>
    <div class="admission-form">
      <h2>Student Admission</h2>
      	<div style="padding: 0.25rem;"><label style="color: brown;">${message}</label></div>
      <form action="register" id="form" method="POST">
        <div class="form-group">
          <label for="firstName">First Name:</label>
          <input type="text" id="firstName" name="firstName" value="${firstName}" />
        </div>
        <div class="form-group">
          <label for="lastName">Last Name:</label>
          <input type="text" id="lastName" name="lastName" value="${lastName}" />
        </div>
        <div class="form-group">
          <label for="phone" class="form-group label">Phone:</label>
          <input type="tel" id="phone" name="phone" value="${phone}" />
        </div>
        <div class="form-group">
          <label for="email" class="form-group label">Email:</label>
          <input type="email" id="email" name="email" value="${email}" />
        </div>
        <div class="form-group">
          <label for="password" class="form-group label">Password:</label>
          <input type="password" id="password" name="password" value="${password}" />
        </div>
        <div class="form-group">
          <label for="confirmPassword" class="form-group label"
            >Confirm Password:</label
          >
          <input
            type="password"
            id="confirmPassword"
            name="confirmPassword"
            value="${confirmPassword}" 
          />
        </div>
        <div class="form-actions">
          <a href="index.jsp">Login to your account</a>
        </div>
        <button id="button" type="submit">Submit</button>
      </form>
    </div>
  </body>
</html>