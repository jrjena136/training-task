package com.sh.springbootapi.repository.entity;

import javax.persistence.*;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table( name= "sportsdetail")

public class Sports {
        @Id
		@GeneratedValue(strategy = GenerationType.AUTO)
	    private int sid;
        @Column(name = "sname")
	    private String sname;
        @Column(name = "score")
	    private double score;
        @Column(name = "type")
	    private String type;

	}

