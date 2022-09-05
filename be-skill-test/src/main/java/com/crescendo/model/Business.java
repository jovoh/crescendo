package com.crescendo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Business {
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	    private int id;
	    private String businessname;
	    private String address;
	    private String phone;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getBusinessname() {
			return businessname;
		}
		public void setBusinessname(String businessname) {
			this.businessname = businessname;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
	    
}
