<%-- 
    Document   : add_columnas
    Created on : 10-07-2018, 10:28:10
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Añidar Columnas</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>

<body>
    <div class="container">
        <h1 class="text-center">Añadir Columna</h1>
    </div>
    <div class="row">
        <div class="col" align="center"><select style="margin-top:40px;"><optgroup label="This is a group"><option value="12" selected="">This is item 1</option><option value="13">This is item 2</option><option value="14">This is item 3</option></optgroup></select></div>
        <div class="col">
            <ul class="list-group">
                <li class="list-group-item"><span>List Group Item 1</span></li>
                <li class="list-group-item"><span>List Group Item 2</span></li>
                <li class="list-group-item"><span>List Group Item 3</span></li>
            </ul>
        </div>
        <div class="col">
            <div class="row">
                <div class="col"><button class="btn btn-primary" type="button">Añadir</button></div>
            </div>
            <div class="row">
                <div class="col" style="margin-top:20px;"><button class="btn btn-primary" type="button">Finalizar</button></div>
            </div>
            <div class="row">
                <div class="col" style="margin-top:20px;"><button class="btn btn-primary" type="button">Cancelar</button></div>
            </div>
        </div>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>
