<html>
<head>
<title>
	create location
</title>
</head>
<body>
<h2>Create Location</h2>

<form action="saveLoc" method="post">
	<pre>
	Id: <input type="text" name="id"/>
	Code: <input type="text" name="code"/>
	Name: <input type="text" name="name"/>
	Type: Urban <input type="radio" name="type" value="URBAN"/>
		  Rural <input type="radio" name="type" value="RURAL"/>
	<input type="submit" value="Save"/>
	</pre>
</form>
${message}

<a href="/displayLocation">view all</a>

</body>
</html>