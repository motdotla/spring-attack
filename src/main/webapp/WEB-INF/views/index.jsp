<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>
<html>
  <head>
    <title>Spring Attack</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.2.1/pure-min.css">
    <link rel="stylesheet" href="assets/css/application.css" type="text/css">
    <script src="assets/js/jquery.js"></script>
  </head>
<body>
  <h1>${message}</h1>
  <form:form method="post" action="/signup" modelAttribute="signup">
    <table>
      <tr>
        <td>
          <label for="email">Email:</label>
        </td>
        <td>
          <form:input path="email" id="email" />
        </td>
      </tr>
      <tr>
        <td colspan="2">
          <input type="submit" value="Sign Up"/>
        </td>
      </tr>
    </table>  
  </form:form>
</body>
</html>
