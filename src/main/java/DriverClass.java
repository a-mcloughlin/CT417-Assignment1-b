
import org.joda.time.DateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aideen
 */
public class DriverClass {
    public DriverClass(){
        
    }
    
    public static void main(String[] args) {	
        
        // Create 10 students
        Student studenta = new Student("Douglas Villa", "1990-01-01", 12345678); 
        Student studentb = new Student("Jacky Gross", "1991-01-01", 13345678); 
        Student studentc = new Student("Rayan Matthews", "1992-01-01", 14345678); 
        Student studentd = new Student("Kevin Chapman", "1993-01-01", 15345678); 
        Student studente = new Student("Juliana Woodard", "1994-01-01", 16345678); 
        Student studentf = new Student("Adriana Waters", "1995-01-01", 17345678); 
        Student studentg = new Student("Conor Harrington", "1996-01-01", 18345678); 
        Student studenth = new Student("Eddie Chang", "1997-01-01", 19345678); 
        Student studenti = new Student("Zackery Hughes", "1998-01-01", 11345678); 
        Student studentj = new Student("Kathy Gonzalez", "1999-01-01", 12245678); 
        Student studentk = new Student("Maribel Galloway", "2000-01-01", 12445678); 
        
        // Create 5 modules
        Module maths = new Module(1, "Maths 210.2", "Danielle Young");
        Module english = new Module(2, "English 103", "Jordyn Paul");
        Module irish = new Module(3, "Irish 12345", "Bryanna Morris");
        Module history = new Module(4, "History 101", "Keyla Sosa");
        Module physics = new Module(5, "Physics 201", "Glenn Rodriguez");
        
        // Create 3 courses
        DateTime start = DateTime.parse("2020-09-01");
        DateTime end = DateTime.parse("2020-12-31");
        Course arts = new Course("Arts Course", start, end);
        Course science = new Course("Science Course", start, end);
        Course literature = new Course("Literature Course", start, end);
        
        // Add modules to courses
        arts.addModule(english);
        arts.addModule(irish);
        arts.addModule(history);
        
        science.addModule(maths);
        science.addModule(physics);
        science.addModule(irish);
       
        literature.addModule(english);
        literature.addModule(physics);
        literature.addModule(history);
        
        // Add students to courses
        arts.addStudent(studenta);
        arts.addStudent(studentb);
        arts.addStudent(studentc);
        arts.addStudent(studentd);
        science.addStudent(studente);
        science.addStudent(studentf);
        science.addStudent(studentg);
        science.addStudent(studenth);
        literature.addStudent(studenti);
        literature.addStudent(studentj);
        literature.addStudent(studentk);
        
        // Print course information
        arts.PrintCourseInfo();
        science.PrintCourseInfo();
        literature.PrintCourseInfo();
        
        
        //Print Module information
        maths.PrintModuleInfo();
        english.PrintModuleInfo();
        irish.PrintModuleInfo();
        history.PrintModuleInfo();
        physics.PrintModuleInfo();
        
        // Print Student Information
        studenta.PrintStudentInfo();
        studentb.PrintStudentInfo();
        studentc.PrintStudentInfo();
        studentd.PrintStudentInfo();
        studente.PrintStudentInfo();
        studentf.PrintStudentInfo();
        studentg.PrintStudentInfo();
        studenth.PrintStudentInfo();
        studenti.PrintStudentInfo();
        studentj.PrintStudentInfo();
        studentk.PrintStudentInfo();
    }
}
