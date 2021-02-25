package com.postgres.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class City implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int population;

}
