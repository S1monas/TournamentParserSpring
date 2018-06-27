package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TournamentDao;
import entity.Tournament;

@Service
public class TournamentServiceImpl implements TournamentService{
	
	@Autowired
	public TournamentDao tournamentDao;

	@Override
	public List<Tournament> getAll() {
		return tournamentDao.getAll();
	}

	@Override
	public void save(Tournament tournament) {
		tournamentDao.save(tournament);
	}

	@Override
	public Tournament getById(int gameid) {
		return tournamentDao.getById(gameid);
	}

	@Override
	public void update(Tournament tournament) {
		tournamentDao.update(tournament);
	}

	@Override
	public void delete(int gameid) {
		tournamentDao.delete(gameid);
	}
}
