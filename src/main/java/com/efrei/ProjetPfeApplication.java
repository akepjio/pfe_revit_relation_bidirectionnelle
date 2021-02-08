package com.efrei;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.efrei.entities.AirTerminalTypes;
import com.efrei.entities.AirTerminals;
import com.efrei.entities.Walls;
import com.efrei.utils.Tables;

@SpringBootApplication
public class ProjetPfeApplication implements CommandLineRunner {
	//[datarevit].[dbo].[Walls]
	
	@Autowired
	private JdbcTemplate jdbcTemplate;//cree un objet avec precision specifier dans le fichier de config

	public static void main(String[] args)  {
		SpringApplication.run(ProjetPfeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//String sql="SELECT * FROM Walls";
		//List<Walls> tables=jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Walls.class));
		//System.out.println(jdbcTemplate.toString());
		//tables.forEach(System.out::println);
		
	}

}
