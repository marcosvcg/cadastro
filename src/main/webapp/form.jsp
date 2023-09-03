<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar</title>
<link rel="stylesheet" href="css/form.css">

<jsp:useBean id="coordenadores" scope="session" class="java.util.ArrayList"></jsp:useBean>
</head>
<body>
	<h1>Adicionar Coordenador</h1>
	
	<div class="form"> 
		<form action="cadastrar" method="POST">
			<label for="nome">Nome:</label>
			<input type="text" id="nome" name="nome" required/>
			
			<label for="curso">Curso:</label>
			<input type="text" id="curso" name="curso" required/>
			
			<p>Período de Disponibilidade:</p>
			
			<label for="dia">Dia:</label>
			<input type="text" id="dia" name="dia" required/>
			
			<label for="horaInicial">Horário Inicial:</label>
			<input type="text" id="horaInicial" name="horaInicial" required/>
			
			<label for="horaFinal">Horário Final:</label>
			<input type="text" id="horaFinal" name="horaFinal" required/>
			
			<input type="submit" value="Adicionar" />
		</form>
	</div>
</body>
</html>
