<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Book</title>
</head>
<body>

<h3>Enter Book-Details</h3>
<form action="SaveController">
<hr>
<pre>
			Book ID <input type="text" name="bid"/>
			Title 	<input type="text" name="bname"/>
			Author	<input type="text" name="author"/>
			Subject	<input type="text" name="subject"/>
			Price	<input type="text" name="price"/>
					<input type="submit" value="Save">
</pre>
<hr>
</form>

</body>
</html>