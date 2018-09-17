<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aluno</title>

<style>

body {
	height: 100%;
	
	
}




button{
width: 40%;
margin-left: 30%;
margin-right: 30%;
}

.area-header {
	float:left;
	width:100%;
	background-color:;
}
.icone {
	float:left;
	width:60px;
	height:60px;
	margin-left: 20px;

}
.name-proj {
	float:left;
	margin-top:15px;
	margin-left:15px;
}

footer{
	position: absolute;
	bottom: 20px;
	margin: auto;
	display: block;
	width: 100%;
	text-align: center;
}
#formulario {
	width: 70%;
	padding: 3% 2%;
	margin: 2% 13%;
	background-color: rgba(200,200,200,0.5);
	border-radius: 40px ;
	padding: 1%;
	float:left;
	
}
input[type=text], label{
	width: 50%;
	margin: 0% 25%;
}

</style>

</head>
<body>
	

	<form action="servico" id="formulario">
	
		<h2>Adicionar aluno:</h2>
	
		
		<label>Matricula: </label> <input type="text" name="matricula" maxlength="14" value="${aluno.matricula }"/><br/>
		<label>Nome: </label> <input type="text" name="nome" value="${aluno.nome }" /><br/>
		<label>CPF </label> <input type="text" name="cpf" maxlength="11" value="${aluno.cpf }"/><br/>
		<label>Data de Nascimento: </label> <input type="text" name="dataNascimento" value="<fmt:formatDate value='${aluno.dataNascimento.time }' pattern='dd/MM/yyyy'/>" /><br/>
		<label>Endereço: </label> <input type="text" name="endereco" value="${aluno.endereco }"/><br/>
		
		<br/>
		<input type="hidden" name="function" value="AdicionarAluno">
		<c:choose>
			<c:when test="${not empty aluno}">
				<input type="hidden" name="id" value="${aluno.id }">
			</c:when>
		</c:choose>
		<button type="submit">Adicionar aluno</button>
	</form>
	<br/>
	<form action="servico">
		<input type="hidden" name="function" value="BuscarAluno">
		<button type="submit">Listar todos os alunos</button>
		
	</form>
	

	
</body>
</html>