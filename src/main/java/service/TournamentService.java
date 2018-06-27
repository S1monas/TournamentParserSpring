package service;

import java.util.List;

import entity.Tournament;

public interface TournamentService {
	
	List<Tournament> getAll();
	
	void save(Tournament tournament);
	
	Tournament getById(int gameid);
	
	void update(Tournament tournament);
	
	void delete (int gameid);

}
