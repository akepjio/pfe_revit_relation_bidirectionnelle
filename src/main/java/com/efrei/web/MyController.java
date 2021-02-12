package com.efrei.web;

import java.util.Date;
import java.util.List;
import java.util.Random;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.efrei.entities.*;
import com.efrei.utils.Not_Empty_Table;
import com.efrei.utils.Tables;


@Controller
public class MyController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	// @GetMapping("/")
	//public String def(Model model) {
		
		//return "redirect:/user/index";
	//}
	
	@GetMapping("/")
	public String chercher(Model model) {
		
		String sql="SELECT * FROM Walls";
		List<Walls> listWalls=jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Walls.class));
		
		//String sql4="SELECT * FROM AirTerminals";
		//List<AirTerminals> listAirTerminals=jdbcTemplate.query(sql4, BeanPropertyRowMapper.newInstance(AirTerminals.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listWalls",listWalls);
		//go to Walls view
		return "Walls";
	}
	
	//View entity information
	@GetMapping("AirTerminals")
	public String chercherairter(Model model1) {
		
		String sql4="SELECT * FROM AirTerminals";
		List<AirTerminals> listAirTerminals=jdbcTemplate.query(sql4, BeanPropertyRowMapper.newInstance(AirTerminals.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model1.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model1.addAttribute("listAirTerminals",listAirTerminals);
		//go to AirTerminals view
		return "AirTerminals";
	}
	
	@GetMapping("AirTerminalTypes")
	public String chercherairterty(Model model2) {
		
		String sql5="SELECT * FROM AirTerminalTypes";
		List<AirTerminalTypes> listAirTerminalTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(AirTerminalTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model2.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model2.addAttribute("listAirTerminalTypes",listAirTerminalTypes);
		//go to AirTerminals view
		return "AirTerminalTypes";
	}
	
	@GetMapping("AnalyzesAsTypeEnums")
	public String chercher1(Model model) {
		
		String sql5="SELECT * FROM AnalyzesAsTypeEnums";
		List<AnalyzesAsTypeEnums> listAnalyzesAsTypeEnums=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(AnalyzesAsTypeEnums.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listAnalyzesAsTypeEnums",listAnalyzesAsTypeEnums);
		//go to AirTerminals view
		return "AnalyzesAsTypeEnums";
	}
	
	@GetMapping("AreaSchemes")
	public String chercher2(Model model) {
		
		String sql5="SELECT * FROM AreaSchemes";
		List<AreaSchemes> listAreaSchemes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(AreaSchemes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listAreaSchemes",listAreaSchemes);
		//go to AirTerminals view
		return "AreaSchemes";
	}
	
	@GetMapping("AssemblyCodes")
	public String chercher3(Model model) {
		
		String sql5="SELECT * FROM AssemblyCodes";
		List<AssemblyCodes> listAssemblyCodes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(AssemblyCodes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listAssemblyCodes",listAssemblyCodes);
		//go to AirTerminals view
		return "AssemblyCodes";
	}
	
	@GetMapping("BuildingTypeSettings")
	public String chercher4(Model model) {
		
		String sql5="SELECT * FROM BuildingTypeSettings";
		List<BuildingTypeSettings> listBuildingTypeSettings=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(BuildingTypeSettings.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listBuildingTypeSettings",listBuildingTypeSettings);
		//go to AirTerminals view
		return "BuildingTypeSettings";
	}
	
	@GetMapping("CableTrayTypes")
	public String chercher5(Model model) {
		
		String sql5="SELECT * FROM CableTrayTypes";
		List<CableTrayTypes> listCableTrayTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(CableTrayTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listCableTrayTypes", listCableTrayTypes);
		//go to AirTerminals view
		return "CableTrayTypes";
	}
	
	@GetMapping("Categories")
	public String chercher6(Model model) {
		
		String sql5="SELECT * FROM Categories";
		List<Categories> listCategories=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Categories.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listCategories",  listCategories);
		//go to AirTerminals view
		return "Categories";
	}
	
	@GetMapping("Ceilings")
	public String chercher7(Model model) {
		
		String sql5="SELECT * FROM Ceilings";
		List<Ceilings> listCeilings=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Ceilings.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listCeilings", listCeilings);
		//go to AirTerminals view
		return "Ceilings";
    }
    
    	@GetMapping("CeilingTypes")
	public String chercher8(Model model) {
		
		String sql5="SELECT * FROM CeilingTypes";
		List<CeilingTypes> listCeilingTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(CeilingTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listCeilingTypes", listCeilingTypes);
		//go to AirTerminals view
		return "CeilingTypes";
	}

    	@GetMapping("ConditionTypeEnums")
	public String chercher9(Model model) {
		
		String sql5="SELECT * FROM ConditionTypeEnums";
		List<ConditionTypeEnums> listConditionTypeEnums=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ConditionTypeEnums.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listConditionTypeEnums", listConditionTypeEnums);
		//go to AirTerminals view
		return "ConditionTypeEnums";
	}

    	@GetMapping("ConduitTypes")
	public String chercher10(Model model) {
		
		String sql5="SELECT * FROM ConduitTypes";
		List<ConduitTypes> listConduitTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ConduitTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listConduitTypes", listConduitTypes);
		//go to AirTerminals view
		return "ConduitTypes";
	}

    @GetMapping("CoverTypes")
	public String chercher11(Model model) {
		
		String sql5="SELECT * FROM CoverTypes";
		List<CoverTypes> listCoverTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(CoverTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listCoverTypes", listCoverTypes);
		//go to AirTerminals view
		return "CoverTypes";
    }
    
    @GetMapping("CurtainPanels")
	public String chercher12(Model model) {
		
		String sql5="SELECT * FROM CurtainPanels";
		List<CurtainPanels> listCurtainPanels=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(CurtainPanels.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listCurtainPanels", listCurtainPanels);
		//go to AirTerminals view
		return "CurtainPanels";
    }
    
    @GetMapping("CurtainPanelTypes")
	public String chercher13(Model model) {
		
		String sql5="SELECT * FROM CurtainPanelTypes";
		List<CurtainPanelTypes> listCurtainPanelTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(CurtainPanelTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listCurtainPanelTypes", listCurtainPanelTypes);
		//go to AirTerminals view
		return "CurtainPanelTypes";
    }
    
    @GetMapping("CurtainSystemTypes")
	public String chercher14(Model model) {
		
		String sql5="SELECT * FROM CurtainSystemTypes";
		List<CurtainSystemTypes> listCurtainSystemTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(CurtainSystemTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listCurtainSystemTypes", listCurtainSystemTypes);
		//go to AirTerminals view
		return "CurtainSystemTypes";
    }
    
    @GetMapping("CurtainWallMullions")
	public String chercher15(Model model) {
		
		String sql5="SELECT * FROM CurtainWallMullions";
		List<CurtainWallMullions> listCurtainWallMullions=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(CurtainWallMullions.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listCurtainWallMullions", listCurtainWallMullions);
		//go to AirTerminals view
		return "CurtainWallMullions";
    }
    
    @GetMapping("CurtainWallMullionTypes")
	public String chercher16(Model model) {
		
		String sql5="SELECT * FROM CurtainWallMullionTypes";
		List<CurtainWallMullionTypes> listCurtainWallMullionTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(CurtainWallMullionTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listCurtainWallMullionTypes", listCurtainWallMullionTypes);
		//go to AirTerminals view
		return "CurtainWallMullionTypes";
    }
    
    @GetMapping("CurtainWallPanelOnWall")
	public String chercher17(Model model) {
		
		String sql5="SELECT * FROM CurtainWallPanelOnWall";
		List<CurtainWallPanelOnWall> listCurtainWallPanelOnWall=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(CurtainWallPanelOnWall.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listCurtainWallPanelOnWall", listCurtainWallPanelOnWall);
		//go to AirTerminals view
		return "CurtainWallPanelOnWall";
    }
    
    @GetMapping("DistributionSystemTypes")
	public String chercher18(Model model) {
		
		String sql5="SELECT * FROM DistributionSystemTypes";
		List<DistributionSystemTypes> listDistributionSystemTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(DistributionSystemTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listDistributionSystemTypes", listDistributionSystemTypes);
		//go to AirTerminals view
		return "DistributionSystemTypes";
    }
    
    @GetMapping("Doors")
	public String chercher19(Model model) {
		
		String sql5="SELECT * FROM Doors";
		List<Doors> listDoors=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Doors.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listDoors", listDoors);
		//go to AirTerminals view
		return "Doors";
    }
    
    @GetMapping("DoorTypes")
	public String chercher20(Model model) {
		
		String sql5="SELECT * FROM DoorTypes";
		List<DoorTypes> listDoorTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(DoorTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listDoorTypes", listDoorTypes);
		//go to AirTerminals view
		return "DoorTypes";
    }
    
    @GetMapping("DoorWall")
	public String chercher21(Model model) {
		
		String sql5="SELECT * FROM DoorWall";
		List<DoorWall> listDoorWall=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(DoorWall.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listDoorWall", listDoorWall);
		//go to AirTerminals view
		return "DoorWall";
    }
    
    @GetMapping("DuctFittingTypes")
	public String chercher22(Model model) {
		
		String sql5="SELECT * FROM DuctFittingTypes";
		List<DuctFittingTypes> listDuctFittingTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(DuctFittingTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listDuctFittingTypes", listDuctFittingTypes);
		//go to AirTerminals view
		return "DuctFittingTypes";
    }
    
    @GetMapping("DuctSystems")
	public String chercher23(Model model) {
		
		String sql5="SELECT * FROM DuctSystems";
		List<DuctSystems> listDuctSystems=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(DuctSystems.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listDuctSystems", listDuctSystems);
		//go to AirTerminals view
		return "DuctSystems";
    }
    
    @GetMapping("DuctSystemTypeEnums")
	public String chercher24(Model model) {
		
		String sql5="SELECT * FROM DuctSystemTypeEnums";
		List<DuctSystemTypeEnums> listDuctSystemTypeEnums=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(DuctSystemTypeEnums.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listDuctSystemTypeEnums", listDuctSystemTypeEnums);
		//go to AirTerminals view
		return "DuctSystemTypeEnums";
    }
    
    @GetMapping("DuctSystemTypes")
	public String chercher25(Model model) {
		
		String sql5="SELECT * FROM DuctSystemTypes";
		List<DuctSystemTypes> listDuctSystemTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(DuctSystemTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listDuctSystemTypes", listDuctSystemTypes);
		//go to AirTerminals view
		return "DuctSystemTypes";
    }
    
    @GetMapping("DuctTypes")
	public String chercher26(Model model) {
		
		String sql5="SELECT * FROM DuctTypes";
		List<DuctTypes> listDuctTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(DuctTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listDuctTypes", listDuctTypes);
		//go to AirTerminals view
		return "DuctTypes";
    }
    
    @GetMapping("EaveCutterTypeEnums")
	public String chercher27(Model model) {
		
		String sql5="SELECT * FROM EaveCutterTypeEnums";
		List<EaveCutterTypeEnums> listEaveCutterTypeEnums=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(EaveCutterTypeEnums.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listEaveCutterTypeEnums", listEaveCutterTypeEnums);
		//go to AirTerminals view
		return "EaveCutterTypeEnums";
    }
    
    @GetMapping("ElectricalDemandFactorDefinitions")
	public String chercher28(Model model) {
		
		String sql5="SELECT * FROM ElectricalDemandFactorDefinitions";
		List<ElectricalDemandFactorDefinitions> listEdfd=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ElectricalDemandFactorDefinitions.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listEdfd", listEdfd);
		//go to AirTerminals view
		return "ElectricalDemandFactorDefinitions";
    }
    
    @GetMapping("ElectricalLoadClassificationParameterElement")
	public String chercher29(Model model) {
		
		String sql5="SELECT * FROM ElectricalLoadClassificationParameterElement";
		List<ElectricalLoadClassificationParameterElement> listElcpe=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ElectricalLoadClassificationParameterElement.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listElcpe", listElcpe);
		//go to AirTerminals view
		return "ElectricalLoadClassificationParameterElement";
    }
    
    @GetMapping("ElectricalLoadClassifications")
	public String chercher30(Model model) {
		
		String sql5="SELECT * FROM ElectricalLoadClassifications";
		List<ElectricalLoadClassifications> listElc=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ElectricalLoadClassifications.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listElc", listElc);
		//go to AirTerminals view
		return "ElectricalLoadClassifications";
    }
    
    @GetMapping("ElectricalPhaseConfigurationEnums")
	public String chercher31(Model model) {
		
		String sql5="SELECT * FROM ElectricalPhaseConfigurationEnums";
		List<ElectricalPhaseConfigurationEnums> listEpc=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ElectricalPhaseConfigurationEnums.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listEpc", listEpc);
		//go to AirTerminals view
		return "ElectricalPhaseConfigurationEnums";
    }
    
    @GetMapping("ElectricalPhaseEnums")
	public String chercher32(Model model) {
		
		String sql5="SELECT * FROM ElectricalPhaseEnums";
		List<ElectricalPhaseEnums> listEpe=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ElectricalPhaseEnums.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listEpe", listEpe);
		//go to AirTerminals view
		return "ElectricalPhaseEnums";
    }
    
    @GetMapping("ElectricalSystemEnums")
	public String chercher33(Model model) {
		
		String sql5="SELECT * FROM ElectricalSystemEnums";
		List<ElectricalSystemEnums> listEse=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ElectricalSystemEnums.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listEse", listEse);
		//go to AirTerminals view
		return "ElectricalSystemEnums";
    }
    
    @GetMapping("ElementLevel")
	public String chercher34(Model model) {
		
		String sql5="SELECT * FROM ElementLevel";
		List<ElementLevel> listElementLevel=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ElementLevel.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listElementLevel", listElementLevel);
		//go to AirTerminals view
		return "ElementLevel";
    }
    
    @GetMapping("ElementPhase")
	public String chercher35(Model model) {
		
		String sql5="SELECT * FROM ElementPhase";
		List<ElementPhase> listElementPhase=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ElementPhase.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listElementPhase", listElementPhase);
		//go to AirTerminals view
		return "ElementPhase";
    }
    
    @GetMapping("FabricLocationEnums")
	public String chercher36(Model model) {
		
		String sql5="SELECT * FROM FabricLocationEnums";
		List<FabricLocationEnums> listFle=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(FabricLocationEnums.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listFle", listFle);
		//go to AirTerminals view
		return "FabricLocationEnums";
    }
    
    @GetMapping("FasciaTypes")
	public String cherchera(Model model) {
		
		String sql5="SELECT * FROM FasciaTypes";
		List<FasciaTypes> listFasciaTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(FasciaTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listFasciaTypes", listFasciaTypes);
		//go to AirTerminals view
		return "FasciaTypes";
    }
    
    @GetMapping("FlexDuctTypes")
	public String chercherz(Model model) {
		
		String sql5="SELECT * FROM FlexDuctTypes";
		List<FlexDuctTypes> listFdt=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(FlexDuctTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listFdt", listFdt);
		//go to AirTerminals view
		return "FlexDuctTypes";
    }
    
    @GetMapping("FlexPipeTypes")
	public String cherchere(Model model) {
		
		String sql5="SELECT * FROM FlexPipeTypes";
		List<FlexPipeTypes> listFpt=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(FlexPipeTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listFpt", listFpt);
		//go to AirTerminals view
		return "FlexPipeTypes";
    }
    
    @GetMapping("Floors")
	public String chercherr(Model model) {
		
		String sql5="SELECT * FROM Floors";
		List<Floors> listFloors=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Floors.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listFloors", listFloors);
		//go to AirTerminals view
		return "Floors";
    }
    
    @GetMapping("FloorTypes")
	public String cherchert(Model model) {
		
		String sql5="SELECT * FROM FloorTypes";
		List<FloorTypes> listFloorTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(FloorTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listFloorTypes", listFloorTypes);
		//go to AirTerminals view
		return "FloorTypes";
    }
    
    @GetMapping("FluidTypes")
	public String cherchery(Model model) {
		
		String sql5="SELECT * FROM FluidTypes";
		List<FluidTypes> listFluidTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(FluidTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listFluidTypes", listFluidTypes);
		//go to AirTerminals view
		return "FluidTypes";
    }
    
    @GetMapping("GenericModelTypes")
	public String chercheru(Model model) {
		
		String sql5="SELECT * FROM GenericModelTypes";
		List<GenericModelTypes> listGmt=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(GenericModelTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listGmt", listGmt);
		//go to AirTerminals view
		return "GenericModelTypes";
    }
    
    @GetMapping("Grids")
	public String chercheri(Model model) {
		
		String sql5="SELECT * FROM Grids";
		List<Grids> listGrids=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Grids.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listGrids", listGrids);
		//go to AirTerminals view
		return "Grids";
    }
    
    @GetMapping("GridTypes")
	public String cherchero(Model model) {
		
		String sql5="SELECT * FROM GridTypes";
		List<GridTypes> listGridTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(GridTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listGridTypes", listGridTypes);
		//go to AirTerminals view
		return "GridTypes";
    }
    
    @GetMapping("GutterTypes")
	public String chercherp(Model model) {
		
		String sql5="SELECT * FROM GutterTypes";
		List<GutterTypes> listGutterTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(GutterTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listGutterTypes", listGutterTypes);
		//go to AirTerminals view
		return "GutterTypes";
    }
    
    @GetMapping("HVACLoadSchedules")
	public String chercherq(Model model) {
		
		String sql5="SELECT * FROM HVACLoadSchedules";
		List<HVACLoadSchedules> listHls=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(HVACLoadSchedules.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listHls", listHls);
		//go to AirTerminals view
		return "HVACLoadSchedules";
    }
    
    @GetMapping("HVACZones")
	public String cherchers(Model model) {
		
		String sql5="SELECT * FROM HVACZones";
		List<HVACZones> listHVACZones=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(HVACZones.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listHVACZones", listHVACZones);
		//go to AirTerminals view
		return "HVACZones";
    }
    
    @GetMapping("InstanceUsageEnums")
	public String chercherd(Model model) {
		
		String sql5="SELECT * FROM InstanceUsageEnums";
		List<InstanceUsageEnums> listIue=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(InstanceUsageEnums.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listIue", listIue);
		//go to AirTerminals view
		return "InstanceUsageEnums";
    }
    
    @GetMapping("Levels")
	public String chercherf(Model model) {
		
		String sql5="SELECT * FROM Levels";
		List<Levels> listLevels=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Levels.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listLevels", listLevels);
		//go to AirTerminals view
		return "Levels";
    }
    
    @GetMapping("LevelTypes")
	public String chercherg(Model model) {
		
		String sql5="SELECT * FROM LevelTypes";
		List<LevelTypes> listLevelTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(LevelTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listLevelTypes", listLevelTypes);
		//go to AirTerminals view
		return "LevelTypes";
    }
    
    @GetMapping("LoadClassificationTypeEnums")
	public String chercherh(Model model) {
		
		String sql5="SELECT * FROM LoadClassificationTypeEnums";
		List<LoadClassificationTypeEnums> listLcte=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(LoadClassificationTypeEnums.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listLcte", listLcte);
		//go to AirTerminals view
		return "LoadClassificationTypeEnums";
    }
    
    @GetMapping("MaterialQuantities")
	public String chercherj(Model model) {
		
		String sql5="SELECT * FROM MaterialQuantities";
		List<MaterialQuantities> listMq=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(MaterialQuantities.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listMq", listMq);
		//go to AirTerminals view
		return "MaterialQuantities";
    }
    
    @GetMapping("Materials")
	public String chercherk(Model model) {
		
		String sql5="SELECT * FROM Materials";
		List<Materials> listMaterials=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Materials.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listMaterials", listMaterials);
		//go to AirTerminals view
		return "Materials";
    }
    
    @GetMapping("NeutralModeEnums")
	public String chercherl(Model model) {
		
		String sql5="SELECT * FROM NeutralModeEnums";
		List<NeutralModeEnums> listNme=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(NeutralModeEnums.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listNme", listNme);
		//go to AirTerminals view
		return "NeutralModeEnums";
    }
    
    @GetMapping("OmniClassNumbers")
	public String chercherm(Model model) {
		
		String sql5="SELECT * FROM OmniClassNumbers";
		List<OmniClassNumbers> listOcn=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(OmniClassNumbers.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listOcn", listOcn);
		//go to AirTerminals view
		return "OmniClassNumbers";
    }
    
    @GetMapping("PanelScheduleTemplatesBranchPanel")
	public String chercherw(Model model) {
		
		String sql5="SELECT * FROM PanelScheduleTemplatesBranchPanel";
		List<PanelScheduleTemplatesBranchPanel> listPstbp=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PanelScheduleTemplatesBranchPanel.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listPstbp", listPstbp);
		//go to AirTerminals view
		return "PanelScheduleTemplatesBranchPanel";
    }
    
    @GetMapping("PanelScheduleTemplatesDataPanel")
	public String chercherx(Model model) {
		
		String sql5="SELECT * FROM PanelScheduleTemplatesDataPanel";
		List<PanelScheduleTemplatesDataPanel> listPstdp=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PanelScheduleTemplatesDataPanel.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listPstdp", listPstdp);
		//go to AirTerminals view
		return "PanelScheduleTemplatesDataPanel";
    }
    
    @GetMapping("PanelScheduleTemplatesSwitchboard")
	public String chercherc(Model model) {
		
		String sql5="SELECT * FROM PanelScheduleTemplatesSwitchboard";
		List<PanelScheduleTemplatesSwitchboard> listPstsb=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PanelScheduleTemplatesSwitchboard.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listPstsb", listPstsb);
		//go to AirTerminals view
		return "PanelScheduleTemplatesSwitchboard";
    }
    

    @GetMapping("Phases")
	public String chercherv(Model model) {
		
		String sql5="SELECT * FROM Phases";
		List<Phases> listPhases=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Phases.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listPhases", listPhases);
		//go to AirTerminals view
		return "Phases";
    }
    

    @GetMapping("PipeConnectionTypes")
	public String chercherb(Model model) {
		
		String sql5="SELECT * FROM PipeConnectionTypes";
		List<PipeConnectionTypes> listPct=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PipeConnectionTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listPct", listPct);
		//go to AirTerminals view
		return "PipeConnectionTypes";
    }
    

    @GetMapping("PipeFittingTypes")
	public String cherchern(Model model) {
		
		String sql5="SELECT * FROM PipeFittingTypes";
		List<PipeFittingTypes> listPift=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PipeFittingTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listPift", listPift);
		//go to AirTerminals view
		return "PipeFittingTypes";
    }
    

    @GetMapping("PipeFlowStateEnums")
	public String chercher37(Model model) {
		
		String sql5="SELECT * FROM PipeFlowStateEnums";
		List<PipeFlowStateEnums> listPfse=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PipeFlowStateEnums.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listPfse", listPfse);
		//go to AirTerminals view
		return "PipeFlowStateEnums";
    }
    

    @GetMapping("PipeMaterialTypes")
	public String chercher38(Model model) {
		
		String sql5="SELECT * FROM PipeMaterialTypes";
		List<PipeMaterialTypes> listPmt=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PipeMaterialTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listPmt", listPmt);
		//go to AirTerminals view
		return "PipeMaterialTypes";
    }
    

    @GetMapping("PipeScheduleTypes")
	public String chercher39(Model model) {
		
		String sql5="SELECT * FROM PipeScheduleTypes";
		List<PipeScheduleTypes> listPst=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PipeScheduleTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listPst", listPst);
		//go to AirTerminals view
		return "PipeScheduleTypes";
    }
    

    @GetMapping("PipeSegments")
	public String chercher40(Model model) {
		
		String sql5="SELECT * FROM PipeSegments";
		List<PipeSegments> listPipeSegments=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PipeSegments.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listPipeSegments", listPipeSegments);
		//go to AirTerminals view
		return "PipeSegments";
    }
    

    @GetMapping("PipeSystemTypeEnums")
	public String chercher41(Model model) {
		
		String sql5="SELECT * FROM PipeSystemTypeEnums";
		List<PipeSystemTypeEnums> listPste=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PipeSystemTypeEnums.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listPste", listPste);
		//go to AirTerminals view
		return "PipeSystemTypeEnums";
    }
    

    @GetMapping("PipeTypes")
	public String chercher42(Model model) {
		
		String sql5="SELECT * FROM PipeTypes";
		List<PipeTypes> listPipeTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PipeTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listPipeTypes", listPipeTypes);
		//go to AirTerminals view
		return "PipeTypes";
    }
    

    @GetMapping("PipingSystemTypes")
	public String chercher43(Model model) {
		
		String sql5="SELECT * FROM PipingSystemTypes";
		List<PipingSystemTypes> listPist=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PipingSystemTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listPist", listPist);
		//go to AirTerminals view
		return "PipingSystemTypes";
    }
    

    @GetMapping("PlumbingFixtureOnWall")
	public String chercher44(Model model) {
		
		String sql5="SELECT * FROM PlumbingFixtureOnWall";
		List<PlumbingFixtureOnWall> listPfow=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PlumbingFixtureOnWall.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listPfow", listPfow);
		//go to AirTerminals view
		return "PlumbingFixtureOnWall";
    }
    

    @GetMapping("PlumbingFixtures")
	public String chercher45(Model model) {
		
		String sql5="SELECT * FROM PlumbingFixtures";
		List<PlumbingFixtures> listPf=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PlumbingFixtures.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listPf", listPf);
		//go to AirTerminals view
		return "PlumbingFixtures";
	}


	@GetMapping("PlumbingFixtureTypes")
	public String chercher46(Model model) {
		
		String sql5="SELECT * FROM PlumbingFixtureTypes";
		List<PlumbingFixtureTypes> listPft=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PlumbingFixtureTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listPft", listPft);
		//go to AirTerminals view
		return "PlumbingFixtureTypes";
	}


	@GetMapping("PowerFactorStateTypeEnums")
	public String chercher47(Model model) {
		
		String sql5="SELECT * FROM PowerFactorStateTypeEnums";
		List<PowerFactorStateTypeEnums> listPfste=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PowerFactorStateTypeEnums.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listPfste", listPfste);
		//go to AirTerminals view
		return "PowerFactorStateTypeEnums";
	}


	@GetMapping("Profiles")
	public String chercher48(Model model) {
		
		String sql5="SELECT * FROM Profiles";
		List<Profiles> listProfiles=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Profiles.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listProfiles", listProfiles);
		//go to AirTerminals view
		return "Profiles";
	}


	@GetMapping("ProjectInformation")
	public String chercher49(Model model) {
		
		String sql5="SELECT * FROM ProjectInformation";
		List<ProjectInformation> listPi=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ProjectInformation.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listPi", listPi);
		//go to AirTerminals view
		return "ProjectInformation";
	}


	@GetMapping("PropertyLineTypes")
	public String chercher50(Model model) {
		
		String sql5="SELECT * FROM PropertyLineTypes";
		List<PropertyLineTypes> listPlt=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PropertyLineTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listPlt", listPlt);
		//go to AirTerminals view
		return "PropertyLineTypes";
	}


	@GetMapping("RailingTypes")
	public String chercher51(Model model) {
		
		String sql5="SELECT * FROM RailingTypes";
		List<RailingTypes> listRailingTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(RailingTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listRailingTypes", listRailingTypes);
		//go to AirTerminals view
		return "RailingTypes";
	}


	@GetMapping("RampTypes")
	public String chercher52(Model model) {
		
		String sql5="SELECT * FROM RampTypes";
		List<RampTypes> listRampTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(RampTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listRampTypes", listRampTypes);
		//go to AirTerminals view
		return "RampTypes";
	}


	@GetMapping("RebarLayoutEnums")
	public String chercher53(Model model) {
		
		String sql5="SELECT * FROM RebarLayoutEnums";
		List<RebarLayoutEnums> listRle=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(RebarLayoutEnums.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listRle", listRle);
		//go to AirTerminals view
		return "RebarLayoutEnums";
	}


	@GetMapping("RebarStyleEnums")
	public String chercher54(Model model) {
		
		String sql5="SELECT * FROM RebarStyleEnums";
		List<RebarStyleEnums> listRse=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(RebarStyleEnums.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listRse", listRse);
		//go to AirTerminals view
		return "RebarStyleEnums";
	}


	@GetMapping("RevitDBLinkInfo")
	public String chercher55(Model model) {
		
		String sql5="SELECT * FROM RevitDBLinkInfo";
		List<RevitDBLinkInfo> listRdbli=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(RevitDBLinkInfo.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listRdbli", listRdbli);
		//go to AirTerminals view
		return "RevitDBLinkInfo";
	}


	@GetMapping("Roofs")
	public String chercher56(Model model) {
		
		String sql5="SELECT * FROM Roofs";
		List<Roofs> listRoofs=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Roofs.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listRoofs", listRoofs);
		//go to AirTerminals view
		return "Roofs";
	}


	@GetMapping("RoofTypes")
	public String chercher57(Model model) {
		
		String sql5="SELECT * FROM RoofTypes";
		List<RoofTypes> listRoofTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(RoofTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listRoofTypes", listRoofTypes);
		//go to AirTerminals view
		return "RoofTypes";
	}


	@GetMapping("RoomAssociations")
	public String chercher58(Model model) {
		
		String sql5="SELECT * FROM RoomAssociations";
		List<RoomAssociations> listRa=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(RoomAssociations.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listRa", listRa);
		//go to AirTerminals view
		return "RoomAssociations";
	}


	@GetMapping("RoomFromToAssociations")
	public String chercher59(Model model) {
		
		String sql5="SELECT * FROM RoomFromToAssociations";
		List<RoomFromToAssociations> listRfta=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(RoomFromToAssociations.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listRfta", listRfta);
		//go to AirTerminals view
		return "RoomFromToAssociations";
	}


	@GetMapping("Rooms")
	public String chercher60(Model model) {
		
		String sql5="SELECT * FROM Rooms";
		List<Rooms> listRooms=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Rooms.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listRooms", listRooms);
		//go to AirTerminals view
		return "Rooms";
	}


	@GetMapping("RoomTags")
	public String chercher61(Model model) {
		
		String sql5="SELECT * FROM RoomTags";
		List<RoomTags> listRoomTags=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(RoomTags.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listRoomTags", listRoomTags);
		//go to AirTerminals view
		return "RoomTags";
	}


	@GetMapping("ServiceTypeEnums")
	public String chercher62(Model model) {
		
		String sql5="SELECT * FROM ServiceTypeEnums";
		List<ServiceTypeEnums> listSte=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ServiceTypeEnums.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listSte", listSte);
		//go to AirTerminals view
		return "ServiceTypeEnums";
	}


	@GetMapping("Sheets")
	public String chercher63(Model model) {
		
		String sql5="SELECT * FROM Sheets";
		List<Sheets> listSheets=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Sheets.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listSheets", listSheets);
		//go to AirTerminals view
		return "Sheets";
	}


	@GetMapping("SlabEdgeTypes")
	public String chercher64(Model model) {
		
		String sql5="SELECT * FROM SlabEdgeTypes";
		List<SlabEdgeTypes> listSet=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(SlabEdgeTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listSet", listSet);
		//go to AirTerminals view
		return "SlabEdgeTypes";
	}


	@GetMapping("SpaceTypeEnums")
	public String chercher65(Model model) {
		
		String sql5="SELECT * FROM SpaceTypeEnums";
		List<SpaceTypeEnums> listSpte=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(SpaceTypeEnums.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listSpte", listSpte);
		//go to AirTerminals view
		return "SpaceTypeEnums";
	}


	@GetMapping("SpaceTypeSettings")
	public String chercher66(Model model) {
		
		String sql5="SELECT * FROM SpaceTypeSettings";
		List<SpaceTypeSettings> listSts=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(SpaceTypeSettings.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listSts", listSts);
		//go to AirTerminals view
		return "SpaceTypeSettings";
	}


	@GetMapping("SpecialtyEquipment")
	public String chercher67(Model model) {
		
		String sql5="SELECT * FROM SpecialtyEquipment";
		List<SpecialtyEquipment> listSe=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(SpecialtyEquipment.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listSe", listSe);
		//go to AirTerminals view
		return "SpecialtyEquipment";
	}


	@GetMapping("SpecialtyEquipmentTypes")
	public String chercher68(Model model) {
		
		String sql5="SELECT * FROM SpecialtyEquipmentTypes";
		List<SpecialtyEquipmentTypes> listSpeet=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(SpecialtyEquipmentTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listSpeet", listSpeet);
		//go to AirTerminals view
		return "SpecialtyEquipmentTypes";
	}


	@GetMapping("StairTypes")
	public String chercher69(Model model) {
		
		String sql5="SELECT * FROM StairTypes";
		List<StairTypes> listStairTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(StairTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listStairTypes", listStairTypes);
		//go to AirTerminals view
		return "StairTypes";
	}


	@GetMapping("StructuralColumns")
	public String chercher70(Model model) {
		
		String sql5="SELECT * FROM StructuralColumns";
		List<StructuralColumns> listSc=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(StructuralColumns.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listSc", listSc);
		//go to AirTerminals view
		return "StructuralColumns";
	}


	@GetMapping("StructuralColumnTypes")
	public String chercher71(Model model) {
		
		String sql5="SELECT * FROM StructuralColumnTypes";
		List<StructuralColumnTypes> listSct=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(StructuralColumnTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listSct", listSct);
		//go to AirTerminals view
		return "StructuralColumnTypes";
	}


	@GetMapping("StructuralFoundationTypes")
	public String chercher72(Model model) {
		
		String sql5="SELECT * FROM StructuralFoundationTypes";
		List<StructuralFoundationTypes> listSft=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(StructuralFoundationTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listSft", listSft);
		//go to AirTerminals view
		return "StructuralFoundationTypes";
	}


	@GetMapping("StructuralFraming")
	public String chercher73(Model model) {
		
		String sql5="SELECT * FROM StructuralFraming";
		List<StructuralFraming> listSf=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(StructuralFraming.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listSf", listSf);
		//go to AirTerminals view
		return "StructuralFraming";
	}


	@GetMapping("StructuralFramingTypes")
	public String chercher74(Model model) {
		
		String sql5="SELECT * FROM StructuralFramingTypes";
		List<StructuralFramingTypes> listStft=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(StructuralFramingTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listStft", listStft);
		//go to AirTerminals view
		return "StructuralFramingTypes";
	}


	@GetMapping("Views")
	public String chercher75(Model model) {
		
		String sql5="SELECT * FROM Views";
		List<Views> listViews=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Views.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listViews", listViews);
		//go to AirTerminals view
		return "Views";
	}


	@GetMapping("VoltageTypes")
	public String chercher76(Model model) {
		
		String sql5="SELECT * FROM VoltageTypes";
		List<VoltageTypes> listVoltageTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(VoltageTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listVoltageTypes", listVoltageTypes);
		//go to AirTerminals view
		return "VoltageTypes";
	}


	@GetMapping("Walls")
	public String chercher77(Model model) {
		
		String sql5="SELECT * FROM Walls";
		List<Walls> listWalls=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Walls.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listWalls", listWalls);
		//go to AirTerminals view
		return "Walls";
	}


	@GetMapping("WallSweeps")
	public String chercher78(Model model) {
		
		String sql5="SELECT * FROM WallSweeps";
		List<WallSweeps> listWallSweeps=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(WallSweeps.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listWallSweeps", listWallSweeps);
		//go to AirTerminals view
		return "WallSweeps";
	}


	@GetMapping("WallSweepTypes")
	public String chercher79(Model model) {
		
		String sql5="SELECT * FROM WallSweepTypes";
		List<WallSweepTypes> listWst=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(WallSweepTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listWst", listWst);
		//go to AirTerminals view
		return "WallSweepTypes";
	}


	@GetMapping("WallTypes")
	public String chercher80(Model model) {
		
		String sql5="SELECT * FROM WallTypes";
		List<WallTypes> listWallTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(WallTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listWallTypes", listWallTypes);
		//go to AirTerminals view
		return "WallTypes";
	}


	@GetMapping("WallUsageEnums")
	public String chercher81(Model model) {
		
		String sql5="SELECT * FROM WallUsageEnums";
		List<WallUsageEnums> listWue=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(WallUsageEnums.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listWue", listWue);
		//go to AirTerminals view
		return "WallUsageEnums";
	}


	@GetMapping("Windows")
	public String chercher82(Model model) {
		
		String sql5="SELECT * FROM Windows";
		List<Windows> listWindows=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Windows.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listWindows", listWindows);
		//go to AirTerminals view
		return "Windows";
	}


	@GetMapping("WindowTypes")
	public String chercher83(Model model) {
		
		String sql5="SELECT * FROM WindowTypes";
		List<WindowTypes> listWindowTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(WindowTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listWindowTypes", listWindowTypes);
		//go to AirTerminals view
		return "WindowTypes";
	}


	@GetMapping("WindowWall")
	public String chercher84(Model model) {
		
		String sql5="SELECT * FROM WindowWall";
		List<WindowWall> listWindowWall=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(WindowWall.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listWindowWall", listWindowWall);
		//go to AirTerminals view
		return "WindowWall";
	}


	@GetMapping("WireInsulationTypes")
	public String chercher85(Model model) {
		
		String sql5="SELECT * FROM WireInsulationTypes";
		List<WireInsulationTypes> listWit=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(WireInsulationTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listWit", listWit);
		//go to AirTerminals view
		return "WireInsulationTypes";
	}


	@GetMapping("WireMaterialTypes")
	public String chercher86(Model model) {
		
		String sql5="SELECT * FROM WireMaterialTypes";
		List<WireMaterialTypes> listWmt=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(WireMaterialTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listWmt", listWmt);
		//go to AirTerminals view
		return "WireMaterialTypes";
	}


	@GetMapping("WireTemperatureRatingTypes")
	public String chercher87(Model model) {
		
		String sql5="SELECT * FROM WireTemperatureRatingTypes";
		List<WireTemperatureRatingTypes> listWtrt=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(WireTemperatureRatingTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listWtrt", listWtrt);
		//go to AirTerminals view
		return "WireTemperatureRatingTypes";
	}


	@GetMapping("WireTypes")
	public String chercher88(Model model) {
		
		String sql5="SELECT * FROM WireTypes";
		List<WireTypes> listWireTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(WireTypes.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listWireTypes", listWireTypes);
		//go to AirTerminals view
		return "WireTypes";
	}


	@GetMapping("WiringTypeEnums")
	public String chercher89(Model model) {
		
		String sql5="SELECT * FROM WiringTypeEnums";
		List<WiringTypeEnums> listWiringTypeEnums=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(WiringTypeEnums.class));
		
		String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES";
		
		String sql3="SELECT 'TABLE_NAME'=convert(char(255),t.TABLE_NAME),\r\n" + 
				"      'Total_Record_Count'=max(i.rows)\r\n" + 
				"FROM sysindexes i, INFORMATION_SCHEMA.TABLES t\r\n" + 
				"WHERE t.TABLE_NAME = object_name(i.id)\r\n" + 
				"      and t.TABLE_TYPE = 'BASE TABLE'\r\n" + 
				"GROUP BY t.TABLE_SCHEMA, t.TABLE_NAME\r\n" + 
				"HAVING max(i.rows)>0\r\n" + 
				"ORDER BY 'Total_Record_Count' DESC";
		List<Not_Empty_Table> tables=jdbcTemplate.query(sql3, BeanPropertyRowMapper.newInstance(Not_Empty_Table.class));
		//once received tables, save them inside the Model
		model.addAttribute("not_empty_tables",tables);
		//once received listWalls, save them inside the Model
		model.addAttribute("listWiringTypeEnums", listWiringTypeEnums);
		//go to AirTerminals view
		return "WiringTypeEnums";
	}



	
	//view edit form 
	@GetMapping("/admin/editWalls")
	public String edit(Model model, Integer id ) {
		String sql1="SELECT * FROM Walls where id="+id;
		List<Walls> walls=jdbcTemplate.query(sql1, BeanPropertyRowMapper.newInstance(Walls.class));
		
		//il faut stocker le produit dans le modele
		model.addAttribute("Walls", walls.get(0));
		return "editWalls";	
	}
	
	@GetMapping("/admin/editAirTerminals")
	public String edit1(Model model, Integer id ) {
		String sql1="SELECT * FROM AirTerminals where id="+id;
		List<AirTerminals> airterminals=jdbcTemplate.query(sql1, BeanPropertyRowMapper.newInstance(AirTerminals.class));
		
		//il faut stocker le produit dans le modele
		model.addAttribute("AirTerminals", airterminals.get(0));
		return "editAirTerminals";
	}
	
	@GetMapping("/admin/editAirTerminalTypes")
	public String edit2(Model model, Integer id ) {
		String sql1="SELECT * FROM AirTerminalTypes where id="+id;
		List<AirTerminalTypes> airterminaltypes=jdbcTemplate.query(sql1, BeanPropertyRowMapper.newInstance(AirTerminalTypes.class));
		
		//il faut stocker le produit dans le modele
		model.addAttribute("AirTerminalTypes", airterminaltypes.get(0));
		return "editAirTerminalTypes";
	}
	
	@GetMapping("/admin/editAnalyzesAsTypeEnums")
	public String edit3(Model model, Integer id ) {
		String sql1="SELECT * FROM AnalyzesAsTypeEnums where id="+id;
		List<AnalyzesAsTypeEnums> analyzesastypeEnums=jdbcTemplate.query(sql1, BeanPropertyRowMapper.newInstance(AnalyzesAsTypeEnums.class));
		
		//il faut stocker le produit dans le modele
		model.addAttribute("AnalyzesAsTypeEnums", analyzesastypeEnums.get(0));
		return "editAnalyzesAsTypeEnums";
	}
    
	@GetMapping("/admin/editAreaSchemes")
	public String edit4(Model model, Integer id ) {
		String sql1="SELECT * FROM AreaSchemes where id="+id;
		List<AreaSchemes> areaschemes=jdbcTemplate.query(sql1, BeanPropertyRowMapper.newInstance(AreaSchemes.class));
		
		//il faut stocker le produit dans le modele
		model.addAttribute("AreaSchemes", areaschemes.get(0));
		return "editAreaSchemes";
	}
	
	@GetMapping("/admin/editAssemblyCodes")
	public String edit5(Model model, String AssemblyCode ) {
		String sql1="SELECT * FROM AssemblyCodes where AssemblyCode=+AssemblyCode";
		List<AssemblyCodes> assemblycodes=jdbcTemplate.query(sql1, BeanPropertyRowMapper.newInstance(AssemblyCodes.class));
		
		//il faut stocker le produit dans le modele
		model.addAttribute("AssemblyCodes", assemblycodes.get(0));
		return "editAssemblyCodes";
	}
	
	@GetMapping("/admin/editBuildingTypeSettings")
	public String edit6(Model model, Integer id ) {
		String sql1="SELECT * FROM BuildingTypeSettings where id="+id;
		List<BuildingTypeSettings> buildingtypesettings=jdbcTemplate.query(sql1, BeanPropertyRowMapper.newInstance(BuildingTypeSettings.class));
		
		//il faut stocker le produit dans le modele
		model.addAttribute("BuildingTypeSettings", buildingtypesettings.get(0));
		return "editBuildingTypeSettings";
	}
	
	@GetMapping("/admin/editCableTrayTypes")
	public String edit7(Model model, Integer id ) {
		String sql1="SELECT * FROM CableTrayTypes where id="+id;
		List<CableTrayTypes> cabletraytypes=jdbcTemplate.query(sql1, BeanPropertyRowMapper.newInstance(CableTrayTypes.class));
		
		//il faut stocker le produit dans le modele
		model.addAttribute("CableTrayTypes", cabletraytypes.get(0));
		return "editCableTrayTypes";
	}
	
	@GetMapping("/admin/editCategories")
	public String edit8(Model model, Integer id ) {
		String sql1="SELECT * FROM Categories where id="+id;
		List<Categories> categories=jdbcTemplate.query(sql1, BeanPropertyRowMapper.newInstance(Categories.class));
		
		//il faut stocker le produit dans le modele
		model.addAttribute("Categories", categories.get(0));
		return "editCategories";
	}
	
	@GetMapping("/admin/editCeilings")
	public String edit9(Model model, Integer id ) {
	    String sql1="SELECT * FROM Ceilings where id="+id;
	    List<Ceilings> Ceilings=jdbcTemplate.query(sql1, BeanPropertyRowMapper.newInstance(Ceilings.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("Ceilings", Ceilings.get(0));
	    return "editCeilings";
	}
    
	@GetMapping("/admin/editCeilingTypes")
	public String edit10(Model model, Integer id ) {
	    String sql5="SELECT * FROM CeilingTypes where id="+id;
	    List<CeilingTypes> CeilingTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(CeilingTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("CeilingTypes", CeilingTypes.get(0));
	    return "editCeilingTypes";
	}
	
	@GetMapping("/admin/editConditionTypeEnums")
	public String edit11(Model model, Integer id ) {
	    String sql5="SELECT * FROM ConditionTypeEnums where id="+id;
	    List<ConditionTypeEnums> ConditionTypeEnums=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ConditionTypeEnums.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("ConditionTypeEnums", ConditionTypeEnums.get(0));
	    return "editConditionTypeEnums";
	}
	
	@GetMapping("/admin/editConduitTypes")
	public String edit12(Model model, Integer id ) {
	    String sql5="SELECT * FROM ConduitTypes where id="+id;
	    List<ConduitTypes> ConduitTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ConduitTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("ConduitTypes", ConduitTypes.get(0));
	    return "editConduitTypes";
	}
    
	@GetMapping("/admin/editCoverTypes")
	public String edit13(Model model, Integer id ) {
	    String sql5="SELECT * FROM CoverTypes where id="+id;
	    List<CoverTypes> CoverTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(CoverTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("CoverTypes", CoverTypes.get(0));
	    return "editCoverTypes";
	}
	
	@GetMapping("/admin/editCurtainPanels")
	public String edit14(Model model, Integer id ) {
	    String sql5="SELECT * FROM CurtainPanels where id="+id;
	    List<CurtainPanels> CurtainPanels=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(CurtainPanels.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("CurtainPanels", CurtainPanels.get(0));
	    return "editCurtainPanels";
	}
	
	@GetMapping("/admin/editCurtainPanelTypes")
	public String edit15(Model model, Integer id ) {
	    String sql5="SELECT * FROM CurtainPanelTypes where id="+id;
	    List<CurtainPanelTypes> CurtainPanelTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(CurtainPanelTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("CurtainPanelTypes", CurtainPanelTypes.get(0));
	    return "editCurtainPanelTypes";
	}
	
	@GetMapping("/admin/editCurtainSystemTypes")
	public String edit16(Model model, Integer id ) {
	    String sql5="SELECT * FROM CurtainSystemTypes where id="+id;
	    List<CurtainSystemTypes> CurtainSystemTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(CurtainSystemTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("CurtainSystemTypes", CurtainSystemTypes.get(0));
	    return "editCurtainSystemTypes";
	}
    
	@GetMapping("/admin/editCurtainWallMullions")
	public String edit17(Model model, Integer id ) {
	    String sql5="SELECT * FROM CurtainWallMullions where id="+id;
	    List<CurtainWallMullions> CurtainWallMullions=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(CurtainWallMullions.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("CurtainWallMullions", CurtainWallMullions.get(0));
	    return "editCurtainWallMullions";
	}
	
	@GetMapping("/admin/editCurtainWallMullionTypes")
	public String edit18(Model model, Integer id ) {
	    String sql5="SELECT * FROM CurtainWallMullionTypes where id="+id;
	    List<CurtainWallMullionTypes> CurtainWallMullionTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(CurtainWallMullionTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("CurtainWallMullionTypes", CurtainWallMullionTypes.get(0));
	    return "editCurtainWallMullionTypes";
	}
	
	@GetMapping("/admin/editCurtainWallPanelOnWall")
	public String edit19(Model model, Integer id ) {
	    String sql5="SELECT * FROM CurtainWallPanelOnWall where id="+id;
	    List<CurtainWallPanelOnWall> CurtainWallPanelOnWall=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(CurtainWallPanelOnWall.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("CurtainWallPanelOnWall", CurtainWallPanelOnWall.get(0));
	    return "editCurtainWallPanelOnWall";
	}
	
	@GetMapping("/admin/editDistributionSystemTypes")
	public String edit20(Model model, Integer id ) {
	    String sql5="SELECT * FROM DistributionSystemTypes where id="+id;
	    List<DistributionSystemTypes> DistributionSystemTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(DistributionSystemTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("DistributionSystemTypes", DistributionSystemTypes.get(0));
	    return "editDistributionSystemTypes";
	}
    
	@GetMapping("/admin/editDoors")
	public String edit21(Model model, Integer id ) {
	    String sql5="SELECT * FROM Doors where id="+id;
	    List<Doors> Doors=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Doors.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("Doors", Doors.get(0));
	    return "editDoors";
	}
	
	@GetMapping("/admin/editDoorTypes")
	public String edit22(Model model, Integer id ) {
	    String sql5="SELECT * FROM DoorTypes where id="+id;
	    List<DoorTypes> DoorTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(DoorTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("DoorTypes", DoorTypes.get(0));
	    return "editDoorTypes";
	}
	
	@GetMapping("/admin/editDoorWall")
	public String edit23(Model model, Integer doorid ) {
	    String sql5="SELECT * FROM DoorWall where doorid="+doorid;
	    List<DoorWall> DoorWall=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(DoorWall.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("DoorWall", DoorWall.get(0));
	    return "editDoorWall";
	}
	
	@GetMapping("/admin/editDuctFittingTypes")
	public String edit24(Model model, Integer id ) {
	    String sql5="SELECT * FROM DuctFittingTypes where id="+id;
	    List<DuctFittingTypes> DuctFittingTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(DuctFittingTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("DuctFittingTypes", DuctFittingTypes.get(0));
	    return "editDuctFittingTypes";
	}
	
	@GetMapping("/admin/editDuctSystems")
	public String edit25(Model model, Integer id ) {
	    String sql5="SELECT * FROM DuctSystems where id="+id;
	    List<DuctSystems> DuctSystems=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(DuctSystems.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("DuctSystems", DuctSystems.get(0));
	    return "editDuctSystems";
	}
	
	@GetMapping("/admin/editDuctSystemTypeEnums")
	public String edit26(Model model, Integer id ) {
	    String sql5="SELECT * FROM DuctSystemTypeEnums where id="+id;
	    List<DuctSystemTypeEnums> DuctSystemTypeEnums=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(DuctSystemTypeEnums.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("DuctSystemTypeEnums", DuctSystemTypeEnums.get(0));
	    return "editDuctSystemTypeEnums";
	}
    
	@GetMapping("/admin/editDuctSystemTypes")
	public String edit27(Model model, Integer id ) {
	    String sql5="SELECT * FROM DuctSystemTypes where id="+id;
	    List<DuctSystemTypes> DuctSystemTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(DuctSystemTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("DuctSystemTypes", DuctSystemTypes.get(0));
	    return "editDuctSystemTypes";
	}
	
	@GetMapping("/admin/editDuctTypes")
	public String edit28(Model model, Integer id ) {
	    String sql5="SELECT * FROM DuctTypes where id="+id;
	    List<DuctTypes> DuctTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(DuctTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("DuctTypes", DuctTypes.get(0));
	    return "editDuctTypes";
	}
	
	@GetMapping("/admin/editEaveCutterTypeEnums")
	public String edit29(Model model, Integer id ) {
	    String sql5="SELECT * FROM EaveCutterTypeEnums where id="+id;
	    List<EaveCutterTypeEnums> EaveCutterTypeEnums=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(EaveCutterTypeEnums.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("EaveCutterTypeEnums", EaveCutterTypeEnums.get(0));
	    return "editEaveCutterTypeEnums";
	}
	
	@GetMapping("/admin/editElectricalDemandFactorDefinitions")
	public String edit30(Model model, Integer id ) {
	    String sql5="SELECT * FROM ElectricalDemandFactorDefinitions where id="+id;
	    List<ElectricalDemandFactorDefinitions> Edfd=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ElectricalDemandFactorDefinitions.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("ElectricalDemandFactorDefinitions", Edfd.get(0));
	    return "editElectricalDemandFactorDefinitions";
	}
	
	@GetMapping("/admin/editElectricalLoadClassificationParameterElement")
	public String edit31(Model model, Integer id ) {
	    String sql5="SELECT * FROM ElectricalLoadClassificationParameterElement where id="+id;
	    List<ElectricalLoadClassificationParameterElement> Elcpe=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ElectricalLoadClassificationParameterElement.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("ElectricalLoadClassificationParameterElement", Elcpe.get(0));
	    return "editElectricalLoadClassificationParameterElement";
	}
	
	@GetMapping("/admin/editElectricalLoadClassifications")
	public String edit32(Model model, Integer id ) {
	    String sql5="SELECT * FROM ElectricalLoadClassifications where id="+id;
	    List<ElectricalLoadClassifications> Elc=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ElectricalLoadClassifications.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("ElectricalLoadClassifications", Elc.get(0));
	    return "editElectricalLoadClassifications";
	}
	
	@GetMapping("/admin/editElectricalPhaseConfigurationEnums")
	public String edit33(Model model, Integer id ) {
	    String sql5="SELECT * FROM ElectricalPhaseConfigurationEnums where id="+id;
	    List<ElectricalPhaseConfigurationEnums> Epc=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ElectricalPhaseConfigurationEnums.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("ElectricalPhaseConfigurationEnums", Epc.get(0));
	    return "editElectricalPhaseConfigurationEnums";
	}
    
	@GetMapping("/admin/editElectricalPhaseEnums")
	public String edit34(Model model, Integer id ) {
	    String sql5="SELECT * FROM ElectricalPhaseEnums where id="+id;
	    List<ElectricalPhaseEnums> Epe=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ElectricalPhaseEnums.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("ElectricalPhaseEnums", Epe.get(0));
	    return "editElectricalPhaseEnums";
	}
	
	@GetMapping("/admin/editElectricalSystemEnums")
	public String edit35(Model model, Integer id ) {
	    String sql5="SELECT * FROM ElectricalSystemEnums where id="+id;
	    List<ElectricalSystemEnums> Ese=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ElectricalSystemEnums.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("ElectricalSystemEnums",  Ese.get(0));
	    return "editElectricalSystemEnums";
	}
	
	@GetMapping("/admin/editElementLevel")
	public String edit36(Model model, Integer elementid ) {
	    String sql5="SELECT * FROM ElementLevel where elementid="+elementid;
	    List<ElementLevel> ElementLevel=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ElementLevel.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("ElementLevel",ElementLevel.get(0));
	    return "editElementLevel";
	}
    
	@GetMapping("/admin/editElementPhase")
	public String edit37(Model model, Integer elementid ) {
	    String sql5="SELECT * FROM ElementPhase where elementid="+elementid;
	    List<ElementPhase> ElementPhase=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ElementPhase.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("ElementPhase", ElementPhase.get(0));
	    return "editElementPhase";
	}
	
	@GetMapping("/admin/editFabricLocationEnums")
	public String edit38(Model model, Integer id ) {
	    String sql5="SELECT * FROM FabricLocationEnums where id="+id;
	    List<FabricLocationEnums> Fle=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(FabricLocationEnums.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("FabricLocationEnums", Fle.get(0));
	    return "editFabricLocationEnums";
	}
	
	@GetMapping("/admin/editFasciaTypes")
	public String edit39(Model model, Integer id ) {
	    String sql5="SELECT * FROM FasciaTypes where id="+id;
	    List<FasciaTypes> FasciaTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(FasciaTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("FasciaTypes", FasciaTypes.get(0));
	    return "editFasciaTypes";
	}
    
	@GetMapping("/admin/editFlexDuctTypes")
	public String edit40(Model model, Integer id ) {
	    String sql5="SELECT * FROM FlexDuctTypes where id="+id;
	    List<FlexDuctTypes> Fdt=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(FlexDuctTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("FlexDuctTypes", Fdt.get(0));
	    return "editFlexDuctTypes";
	}
	
	@GetMapping("/admin/editFlexPipeTypes")
	public String edit41(Model model, Integer id ) {
	    String sql5="SELECT * FROM FlexPipeTypes where id="+id;
	    List<FlexPipeTypes> Fpt=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(FlexPipeTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("FlexPipeTypes", Fpt.get(0));
	    return "editFlexPipeTypes";
	}
	
	@GetMapping("/admin/editFloors")
	public String edit42(Model model, Integer id ) {
	    String sql5="SELECT * FROM Floors where id="+id;
	    List<Floors> Floors=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Floors.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("Floors", Floors.get(0));
	    return "editFloors";
	}

	@GetMapping("/admin/editFloorTypes")
	public String edit43(Model model, Integer id ) {
	    String sql5="SELECT * FROM FloorTypes where id="+id;
	    List<FloorTypes> FloorTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(FloorTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("FloorTypes", FloorTypes.get(0));
	    return "editFloorTypes";
	}
	
	@GetMapping("/admin/editFluidTypes")
	public String edit44(Model model, Integer id ) {
	    String sql5="SELECT * FROM FluidTypes where id="+id;
	    List<FluidTypes> FluidTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(FluidTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("FluidTypes", FluidTypes.get(0));
	    return "editFluidTypes";
	}
	
	@GetMapping("/admin/editGenericModelTypes")
	public String edit45(Model model, Integer id ) {
	    String sql5="SELECT * FROM GenericModelTypes where id="+id;
	    List<GenericModelTypes> Gmt=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(GenericModelTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("GenericModelTypes", Gmt.get(0));
	    return "editGenericModelTypes";
	}
	
	@GetMapping("/admin/editGrids")
	public String edit46(Model model, Integer id ) {
	    String sql5="SELECT * FROM Grids where id="+id;
	    List<Grids> Grids=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Grids.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("Grids", Grids.get(0));
	    return "editGrids";
	}
	
	@GetMapping("/admin/editGridTypes")
	public String edit47(Model model, Integer id ) {
	    String sql5="SELECT * FROM GridTypes where id="+id;
	    List<GridTypes> GridTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(GridTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("GridTypes", GridTypes.get(0));
	    return "editGridTypes";
	}
	
	@GetMapping("/admin/editGutterTypes")
	public String edit48(Model model, Integer id ) {
	    String sql5="SELECT * FROM GutterTypes where id="+id;
	    List<GutterTypes> GutterTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(GutterTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("GutterTypes", GutterTypes.get(0));
	    return "editGutterTypes";
	}
	
	@GetMapping("/admin/editHVACLoadSchedules")
	public String edit49(Model model, Integer id ) {
	    String sql5="SELECT * FROM HVACLoadSchedules where id="+id;
	    List<HVACLoadSchedules> Hls=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(HVACLoadSchedules.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("HVACLoadSchedules", Hls.get(0));
	    return "editHVACLoadSchedules";
	}
    
	@GetMapping("/admin/editHVACZones")
	public String edit50(Model model, Integer id ) {
	    String sql5="SELECT * FROM HVACZones where id="+id;
	    List<HVACZones> HVACZones=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(HVACZones.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("HVACZones", HVACZones.get(0));
	    return "editHVACZones";
	}
    
	@GetMapping("/admin/editInstanceUsageEnums")
	public String edit51(Model model, Integer id ) {
	    String sql5="SELECT * FROM InstanceUsageEnums where id="+id;
	    List<InstanceUsageEnums> Iue=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(InstanceUsageEnums.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("InstanceUsageEnums", Iue.get(0));
	    return "editInstanceUsageEnums";
	}
	
	@GetMapping("/admin/editLevels")
	public String edit52(Model model, Integer id ) {
	    String sql5="SELECT * FROM Levels where id="+id;
	    List<Levels> Levels=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Levels.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("Levels", Levels.get(0));
	    return "editLevels";
	}
	
	@GetMapping("/admin/editLevelTypes")
	public String edit53(Model model, Integer id ) {
	    String sql5="SELECT * FROM LevelTypes where id="+id;
	    List<LevelTypes> LevelTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(LevelTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("LevelTypes", LevelTypes.get(0));
	    return "editLevelTypes";
	}

	@GetMapping("/admin/editLoadClassificationTypeEnums")
	public String edit54(Model model, Integer id ) {
	    String sql5="SELECT * FROM LoadClassificationTypeEnums where id="+id;
	    List<LoadClassificationTypeEnums> Lcte=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(LoadClassificationTypeEnums.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("LoadClassificationTypeEnums", Lcte.get(0));
	    return "editLoadClassificationTypeEnums";
	}
	
	@GetMapping("/admin/editMaterialQuantities")
	public String edit55(Model model, Integer elementid ) {
	    String sql5="SELECT * FROM MaterialQuantities where elementid="+elementid;
	    List<MaterialQuantities> Mq=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(MaterialQuantities.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("MaterialQuantities", Mq.get(0));
	    return "editMaterialQuantities";
	}
	
	@GetMapping("/admin/editMaterials")
	public String edit56(Model model, Integer id ) {
	    String sql5="SELECT * FROM Materials where id="+id;
	    List<Materials> Materials=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Materials.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("Materials", Materials.get(0));
	    return "editMaterials";
	}
	
	@GetMapping("/admin/editNeutralModeEnums")
	public String edit57(Model model, Integer id ) {
	    String sql5="SELECT * FROM NeutralModeEnums where id="+id;
	    List<NeutralModeEnums> Nme=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(NeutralModeEnums.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("NeutralModeEnums", Nme.get(0));
	    return "editNeutralModeEnums";
	}
	
	@GetMapping("/admin/editOmniClassNumbers")
	public String edit58(Model model, String omniclassnumber ) {
	    String sql5="SELECT * FROM OmniClassNumbers where omniclassnumber=+omniclassnumber";
	    List<OmniClassNumbers> Ocn=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(OmniClassNumbers.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("OmniClassNumbers", Ocn.get(0));
	    return "editOmniClassNumbers";
	}
    
	@GetMapping("/admin/editPanelScheduleTemplatesBranchPanel")
	public String edit59(Model model, Integer id ) {
	    String sql5="SELECT * FROM PanelScheduleTemplatesBranchPanel where id="+id;
	    List<PanelScheduleTemplatesBranchPanel> Pstbp=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PanelScheduleTemplatesBranchPanel.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("PanelScheduleTemplatesBranchPanel", Pstbp.get(0));
	    return "editPanelScheduleTemplatesBranchPanel";
	}
	
	@GetMapping("/admin/editPanelScheduleTemplatesDataPanel")
	public String edit60(Model model, Integer id ) {
	    String sql5="SELECT * FROM PanelScheduleTemplatesDataPanel where id="+id;
	    List<PanelScheduleTemplatesDataPanel> Pstdp=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PanelScheduleTemplatesDataPanel.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("PanelScheduleTemplatesDataPanel", Pstdp.get(0));
	    return "editPanelScheduleTemplatesDataPanel";
	}
	
	@GetMapping("/admin/editPanelScheduleTemplatesSwitchboard")
	public String edit61(Model model, Integer id ) {
	    String sql5="SELECT * FROM PanelScheduleTemplatesSwitchboard where id="+id;
	    List<PanelScheduleTemplatesSwitchboard> Pstsb=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PanelScheduleTemplatesSwitchboard.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("PanelScheduleTemplatesSwitchboard", Pstsb.get(0));
	    return "editPanelScheduleTemplatesSwitchboard";
	}
	
	@GetMapping("/admin/editPhases")
	public String edit62(Model model, Integer id ) {
	    String sql5="SELECT * FROM Phases where id="+id;
	    List<Phases> Phases=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Phases.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("Phases", Phases.get(0));
	    return "editPhases";
	}
	
	@GetMapping("/admin/editPipeConnectionTypes")
	public String edit63(Model model, Integer id ) {
	    String sql5="SELECT * FROM PipeConnectionTypes where id="+id;
	    List<PipeConnectionTypes> Pct=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PipeConnectionTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("PipeConnectionTypes", Pct.get(0));
	    return "editPipeConnectionTypes";
	}
	
	@GetMapping("/admin/editPipeFittingTypes")
	public String edit64(Model model, Integer id ) {
	    String sql5="SELECT * FROM PipeFittingTypes where id="+id;
	    List<PipeFittingTypes> Pift=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PipeFittingTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("PipeFittingTypes", Pift.get(0));
	    return "editPipeFittingTypes";
	}
	
	@GetMapping("/admin/editPipeFlowStateEnums")
	public String edit65(Model model, Integer id ) {
	    String sql5="SELECT * FROM PipeFlowStateEnums where id="+id;
	    List<PipeFlowStateEnums> Pfse=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PipeFlowStateEnums.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("PipeFlowStateEnums", Pfse.get(0));
	    return "editPipeFlowStateEnums";
	}
	
	@GetMapping("/admin/editPipeMaterialTypes")
	public String edit66(Model model, Integer id ) {
	    String sql5="SELECT * FROM PipeMaterialTypes where id="+id;
	    List<PipeMaterialTypes> Pmt=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PipeMaterialTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("PipeMaterialTypes", Pmt.get(0));
	    return "editPipeMaterialTypes";
	}
	
	@GetMapping("/admin/editPipeScheduleTypes")
	public String edit67(Model model, Integer id ) {
	    String sql5="SELECT * FROM PipeScheduleTypes where id="+id;
	    List<PipeScheduleTypes> Pst=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PipeScheduleTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("PipeScheduleTypes", Pst.get(0));
	    return "editPipeScheduleTypes";
	}
	
	@GetMapping("/admin/editPipeSegments")
	public String edit68(Model model, Integer id ) {
	    String sql5="SELECT * FROM PipeSegments where id="+id;
	    List<PipeSegments> PipeSegments=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PipeSegments.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("PipeSegments", PipeSegments.get(0));
	    return "editPipeSegments";
	}
	
	@GetMapping("/admin/editPipeSystemTypeEnums")
	public String edit69(Model model, Integer id ) {
	    String sql5="SELECT * FROM PipeSystemTypeEnums where id="+id;
	    List<PipeSystemTypeEnums> Pste=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PipeSystemTypeEnums.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("PipeSystemTypeEnums", Pste.get(0));
	    return "editPipeSystemTypeEnums";
	}
	
	@GetMapping("/admin/editPipeTypes")
	public String edit70(Model model, Integer id ) {
	    String sql5="SELECT * FROM PipeTypes where id="+id;
	    List<PipeTypes> PipeTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PipeTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("PipeTypes", PipeTypes.get(0));
	    return "editPipeTypes";
	}
	
	@GetMapping("/admin/editPipingSystemTypes")
	public String edit71(Model model, Integer id ) {
	    String sql5="SELECT * FROM PipingSystemTypes where id="+id;
	    List<PipingSystemTypes> Pist=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PipingSystemTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("PipingSystemTypes", Pist.get(0));
	    return "editPipingSystemTypes";
	}
	
	@GetMapping("/admin/editPlumbingFixtureOnWall")
	public String edit72(Model model, Integer id ) {
	    String sql5="SELECT * FROM PlumbingFixtureOnWall where id="+id;
	    List<PlumbingFixtureOnWall> Pfow=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PlumbingFixtureOnWall.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("PlumbingFixtureOnWall", Pfow.get(0));
	    return "editPlumbingFixtureOnWall";
	}
    
	@GetMapping("/admin/editPlumbingFixtures")
	public String edit73(Model model, Integer id ) {
	    String sql5="SELECT * FROM PlumbingFixtures where id="+id;
	    List<PlumbingFixtures> Pf=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PlumbingFixtures.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("PlumbingFixtures", Pf.get(0));
	    return "editPlumbingFixtures";
	}
	
	@GetMapping("/admin/editPlumbingFixtureTypes")
	public String edit74(Model model, Integer id ) {
	    String sql5="SELECT * FROM PlumbingFixtureTypes where id="+id;
	    List<PlumbingFixtureTypes> Pft=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PlumbingFixtureTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("PlumbingFixtureTypes", Pft.get(0));
	    return "editPlumbingFixtureTypes";
	}
	
	@GetMapping("/admin/editPowerFactorStateTypeEnums")
	public String edit75(Model model, Integer id ) {
	    String sql5="SELECT * FROM PowerFactorStateTypeEnums where id="+id;
	    List<PowerFactorStateTypeEnums> Pfste=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PowerFactorStateTypeEnums.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("PowerFactorStateTypeEnums", Pfste.get(0));
	    return "editPowerFactorStateTypeEnums";
	}
	
	@GetMapping("/admin/editProfiles")
	public String edit76(Model model, Integer id ) {
	    String sql5="SELECT * FROM Profiles where id="+id;
	    List<Profiles> Profiles=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Profiles.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("Profiles", Profiles.get(0));
	    return "editProfiles";
	}
	
	@GetMapping("/admin/editProjectInformation")
	public String edit77(Model model, Integer id ) {
	    String sql5="SELECT * FROM ProjectInformation where id="+id;
	    List<ProjectInformation> Pi=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ProjectInformation.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("ProjectInformation", Pi.get(0));
	    return "editProjectInformation";
	}
	
	@GetMapping("/admin/editPropertyLineTypes")
	public String edit78(Model model, Integer id ) {
	    String sql5="SELECT * FROM PropertyLineTypes where id="+id;
	    List<PropertyLineTypes> Plt=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(PropertyLineTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("PropertyLineTypes", Plt.get(0));
	    return "editPropertyLineTypes";
	}
	
	@GetMapping("/admin/editRailingTypes")
	public String edit79(Model model, Integer id ) {
	    String sql5="SELECT * FROM RailingTypes where id="+id;
	    List<RailingTypes> RailingTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(RailingTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("RailingTypes", RailingTypes.get(0));
	    return "editRailingTypes";
	}
	
	@GetMapping("/admin/editRampTypes")
	public String edit80(Model model, Integer id ) {
	    String sql5="SELECT * FROM RampTypes where id="+id;
	    List<RampTypes> RampTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(RampTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("RampTypes", RampTypes.get(0));
	    return "editRampTypes";
	}
	
	@GetMapping("/admin/editRebarLayoutEnums")
	public String edit81(Model model, Integer id ) {
	    String sql5="SELECT * FROM RebarLayoutEnums where id="+id;
	    List<RebarLayoutEnums> Rle=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(RebarLayoutEnums.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("RebarLayoutEnums", Rle.get(0));
	    return "editRebarLayoutEnums";
	}
	
	@GetMapping("/admin/editRebarStyleEnums")
	public String edit82(Model model, Integer id ) {
	    String sql5="SELECT * FROM RebarStyleEnums where id="+id;
	    List<RebarStyleEnums> Rse=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(RebarStyleEnums.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("RebarStyleEnums", Rse.get(0));
	    return "editRebarStyleEnums";
	}
    
	@GetMapping("/admin/editRevitDBLinkInfo")
	public String edit83(Model model, String name ) {
	    String sql5="SELECT * FROM RevitDBLinkInfo where name=+name";
	    List<RevitDBLinkInfo> Rdbli=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(RevitDBLinkInfo.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("RevitDBLinkInfo", Rdbli.get(0));
	    return "editRevitDBLinkInfo";
	}
	
	@GetMapping("/admin/editRoofs")
	public String edit84(Model model, Integer id ) {
	    String sql5="SELECT * FROM Roofs where id="+id;
	    List<Roofs> Roofs=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Roofs.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("Roofs", Roofs.get(0));
	    return "editRoofs";
	}
	
	@GetMapping("/admin/editRoofTypes")
	public String edit85(Model model, Integer id ) {
	    String sql5="SELECT * FROM RoofTypes where id="+id;
	    List<RoofTypes> RoofTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(RoofTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("RoofTypes", RoofTypes.get(0));
	    return "editRoofTypes";
	}

	@GetMapping("/admin/editRoomAssociations")
	public String edit86(Model model, Integer id ) {
	    String sql5="SELECT * FROM RoomAssociations where id="+id;
	    List<RoomAssociations> Ra=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(RoomAssociations.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("RoomAssociations", Ra.get(0));
	    return "editRoomAssociations";
	}
	
	@GetMapping("/admin/editRoomFromToAssociations")
	public String edit87(Model model, Integer id ) {
	    String sql5="SELECT * FROM RoomFromToAssociations where id="+id;
	    List<RoomFromToAssociations> Rfta=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(RoomFromToAssociations.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("RoomFromToAssociations", Rfta.get(0));
	    return "editRoomFromToAssociations";
	}
	
	@GetMapping("/admin/editRooms")
	public String edit88(Model model, Integer id ) {
	    String sql5="SELECT * FROM Rooms where id="+id;
	    List<Rooms> Rooms=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Rooms.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("Rooms", Rooms.get(0));
	    return "editRooms";
	}
	
	@GetMapping("/admin/editRoomTags")
	public String edit89(Model model, Integer id ) {
	    String sql5="SELECT * FROM RoomTags where id="+id;
	    List<RoomTags> RoomTags=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(RoomTags.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("RoomTags", RoomTags.get(0));
	    return "editRoomTags";
	}
	
	@GetMapping("/admin/editServiceTypeEnums")
	public String edit90(Model model, Integer id ) {
	    String sql5="SELECT * FROM ServiceTypeEnums where id="+id;
	    List<ServiceTypeEnums> Ste=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(ServiceTypeEnums.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("ServiceTypeEnums", Ste.get(0));
	    return "editServiceTypeEnums";
	}
	
	@GetMapping("/admin/editSheets")
	public String edit91(Model model, Integer id ) {
	    String sql5="SELECT * FROM Sheets where id="+id;
	    List<Sheets> Sheets=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Sheets.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("Sheets", Sheets.get(0));
	    return "editSheets";
	}
	
	@GetMapping("/admin/editSlabEdgeTypes")
	public String edit92(Model model, Integer id ) {
	    String sql5="SELECT * FROM SlabEdgeTypes where id="+id;
	    List<SlabEdgeTypes> Set=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(SlabEdgeTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("SlabEdgeTypes", Set.get(0));
	    return "editSlabEdgeTypes";
	}

	@GetMapping("/admin/editSpaceTypeEnums")
	public String edit93(Model model, Integer id ) {
	    String sql5="SELECT * FROM SpaceTypeEnums where id="+id;
	    List<SpaceTypeEnums> Spte=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(SpaceTypeEnums.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("SpaceTypeEnums", Spte.get(0));
	    return "editSpaceTypeEnums";
	}
	
	@GetMapping("/admin/editSpaceTypeSettings")
	public String edit94(Model model, Integer id ) {
	    String sql5="SELECT * FROM SpaceTypeSettings where id="+id;
	    List<SpaceTypeSettings> Sts=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(SpaceTypeSettings.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("SpaceTypeSettings", Sts.get(0));
	    return "editSpaceTypeSettings";
	}

	@GetMapping("/admin/editSpecialtyEquipment")
	public String edit95(Model model, Integer id ) {
	    String sql5="SELECT * FROM SpecialtyEquipment where id="+id;
	    List<SpecialtyEquipment> Se=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(SpecialtyEquipment.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("SpecialtyEquipment", Se.get(0));
	    return "editSpecialtyEquipment";
	}
	
	@GetMapping("/admin/editSpecialtyEquipmentTypes")
	public String edit96(Model model, Integer id ) {
	    String sql5="SELECT * FROM SpecialtyEquipmentTypes where id="+id;
	    List<SpecialtyEquipmentTypes> Speet=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(SpecialtyEquipmentTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("SpecialtyEquipmentTypes", Speet.get(0));
	    return "editSpecialtyEquipmentTypes";
	}
	
	@GetMapping("/admin/editStairTypes")
	public String edit97(Model model, Integer id ) {
	    String sql5="SELECT * FROM StairTypes where id="+id;
	    List<StairTypes> StairTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(StairTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("StairTypes", StairTypes.get(0));
	    return "editStairTypes";
	}

	@GetMapping("/admin/editStructuralColumns")
	public String edit98(Model model, Integer id ) {
	    String sql5="SELECT * FROM StructuralColumns where id="+id;
	    List<StructuralColumns> Sc=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(StructuralColumns.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("StructuralColumns", Sc.get(0));
	    return "editStructuralColumns";
	}
	
	@GetMapping("/admin/editStructuralColumnTypes")
	public String edit99(Model model, Integer id ) {
	    String sql5="SELECT * FROM StructuralColumnTypes where id="+id;
	    List<StructuralColumnTypes> Sct=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(StructuralColumnTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("StructuralColumnTypes", Sct.get(0));
	    return "editStructuralColumnTypes";
	}
    
	@GetMapping("/admin/editStructuralFoundationTypes")
	public String edit100(Model model, Integer id ) {
	    String sql5="SELECT * FROM StructuralFoundationTypes where id="+id;
	    List<StructuralFoundationTypes> Sft=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(StructuralFoundationTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("StructuralFoundationTypes", Sft.get(0));
	    return "editStructuralFoundationTypes";
	}
	
	@GetMapping("/admin/editStructuralFraming")
	public String edit101(Model model, Integer id ) {
	    String sql5="SELECT * FROM StructuralFraming where id="+id;
	    List<StructuralFraming> Sf=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(StructuralFraming.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("StructuralFraming", Sf.get(0));
	    return "editStructuralFraming";
	}
	
	@GetMapping("/admin/editStructuralFramingTypes")
	public String edit102(Model model, Integer id ) {
	    String sql5="SELECT * FROM StructuralFramingTypes where id="+id;
	    List<StructuralFramingTypes> Stft=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(StructuralFramingTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("StructuralFramingTypes", Stft.get(0));
	    return "editStructuralFramingTypes";
	}
	
	@GetMapping("/admin/editViews")
	public String edit103(Model model, Integer id ) {
	    String sql5="SELECT * FROM Views where id="+id;
	    List<Views> Views=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Views.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("Views", Views.get(0));
	    return "editViews";
	}
	
	@GetMapping("/admin/editVoltageTypes")
	public String edit104(Model model, Integer id ) {
	    String sql5="SELECT * FROM VoltageTypes where id="+id;
	    List<VoltageTypes> VoltageTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(VoltageTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("VoltageTypes", VoltageTypes.get(0));
	    return "editVoltageTypes";
	}
	
	@GetMapping("/admin/editWallSweeps")
	public String edit105(Model model, Integer id ) {
	    String sql5="SELECT * FROM WallSweeps where id="+id;
	    List<WallSweeps> WallSweeps=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(WallSweeps.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("WallSweeps", WallSweeps.get(0));
	    return "editWallSweeps";
	}
    
	@GetMapping("/admin/editWallSweepTypes")
	public String edit106(Model model, Integer id ) {
	    String sql5="SELECT * FROM WallSweepTypes where id="+id;
	    List<WallSweepTypes> Wst=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(WallSweepTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("WallSweepTypes", Wst.get(0));
	    return "editWallSweepTypes";
	}
	
	@GetMapping("/admin/editWallTypes")
	public String edit107(Model model, Integer id ) {
	    String sql5="SELECT * FROM WallTypes where id="+id;
	    List<WallTypes> WallTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(WallTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("WallTypes", WallTypes.get(0));
	    return "editWallTypes";
	}
	
	@GetMapping("/admin/editWallUsageEnums")
	public String edit108(Model model, Integer id ) {
	    String sql5="SELECT * FROM WallUsageEnums where id="+id;
	    List<WallUsageEnums> Wue=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(WallUsageEnums.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("WallUsageEnums", Wue.get(0));
	    return "editWallUsageEnums";
	}
	
	@GetMapping("/admin/editWindows")
	public String edit109(Model model, Integer id ) {
	    String sql5="SELECT * FROM Windows where id="+id;
	    List<Windows> Windows=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(Windows.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("Windows", Windows.get(0));
	    return "editWindows";
	}
	
	@GetMapping("/admin/editWindowTypes")
	public String edit110(Model model, Integer id ) {
	    String sql5="SELECT * FROM WindowTypes where id="+id;
	    List<WindowTypes> WindowTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(WindowTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("WindowTypes", WindowTypes.get(0));
	    return "editWindowTypes";
	}
	
	@GetMapping("/admin/editWindowWall")
	public String edit111(Model model, Integer windowid ) {
	    String sql5="SELECT * FROM WindowWall where windowid="+windowid;
	    List<WindowWall> WindowWall=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(WindowWall.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("WindowWall", WindowWall.get(0));
	    return "editWindowWall";
	}
	
	@GetMapping("/admin/editWireInsulationTypes")
	public String edit112(Model model, Integer id ) {
	    String sql5="SELECT * FROM WireInsulationTypes where id="+id;
	    List<WireInsulationTypes> Wit=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(WireInsulationTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("WireInsulationTypes", Wit.get(0));
	    return "editWireInsulationTypes";
	}
	
	@GetMapping("/admin/editWireMaterialTypes")
	public String edit113(Model model, Integer id ) {
	    String sql5="SELECT * FROM WireMaterialTypes where id="+id;
	    List<WireMaterialTypes> Wmt=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(WireMaterialTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("WireMaterialTypes", Wmt.get(0));
	    return "editWireMaterialTypes";
	}
	
	@GetMapping("/admin/editWireTemperatureRatingTypes")
	public String edit114(Model model, Integer id ) {
	    String sql5="SELECT * FROM WireTemperatureRatingTypes where id="+id;
	    List<WireTemperatureRatingTypes> Wtrt=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(WireTemperatureRatingTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("WireTemperatureRatingTypes", Wtrt.get(0));
	    return "editWireTemperatureRatingTypes";
	}

	@GetMapping("/admin/editWireTypes")
	public String edit115(Model model, Integer id ) {
	    String sql5="SELECT * FROM WireTypes where id="+id;
	    List<WireTypes> WireTypes=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(WireTypes.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("WireTypes", WireTypes.get(0));
	    return "editWireTypes";
	}
	
	@GetMapping("/admin/editWiringTypeEnums")
	public String edit116(Model model, Integer id ) {
	    String sql5="SELECT * FROM WiringTypeEnums where id="+id;
	    List<WiringTypeEnums> WiringTypeEnums=jdbcTemplate.query(sql5, BeanPropertyRowMapper.newInstance(WiringTypeEnums.class));
	    
	    //il faut stocker le produit dans le modele
	    model.addAttribute("WiringTypeEnums", WiringTypeEnums.get(0));
	    return "editWiringTypeEnums";
	}
	
	
	
	//Save modify information
		@PostMapping("/admin/saveWalls")
	public String save(Model model,  Walls walls) {
			//String sql1="SELECT * FROM Walls where id="+id;
			//List<Walls> wallsList=jdbcTemplate.query(sql1, BeanPropertyRowMapper.newInstance(Walls.class));
			//Walls walls=wallsList.get(0);	
			//String sql2="INSERT into  Walls where id=";	
			String sqlUpdate = "UPDATE Walls set comments=? where Id=?";
			jdbcTemplate.update(sqlUpdate,walls.getComments(),walls.getId());
			
			String sqlUpdate1 = "UPDATE Walls set DesignOption=? where Id=?";
			jdbcTemplate.update(sqlUpdate1,walls.getDesignOption(),walls.getId());
			
			String sqlUpdate2 = "UPDATE Walls set Mark=? where Id=?";
			jdbcTemplate.update(sqlUpdate2,walls.getMark(),walls.getId());
			
			String sqlUpdate3 = "UPDATE Walls set BaseOffset=? where Id=?";
			jdbcTemplate.update(sqlUpdate3,walls.getBaseOffset(),walls.getId());
			
			String sqlUpdate4 = "UPDATE Walls set RoomBounding=? where Id=?";
			jdbcTemplate.update(sqlUpdate4,walls.getRoomBounding(),walls.getId());
			
			String sqlUpdate5 = "UPDATE Walls set LOT=? where Id=?";
			jdbcTemplate.update(sqlUpdate5,walls.getLOT(),walls.getId());
			
		/*	String sql1="INSERT INTO Walls (Id,TypeId,PhaseCreated,PhaseDemolished,DesignOption,EstimatedReinforcementVolume,"
					+ "Volume,Area,Comments,Length,Mark,StructuralUsage,TopOffset,BaseOffset,BaseConstraint,UnconnectedHeight,TopConstraint,"
					+ "RoomBounding,LOT,'') VALUES"
					+ "("+walls.getId()
					+ ","+walls.getTypeId()
					+ ","+walls.getPhaseCreated()
					+ ","+walls.getPhaseDemolished()
					+ ","+walls.getDesignOption()
					+ ","+walls.getEstimatedReinforcementVolume()
					+ ","+walls.getVolume()
					+ ","+walls.getArea()
					+ ","+walls.getComments()
					+ ","+walls.getLength()
					+ ","+walls.getMark()
					+ ","+walls.getStructuralUsage()
					+ ","+walls.getTopOffset()
					+ ","+walls.getBaseOffset()
					+ ","+walls.getBaseConstraint()
					+ ","+walls.getUnconnectedHeight()
					+ ","+walls.getTopConstraint()
					+ ","+walls.getRoomBounding()
					+ ","+walls.getLOT()
					//+","
					+ ")";
			System.out.println(sql1);*/
			
			//jdbcTemplate.execute(sql1);
			
			//il faut stocker le produit dans le modele
			//model.addAttribute("Walls", walls.get(0));
			
			return "redirect:/";
	
	}
	

	    @PostMapping("/admin/saveCeilings")
		public String save1(Model model,  Ceilings Ceilings) {
				String sqlUpdate = "UPDATE Ceilings set comments=? where Id=?";
				jdbcTemplate.update(sqlUpdate,Ceilings.getComments(),Ceilings.getId());
				
				String sqlUpdate1 = "UPDATE Ceilings set DesignOption=? where Id=?";
				jdbcTemplate.update(sqlUpdate1,Ceilings.getDesignOption(),Ceilings.getId());
				
				String sqlUpdate2 = "UPDATE Ceilings set Mark=? where Id=?";
				jdbcTemplate.update(sqlUpdate2,Ceilings.getMark(),Ceilings.getId());
				
				String sqlUpdate3 = "UPDATE Ceilings set HeightOffsetFromLevel=? where Id=?";
				jdbcTemplate.update(sqlUpdate3,Ceilings.getHeightOffsetFromLevel(),Ceilings.getId());

				return "redirect:/";
		}
		



	    @PostMapping("/admin/saveCeilingTypes")
		public String save2(Model model,  CeilingTypes CeilingTypes) {
				String sqlUpdate = "UPDATE CeilingTypes set TypeComments=? where Id=?";
				jdbcTemplate.update(sqlUpdate,CeilingTypes.getTypeComments(),CeilingTypes.getId());
				
				String sqlUpdate1 = "UPDATE CeilingTypes set Keynote=? where Id=?";
				jdbcTemplate.update(sqlUpdate1,CeilingTypes.getKeynote(),CeilingTypes.getId());
				
				String sqlUpdate2 = "UPDATE CeilingTypes set Model=? where Id=?";
				jdbcTemplate.update(sqlUpdate2,CeilingTypes.getModel(),CeilingTypes.getId());
				
				String sqlUpdate3 = "UPDATE CeilingTypes set Manufacturer=? where Id=?";
				jdbcTemplate.update(sqlUpdate3,CeilingTypes.getManufacturer(),CeilingTypes.getId());
				
				String sqlUpdate4 = "UPDATE CeilingTypes set URL=? where Id=?";
				jdbcTemplate.update(sqlUpdate4,CeilingTypes.getURL(),CeilingTypes.getId());
				
				String sqlUpdate5 = "UPDATE CeilingTypes set Description=? where Id=?";
				jdbcTemplate.update(sqlUpdate5,CeilingTypes.getDescription(),CeilingTypes.getId());	
				

	            String sqlUpdate6 = "UPDATE CeilingTypes set AssemblyCode=? where Id=?";
				jdbcTemplate.update(sqlUpdate6,CeilingTypes.getAssemblyCode(),CeilingTypes.getId());

				return "redirect:/";
		}



	    @PostMapping("/admin/saveCurtainWallMullions")
		public String save3(Model model,  CurtainWallMullions cwm) {
	        String sqlUpdate = "UPDATE CurtainWallMullions set comments=? where Id=?";
	        jdbcTemplate.update(sqlUpdate,cwm.getComments(),cwm.getId());
	        
	        String sqlUpdate1 = "UPDATE CurtainWallMullions set DesignOption=? where Id=?";
	        jdbcTemplate.update(sqlUpdate1,cwm.getDesignOption(),cwm.getId());
	        
	        String sqlUpdate2 = "UPDATE CurtainWallMullions set Mark=? where Id=?";
	        jdbcTemplate.update(sqlUpdate2,cwm.getMark(),cwm.getId());

	        return "redirect:/";
		}



	    @PostMapping("/admin/saveCurtainWallMullionTypes")
		public String save4(Model model,  CurtainWallMullionTypes cwmt) {
				String sqlUpdate = "UPDATE CurtainWallMullionTypes set TypeComments=? where Id=?";
				jdbcTemplate.update(sqlUpdate,cwmt.getTypeComments(),cwmt.getId());
				
				String sqlUpdate1 = "UPDATE CurtainWallMullionTypes set Keynote=? where Id=?";
				jdbcTemplate.update(sqlUpdate1,cwmt.getKeynote(),cwmt.getId());
				
				String sqlUpdate2 = "UPDATE CurtainWallMullionTypes set Model=? where Id=?";
				jdbcTemplate.update(sqlUpdate2,cwmt.getModel(),cwmt.getId());
				
				String sqlUpdate3 = "UPDATE CurtainWallMullionTypes set Manufacturer=? where Id=?";
				jdbcTemplate.update(sqlUpdate3,cwmt.getManufacturer(),cwmt.getId());
				
				String sqlUpdate4 = "UPDATE CurtainWallMullionTypes set URL=? where Id=?";
				jdbcTemplate.update(sqlUpdate4,cwmt.getURL(),cwmt.getId());
				
				String sqlUpdate5 = "UPDATE CurtainWallMullionTypes set Description=? where Id=?";
				jdbcTemplate.update(sqlUpdate5,cwmt.getDescription(),cwmt.getId());	
				

	            String sqlUpdate6 = "UPDATE CurtainWallMullionTypes set AssemblyCode=? where Id=?";
				jdbcTemplate.update(sqlUpdate6,cwmt.getAssemblyCode(),cwmt.getId());	
				

	            String sqlUpdate7 = "UPDATE CurtainWallMullionTypes set TypeMark=? where Id=?";
				jdbcTemplate.update(sqlUpdate7,cwmt.getTypeMark(),cwmt.getId());	
				

	            String sqlUpdate8 = "UPDATE CurtainWallMullionTypes set Cost=? where Id=?";
				jdbcTemplate.update(sqlUpdate8,cwmt.getCost(),cwmt.getId());	
				

	            String sqlUpdate9 = "UPDATE CurtainWallMullionTypes set OmniClassNumber=? where Id=?";
				jdbcTemplate.update(sqlUpdate9,cwmt.getOmniClassNumber(),cwmt.getId());	

				return "redirect:/";
		}



	    @PostMapping("/admin/saveStructuralFraming")
		public String save5(Model model,  StructuralFraming sf) {
	        String sqlUpdate = "UPDATE StructuralFraming set comments=? where Id=?";
	        jdbcTemplate.update(sqlUpdate,sf.getComments(),sf.getId());
	        
	        String sqlUpdate1 = "UPDATE StructuralFraming set DesignOption=? where Id=?";
	        jdbcTemplate.update(sqlUpdate1,sf.getDesignOption(),sf.getId());
	        
	        String sqlUpdate2 = "UPDATE StructuralFraming set Mark=? where Id=?";
	        jdbcTemplate.update(sqlUpdate2,sf.getMark(),sf.getId());

	        String sqlUpdate3 = "UPDATE StructuralFraming set ReferenceLevel=? where Id=?";
	        jdbcTemplate.update(sqlUpdate3,sf.getReferenceLevel(),sf.getId());

	        String sqlUpdate4 = "UPDATE StructuralFraming set StructuralUsage=? where Id=?";
	        jdbcTemplate.update(sqlUpdate4,sf.getStructuralUsage(),sf.getId());
	        
	        return "redirect:/";
		}



	    @PostMapping("/admin/saveStructuralFramingTypes")
		public String save6(Model model,  StructuralFramingTypes sft) {
				String sqlUpdate = "UPDATE StructuralFramingTypes set TypeComments=? where Id=?";
				jdbcTemplate.update(sqlUpdate,sft.getTypeComments(),sft.getId());
				
				String sqlUpdate1 = "UPDATE StructuralFramingTypes set Keynote=? where Id=?";
				jdbcTemplate.update(sqlUpdate1,sft.getKeynote(),sft.getId());
				
				String sqlUpdate2 = "UPDATE StructuralFramingTypes set Model=? where Id=?";
				jdbcTemplate.update(sqlUpdate2,sft.getModel(),sft.getId());
				
				String sqlUpdate3 = "UPDATE StructuralFramingTypes set Manufacturer=? where Id=?";
				jdbcTemplate.update(sqlUpdate3,sft.getManufacturer(),sft.getId());
				
				String sqlUpdate4 = "UPDATE StructuralFramingTypes set URL=? where Id=?";
				jdbcTemplate.update(sqlUpdate4,sft.getURL(),sft.getId());
				
				String sqlUpdate5 = "UPDATE StructuralFramingTypes set Description=? where Id=?";
				jdbcTemplate.update(sqlUpdate5,sft.getDescription(),sft.getId());	
				

	            String sqlUpdate6 = "UPDATE StructuralFramingTypes set AssemblyCode=? where Id=?";
				jdbcTemplate.update(sqlUpdate6,sft.getAssemblyCode(),sft.getId());	
				

	            String sqlUpdate7 = "UPDATE StructuralFramingTypes set TypeMark=? where Id=?";
				jdbcTemplate.update(sqlUpdate7,sft.getTypeMark(),sft.getId());	
				

	            String sqlUpdate8 = "UPDATE StructuralFramingTypes set Cost=? where Id=?";
				jdbcTemplate.update(sqlUpdate8,sft.getCost(),sft.getId());	
				

	            String sqlUpdate9 = "UPDATE StructuralFramingTypes set OmniClassNumber=? where Id=?";
				jdbcTemplate.update(sqlUpdate9,sft.getOmniClassNumber(),sft.getId());	

				return "redirect:/";
		}



	    @PostMapping("/admin/saveWallTypes")
		public String save7(Model model,  WallTypes WallTypes) {
				String sqlUpdate = "UPDATE WallTypes set TypeComments=? where Id=?";
				jdbcTemplate.update(sqlUpdate,WallTypes.getTypeComments(),WallTypes.getId());
				
				String sqlUpdate1 = "UPDATE WallTypes set Keynote=? where Id=?";
				jdbcTemplate.update(sqlUpdate1,WallTypes.getKeynote(),WallTypes.getId());
				
				String sqlUpdate2 = "UPDATE WallTypes set Model=? where Id=?";
				jdbcTemplate.update(sqlUpdate2,WallTypes.getModel(),WallTypes.getId());
				
				String sqlUpdate3 = "UPDATE WallTypes set Manufacturer=? where Id=?";
				jdbcTemplate.update(sqlUpdate3,WallTypes.getManufacturer(),WallTypes.getId());
				
				String sqlUpdate4 = "UPDATE WallTypes set URL=? where Id=?";
				jdbcTemplate.update(sqlUpdate4,WallTypes.getURL(),WallTypes.getId());
				
				String sqlUpdate5 = "UPDATE WallTypes set Description=? where Id=?";
				jdbcTemplate.update(sqlUpdate5,WallTypes.getDescription(),WallTypes.getId());	
				

	            String sqlUpdate6 = "UPDATE WallTypes set AssemblyCode=? where Id=?";
				jdbcTemplate.update(sqlUpdate6,WallTypes.getAssemblyCode(),WallTypes.getId());	
				

	            String sqlUpdate7 = "UPDATE WallTypes set TypeMark=? where Id=?";
				jdbcTemplate.update(sqlUpdate7,WallTypes.getTypeMark(),WallTypes.getId());	
				

	            String sqlUpdate8 = "UPDATE WallTypes set OmniClassNumber=? where Id=?";
				jdbcTemplate.update(sqlUpdate8,WallTypes.getOmniClassNumber(),WallTypes.getId());

				return "redirect:/";
		}


	    @PostMapping("/admin/saveCurtainPanels")
		public String save8(Model model, CurtainPanels CurtainPanels) {
	        String sqlUpdate = "UPDATE CurtainPanels set comments=? where Id=?";
	        jdbcTemplate.update(sqlUpdate,CurtainPanels.getComments(),CurtainPanels.getId());
	        
	        String sqlUpdate1 = "UPDATE CurtainPanels set DesignOption=? where Id=?";
	        jdbcTemplate.update(sqlUpdate1,CurtainPanels.getDesignOption(),CurtainPanels.getId());
	        
	        String sqlUpdate2 = "UPDATE CurtainPanels set Mark=? where Id=?";
	        jdbcTemplate.update(sqlUpdate2,CurtainPanels.getMark(),CurtainPanels.getId());

	        return "redirect:/";
		}



	    @PostMapping("/admin/saveCurtainPanelTypes")
		public String save9(Model model,  CurtainPanelTypes cpt) {
				String sqlUpdate = "UPDATE CurtainPanelTypes set TypeComments=? where Id=?";
				jdbcTemplate.update(sqlUpdate,cpt.getTypeComments(),cpt.getId());
				
				String sqlUpdate1 = "UPDATE CurtainPanelTypes set Keynote=? where Id=?";
				jdbcTemplate.update(sqlUpdate1,cpt.getKeynote(),cpt.getId());
				
				String sqlUpdate2 = "UPDATE CurtainPanelTypes set Model=? where Id=?";
				jdbcTemplate.update(sqlUpdate2,cpt.getModel(),cpt.getId());
				
				String sqlUpdate3 = "UPDATE CurtainPanelTypes set Manufacturer=? where Id=?";
				jdbcTemplate.update(sqlUpdate3,cpt.getManufacturer(),cpt.getId());
				
				String sqlUpdate4 = "UPDATE CurtainPanelTypes set URL=? where Id=?";
				jdbcTemplate.update(sqlUpdate4,cpt.getURL(),cpt.getId());
				
				String sqlUpdate5 = "UPDATE CurtainPanelTypes set Description=? where Id=?";
				jdbcTemplate.update(sqlUpdate5,cpt.getDescription(),cpt.getId());	
				

	            String sqlUpdate6 = "UPDATE CurtainPanelTypes set AssemblyCode=? where Id=?";
				jdbcTemplate.update(sqlUpdate6,cpt.getAssemblyCode(),cpt.getId());	
				

	            String sqlUpdate7 = "UPDATE CurtainPanelTypes set TypeMark=? where Id=?";
				jdbcTemplate.update(sqlUpdate7,cpt.getTypeMark(),cpt.getId());	
				

	            String sqlUpdate8 = "UPDATE CurtainPanelTypes set Cost=? where Id=?";
				jdbcTemplate.update(sqlUpdate8,cpt.getCost(),cpt.getId());	
				

	            String sqlUpdate9 = "UPDATE CurtainPanelTypes set Finish=? where Id=?";
				jdbcTemplate.update(sqlUpdate9,cpt.getFinish(),cpt.getId());	
				

	            String sqlUpdate10 = "UPDATE CurtainPanelTypes set ConstructionType=? where Id=?";
				jdbcTemplate.update(sqlUpdate10,cpt.getConstructionType(),cpt.getId());	

				return "redirect:/";
		}



	    @PostMapping("/admin/saveDoors")
		public String save10(Model model, Doors Doors) {
	        String sqlUpdate = "UPDATE Doors set comments=? where Id=?";
	        jdbcTemplate.update(sqlUpdate,Doors.getComments(),Doors.getId());
	        
	        String sqlUpdate1 = "UPDATE Doors set DesignOption=? where Id=?";
	        jdbcTemplate.update(sqlUpdate1,Doors.getDesignOption(),Doors.getId());
	        
	        String sqlUpdate2 = "UPDATE Doors set Mark=? where Id=?";
	        jdbcTemplate.update(sqlUpdate2,Doors.getMark(),Doors.getId());

	        String sqlUpdate3 = "UPDATE Doors set HeadHeight=? where Id=?";
	        jdbcTemplate.update(sqlUpdate3,Doors.getHeadHeight(),Doors.getId());

	        String sqlUpdate4 = "UPDATE Doors set SillHeight=? where Id=?";
	        jdbcTemplate.update(sqlUpdate4,Doors.getSillHeight(),Doors.getId());

	        String sqlUpdate5 = "UPDATE Doors set FrameMaterial=? where Id=?";
	        jdbcTemplate.update(sqlUpdate5,Doors.getFrameMaterial(),Doors.getId());

	        String sqlUpdate6 = "UPDATE Doors set FrameType=? where Id=?";
	        jdbcTemplate.update(sqlUpdate6,Doors.getFrameType(),Doors.getId());

	        String sqlUpdate7 = "UPDATE Doors set Finish=? where Id=?";
	        jdbcTemplate.update(sqlUpdate7,Doors.getFinish(),Doors.getId());

	        String sqlUpdate8 = "UPDATE Doors set Service=? where Id=?";
	        jdbcTemplate.update(sqlUpdate8,Doors.getService(),Doors.getId());

	        String sqlUpdate9 = "UPDATE Doors set LOT=? where Id=?";
	        jdbcTemplate.update(sqlUpdate9,Doors.getLOT(),Doors.getId());

	        return "redirect:/";
		}



	    @PostMapping("/admin/saveAirTerminals")
		public String save11(Model model, AirTerminals AirTerminals) {
	        String sqlUpdate = "UPDATE AirTerminals set comments=? where Id=?";
	        jdbcTemplate.update(sqlUpdate,AirTerminals.getComments(),AirTerminals.getId());
	        
	        String sqlUpdate1 = "UPDATE AirTerminals set DesignOption=? where Id=?";
	        jdbcTemplate.update(sqlUpdate1,AirTerminals.getDesignOption(),AirTerminals.getId());
	        
	        String sqlUpdate2 = "UPDATE AirTerminals set Mark=? where Id=?";
	        jdbcTemplate.update(sqlUpdate2,AirTerminals.getMark(),AirTerminals.getId());

	        String sqlUpdate3 = "UPDATE AirTerminals set Flow=? where Id=?";
	        jdbcTemplate.update(sqlUpdate3,AirTerminals.getFlow(),AirTerminals.getId());

	        return "redirect:/";
		}



	    @PostMapping("/admin/saveAirTerminalTypes")
		public String save12(Model model, AirTerminalTypes atp) {
				String sqlUpdate = "UPDATE AirTerminalTypes set TypeComments=? where Id=?";
				jdbcTemplate.update(sqlUpdate,atp.getTypeComments(),atp.getId());
				
				String sqlUpdate1 = "UPDATE AirTerminalTypes set Keynote=? where Id=?";
				jdbcTemplate.update(sqlUpdate1,atp.getKeynote(),atp.getId());
				
				String sqlUpdate2 = "UPDATE AirTerminalTypes set Model=? where Id=?";
				jdbcTemplate.update(sqlUpdate2,atp.getModel(),atp.getId());
				
				String sqlUpdate3 = "UPDATE AirTerminalTypes set Manufacturer=? where Id=?";
				jdbcTemplate.update(sqlUpdate3,atp.getManufacturer(),atp.getId());
				
				String sqlUpdate4 = "UPDATE AirTerminalTypes set URL=? where Id=?";
				jdbcTemplate.update(sqlUpdate4,atp.getURL(),atp.getId());
				
				String sqlUpdate5 = "UPDATE AirTerminalTypes set Description=? where Id=?";
				jdbcTemplate.update(sqlUpdate5,atp.getDescription(),atp.getId());	
				

	            String sqlUpdate6 = "UPDATE AirTerminalTypes set AssemblyCode=? where Id=?";
				jdbcTemplate.update(sqlUpdate6,atp.getAssemblyCode(),atp.getId());	
				

	            String sqlUpdate7 = "UPDATE AirTerminalTypes set TypeMark=? where Id=?";
				jdbcTemplate.update(sqlUpdate7,atp.getTypeMark(),atp.getId());	
				

	            String sqlUpdate8 = "UPDATE AirTerminalTypes set Cost=? where Id=?";
				jdbcTemplate.update(sqlUpdate8,atp.getCost(),atp.getId());	
				

	            String sqlUpdate9 = "UPDATE AirTerminalTypes set MaxFlow=? where Id=?";
				jdbcTemplate.update(sqlUpdate9,atp.getMaxFlow(),atp.getId());	
				

	            String sqlUpdate10 = "UPDATE AirTerminalTypes set MinFlow=? where Id=?";
				jdbcTemplate.update(sqlUpdate10,atp.getMinFlow(),atp.getId());	

				return "redirect:/";
		}



	    @PostMapping("/admin/saveStructuralColumns")
		public String save13(Model model, StructuralColumns sc) {
	        String sqlUpdate = "UPDATE StructuralColumns set comments=? where Id=?";
	        jdbcTemplate.update(sqlUpdate,sc.getComments(),sc.getId());
	        
	        String sqlUpdate1 = "UPDATE StructuralColumns set DesignOption=? where Id=?";
	        jdbcTemplate.update(sqlUpdate1,sc.getDesignOption(),sc.getId());
	        
	        String sqlUpdate2 = "UPDATE StructuralColumns set Mark=? where Id=?";
	        jdbcTemplate.update(sqlUpdate2,sc.getMark(),sc.getId());

	        String sqlUpdate3 = "UPDATE StructuralColumns set LOT=? where Id=?";
	        jdbcTemplate.update(sqlUpdate3,sc.getLOT(),sc.getId());

	        String sqlUpdate4 = "UPDATE StructuralColumns set TopOffset=? where Id=?";
	        jdbcTemplate.update(sqlUpdate4,sc.getTopOffset(),sc.getId());

	        String sqlUpdate5 = "UPDATE StructuralColumns set AnalyzeAs=? where Id=?";
	        jdbcTemplate.update(sqlUpdate5,sc.getAnalyzeAs(),sc.getId());

	        return "redirect:/";
		}



	    @PostMapping("/admin/saveStructuralColumnTypes")
		public String save14(Model model, StructuralColumnTypes sct) {
				String sqlUpdate = "UPDATE StructuralColumnTypes set TypeComments=? where Id=?";
				jdbcTemplate.update(sqlUpdate,sct.getTypeComments(),sct.getId());
				
				String sqlUpdate1 = "UPDATE StructuralColumnTypes set Keynote=? where Id=?";
				jdbcTemplate.update(sqlUpdate1,sct.getKeynote(),sct.getId());
				
				String sqlUpdate2 = "UPDATE StructuralColumnTypes set Model=? where Id=?";
				jdbcTemplate.update(sqlUpdate2,sct.getModel(),sct.getId());
				
				String sqlUpdate3 = "UPDATE StructuralColumnTypes set Manufacturer=? where Id=?";
				jdbcTemplate.update(sqlUpdate3,sct.getManufacturer(),sct.getId());
				
				String sqlUpdate4 = "UPDATE StructuralColumnTypes set URL=? where Id=?";
				jdbcTemplate.update(sqlUpdate4,sct.getURL(),sct.getId());
				
				String sqlUpdate5 = "UPDATE StructuralColumnTypes set Description=? where Id=?";
				jdbcTemplate.update(sqlUpdate5,sct.getDescription(),sct.getId());	
				

	            String sqlUpdate6 = "UPDATE StructuralColumnTypes set AssemblyCode=? where Id=?";
				jdbcTemplate.update(sqlUpdate6,sct.getAssemblyCode(),sct.getId());	
				

	            String sqlUpdate7 = "UPDATE StructuralColumnTypes set TypeMark=? where Id=?";
				jdbcTemplate.update(sqlUpdate7,sct.getTypeMark(),sct.getId());	
				

	            String sqlUpdate8 = "UPDATE StructuralColumnTypes set Cost=? where Id=?";
				jdbcTemplate.update(sqlUpdate8,sct.getCost(),sct.getId());	

	            return "redirect:/";
	        }



	        @PostMapping("/admin/saveGrids")
	        public String save15(Model model, Grids Grids) {
	            String sqlUpdate = "UPDATE Grids set Name=? where Id=?";
	            jdbcTemplate.update(sqlUpdate,Grids.getName(),Grids.getId());

	            return "redirect:/";
	        }



	        @PostMapping("/admin/saveGridTypes")
	        public String save16(Model model, GridTypes GridTypes) {
	            String sqlUpdate = "UPDATE GridTypes set Symbol=? where Id=?";
	            jdbcTemplate.update(sqlUpdate,GridTypes.getSymbol(),GridTypes.getId());
	            
	            String sqlUpdate1 = "UPDATE GridTypes set CenterSegment=? where Id=?";
	            jdbcTemplate.update(sqlUpdate1,GridTypes.getCenterSegment(),GridTypes.getId());
	            
	            String sqlUpdate2 = "UPDATE GridTypes set CenterSegmentPattern=? where Id=?";
	            jdbcTemplate.update(sqlUpdate2,GridTypes.getCenterSegmentPattern(),GridTypes.getId());
	    
	            String sqlUpdate3 = "UPDATE GridTypes set CenterSegmentColor=? where Id=?";
	            jdbcTemplate.update(sqlUpdate3,GridTypes.getCenterSegmentColor(),GridTypes.getId());
	    
	            String sqlUpdate4 = "UPDATE GridTypes set CenterSegmentWeight? where Id=?";
	            jdbcTemplate.update(sqlUpdate4,GridTypes.getCenterSegmentWeight(),GridTypes.getId());
	    
	            String sqlUpdate5 = "UPDATE GridTypes set EndSegmentsLength=? where Id=?";
	            jdbcTemplate.update(sqlUpdate5,GridTypes.getEndSegmentsLength(),GridTypes.getId());
	    
	            String sqlUpdate6 = "UPDATE GridTypes set EndSegmentPattern=? where Id=?";
	            jdbcTemplate.update(sqlUpdate6,GridTypes.getEndSegmentPattern(),GridTypes.getId());
	    
	            String sqlUpdate7 = "UPDATE GridTypes set EndSegmentColor=? where Id=?";
	            jdbcTemplate.update(sqlUpdate7,GridTypes.getEndSegmentColor(),GridTypes.getId());
	    
	            String sqlUpdate8 = "UPDATE GridTypes set EndSegmentWeight=? where Id=?";
	            jdbcTemplate.update(sqlUpdate8,GridTypes.getEndSegmentWeight(),GridTypes.getId());
	    
	            return "redirect:/";
	        }



	        @PostMapping("/admin/saveWindows")
	        public String save17(Model model, Windows Windows) {
	            String sqlUpdate = "UPDATE Windows set comments=? where Id=?";
	            jdbcTemplate.update(sqlUpdate,Windows.getComments(),Windows.getId());
	            
	            String sqlUpdate1 = "UPDATE Windows set DesignOption=? where Id=?";
	            jdbcTemplate.update(sqlUpdate1,Windows.getDesignOption(),Windows.getId());
	            
	            String sqlUpdate2 = "UPDATE Windows set Mark=? where Id=?";
	            jdbcTemplate.update(sqlUpdate2,Windows.getMark(),Windows.getId());
	    
	            String sqlUpdate3 = "UPDATE Windows set HeadHeight=? where Id=?";
	            jdbcTemplate.update(sqlUpdate3,Windows.getHeadHeight(),Windows.getId());
	    
	            String sqlUpdate4 = "UPDATE Windows set SillHeight=? where Id=?";
	            jdbcTemplate.update(sqlUpdate4,Windows.getSillHeight(),Windows.getId());
	    
	            return "redirect:/";
	        }



	        @PostMapping("/admin/saveWindowTypes")
	        public String save18(Model model, WindowTypes WindowTypes) {
	                String sqlUpdate = "UPDATE WindowTypes set TypeComments=? where Id=?";
	                jdbcTemplate.update(sqlUpdate,WindowTypes.getTypeComments(),WindowTypes.getId());
	                
	                String sqlUpdate1 = "UPDATE WindowTypes set Keynote=? where Id=?";
	                jdbcTemplate.update(sqlUpdate1,WindowTypes.getKeynote(),WindowTypes.getId());
	                
	                String sqlUpdate2 = "UPDATE WindowTypes set Model=? where Id=?";
	                jdbcTemplate.update(sqlUpdate2,WindowTypes.getModel(),WindowTypes.getId());
	                
	                String sqlUpdate3 = "UPDATE WindowTypes set Manufacturer=? where Id=?";
	                jdbcTemplate.update(sqlUpdate3,WindowTypes.getManufacturer(),WindowTypes.getId());
	                
	                String sqlUpdate4 = "UPDATE WindowTypes set URL=? where Id=?";
	                jdbcTemplate.update(sqlUpdate4,WindowTypes.getURL(),WindowTypes.getId());
	                
	                String sqlUpdate5 = "UPDATE WindowTypes set Description=? where Id=?";
	                jdbcTemplate.update(sqlUpdate5,WindowTypes.getDescription(),WindowTypes.getId());	
	                
	    
	                String sqlUpdate6 = "UPDATE WindowTypes set AssemblyCode=? where Id=?";
	                jdbcTemplate.update(sqlUpdate6,WindowTypes.getAssemblyCode(),WindowTypes.getId());	
	                
	    
	                String sqlUpdate7 = "UPDATE WindowTypes set TypeMark=? where Id=?";
	                jdbcTemplate.update(sqlUpdate7,WindowTypes.getTypeMark(),WindowTypes.getId());	
	                
	    
	                String sqlUpdate8 = "UPDATE WindowTypes set Cost=? where Id=?";
	                jdbcTemplate.update(sqlUpdate8,WindowTypes.getCost(),WindowTypes.getId());	

	                String sqlUpdate9 = "UPDATE WindowTypes set Width=? where Id=?";
	                jdbcTemplate.update(sqlUpdate9,WindowTypes.getWidth(),WindowTypes.getId());

	                String sqlUpdate10 = "UPDATE WindowTypes set Height=? where Id=?";
	                jdbcTemplate.update(sqlUpdate10,WindowTypes.getHeight(),WindowTypes.getId());

	                String sqlUpdate11 = "UPDATE WindowTypes set Operation=? where Id=?";
	                jdbcTemplate.update(sqlUpdate11,WindowTypes.getOperation(),WindowTypes.getId());

	                String sqlUpdate12 = "UPDATE WindowTypes set ConstructionType=? where Id=?";
	                jdbcTemplate.update(sqlUpdate12,WindowTypes.getConstructionType(),WindowTypes.getId());
	    
	                return "redirect:/";
	            }



	            @PostMapping("/admin/savePlumbingFixtures")
	            public String save19(Model model, PlumbingFixtures pb) {
	                String sqlUpdate = "UPDATE PlumbingFixtures set comments=? where Id=?";
	                jdbcTemplate.update(sqlUpdate,pb.getComments(),pb.getId());
	                
	                String sqlUpdate1 = "UPDATE PlumbingFixtures set DesignOption=? where Id=?";
	                jdbcTemplate.update(sqlUpdate1,pb.getDesignOption(),pb.getId());
	                
	                String sqlUpdate2 = "UPDATE PlumbingFixtures set Mark=? where Id=?";
	                jdbcTemplate.update(sqlUpdate2,pb.getMark(),pb.getId());
	        
	                return "redirect:/";
	            }



	            @PostMapping("/admin/savePlumbingFixtureTypes")
	            public String save20(Model model, PlumbingFixtureTypes pft) {
	                    String sqlUpdate = "UPDATE PlumbingFixtureTypes set TypeComments=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate,pft.getTypeComments(),pft.getId());
	                    
	                    String sqlUpdate1 = "UPDATE PlumbingFixtureTypes set Keynote=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate1,pft.getKeynote(),pft.getId());
	                    
	                    String sqlUpdate2 = "UPDATE PlumbingFixtureTypes set Model=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate2,pft.getModel(),pft.getId());
	                    
	                    String sqlUpdate3 = "UPDATE PlumbingFixtureTypes set Manufacturer=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate3,pft.getManufacturer(),pft.getId());
	                    
	                    String sqlUpdate4 = "UPDATE PlumbingFixtureTypes set URL=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate4,pft.getURL(),pft.getId());
	                    
	                    String sqlUpdate5 = "UPDATE PlumbingFixtureTypes set Description=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate5,pft.getDescription(),pft.getId());	
	                    
	        
	                    String sqlUpdate6 = "UPDATE PlumbingFixtureTypes set AssemblyCode=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate6,pft.getAssemblyCode(),pft.getId());	
	                    
	        
	                    String sqlUpdate7 = "UPDATE PlumbingFixtureTypes set TypeMark=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate7,pft.getTypeMark(),pft.getId());	
	                    
	        
	                    String sqlUpdate8 = "UPDATE PlumbingFixtureTypes set Cost=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate8,pft.getCost(),pft.getId());	
	    
	                    String sqlUpdate9 = "UPDATE PlumbingFixtureTypes set WFU=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate9,pft.getWFU(),pft.getId());
	    
	                    String sqlUpdate10 = "UPDATE PlumbingFixtureTypes set HWFU=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate10,pft.getHWFU(),pft.getId());
	    
	                    String sqlUpdate11 = "UPDATE PlumbingFixtureTypes set CWFU=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate11,pft.getCWFU(),pft.getId());
	        
	                    return "redirect:/";
	                }



	                @PostMapping("/admin/saveRoofs")
	                public String save21(Model model, Roofs Roofs) {
	                    String sqlUpdate = "UPDATE Roofs set comments=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate,Roofs.getComments(),Roofs.getId());
	                    
	                    String sqlUpdate1 = "UPDATE Roofs set DesignOption=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate1,Roofs.getDesignOption(),Roofs.getId());
	                    
	                    String sqlUpdate2 = "UPDATE Roofs set Mark=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate2,Roofs.getMark(),Roofs.getId());
	            
	                    String sqlUpdate3 = "UPDATE Roofs set Volume=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate3,Roofs.getVolume(),Roofs.getId());
	            
	                    String sqlUpdate4 = "UPDATE Roofs set RafterorTruss=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate4,Roofs.getRafterorTruss(),Roofs.getId());

	                    String sqlUpdate5 = "UPDATE Roofs set FasciaDepth=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate5,Roofs.getFasciaDepth(),Roofs.getId());

	                    String sqlUpdate6 = "UPDATE Roofs set RafterCut=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate6,Roofs.getRafterCut(),Roofs.getId());

	                    String sqlUpdate7 = "UPDATE Roofs set BaseLevel=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate7,Roofs.getBaseLevel(),Roofs.getId());

	                    String sqlUpdate8 = "UPDATE Roofs set CutoffOffset=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate8,Roofs.getCutoffOffset(),Roofs.getId());

	                    String sqlUpdate9 = "UPDATE Roofs set CutoffLevel=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate9,Roofs.getCutoffLevel(),Roofs.getId());

	                    String sqlUpdate10 = "UPDATE Roofs set BaseOffsetFromLevel=? where Id=?";
	                    jdbcTemplate.update(sqlUpdate10,Roofs.getBaseOffsetFromLevel(),Roofs.getId());
	            
	                    return "redirect:/";
	                }



	                @PostMapping("/admin/saveRoofTypes")
	                public String save22(Model model, RoofTypes RoofTypes) {
	                        String sqlUpdate = "UPDATE RoofTypes set TypeComments=? where Id=?";
	                        jdbcTemplate.update(sqlUpdate,RoofTypes.getTypeComments(),RoofTypes.getId());
	                        
	                        String sqlUpdate1 = "UPDATE RoofTypes set Keynote=? where Id=?";
	                        jdbcTemplate.update(sqlUpdate1,RoofTypes.getKeynote(),RoofTypes.getId());
	                        
	                        String sqlUpdate2 = "UPDATE RoofTypes set Model=? where Id=?";
	                        jdbcTemplate.update(sqlUpdate2,RoofTypes.getModel(),RoofTypes.getId());
	                        
	                        String sqlUpdate3 = "UPDATE RoofTypes set Manufacturer=? where Id=?";
	                        jdbcTemplate.update(sqlUpdate3,RoofTypes.getManufacturer(),RoofTypes.getId());
	                        
	                        String sqlUpdate4 = "UPDATE RoofTypes set URL=? where Id=?";
	                        jdbcTemplate.update(sqlUpdate4,RoofTypes.getURL(),RoofTypes.getId());
	                        
	                        String sqlUpdate5 = "UPDATE RoofTypes set Description=? where Id=?";
	                        jdbcTemplate.update(sqlUpdate5,RoofTypes.getDescription(),RoofTypes.getId());	
	                        
	            
	                        String sqlUpdate6 = "UPDATE RoofTypes set AssemblyCode=? where Id=?";
	                        jdbcTemplate.update(sqlUpdate6,RoofTypes.getAssemblyCode(),RoofTypes.getId());	
	                        
	            
	                        String sqlUpdate7 = "UPDATE RoofTypes set TypeMark=? where Id=?";
	                        jdbcTemplate.update(sqlUpdate7,RoofTypes.getTypeMark(),RoofTypes.getId());	
	                        
	            
	                        String sqlUpdate8 = "UPDATE RoofTypes set Cost=? where Id=?";
	                        jdbcTemplate.update(sqlUpdate8,RoofTypes.getCost(),RoofTypes.getId());	
	            
	                        return "redirect:/";
	                    }



	                    @PostMapping("/admin/saveSpecialtyEquipment")
	                    public String save23(Model model, SpecialtyEquipment se) {
	                        String sqlUpdate = "UPDATE SpecialtyEquipment set comments=? where Id=?";
	                        jdbcTemplate.update(sqlUpdate,se.getComments(),se.getId());
	                        
	                        String sqlUpdate1 = "UPDATE SpecialtyEquipment set DesignOption=? where Id=?";
	                        jdbcTemplate.update(sqlUpdate1,se.getDesignOption(),se.getId());
	                        
	                        String sqlUpdate2 = "UPDATE SpecialtyEquipment set Mark=? where Id=?";
	                        jdbcTemplate.update(sqlUpdate2,se.getMark(),se.getId());
	                
	                        return "redirect:/";
	                    }



	                    @PostMapping("/admin/saveSpecialtyEquipmentTypes")
	                    public String save24(Model model, SpecialtyEquipmentTypes set) {
	                            String sqlUpdate = "UPDATE SpecialtyEquipmentTypes set TypeComments=? where Id=?";
	                            jdbcTemplate.update(sqlUpdate,set.getTypeComments(),set.getId());
	                            
	                            String sqlUpdate1 = "UPDATE SpecialtyEquipmentTypes set Keynote=? where Id=?";
	                            jdbcTemplate.update(sqlUpdate1,set.getKeynote(),set.getId());
	                            
	                            String sqlUpdate2 = "UPDATE SpecialtyEquipmentTypes set Model=? where Id=?";
	                            jdbcTemplate.update(sqlUpdate2,set.getModel(),set.getId());
	                            
	                            String sqlUpdate3 = "UPDATE SpecialtyEquipmentTypes set Manufacturer=? where Id=?";
	                            jdbcTemplate.update(sqlUpdate3,set.getManufacturer(),set.getId());
	                            
	                            String sqlUpdate4 = "UPDATE SpecialtyEquipmentTypes set URL=? where Id=?";
	                            jdbcTemplate.update(sqlUpdate4,set.getURL(),set.getId());
	                            
	                            String sqlUpdate5 = "UPDATE SpecialtyEquipmentTypes set Description=? where Id=?";
	                            jdbcTemplate.update(sqlUpdate5,set.getDescription(),set.getId());	
	                            
	                
	                            String sqlUpdate6 = "UPDATE SpecialtyEquipmentTypes set AssemblyCode=? where Id=?";
	                            jdbcTemplate.update(sqlUpdate6,set.getAssemblyCode(),set.getId());	
	                            
	                
	                            String sqlUpdate7 = "UPDATE SpecialtyEquipmentTypes set TypeMark=? where Id=?";
	                            jdbcTemplate.update(sqlUpdate7,set.getTypeMark(),set.getId());	
	                            
	                
	                            String sqlUpdate8 = "UPDATE SpecialtyEquipmentTypes set Cost=? where Id=?";
	                            jdbcTemplate.update(sqlUpdate8,set.getCost(),set.getId());	
	                
	                            return "redirect:/";
	                        }



	                        @PostMapping("/admin/saveFloors")
	                        public String save25(Model model, Floors Floors) {
	                            String sqlUpdate = "UPDATE Floors set comments=? where Id=?";
	                            jdbcTemplate.update(sqlUpdate,Floors.getComments(),Floors.getId());
	                            
	                            String sqlUpdate1 = "UPDATE Floors set DesignOption=? where Id=?";
	                            jdbcTemplate.update(sqlUpdate1,Floors.getDesignOption(),Floors.getId());
	                            
	                            String sqlUpdate2 = "UPDATE Floors set Mark=? where Id=?";
	                            jdbcTemplate.update(sqlUpdate2,Floors.getMark(),Floors.getId());

	                            String sqlUpdate3 = "UPDATE Floors set Structural=? where Id=?";
	                            jdbcTemplate.update(sqlUpdate3,Floors.getStructural(),Floors.getId());

	                            String sqlUpdate4 = "UPDATE Floors set HeightOffsetFromLevel=? where Id=?";
	                            jdbcTemplate.update(sqlUpdate4,Floors.getHeightOffsetFromLevel(),Floors.getId());

	                            String sqlUpdate5 = "UPDATE Floors set AnalyzeAs=? where Id=?";
	                            jdbcTemplate.update(sqlUpdate5,Floors.getAnalyzeAs(),Floors.getId());

	                            String sqlUpdate6 = "UPDATE Floors set LOT=? where Id=?";
	                            jdbcTemplate.update(sqlUpdate6,Floors.getLOT(),Floors.getId());
	                    
	                            return "redirect:/";
	                        }



	                        @PostMapping("/admin/saveFloorTypes")
	                        public String save26(Model model, FloorTypes FloorTypes) {
	                                String sqlUpdate = "UPDATE FloorTypes set TypeComments=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate,FloorTypes.getTypeComments(),FloorTypes.getId());
	                                
	                                String sqlUpdate1 = "UPDATE FloorTypes set Keynote=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate1,FloorTypes.getKeynote(),FloorTypes.getId());
	                                
	                                String sqlUpdate2 = "UPDATE FloorTypes set Model=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate2,FloorTypes.getModel(),FloorTypes.getId());
	                                
	                                String sqlUpdate3 = "UPDATE FloorTypes set Manufacturer=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate3,FloorTypes.getManufacturer(),FloorTypes.getId());
	                                
	                                String sqlUpdate4 = "UPDATE FloorTypes set URL=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate4,FloorTypes.getURL(),FloorTypes.getId());
	                                
	                                String sqlUpdate5 = "UPDATE FloorTypes set Description=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate5,FloorTypes.getDescription(),FloorTypes.getId());	
	                                
	                    
	                                String sqlUpdate6 = "UPDATE FloorTypes set AssemblyCode=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate6,FloorTypes.getAssemblyCode(),FloorTypes.getId());	
	                                
	                    
	                                String sqlUpdate7 = "UPDATE FloorTypes set TypeMark=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate7,FloorTypes.getTypeMark(),FloorTypes.getId());	
	                                
	                    
	                                String sqlUpdate8 = "UPDATE FloorTypes set Cost=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate8,FloorTypes.getCost(),FloorTypes.getId());	
	                    
	                                return "redirect:/";
	                            }



	                            @PostMapping("/admin/saveHVACZones")
	                            public String save27(Model model, HVACZones HVACZones) {

	                                String sqlUpdate = "UPDATE HVACZones set comments=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate,HVACZones.getComments(),HVACZones.getId());
	                                
	                                String sqlUpdate1 = "UPDATE HVACZones set DesignOption=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate1,HVACZones.getDesignOption(),HVACZones.getId());
	                                
	                                String sqlUpdate2 = "UPDATE HVACZones set UseAirChangesPerHour=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate2,HVACZones.getUseAirChangesPerHour(),HVACZones.getId());
	    
	                                String sqlUpdate3 = "UPDATE HVACZones set UseOutsideAirPerArea=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate3,HVACZones.getUseOutsideAirPerArea(),HVACZones.getId());
	    
	                                String sqlUpdate4 = "UPDATE HVACZones set UseOutsideAirPerPerson=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate4,HVACZones.getUseOutsideAirPerPerson(),HVACZones.getId());
	    
	                                String sqlUpdate5 = "UPDATE HVACZones set UseDehumidificationSetPoint=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate5,HVACZones.getUseDehumidificationSetPoint(),HVACZones.getId());
	    
	                                String sqlUpdate6 = "UPDATE HVACZones set UseHumidificationSetPoint=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate6,HVACZones.getUseHumidificationSetPoint(),HVACZones.getId());

	                                String sqlUpdate7 = "UPDATE HVACZones set OutdoorAirperArea=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate7,HVACZones.getOutdoorAirperArea(),HVACZones.getId());

	                                String sqlUpdate8 = "UPDATE HVACZones set OutdoorAirperPerson=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate8,HVACZones.getOutdoorAirperPerson(),HVACZones.getId());

	                                String sqlUpdate9 = "UPDATE HVACZones set DehumidificationSetPoint=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate9,HVACZones.getDehumidificationSetPoint(),HVACZones.getId());

	                                String sqlUpdate10 = "UPDATE HVACZones set HumidificationSetPoint=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate10,HVACZones.getHumidificationSetPoint(),HVACZones.getId());

	                                String sqlUpdate11 = "UPDATE HVACZones set CoolingAirTemperature=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate11,HVACZones.getCoolingAirTemperature(),HVACZones.getId());

	                                String sqlUpdate12 = "UPDATE HVACZones set HeatingAirTemperature=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate12,HVACZones.getHeatingAirTemperature(),HVACZones.getId());

	                                String sqlUpdate13 = "UPDATE HVACZones set CoolingSetPoint=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate13,HVACZones.getCoolingSetPoint(),HVACZones.getId());

	                                String sqlUpdate14 = "UPDATE HVACZones set HeatingSetPoint=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate14,HVACZones.getHeatingSetPoint(),HVACZones.getId());

	                                String sqlUpdate15 = "UPDATE HVACZones set ServiceType=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate15,HVACZones.getServiceType(),HVACZones.getId());

	                                String sqlUpdate16 = "UPDATE HVACZones set CoilBypass=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate16,HVACZones.getCoilBypass(),HVACZones.getId());
	                        
	                                return "redirect:/";
	                            }



	                            @PostMapping("/admin/saveDuctSystems")
	                            public String save28(Model model, DuctSystems DuctSystems) {
	                                String sqlUpdate = "UPDATE DuctSystems set comments=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate,DuctSystems.getComments(),DuctSystems.getId());
	                                
	                                String sqlUpdate1 = "UPDATE DuctSystems set DesignOption=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate1,DuctSystems.getDesignOption(),DuctSystems.getId());
	                                
	                                String sqlUpdate2 = "UPDATE DuctSystems set SystemName=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate2,DuctSystems.getSystemName(),DuctSystems.getId());

	                                String sqlUpdate3 = "UPDATE DuctSystems set Flow=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate3,DuctSystems.getFlow(),DuctSystems.getId());
	                        
	                                return "redirect:/";
	                            }



	                            @PostMapping("/admin/saveDuctSystemTypes")
	                            public String save29(Model model, DuctSystemTypes DuctSystemTypes) {
	                                String sqlUpdate = "UPDATE DuctSystemTypes set TypeComments=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate,DuctSystemTypes.getTypeComments(),DuctSystemTypes.getId());
	                                
	                                String sqlUpdate1 = "UPDATE DuctSystemTypes set Abbreviation=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate1,DuctSystemTypes.getAbbreviation(),DuctSystemTypes.getId());
	                                
	                                String sqlUpdate2 = "UPDATE DuctSystemTypes set URL=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate2,DuctSystemTypes.getURL(),DuctSystemTypes.getId());

	                                String sqlUpdate3 = "UPDATE DuctSystemTypes set Description=? where Id=?";
	                                jdbcTemplate.update(sqlUpdate3,DuctSystemTypes.getDescription(),DuctSystemTypes.getId());
	                        
	                                return "redirect:/";
	                            }



	                            @PostMapping("/admin/saveDuctTypes")
	                            public String save30(Model model, DuctTypes DuctTypes) {
	                                    String sqlUpdate = "UPDATE DuctTypes set TypeComments=? where Id=?";
	                                    jdbcTemplate.update(sqlUpdate,DuctTypes.getTypeComments(),DuctTypes.getId());
	                                    
	                                    String sqlUpdate1 = "UPDATE DuctTypes set Keynote=? where Id=?";
	                                    jdbcTemplate.update(sqlUpdate1,DuctTypes.getKeynote(),DuctTypes.getId());
	                                    
	                                    String sqlUpdate2 = "UPDATE DuctTypes set Model=? where Id=?";
	                                    jdbcTemplate.update(sqlUpdate2,DuctTypes.getModel(),DuctTypes.getId());
	                                    
	                                    String sqlUpdate3 = "UPDATE DuctTypes set Manufacturer=? where Id=?";
	                                    jdbcTemplate.update(sqlUpdate3,DuctTypes.getManufacturer(),DuctTypes.getId());
	                                    
	                                    String sqlUpdate4 = "UPDATE DuctTypes set URL=? where Id=?";
	                                    jdbcTemplate.update(sqlUpdate4,DuctTypes.getURL(),DuctTypes.getId());
	                                    
	                                    String sqlUpdate5 = "UPDATE DuctTypes set Description=? where Id=?";
	                                    jdbcTemplate.update(sqlUpdate5,DuctTypes.getDescription(),DuctTypes.getId());	
	                                    
	                        
	                                    String sqlUpdate6 = "UPDATE DuctTypes set AssemblyCode=? where Id=?";
	                                    jdbcTemplate.update(sqlUpdate6,DuctTypes.getAssemblyCode(),DuctTypes.getId());	
	                                    
	                        
	                                    String sqlUpdate7 = "UPDATE DuctTypes set TypeMark=? where Id=?";
	                                    jdbcTemplate.update(sqlUpdate7,DuctTypes.getTypeMark(),DuctTypes.getId());	
	                                    
	                        
	                                    String sqlUpdate8 = "UPDATE DuctTypes set Cost=? where Id=?";
	                                    jdbcTemplate.update(sqlUpdate8,DuctTypes.getCost(),DuctTypes.getId());	
	                        
	                                    return "redirect:/";
	                                }



	                                @PostMapping("/admin/saveMaterialQuantities")
	                                public String save31(Model model, MaterialQuantities mq) {
	                                    String sqlUpdate = "UPDATE MaterialQuantities set AsPaint=? where ElementId=?";
	                                    jdbcTemplate.update(sqlUpdate,mq.getAsPaint(),mq.getElementId());
	                        
	                                    return "redirect:/";
	                                }



	/*
	 * @PostMapping("/admin/saveDuctSystemTypes") public String save32(Model model,
	 * DuctSystemTypes DuctSystemTypes) { String sqlUpdate =
	 * "UPDATE DuctSystemTypes set TypeComments=? where Id=?";
	 * jdbcTemplate.update(sqlUpdate,DuctSystemTypes.getTypeComments(),
	 * DuctSystemTypes.getId());
	 * 
	 * String sqlUpdate1 = "UPDATE DuctSystemTypes set Abbreviation=? where Id=?";
	 * jdbcTemplate.update(sqlUpdate1,DuctSystemTypes.getAbbreviation(),
	 * DuctSystemTypes.getId());
	 * 
	 * String sqlUpdate2 = "UPDATE DuctSystemTypes set URL=? where Id=?";
	 * jdbcTemplate.update(sqlUpdate2,DuctSystemTypes.getURL(),DuctSystemTypes.getId
	 * ());
	 * 
	 * String sqlUpdate3 = "UPDATE DuctSystemTypes set Description=? where Id=?";
	 * jdbcTemplate.update(sqlUpdate3,DuctSystemTypes.getDescription(),
	 * DuctSystemTypes.getId());
	 * 
	 * return "redirect:/"; }
	 * 
	 */
	    
	                                @PostMapping("/admin/saveMaterials")
	                                public String save33(Model model, Materials Materials) {
	                                        String sqlUpdate = "UPDATE Materials set Comments=? where Id=?";
	                                        jdbcTemplate.update(sqlUpdate,Materials.getComments(),Materials.getId());
	                                        
	                                        String sqlUpdate1 = "UPDATE Materials set Keynote=? where Id=?";
	                                        jdbcTemplate.update(sqlUpdate1,Materials.getKeynote(),Materials.getId());
	                                        
	                                        String sqlUpdate2 = "UPDATE Materials set Model=? where Id=?";
	                                        jdbcTemplate.update(sqlUpdate2,Materials.getModel(),Materials.getId());
	                                        
	                                        String sqlUpdate3 = "UPDATE Materials set Manufacturer=? where Id=?";
	                                        jdbcTemplate.update(sqlUpdate3,Materials.getManufacturer(),Materials.getId());
	                                        
	                                        String sqlUpdate4 = "UPDATE Materials set URL=? where Id=?";
	                                        jdbcTemplate.update(sqlUpdate4,Materials.getURL(),Materials.getId());
	                                        
	                                        String sqlUpdate5 = "UPDATE Materials set Description=? where Id=?";
	                                        jdbcTemplate.update(sqlUpdate5,Materials.getDescription(),Materials.getId());	
	                                        
	                            
	                                        String sqlUpdate6 = "UPDATE Materials set Name=? where Id=?";
	                                        jdbcTemplate.update(sqlUpdate6,Materials.getName(),Materials.getId());	
	                                        
	                            
	                                        String sqlUpdate7 = "UPDATE Materials set Cost=? where Id=?";
	                                        jdbcTemplate.update(sqlUpdate7,Materials.getCost(),Materials.getId());	
	                            
	                                        return "redirect:/";
	                                    }



	                                    @PostMapping("/admin/saveWireInsulationTypes")
	                                    public String save34(Model model, WireInsulationTypes wit) {
	                                            String sqlUpdate = "UPDATE WireInsulationTypes set TypeComments=? where Id=?";
	                                            jdbcTemplate.update(sqlUpdate,wit.getTypeComments(),wit.getId());
	                                            
	                                            String sqlUpdate1 = "UPDATE WireInsulationTypes set Keynote=? where Id=?";
	                                            jdbcTemplate.update(sqlUpdate1,wit.getKeynote(),wit.getId());
	                                            
	                                            String sqlUpdate2 = "UPDATE WireInsulationTypes set Model=? where Id=?";
	                                            jdbcTemplate.update(sqlUpdate2,wit.getModel(),wit.getId());
	                                            
	                                            String sqlUpdate3 = "UPDATE WireInsulationTypes set Manufacturer=? where Id=?";
	                                            jdbcTemplate.update(sqlUpdate3,wit.getManufacturer(),wit.getId());
	                                            
	                                            String sqlUpdate4 = "UPDATE WireInsulationTypes set URL=? where Id=?";
	                                            jdbcTemplate.update(sqlUpdate4,wit.getURL(),wit.getId());
	                                            
	                                            String sqlUpdate5 = "UPDATE WireInsulationTypes set Description=? where Id=?";
	                                            jdbcTemplate.update(sqlUpdate5,wit.getDescription(),wit.getId());	
	                                            
	                                
	                                            String sqlUpdate6 = "UPDATE WireInsulationTypes set AssemblyCode=? where Id=?";
	                                            jdbcTemplate.update(sqlUpdate6,wit.getAssemblyCode(),wit.getId());	
	                                            
	                                
	                                            String sqlUpdate7 = "UPDATE WireInsulationTypes set TypeMark=? where Id=?";
	                                            jdbcTemplate.update(sqlUpdate7,wit.getTypeMark(),wit.getId());	
	                                            
	                                
	                                            String sqlUpdate8 = "UPDATE WireInsulationTypes set Cost=? where Id=?";
	                                            jdbcTemplate.update(sqlUpdate8,wit.getCost(),wit.getId());	
	                                
	                                            return "redirect:/";
	                                        }



	                                        @PostMapping("/admin/saveDuctFittingTypes")
	                                        public String save35(Model model, DuctFittingTypes dft) {
	                                                String sqlUpdate = "UPDATE DuctFittingTypes set TypeComments=? where Id=?";
	                                                jdbcTemplate.update(sqlUpdate,dft.getTypeComments(),dft.getId());
	                                                
	                                                String sqlUpdate1 = "UPDATE DuctFittingTypes set Keynote=? where Id=?";
	                                                jdbcTemplate.update(sqlUpdate1,dft.getKeynote(),dft.getId());
	                                                
	                                                String sqlUpdate2 = "UPDATE DuctFittingTypes set Model=? where Id=?";
	                                                jdbcTemplate.update(sqlUpdate2,dft.getModel(),dft.getId());
	                                                
	                                                String sqlUpdate3 = "UPDATE DuctFittingTypes set Manufacturer=? where Id=?";
	                                                jdbcTemplate.update(sqlUpdate3,dft.getManufacturer(),dft.getId());
	                                                
	                                                String sqlUpdate4 = "UPDATE DuctFittingTypes set URL=? where Id=?";
	                                                jdbcTemplate.update(sqlUpdate4,dft.getURL(),dft.getId());
	                                                
	                                                String sqlUpdate5 = "UPDATE DuctFittingTypes set Description=? where Id=?";
	                                                jdbcTemplate.update(sqlUpdate5,dft.getDescription(),dft.getId());	
	                                                
	                                    
	                                                String sqlUpdate6 = "UPDATE DuctFittingTypes set AssemblyCode=? where Id=?";
	                                                jdbcTemplate.update(sqlUpdate6,dft.getAssemblyCode(),dft.getId());	
	                                                
	                                    
	                                                String sqlUpdate7 = "UPDATE DuctFittingTypes set TypeMark=? where Id=?";
	                                                jdbcTemplate.update(sqlUpdate7,dft.getTypeMark(),dft.getId());	
	                                                
	                                    
	                                                String sqlUpdate8 = "UPDATE DuctFittingTypes set Cost=? where Id=?";
	                                                jdbcTemplate.update(sqlUpdate8,dft.getCost(),dft.getId());	
	                                    
	                                                return "redirect:/";
	                                            }



	                                            @PostMapping("/admin/saveFluidTypes")
	                                            public String save36(Model model, FluidTypes FluidTypes) {
	                                                    String sqlUpdate = "UPDATE FluidTypes set TypeComments=? where Id=?";
	                                                    jdbcTemplate.update(sqlUpdate,FluidTypes.getTypeComments(),FluidTypes.getId());
	                                                    
	                                                    String sqlUpdate1 = "UPDATE FluidTypes set Keynote=? where Id=?";
	                                                    jdbcTemplate.update(sqlUpdate1,FluidTypes.getKeynote(),FluidTypes.getId());
	                                                    
	                                                    String sqlUpdate2 = "UPDATE FluidTypes set Model=? where Id=?";
	                                                    jdbcTemplate.update(sqlUpdate2,FluidTypes.getModel(),FluidTypes.getId());
	                                                    
	                                                    String sqlUpdate3 = "UPDATE FluidTypes set Manufacturer=? where Id=?";
	                                                    jdbcTemplate.update(sqlUpdate3,FluidTypes.getManufacturer(),FluidTypes.getId());
	                                                    
	                                                    String sqlUpdate4 = "UPDATE FluidTypes set URL=? where Id=?";
	                                                    jdbcTemplate.update(sqlUpdate4,FluidTypes.getURL(),FluidTypes.getId());
	                                                    
	                                                    String sqlUpdate5 = "UPDATE FluidTypes set Description=? where Id=?";
	                                                    jdbcTemplate.update(sqlUpdate5,FluidTypes.getDescription(),FluidTypes.getId());	
	                                                    
	                                        
	                                                    String sqlUpdate6 = "UPDATE FluidTypes set AssemblyCode=? where Id=?";
	                                                    jdbcTemplate.update(sqlUpdate6,FluidTypes.getAssemblyCode(),FluidTypes.getId());	
	                                                    
	                                        
	                                                    String sqlUpdate7 = "UPDATE FluidTypes set TypeMark=? where Id=?";
	                                                    jdbcTemplate.update(sqlUpdate7,FluidTypes.getTypeMark(),FluidTypes.getId());	
	                                                    
	                                        
	                                                    String sqlUpdate8 = "UPDATE FluidTypes set Cost=? where Id=?";
	                                                    jdbcTemplate.update(sqlUpdate8,FluidTypes.getCost(),FluidTypes.getId());	
	                                        
	                                                    return "redirect:/";
	                                                }



	                                                @PostMapping("/admin/savePipingSystemTypes")
	                                                public String save37(Model model, PipingSystemTypes pist) {
	                                                        String sqlUpdate = "UPDATE PipingSystemTypes set TypeComments=? where Id=?";
	                                                        jdbcTemplate.update(sqlUpdate,pist.getTypeComments(),pist.getId());
	                                                        
	                                                        String sqlUpdate4 = "UPDATE PipingSystemTypes set URL=? where Id=?";
	                                                        jdbcTemplate.update(sqlUpdate4,pist.getURL(),pist.getId());
	                                                        
	                                                        String sqlUpdate5 = "UPDATE PipingSystemTypes set Description=? where Id=?";
	                                                        jdbcTemplate.update(sqlUpdate5,pist.getDescription(),pist.getId());		
	                                                    
	                                                        return "redirect:/";
	                                                    }



	                                                    @PostMapping("/admin/savePipeScheduleTypes")
	                                                    public String save38(Model model, PipeScheduleTypes pst) {
	                                                            String sqlUpdate = "UPDATE PipeScheduleTypes set TypeComments=? where Id=?";
	                                                            jdbcTemplate.update(sqlUpdate,pst.getTypeComments(),pst.getId());
	                                                            
	                                                            String sqlUpdate1 = "UPDATE PipeScheduleTypes set Keynote=? where Id=?";
	                                                            jdbcTemplate.update(sqlUpdate1,pst.getKeynote(),pst.getId());
	                                                            
	                                                            String sqlUpdate2 = "UPDATE PipeScheduleTypes set Model=? where Id=?";
	                                                            jdbcTemplate.update(sqlUpdate2,pst.getModel(),pst.getId());
	                                                            
	                                                            String sqlUpdate3 = "UPDATE PipeScheduleTypes set Manufacturer=? where Id=?";
	                                                            jdbcTemplate.update(sqlUpdate3,pst.getManufacturer(),pst.getId());
	                                                            
	                                                            String sqlUpdate4 = "UPDATE PipeScheduleTypes set URL=? where Id=?";
	                                                            jdbcTemplate.update(sqlUpdate4,pst.getURL(),pst.getId());
	                                                            
	                                                            String sqlUpdate5 = "UPDATE PipeScheduleTypes set Description=? where Id=?";
	                                                            jdbcTemplate.update(sqlUpdate5,pst.getDescription(),pst.getId());	
	                                                            
	                                                
	                                                            String sqlUpdate6 = "UPDATE PipeScheduleTypes set AssemblyCode=? where Id=?";
	                                                            jdbcTemplate.update(sqlUpdate6,pst.getAssemblyCode(),pst.getId());	
	                                                            
	                                                
	                                                            String sqlUpdate7 = "UPDATE PipeScheduleTypes set TypeMark=? where Id=?";
	                                                            jdbcTemplate.update(sqlUpdate7,pst.getTypeMark(),pst.getId());	
	                                                            
	                                                
	                                                            String sqlUpdate8 = "UPDATE PipeScheduleTypes set Cost=? where Id=?";
	                                                            jdbcTemplate.update(sqlUpdate8,pst.getCost(),pst.getId());	
	                                                
	                                                            return "redirect:/";
	                                                        }



	                                                        @PostMapping("/admin/saveProfiles")
	                                                        public String save39(Model model, Profiles Profiles) {
	                                                                String sqlUpdate = "UPDATE Profiles set TypeComments=? where Id=?";
	                                                                jdbcTemplate.update(sqlUpdate,Profiles.getTypeComments(),Profiles.getId());
	                                                                
	                                                                String sqlUpdate1 = "UPDATE Profiles set Keynote=? where Id=?";
	                                                                jdbcTemplate.update(sqlUpdate1,Profiles.getKeynote(),Profiles.getId());
	                                                                
	                                                                String sqlUpdate2 = "UPDATE Profiles set Model=? where Id=?";
	                                                                jdbcTemplate.update(sqlUpdate2,Profiles.getModel(),Profiles.getId());
	                                                                
	                                                                String sqlUpdate3 = "UPDATE Profiles set Manufacturer=? where Id=?";
	                                                                jdbcTemplate.update(sqlUpdate3,Profiles.getManufacturer(),Profiles.getId());
	                                                                
	                                                                String sqlUpdate4 = "UPDATE Profiles set URL=? where Id=?";
	                                                                jdbcTemplate.update(sqlUpdate4,Profiles.getURL(),Profiles.getId());
	                                                                
	                                                                String sqlUpdate5 = "UPDATE Profiles set Description=? where Id=?";
	                                                                jdbcTemplate.update(sqlUpdate5,Profiles.getDescription(),Profiles.getId());	
	                                                                
	                                                    
	                                                                String sqlUpdate6 = "UPDATE Profiles set AssemblyCode=? where Id=?";
	                                                                jdbcTemplate.update(sqlUpdate6,Profiles.getAssemblyCode(),Profiles.getId());	
	                                                                
	                                                    
	                                                                String sqlUpdate7 = "UPDATE Profiles set TypeMark=? where Id=?";
	                                                                jdbcTemplate.update(sqlUpdate7,Profiles.getTypeMark(),Profiles.getId());	
	                                                                
	                                                    
	                                                                String sqlUpdate8 = "UPDATE Profiles set Cost=? where Id=?";
	                                                                jdbcTemplate.update(sqlUpdate8,Profiles.getCost(),Profiles.getId());	
	                                                    
	                                                                return "redirect:/";
	                                                            }



	                                                            @PostMapping("/admin/savePipeConnectionTypes")
	                                                            public String save40(Model model, PipeConnectionTypes pct) {
	                                                                    String sqlUpdate = "UPDATE PipeConnectionTypes set TypeComments=? where Id=?";
	                                                                    jdbcTemplate.update(sqlUpdate,pct.getTypeComments(),pct.getId());
	                                                                    
	                                                                    String sqlUpdate1 = "UPDATE PipeConnectionTypes set Keynote=? where Id=?";
	                                                                    jdbcTemplate.update(sqlUpdate1,pct.getKeynote(),pct.getId());
	                                                                    
	                                                                    String sqlUpdate2 = "UPDATE PipeConnectionTypes set Model=? where Id=?";
	                                                                    jdbcTemplate.update(sqlUpdate2,pct.getModel(),pct.getId());
	                                                                    
	                                                                    String sqlUpdate3 = "UPDATE PipeConnectionTypes set Manufacturer=? where Id=?";
	                                                                    jdbcTemplate.update(sqlUpdate3,pct.getManufacturer(),pct.getId());
	                                                                    
	                                                                    String sqlUpdate4 = "UPDATE PipeConnectionTypes set URL=? where Id=?";
	                                                                    jdbcTemplate.update(sqlUpdate4,pct.getURL(),pct.getId());
	                                                                    
	                                                                    String sqlUpdate5 = "UPDATE PipeConnectionTypes set Description=? where Id=?";
	                                                                    jdbcTemplate.update(sqlUpdate5,pct.getDescription(),pct.getId());	
	                                                                    
	                                                        
	                                                                    String sqlUpdate6 = "UPDATE PipeConnectionTypes set AssemblyCode=? where Id=?";
	                                                                    jdbcTemplate.update(sqlUpdate6,pct.getAssemblyCode(),pct.getId());	
	                                                                    
	                                                        
	                                                                    String sqlUpdate7 = "UPDATE PipeConnectionTypes set TypeMark=? where Id=?";
	                                                                    jdbcTemplate.update(sqlUpdate7,pct.getTypeMark(),pct.getId());	
	                                                                    
	                                                        
	                                                                    String sqlUpdate8 = "UPDATE PipeConnectionTypes set Cost=? where Id=?";
	                                                                    jdbcTemplate.update(sqlUpdate8,pct.getCost(),pct.getId());	
	                                                        
	                                                                    return "redirect:/";
	                                                                }



	                                                                @PostMapping("/admin/savePipeFittingTypes")
	                                                                public String save41(Model model, PipeFittingTypes pft) {
	                                                                        String sqlUpdate = "UPDATE PipeFittingTypes set TypeComments=? where Id=?";
	                                                                        jdbcTemplate.update(sqlUpdate,pft.getTypeComments(),pft.getId());
	                                                                        
	                                                                        String sqlUpdate1 = "UPDATE PipeFittingTypes set Keynote=? where Id=?";
	                                                                        jdbcTemplate.update(sqlUpdate1,pft.getKeynote(),pft.getId());
	                                                                        
	                                                                        String sqlUpdate2 = "UPDATE PipeFittingTypes set Model=? where Id=?";
	                                                                        jdbcTemplate.update(sqlUpdate2,pft.getModel(),pft.getId());
	                                                                        
	                                                                        String sqlUpdate3 = "UPDATE PipeFittingTypes set Manufacturer=? where Id=?";
	                                                                        jdbcTemplate.update(sqlUpdate3,pft.getManufacturer(),pft.getId());
	                                                                        
	                                                                        String sqlUpdate4 = "UPDATE PipeFittingTypes set URL=? where Id=?";
	                                                                        jdbcTemplate.update(sqlUpdate4,pft.getURL(),pft.getId());
	                                                                        
	                                                                        String sqlUpdate5 = "UPDATE PipeFittingTypes set Description=? where Id=?";
	                                                                        jdbcTemplate.update(sqlUpdate5,pft.getDescription(),pft.getId());	
	                                                                        
	                                                            
	                                                                        String sqlUpdate6 = "UPDATE PipeFittingTypes set AssemblyCode=? where Id=?";
	                                                                        jdbcTemplate.update(sqlUpdate6,pft.getAssemblyCode(),pft.getId());	
	                                                                        
	                                                            
	                                                                        String sqlUpdate7 = "UPDATE PipeFittingTypes set TypeMark=? where Id=?";
	                                                                        jdbcTemplate.update(sqlUpdate7,pft.getTypeMark(),pft.getId());	
	                                                                        
	                                                            
	                                                                        String sqlUpdate8 = "UPDATE PipeFittingTypes set Cost=? where Id=?";
	                                                                        jdbcTemplate.update(sqlUpdate8,pft.getCost(),pft.getId());	
	                                                            
	                                                                        return "redirect:/";
	                                                                    }



	                                                                    @PostMapping("/admin/saveDoorTypes")
	                                                                    public String save42(Model model, DoorTypes DoorTypes) {
	                                                                            String sqlUpdate = "UPDATE DoorTypes set TypeComments=? where Id=?";
	                                                                            jdbcTemplate.update(sqlUpdate,DoorTypes.getTypeComments(),DoorTypes.getId());
	                                                                            
	                                                                            String sqlUpdate1 = "UPDATE DoorTypes set Keynote=? where Id=?";
	                                                                            jdbcTemplate.update(sqlUpdate1,DoorTypes.getKeynote(),DoorTypes.getId());
	                                                                            
	                                                                            String sqlUpdate2 = "UPDATE DoorTypes set Model=? where Id=?";
	                                                                            jdbcTemplate.update(sqlUpdate2,DoorTypes.getModel(),DoorTypes.getId());
	                                                                            
	                                                                            String sqlUpdate3 = "UPDATE DoorTypes set Manufacturer=? where Id=?";
	                                                                            jdbcTemplate.update(sqlUpdate3,DoorTypes.getManufacturer(),DoorTypes.getId());
	                                                                            
	                                                                            String sqlUpdate4 = "UPDATE DoorTypes set URL=? where Id=?";
	                                                                            jdbcTemplate.update(sqlUpdate4,DoorTypes.getURL(),DoorTypes.getId());
	                                                                            
	                                                                            String sqlUpdate5 = "UPDATE DoorTypes set Description=? where Id=?";
	                                                                            jdbcTemplate.update(sqlUpdate5,DoorTypes.getDescription(),DoorTypes.getId());	
	                                                                            
	                                                                
	                                                                            String sqlUpdate6 = "UPDATE DoorTypes set AssemblyCode=? where Id=?";
	                                                                            jdbcTemplate.update(sqlUpdate6,DoorTypes.getAssemblyCode(),DoorTypes.getId());	
	                                                                            
	                                                                
	                                                                            String sqlUpdate7 = "UPDATE DoorTypes set TypeMark=? where Id=?";
	                                                                            jdbcTemplate.update(sqlUpdate7,DoorTypes.getTypeMark(),DoorTypes.getId());	
	                                                                            
	                                                                
	                                                                            String sqlUpdate8 = "UPDATE DoorTypes set Cost=? where Id=?";
	                                                                            jdbcTemplate.update(sqlUpdate8,DoorTypes.getCost(),DoorTypes.getId());	
	                                                                
	                                                                            return "redirect:/";
	                                                                        }



	                                                                        @PostMapping("/admin/saveDistributionSystemTypes")
	                                                                        public String save43(Model model, DistributionSystemTypes dst) {
	                                                                                String sqlUpdate = "UPDATE DistributionSystemTypes set TypeComments=? where Id=?";
	                                                                                jdbcTemplate.update(sqlUpdate,dst.getTypeComments(),dst.getId());
	                                                                                
	                                                                                String sqlUpdate1 = "UPDATE DistributionSystemTypes set Keynote=? where Id=?";
	                                                                                jdbcTemplate.update(sqlUpdate1,dst.getKeynote(),dst.getId());
	                                                                                
	                                                                                String sqlUpdate2 = "UPDATE DistributionSystemTypes set Model=? where Id=?";
	                                                                                jdbcTemplate.update(sqlUpdate2,dst.getModel(),dst.getId());
	                                                                                
	                                                                                String sqlUpdate3 = "UPDATE DistributionSystemTypes set Manufacturer=? where Id=?";
	                                                                                jdbcTemplate.update(sqlUpdate3,dst.getManufacturer(),dst.getId());
	                                                                                
	                                                                                String sqlUpdate4 = "UPDATE DistributionSystemTypes set URL=? where Id=?";
	                                                                                jdbcTemplate.update(sqlUpdate4,dst.getURL(),dst.getId());
	                                                                                
	                                                                                String sqlUpdate5 = "UPDATE DistributionSystemTypes set Description=? where Id=?";
	                                                                                jdbcTemplate.update(sqlUpdate5,dst.getDescription(),dst.getId());	
	                                                                                
	                                                                    
	                                                                                String sqlUpdate6 = "UPDATE DistributionSystemTypes set AssemblyCode=? where Id=?";
	                                                                                jdbcTemplate.update(sqlUpdate6,dst.getAssemblyCode(),dst.getId());	
	                                                                                
	                                                                    
	                                                                                String sqlUpdate7 = "UPDATE DistributionSystemTypes set TypeMark=? where Id=?";
	                                                                                jdbcTemplate.update(sqlUpdate7,dst.getTypeMark(),dst.getId());	
	                                                                                
	                                                                    
	                                                                                String sqlUpdate8 = "UPDATE DistributionSystemTypes set Cost=? where Id=?";
	                                                                                jdbcTemplate.update(sqlUpdate8,dst.getCost(),dst.getId());	
	                                                                    
	                                                                                return "redirect:/";
	                                                                            }



	                                                                            @PostMapping("/admin/saveCoverTypes")
	                                                                            public String save44(Model model, CoverTypes CoverTypes) {
	                                                                                    String sqlUpdate = "UPDATE CoverTypes set TypeComments=? where Id=?";
	                                                                                    jdbcTemplate.update(sqlUpdate,CoverTypes.getTypeComments(),CoverTypes.getId());
	                                                                                    
	                                                                                    String sqlUpdate1 = "UPDATE CoverTypes set Keynote=? where Id=?";
	                                                                                    jdbcTemplate.update(sqlUpdate1,CoverTypes.getKeynote(),CoverTypes.getId());
	                                                                                    
	                                                                                    String sqlUpdate2 = "UPDATE CoverTypes set Model=? where Id=?";
	                                                                                    jdbcTemplate.update(sqlUpdate2,CoverTypes.getModel(),CoverTypes.getId());
	                                                                                    
	                                                                                    String sqlUpdate3 = "UPDATE CoverTypes set Manufacturer=? where Id=?";
	                                                                                    jdbcTemplate.update(sqlUpdate3,CoverTypes.getManufacturer(),CoverTypes.getId());
	                                                                                    
	                                                                                    String sqlUpdate4 = "UPDATE CoverTypes set URL=? where Id=?";
	                                                                                    jdbcTemplate.update(sqlUpdate4,CoverTypes.getURL(),CoverTypes.getId());
	                                                                                    
	                                                                                    String sqlUpdate5 = "UPDATE CoverTypes set Description=? where Id=?";
	                                                                                    jdbcTemplate.update(sqlUpdate5,CoverTypes.getDescription(),CoverTypes.getId());	
	                                                                                    
	                                                                        
	                                                                                    String sqlUpdate6 = "UPDATE CoverTypes set AssemblyCode=? where Id=?";
	                                                                                    jdbcTemplate.update(sqlUpdate6,CoverTypes.getAssemblyCode(),CoverTypes.getId());	
	                                                                                    
	                                                                        
	                                                                                    String sqlUpdate7 = "UPDATE CoverTypes set TypeMark=? where Id=?";
	                                                                                    jdbcTemplate.update(sqlUpdate7,CoverTypes.getTypeMark(),CoverTypes.getId());	
	                                                                                    
	                                                                        
	                                                                                    String sqlUpdate8 = "UPDATE CoverTypes set Cost=? where Id=?";
	                                                                                    jdbcTemplate.update(sqlUpdate8,CoverTypes.getCost(),CoverTypes.getId());	

	                                                                                    String sqlUpdate9 = "UPDATE CoverTypes set Name=? where Id=?";
	                                                                                    jdbcTemplate.update(sqlUpdate9,CoverTypes.getName(),CoverTypes.getId());
	                                                                        
	                                                                                    return "redirect:/";
	                                                                                }

	                                                                                @PostMapping("/admin/saveCurtainSystemTypes")
	                                                                                public String save45(Model model, CurtainSystemTypes cst) {
	                                                                                        String sqlUpdate = "UPDATE CurtainSystemTypes set TypeComments=? where Id=?";
	                                                                                        jdbcTemplate.update(sqlUpdate,cst.getTypeComments(),cst.getId());
	                                                                                        
	                                                                                        String sqlUpdate1 = "UPDATE CurtainSystemTypes set Keynote=? where Id=?";
	                                                                                        jdbcTemplate.update(sqlUpdate1,cst.getKeynote(),cst.getId());
	                                                                                        
	                                                                                        String sqlUpdate2 = "UPDATE CurtainSystemTypes set Model=? where Id=?";
	                                                                                        jdbcTemplate.update(sqlUpdate2,cst.getModel(),cst.getId());
	                                                                                        
	                                                                                        String sqlUpdate3 = "UPDATE CurtainSystemTypes set Manufacturer=? where Id=?";
	                                                                                        jdbcTemplate.update(sqlUpdate3,cst.getManufacturer(),cst.getId());
	                                                                                        
	                                                                                        String sqlUpdate4 = "UPDATE CurtainSystemTypes set URL=? where Id=?";
	                                                                                        jdbcTemplate.update(sqlUpdate4,cst.getURL(),cst.getId());
	                                                                                        
	                                                                                        String sqlUpdate5 = "UPDATE CurtainSystemTypes set Description=? where Id=?";
	                                                                                        jdbcTemplate.update(sqlUpdate5,cst.getDescription(),cst.getId());	
	                                                                                        
	                                                                            
	                                                                                        String sqlUpdate6 = "UPDATE CurtainSystemTypes set AssemblyCode=? where Id=?";
	                                                                                        jdbcTemplate.update(sqlUpdate6,cst.getAssemblyCode(),cst.getId());	
	                                                                                        
	                                                                            
	                                                                                        String sqlUpdate7 = "UPDATE CurtainSystemTypes set TypeMark=? where Id=?";
	                                                                                        jdbcTemplate.update(sqlUpdate7,cst.getTypeMark(),cst.getId());	
	                                                                                        
	                                                                            
	                                                                                        String sqlUpdate8 = "UPDATE CurtainSystemTypes set Cost=? where Id=?";
	                                                                                        jdbcTemplate.update(sqlUpdate8,cst.getCost(),cst.getId());	
	                                                                            
	                                                                                        return "redirect:/";
	                                                                                    }

	                                                                                    @PostMapping("/admin/saveGutterTypes")
	                                                                                    public String save46(Model model, GutterTypes GutterTypes) {
	                                                                                            String sqlUpdate = "UPDATE GutterTypes set TypeComments=? where Id=?";
	                                                                                            jdbcTemplate.update(sqlUpdate,GutterTypes.getTypeComments(),GutterTypes.getId());
	                                                                                            
	                                                                                            String sqlUpdate1 = "UPDATE GutterTypes set Keynote=? where Id=?";
	                                                                                            jdbcTemplate.update(sqlUpdate1,GutterTypes.getKeynote(),GutterTypes.getId());
	                                                                                            
	                                                                                            String sqlUpdate2 = "UPDATE GutterTypes set Model=? where Id=?";
	                                                                                            jdbcTemplate.update(sqlUpdate2,GutterTypes.getModel(),GutterTypes.getId());
	                                                                                            
	                                                                                            String sqlUpdate3 = "UPDATE GutterTypes set Manufacturer=? where Id=?";
	                                                                                            jdbcTemplate.update(sqlUpdate3,GutterTypes.getManufacturer(),GutterTypes.getId());
	                                                                                            
	                                                                                            String sqlUpdate4 = "UPDATE GutterTypes set URL=? where Id=?";
	                                                                                            jdbcTemplate.update(sqlUpdate4,GutterTypes.getURL(),GutterTypes.getId());
	                                                                                            
	                                                                                            String sqlUpdate5 = "UPDATE GutterTypes set Description=? where Id=?";
	                                                                                            jdbcTemplate.update(sqlUpdate5,GutterTypes.getDescription(),GutterTypes.getId());	
	                                                                                            
	                                                                                
	                                                                                            String sqlUpdate6 = "UPDATE GutterTypes set AssemblyCode=? where Id=?";
	                                                                                            jdbcTemplate.update(sqlUpdate6,GutterTypes.getAssemblyCode(),GutterTypes.getId());	
	                                                                                            
	                                                                                
	                                                                                            String sqlUpdate7 = "UPDATE GutterTypes set TypeMark=? where Id=?";
	                                                                                            jdbcTemplate.update(sqlUpdate7,GutterTypes.getTypeMark(),GutterTypes.getId());	
	                                                                                            
	                                                                                
	                                                                                            String sqlUpdate8 = "UPDATE GutterTypes set Cost=? where Id=?";
	                                                                                            jdbcTemplate.update(sqlUpdate8,GutterTypes.getCost(),GutterTypes.getId());	
	                                                                                
	                                                                                            return "redirect:/";
	                                                                                        }



	                                                                                        @PostMapping("/admin/saveFasciaTypes")
	                                                                                        public String save47(Model model, FasciaTypes FasciaTypes) {
	                                                                                                String sqlUpdate = "UPDATE FasciaTypes set TypeComments=? where Id=?";
	                                                                                                jdbcTemplate.update(sqlUpdate,FasciaTypes.getTypeComments(),FasciaTypes.getId());
	                                                                                                
	                                                                                                String sqlUpdate1 = "UPDATE FasciaTypes set Keynote=? where Id=?";
	                                                                                                jdbcTemplate.update(sqlUpdate1,FasciaTypes.getKeynote(),FasciaTypes.getId());
	                                                                                                
	                                                                                                String sqlUpdate2 = "UPDATE FasciaTypes set Model=? where Id=?";
	                                                                                                jdbcTemplate.update(sqlUpdate2,FasciaTypes.getModel(),FasciaTypes.getId());
	                                                                                                
	                                                                                                String sqlUpdate3 = "UPDATE FasciaTypes set Manufacturer=? where Id=?";
	                                                                                                jdbcTemplate.update(sqlUpdate3,FasciaTypes.getManufacturer(),FasciaTypes.getId());
	                                                                                                
	                                                                                                String sqlUpdate4 = "UPDATE FasciaTypes set URL=? where Id=?";
	                                                                                                jdbcTemplate.update(sqlUpdate4,FasciaTypes.getURL(),FasciaTypes.getId());
	                                                                                                
	                                                                                                String sqlUpdate5 = "UPDATE FasciaTypes set Description=? where Id=?";
	                                                                                                jdbcTemplate.update(sqlUpdate5,FasciaTypes.getDescription(),FasciaTypes.getId());	
	                                                                                                
	                                                                                    
	                                                                                                String sqlUpdate6 = "UPDATE FasciaTypes set AssemblyCode=? where Id=?";
	                                                                                                jdbcTemplate.update(sqlUpdate6,FasciaTypes.getAssemblyCode(),FasciaTypes.getId());	
	                                                                                                
	                                                                                    
	                                                                                                String sqlUpdate7 = "UPDATE FasciaTypes set TypeMark=? where Id=?";
	                                                                                                jdbcTemplate.update(sqlUpdate7,FasciaTypes.getTypeMark(),FasciaTypes.getId());	
	                                                                                                
	                                                                                    
	                                                                                                String sqlUpdate8 = "UPDATE FasciaTypes set Cost=? where Id=?";
	                                                                                                jdbcTemplate.update(sqlUpdate8,FasciaTypes.getCost(),FasciaTypes.getId());	
	                                                                                    
	                                                                                                return "redirect:/";
	                                                                                            }



	                                                                                            @PostMapping("/admin/saveRampTypes")
	                                                                                            public String save48(Model model, RampTypes RampTypes) {
	                                                                                                    String sqlUpdate = "UPDATE RampTypes set TypeComments=? where Id=?";
	                                                                                                    jdbcTemplate.update(sqlUpdate,RampTypes.getTypeComments(),RampTypes.getId());
	                                                                                                    
	                                                                                                    String sqlUpdate1 = "UPDATE RampTypes set Keynote=? where Id=?";
	                                                                                                    jdbcTemplate.update(sqlUpdate1,RampTypes.getKeynote(),RampTypes.getId());
	                                                                                                    
	                                                                                                    String sqlUpdate2 = "UPDATE RampTypes set Model=? where Id=?";
	                                                                                                    jdbcTemplate.update(sqlUpdate2,RampTypes.getModel(),RampTypes.getId());
	                                                                                                    
	                                                                                                    String sqlUpdate3 = "UPDATE RampTypes set Manufacturer=? where Id=?";
	                                                                                                    jdbcTemplate.update(sqlUpdate3,RampTypes.getManufacturer(),RampTypes.getId());
	                                                                                                    
	                                                                                                    String sqlUpdate4 = "UPDATE RampTypes set URL=? where Id=?";
	                                                                                                    jdbcTemplate.update(sqlUpdate4,RampTypes.getURL(),RampTypes.getId());
	                                                                                                    
	                                                                                                    String sqlUpdate5 = "UPDATE RampTypes set Description=? where Id=?";
	                                                                                                    jdbcTemplate.update(sqlUpdate5,RampTypes.getDescription(),RampTypes.getId());	
	                                                                                                    
	                                                                                        
	                                                                                                    String sqlUpdate6 = "UPDATE RampTypes set AssemblyCode=? where Id=?";
	                                                                                                    jdbcTemplate.update(sqlUpdate6,RampTypes.getAssemblyCode(),RampTypes.getId());	
	                                                                                                    
	                                                                                        
	                                                                                                    String sqlUpdate7 = "UPDATE RampTypes set TypeMark=? where Id=?";
	                                                                                                    jdbcTemplate.update(sqlUpdate7,RampTypes.getTypeMark(),RampTypes.getId());	
	                                                                                                    
	                                                                                        
	                                                                                                    String sqlUpdate8 = "UPDATE RampTypes set Cost=? where Id=?";
	                                                                                                    jdbcTemplate.update(sqlUpdate8,RampTypes.getCost(),RampTypes.getId());	
	                                                                                        
	                                                                                                    return "redirect:/";
	                                                                                                }








	        














	    




















	                        








	        








	    




	    












	    













	    





		




		



	  
		
		
		
    
	

}
