<!DOCTYPE html>
<html>
	<head>
	<#include "css/main.css">
		<meta charset="UTF-8">
		<title>Esamo turnyro redagavimas</title>
	</head>
	<body class="container">
	<#include "templates/header.ftl">
		<form name="tournament" action="/TournamentParserSpring/updateTournament" method="post">
			<input placeholder="Tournament ID"     		 type="text"   	name="gameid"  		value="${tournament.gameid}"><p>
			<input placeholder="Tournament Name"    	 type="text"   	name="game"  		value="${tournament.game}"><p>
			<input placeholder="Format"					 type="text"   	name="format" 		value="${tournament.format}"><p>
			<input placeholder="Currency"     			 type="text" 	name="currency"   	value="${tournament.currency}"><p>
			<input placeholder="Buyin"     			     type="text"   	name="buyin"  		value="${tournament.buyin}"><p>
			<input placeholder="Result"     			 type="text"   	name="result"  		value="${tournament.result}"><p>
			<input type="submit" value="Update">
		</form>
	</body>
</html>
