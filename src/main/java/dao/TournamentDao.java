package dao;

import java.util.List;

import entity.Tournament;

public interface TournamentDao {

	List<Tournament> getAll();
	
	void save(Tournament tournament);
	
	Tournament getById(int gameid);
	
	void update(Tournament tournament);
	
	void delete (int gameid);
}
