package entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Tournament {
	
	private int gameid;
	
	@Pattern(regexp="^[A-Za-z\\s]+$", message="Klaidingas pavadinimas!")
	private String game;

	@Pattern(regexp="^[A-Za-z0-9.-]{1,25}", message="Klaidingai formatas!")
	private String format;
	
	@Pattern(regexp="^[A-Za-z0-9.-]{1,25}", message="Klaidinga valiuta!")
	private String currency;
	
	@Pattern(regexp="^[0-9.]{1,7}$", message="Klaidingas buy-in, naudoti tik skaicius!")
	private String buyin;
	
	@NotNull(message="Klaidingas rezultatas!")
	private double result;


	public Tournament() {
	}

	public Tournament (int gameid, String game, String format, String currency, String buyin, double result) {
		this.gameid = gameid;
		this.game = game;
		this.format = format;
		this.currency = currency;
		this.buyin = buyin;
		this.result = result;		
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public int getGameid() {
		return gameid;
	}

	public void setGameid(int gameid) {
		this.gameid = gameid;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getBuyin() {
		return buyin;
	}

	public void setBuyin(String buyin) {
		this.buyin = buyin;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	
}
