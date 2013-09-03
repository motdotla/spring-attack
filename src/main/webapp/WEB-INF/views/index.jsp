<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Spring Attack</title>

  <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.2.1/pure-min.css">
  <link rel="stylesheet" href="assets/css/application.css" type="text/css">
  <script src="assets/js/jquery.js"></script>
</head>
<body>
  <div class="pure-g-r">
    <div class="pure-u-1-6">
    </div>

    <div class="pure-u-2-3">
      <div class="header">
        <h1>Spring Attack!</h1>
        <h4>Receive pictures of Spring in your email.</h4>
      </div>

      <div class="content">
        <form:form class="pure-form-stacked signup" method="post" action="/signup" modelAttribute="signup">
          <form:input path="email" id="email" type="email" placeholder="Email" />

          <button type="submit" class="pure-button pure-button-primary">Submit</button>
        </form:form>
      </div>
    </div>
  </div>
</body>
</html>
