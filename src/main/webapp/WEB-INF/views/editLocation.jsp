<html>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<title>
	Update location
</title>
</head>
<body>
<h2>Update Location</h2>

<form action="updateLocation" method="post">
	<pre>
	Code: <input type="text" name="code" value="${location.code}"/>
	Name: <input type="text" name="name" value="${location.name}"/>
	Type: Urban <input type="radio" name="type" value="URBAN" ${location.type=='URBAN'?'checked':''}/>
		  Rural <input type="radio" name="type" value="RURAL" ${location.type=='RURAL'?'checked':''}/>
	<input type="submit" value="Save"/>
	</pre>
</form>

</body>
</html>