<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Belo Horizonte</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	
	<br />
	<br />
	
	<div align="center">
		<form action="bh" method="post">
			<p class = "title"><b>Cálculo de Imposto</b></p>
			<table>
				<tr>
					<td>
						<input type = "text" id="areaTotal" 
						name="areaTotal" placeholder="Área total do imóvel" required="required">
					</td>	
				</tr>
				<tr>
					<td>
						<input type = "text" id="numQuarto" 
						name="numQuarto" placeholder="Número de quartos" required="required">
					</td>
				</tr>
				<tr>
					<td>
						<button id="calc" value="Calcular" 
						name="btn">Calcular</button>
					</td>
				</tr>
			</table>
		</form>
	</div>

	<br>
	<br>
	
	<c:if test="${not empty saida}">
		<div align="center">
			<h1><c:out value="${saida}"/></h1>
		</div>
	</c:if>
</body>
</html>