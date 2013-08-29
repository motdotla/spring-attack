<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>
<html>
  <head></head>
<body>
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
