package config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import dao.TournamentDao;
import dao.TournamentDaoImpl;
import service.TournamentService;
import service.TournamentServiceImpl;

@Configuration
public class SpringConfig {
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(getDataSource());
	}
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/db");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		return dataSource;
	}
	
	@Bean
	public TournamentDao getTournamentDao() {
		return new TournamentDaoImpl(getJdbcTemplate());
	}
	
	@Bean
	public TournamentService getTournamentService() {
		return new TournamentServiceImpl();
	}

}
