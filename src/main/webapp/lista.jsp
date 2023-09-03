<%@page import="br.com.cadastro.model.Coordenador"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Coordenadores</title>
	<link rel="stylesheet" href="css/lista.css">

	<jsp:useBean id="coordenadores" scope="session" class="java.util.ArrayList"></jsp:useBean>
</head>
<body>
	<div class="container">
		<div class="barra"></div>
		<table>
		<button class="btn-adicionar" onclick="window.location.href='/cadastro/form.jsp'">Adicionar Coordenador</button>
		
			<thead>
				<tr>
					<th>Coordenador</th>
					<th>Cursos</th>
					<th>Dias</th>
					<th>Horários</th>
					<th>Opções</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="c" items="${coordenadores}">
					<tr>
						<td>${c.nome}</td>
						<td>${c.curso.disciplina}</td>
						<td>${c.periodo.dia}</td>
						<td>${c.periodo.horarioInicial} - ${c.periodo.horarioFinal}</td>
						<td>
							<form action="/cadastro/excluir" method="GET">
								<input type="hidden" name="id" value="${c.id}">
								<button type="submit" class="btn-excluir">Excluir</button>
							</form>
							<form action="/cadastro/atualizar" method="GET">
								<input type="hidden" name="id" value="${c.id}">
								<button type="submit" class="btn-atualizar">Atualizar</button>
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>