<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error</title>
</head>
<body>

  <!-- Error -->
    <section class="error bg-navy">
        <div class="container">
            <div class="row">
                <div class="col-md-6 col-md-offset-3">
                    <div class="error-content text-center">
                        <div class="error-box">
                            <div class="error-box-inner">
                                <h1 class="white">404</h1>
                            </div>
                        </div>
                        <h2 class="page-title white">Oops, looks like a ghost!</h2>
                        <h1>${ msg1}</h1>
                        <p class="white mar-0">The page you are looking for can't be found. Go home by <a href="index.jsp">Clicking here.</a></p>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Error Ends -->

</body>
</html>