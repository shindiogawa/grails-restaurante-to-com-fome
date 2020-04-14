<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Area restrita - Restaurante Tô com Fome</title>
</head>
<body>
    <form action='${request.contextPath}/j_spring_security_check' method='POST' id='ajaxLoginForm' name='formLogar'>
        <p>
            Email
            <input type="email" name="j_username" id="username">
        </p>
        <p>
            Senha
            <input type="password" name="j_password" id="password">
        </p>
        <input type="submit" value="Entrar">
    </form>
</body>
</html>
