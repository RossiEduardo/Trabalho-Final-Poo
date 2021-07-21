<!DOCTYPE html>
<html lang="pt-br">
	<head>
	    <meta charset="UTF-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <title>allPet</title>
	</head>
	<body>
	    <p>Testando</p>
	    
	    <ul>
	        <#list usuarios as usuario>
			  	<li>${usuario.id} - ${usuario.nome}</li>
			</#list>
		</ul>
	</body>
</html>