<%-- 
    Document   : asistente_informe
    Created on : 10-07-2018, 10:29:25
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Asistente Informe</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>

<body>
    <div class="container">
        <h1 class="text-center">Asistente para creación de Informe</h1>
    </div>
    <div class="row">
        <div class="col">
            <div class="container-fluid float-left"><img>
                <div class="row">
                    <div class="col"><button class="btn btn-primary" type="button">Agregar otro gráfico</button><button class="btn btn-primary" type="button">Buscar gráficos anteriores</button></div>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="container-fluid">
                <div class="form-check"><input class="form-check-input" type="radio" id="formCheck-1"><label class="form-check-label" for="formCheck-1">Izquierda</label></div>
                <div class="form-check"><input class="form-check-input" type="radio" id="formCheck-2"><label class="form-check-label" for="formCheck-2">Centro</label></div>
                <div class="form-check"><input class="form-check-input" type="radio" id="formCheck-3"><label class="form-check-label" for="formCheck-3">Derecha</label></div>
            </div>
        </div>
        <div class="col">
            <div class="container-fluid"><textarea></textarea>
                <div class="col">
                    <div class="row">
                        <div class="col"><button class="btn btn-primary" type="button">Agregar Datos</button></div>
                    </div>
                    <div class="row">
                        <div class="col"><button class="btn btn-primary" type="button">Buscar set de Datos</button></div>
                    </div>
                    <div class="row">
                        <div class="col"><button class="btn btn-primary" type="button">Definir Ubicaciones</button></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col">
            <div class="container" align="center"><button class="btn btn-primary" type="button">Preview</button><button class="btn btn-primary" type="button">Generar</button></div>
        </div>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>
