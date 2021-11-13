<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<body>

<h2>Complex</h2>

<p>Fill Data</p>

<form action="handler" method="post">

<div class="container mt-4">

	<div class="row">
		<div class="col-md-8 offset-md-2">
		<div class="card">
			<div class="card-body">
			
			<div class="alert alert-danger" role="alert">
  				<form:errors path="student.*"/>
			</div>
			
  <label for="fname">First name:</label><br>
  <input type="text" id="fname" name="fname"><br>
  <label for="lname">Last name:</label><br>
  <input type="text" id="lname" name="lname">
    <br><br>
  <label for="lname">Id:</label><br>
  <input type="text" id="id" name="id">
  
    <br><br>
      <br><br>
     <h1>Select the Language</h1>
  <input type="radio" id="html" name="language" value="HTML">
  <label for="html">HTML</label><br>
  <input type="radio" id="css" name="language" value="CSS">
  <label for="css">CSS</label><br>
  <input type="radio" id="javascript" name="language" value="JavaScript">
  <label for="javascript">JavaScript</label>
  <br><br>
  
  <label for="birthday">Birthday:</label>
  <input type="text" id="date" name="date" placeholder="dd/mm/yyyy"><br><br>
  
  <label for="cars">Choose a car:</label>
  <select id="cars" name="cars" size="4" multiple>
    <option value="volvo">Volvo</option>
    <option value="saab">Saab</option>
    <option value="fiat">Fiat</option>
    <option value="audi">Audi</option>
  </select><br><br>
  
  <label for="city">City</label><br>
  <input type="text" id="city" name="address.city"><br>
  <label for="street">Street :</label><br>
  <input type="text" id="street" name="address.street">
  
   <input type="submit">
   </div>
   </div>
   </div>
   </div>
</div>
</form> 

</body>
</html>
    