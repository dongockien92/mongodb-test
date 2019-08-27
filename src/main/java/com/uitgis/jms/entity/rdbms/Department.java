package com.uitgis.jms.entity.rdbms;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "T_DEPARTMENT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	/**
	 * Only using generator native for mysql
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;

	private String name;

	public Department(String name) {
		super();
		this.name = name;
	}

}
