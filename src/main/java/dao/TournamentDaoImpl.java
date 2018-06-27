package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import entity.Tournament;
import mapper.TournamentMapper;

public class TournamentDaoImpl implements TournamentDao{

	public final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public TournamentDaoImpl (JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<Tournament> getAll() {
		String sql = "SELECT * FROM tournaments"; 
		return jdbcTemplate.query(sql, new TournamentMapper());
	}

	@Override
	public void save(Tournament tournament) {
		String sql = "INSERT INTO tournaments (gameid, game, format, currency, buyin, result) VALUES (?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, tournament.getGameid(), tournament.getGame(),tournament.getFormat(),tournament.getCurrency(),tournament.getBuyin(),tournament.getResult());
		
	}

	@Override
	public Tournament getById(int gameid) {
		String sql = "SELECT * FROM tournaments WHERE gameid = ?";
		return jdbcTemplate.queryForObject(sql, new TournamentMapper(), gameid);
	}

	@Override
	public void update(Tournament tournament) {
		String sql = "UPDATE tournaments SET game =?, format = ?, currency = ?, buyin = ?, result = ? WHERE gameid = ?";
		jdbcTemplate.update(sql, tournament.getGame(),tournament.getFormat(),tournament.getCurrency(),tournament.getBuyin(),tournament.getResult(),tournament.getGameid());
	}

	@Override
	public void delete(int gameid) {
		String sql = "DELETE FROM tournaments WHERE gameid = ?";
		jdbcTemplate.update(sql, gameid);
	}

}
