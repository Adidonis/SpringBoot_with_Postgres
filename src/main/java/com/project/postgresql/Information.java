package com.project.postgresql;

import javax.persistence.*;

@Entity
@Table(name = "alien")
public class Information {
	private int id;
	private String fname;
	private String lname;
	
    public Information(int id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Column(name = "Fname")
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Column(name = "Lname")
    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Information() {
		
	}
    public static void add(Information information) {
    }
    
    @Override
	public String toString() {
		return "Course [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
    }
	
}

