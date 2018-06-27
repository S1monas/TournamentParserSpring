package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import org.springframework.validation.BindingResult;

import entity.Tournament;
import service.TournamentService;

@Controller
@RequestMapping("/")
public class TournamentController {
	
	@Autowired
	public TournamentService tournamentService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	/*@GetMapping("/nextPage")
	public String nextPage() {
		return "nextPage";
	}*/
	
	@GetMapping("/tournaments")
	//Model need for working between view and controller
	public String getAllTournaments(Model model) {
		model.addAttribute("tournaments", tournamentService.getAll());
		return "tournamentsList";
	}
	
	@GetMapping("/tournament/{gameid}")
	public String getById(@PathVariable("gameid") int gameid, Model model) {
		model.addAttribute("tournament", tournamentService.getById(gameid));
		return "showTournament";
	}

	@GetMapping("/update/{gameid}")
	public String update(@PathVariable("gameid") int gameid, Model model) {
		model.addAttribute("tournament", tournamentService.getById(gameid));
		return "editTournament";
	}
	
	@PostMapping("/updateTournament")
	public String updateTournament(@ModelAttribute("tournament") Tournament tournament) {
		tournamentService.update(tournament);
		return "redirect:/tournament/" + tournament.getGameid();
	}
	
	@GetMapping("/delete/{gameid}")
	public String delete(@PathVariable("gameid") int gameid) {
		tournamentService.delete(gameid);
		return "redirect:/tournaments";
	}

	@PostMapping("/addTournament")
	public String addTournament(@Valid Tournament tournament, BindingResult bindingResult, Model model) {
		if (!bindingResult.hasErrors()) {
            model.addAttribute("noErrors", true);
            tournamentService.save(tournament);
        }
        return "createTournament";
	}
	
	@GetMapping("/addTournament")
	public String createTournamentPage(Model model) {
		model.addAttribute("tournament", new Tournament());
		return "createTournament";
	} 
		
}
