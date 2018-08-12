<%-- 
    Document   : index
    Created on : 17-mar-2018, 15:02:02
    Version    : 1.0.1
    Author     : Andrés Felipe Pérez Bedoya
    Copiright  : Enterprise app from Developer Art
--%>

<!DOCTYPE html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%-->

<html lang="es">
   <head>
      <meta charset="utf-8">  
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="description" content="Login form for user Clinic application">
      <meta name="author" content="Developer Art Inc">
      <link rel="icon" href="img/favicon.ico">

      <title>Clinic Histories v1.0.3</title>

      <!-- Bootstrap core CSS -->
      <link href="css/bootstrap.min.css" rel="stylesheet">

      <!-- Custom styles for this template -->
      <link href="css/style.css" rel="stylesheet">


      <!--
      //<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
      //<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
      //<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
      --> 


   </head>

   <body>

      <main>
         <section>
            <form method="post" action="SignIn">
               <table align="center" border="0">
                  <tbody>
                     <tr>
                        <td><img src="img/logopys-small.png" id="logo" alt="symbol"></td>
                     </tr>
                     <tr>
                        <td><h2>
                              <label>Sicología y Selecciones</label></h2></td>
                     </tr>
                     <tr>
                        <td><h4>
                              <label>Incio de sesión</label></h4></td>
                     </tr>
                     <tr>
                        <td><label for="cedula">*</label>
                           <input type="text" id="cedula" name="_cedula"
                                  size="25" placeholder="Cédula" autofocus=""
                                  required></td>
                     </tr>
                     <tr>
                        <td><label for="clave">*</label>
                           <input type="password" id="clave" name="_clave"
                                  size="25" placeholder="Contraseña" required>
                        </td>
                     <tr>
                        <td>
                           <label for="user">Ambos campos son obligatorios</label>
                        </td>
                     </tr>
                     <tr>
                        <td><button type="submit">Iniciar sesión</button></td>                        
                     </tr>
                     <tr>
                        <td class="errors">${msgError}</td>
                     </tr>
                  </tbody>
               </table>
            </form>
         </section>
      </main>
   </body>
</html>