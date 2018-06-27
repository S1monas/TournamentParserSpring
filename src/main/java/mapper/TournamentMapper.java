package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entity.Tournament;

public class TournamentMapper implements RowMapper<Tournament> {

	@Override
	public Tournament mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tournament tournament = new Tournament();
		tournament.setGameid(rs.getInt("gameid"));
		tournament.setGame(rs.getString("game"));
		tournament.setFormat(rs.getString("format"));
		tournament.setCurrency(rs.getString("currency"));
		tournament.setBuyin(rs.getString("buyin"));
		tournament.setResult(rs.getDouble("result"));
		return tournament;
	}

}
