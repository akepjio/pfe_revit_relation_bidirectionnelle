package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class ProjectInformation {
	private Integer Id;
	private String ProjectIssueDate;
	private String ProjectStatus;
	private String ClientName;
	private String ProjectAddress;
	private String ProjectName;
	private String ProjectNumber;
	private String NUMERO_MODULE;
}
