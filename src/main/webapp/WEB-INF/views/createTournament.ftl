<#import "templates/spring.ftl" as spring />
<!DOCTYPE html>
<html>
	<head>
	<#include "css/main.css">
		<meta charset="UTF-8">
		<title>Naujo turnyro sukurimas</title>
	</head>
	<body class="container">
	<#include "templates/header.ftl">
		<@spring.bind "tournament"/>
        <#if noErrors??>
            Tournaments<br>
            Tournament ID: 		${tournament.gameid}<br>
            Tournament Name: 	${tournament.game}<br>
            Format: 			${tournament.format}<br>
            Currency: 			${tournament.currency}<br>
            Buyin: 				${tournament.buyin}<br>
            Result: 			${tournament.result}<p>
            <a href="/TournamentParserSpring/tournaments" class="button">Show tournaments</a>
        <#else>		
			<form name="tournaments" action="/TournamentParserSpring/addTournament" 	method="post">
				Tournament ID:<br>
				<@spring.formInput "tournament.gameid"/>
                <@spring.showErrors "<br>"/><p>
				Tournament Name:<br>
				<@spring.formInput "tournament.game"/>
                <@spring.showErrors "<br>"/><p>
                 Format:<br>
				<@spring.formInput "tournament.format"/>
                <@spring.showErrors "<br>"/><p>
                Currency:<br>
				<@spring.formInput "tournament.currency"/>
                <@spring.showErrors "<br>"/><p>
                Buyin:<br>
				<@spring.formInput "tournament.buyin"/>
                <@spring.showErrors "<br>"/><p>
                Result:<br>
				<@spring.formInput "tournament.result"/>
                <@spring.showErrors "<br>"/><p>
                <br>
				<input type="submit" value="Add">
			</form>
		</#if>
	</body>
</html>
