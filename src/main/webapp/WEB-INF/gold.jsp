<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>        
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninja Gold</title>
<link rel="stylesheet" href="css/gold.css">
</head>

<body>
<h2 class="currentgold">Your Gold: <c:out value="${gold}"></c:out></h2>

<div class="boxs">
	<form action="/findgold" method="POST">
	
	<div class="box">
	<h2>Farm</h2>
	<p>(earns 10-20 gold)</p>
	<button type="submit" name="button" value="farm" class="button">Find Gold!</button>
	</div>
	
	<div class="box">
	<h2>Cave</h2>
	<p>(earns 5-10 gold)</p>
	<button type="submit" name="button" value="cave" class="button">Find Gold!</button>
	</div>
	
	<div class="box">
	<h2>House</h2>
	<p>(earns 2-5 gold)</p>
	<button type="submit" name="button" value="house" class="button">Find Gold!</button>
	</div>
	
	<div class="box">
	<h2>Casino!</h2>
	<p>(earns/takes 0-50 gold)</p>
	<button type="submit" name="button" value="casino" class="button">Find Gold!</button>
	</div>
		
	</form>
</div>

<h2>Activities:</h2>
<textarea rows="8" cols="140"><c:out value="${activies}"></c:out></textarea>

</body>
</html>