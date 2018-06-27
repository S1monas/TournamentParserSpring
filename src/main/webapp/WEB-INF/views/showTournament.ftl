<!DOCTYPE html>
<html>
	<head>
	<#include "css/main.css">
		<meta charset="UTF-8">
		<title>Turnyro informacija</title>
	</head>
	<body class="container">
		<#include "templates/header.ftl">
		<table id="customers">
			<th>Turnyro informacija</th>
			<th></th>
				<tr>
					<td><b>Tournament ID:</b></td>
					<td>${tournament.gameid}</td>
				</tr>
				<tr>
					<td><b>Tournament Name:</b></td>
					<td>${tournament.game}</td>
				</tr>
				<tr>
					<td><b>Format:</b></td>
					<td>${tournament.format}</td>
				</tr>
				<tr>
					<td><b>Currency:</b></td>
					<td>${tournament.currency}</td>
				</tr>
				<tr>
					<td><b>Buyin:</b></td>
					<td>${tournament.buyin}</td>
				</tr>
				<tr>
					<td><b>Result:</b></td>
					<td>${tournament.result}</td>
				</tr>
			</table>
		</div>
		<br>
		<a type="button" href="/TournamentParserSpring/tournaments" class="button">Atgal</a>
	</body>
</html>
