<!DOCTYPE html>
<html>
	<head>
	<#include "css/main.css">
		<meta charset="UTF-8">
		<title>Turnyrai</title>
	</head>
	<body class="container">
	<#include "templates/header.ftl">
		<table id="customers">
			<tr>
				<th>Tournament ID</th>
				<th>Tournament Name</th>
				<th>Format</th>
				<th>Currency</th>
				<th>Buyin</th>
				<th>Result</th>
				<th>Delete</th>
				<th>Update</th>
			</tr>
			<#list tournaments as tournament>
				<tr>
					<td><a href="/TournamentParserSpring/tournament/${tournament.gameid}">${tournament.gameid}</a></td>
					<td>${tournament.game}</td>
					<td>${tournament.format}</td>
					<td>${tournament.currency}</td>
					<td>${tournament.buyin}</td>
					<td>${tournament.result}</td>
					<td><a href="/TournamentParserSpring/delete/${tournament.gameid}" class="button">Delete</a></td>
					<td><a href="/TournamentParserSpring/update/${tournament.gameid}" class="button">Update</a></td>
				</tr>
			</#list>
		</table>
		<br>
		<a href="/TournamentParserSpring/addTournament" class="button">Add</a>
	</body>
</html>
