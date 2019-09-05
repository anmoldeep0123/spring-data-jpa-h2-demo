<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addAnmolTable">
		<input type="text" name="fname"><br> <input type="text"
			name="lname"><br> <input type="submit"><br>
	</form>

	<br>

	<form action="getAnmolRow">
		<input type="text" name="id"><br> <input type="submit"><br>
	</form>

	<br>
	<label>Pagination</label>

	<form action="getPaginated">
		<input type="text" name="pageNumber"><br> <input
			type="text" name="pageSize"><br> <input type="submit"><br>
	</form>
</body>
</html>