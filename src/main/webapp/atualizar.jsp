<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Atualizar</title>
<link rel="stylesheet" href="css/form.css">

<jsp:useBean id="coordenadores" scope="session" class="java.util.ArrayList"></jsp:useBean>
</head>
	<body>
	<h1>Atualizar Informações</h1>
	<hr />
	
	<div class="form"> 
		<form action="atualizar" method="POST">
		
			<input type="hidden" name="id" value="${coordenador.id}" >
			<label for="nome">Nome:</label>
			<input type="text" value="${coordenador.nome}" name="nome" required/><br />
			
			<label for="curso">Curso:</label>
			<input type="text" value="${coordenador.curso.disciplina}" name="curso" required/><br />
			
			<p> Período de Disponibilidade: </p>
			
			<label for="dia">Dia:</label>
			<input type="text" value="${coordenador.periodo.dia}" name="dia" required/><br />
			
			<label for="horaInicial">Horário Inicial:</label>
			<input type="text" value="${coordenador.periodo.horarioInicial}" name="horaInicial" required/><br />
			
			<label for="horaFinal">Horário Final:</label>
			<input type="text" value="${coordenador.periodo.horarioFinal}" name="horaFinal" required/><br />
		
		 	<input type="submit" value="Adicionar" />
		</form>
	</div>
</body>
</html>