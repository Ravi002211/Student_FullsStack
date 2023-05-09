<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sine up</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
 <h2>Sine up here</h2>
    <div class="register">
      <form action="reg" method="post">
        <label><b>User name</b></label>
        <br />
        <input type="text" name="uname" id="textBox" placeholder="Username" />
        <br /><br />
        <label><b>Password</b></label>
        <br />
        <input
          type="password"
          name="pass"
          id="textBox"
          placeholder="password"
        />
        <br /><br />
        <label><b>Eamil</b></label>
        <br />
        <input type="email" name="mail" id="textBox" placeholder="E mail" />
        <br /><br />
        <label><b>Gender</b></label>
        <br />
        <input type="radio" name="gender" value="male" />Male
        <input type="radio" name="gender" value="Female" />Female
        <input type="radio" name="gender" value="other" />Other <br /><br />
        <label><b>Address</b></label>
        <br />
        <textarea name="address" id="textBox" cols="20" rows="2"></textarea>
        <br /><br />
        <label><b>Resume</b></label>
        <br />
        <input type="file" name="file" id="file" />
        <br /><br />
        <input type="submit" id="submit" value="sine up" />
        <br /><br />
        <a href="login.jsp">Already Register? Sign in instead</a>
      </form>
    </div>
</body>
</html>