package Module;


//import org.hibernate.annotations.Entity;
//import org.hibernate.annotations.Table;


import javax.persistence.*;

@Entity
@Table(name = "Stud")
public class Student {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)  //To be asked
    private int stdID;
    @Column(name = "Name")
    private String stdName;
    @Column(name = "Contact No.")
    private String stdNumber;
    @Column(name = "Email")
    private String email;

    public Student() {
    }

    public Student(int stdID, String stdName, String stdNumber, String email) {
        this.stdID = stdID;
        this.stdName = stdName;
        this.stdNumber = stdNumber;
        this.email = email;
    }

    public int getStdID() {
        return stdID;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdNumber() {
        return stdNumber;
    }

    public void setStdNumber(String stdNumber) {
        this.stdNumber = stdNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdID=" + stdID +
                ", stdName='" + stdName + '\'' +
                ", stdNumber='" + stdNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
