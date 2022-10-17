package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee001")
public class Employee {
	
	@Id  //meaning the field is primary key
	@Column(name="eid")
	private int id;
	@Column(name="ename")
	private String name;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
}
