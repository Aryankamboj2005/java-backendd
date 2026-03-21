package Aryan.com;

public class getNameAndRollNo {
    int rollno;
    String name;

    public getNameAndRollNo(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }
}
	int rollno;
	String name;
	// making getter and setter by right click then go to the source and then selecting the deseried option
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
 // generating constructor by right click then select source adn then select the deseried option
	public getNameAndRollNo(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
		
		
	}
}
