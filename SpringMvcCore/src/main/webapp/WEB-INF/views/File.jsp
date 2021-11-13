<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>

<h1>Show File-select Fields</h1>

<h3>Show a file-select field which allows multiple files:</h3>
<form action="uploadimage" method="post" enctype="multipart/form-data">
  <label for="myfile">Select files:</label>
  <input type="file" id="myfile" name="myfile" multiple><br><br>
  <input type="submit">
</form>

</body>
</html>
    