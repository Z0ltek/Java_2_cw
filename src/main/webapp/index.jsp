<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<form action="add" method="POST">
    <label>Imię<input type="text" id="name" name="name"></label></br>
    <label>Nazwisko<input type="text" id="surname" name="surname"></label></br>
    <label>Pracodawca<input type="text" id="employment" name="employment"></label></br>
    <label>Adres email<input type="text" id="email" name="email"></label></br>
    <label>Potwierdz adres email<input type="text" id="email" name="confirmemail"></label></br>
    <label>Skąd się dowiedziałeś o konferencji ?</label></br>
    <label>Ogłoszenie w pracy<input type="radio" id="info" name="work"></label></br>
    <label>Ogłoszenie na uczelni<input type="radio" id="info" name="school"></label></br>
    <label>Facebook<input type="radio" id="info" name="facebook"></label></br>
    <label>Znajomi<input type="radio" id="info" name="friends"></label></br>
    <input type="submit" value="Wyślij">
</form>
</body>
</html>
