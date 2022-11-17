package com.putupiron.pufe.dto;

import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PTReserv {
	private Integer pt_no;
	private	Date	pt_date;
	private Integer	pt_time;
	private	String	trainer_email;
	private	String	trainer_name;
	private	String	user_email;
	private	String	user_name;
	private	String	request;
	
	public PTReserv(Date pt_date, Integer pt_time, String trainer_email, String user_email) {
		this.pt_date = pt_date;
		this.pt_time = pt_time;
		this.trainer_email = trainer_email;
		this.user_email = user_email;
	}
	public PTReserv(Date pt_date, Integer pt_time, String trainer_email) {
		this.pt_date = pt_date;
		this.pt_time = pt_time;
		this.trainer_email = trainer_email;
	}
}
