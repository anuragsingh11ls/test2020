package comprableTest;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class ComperatorTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
                Employee e1=new Employee();
        e1.setEid(1);
        e1.setFname("anurag");
        e1.setlName("singh");
        Employee e2=new Employee();
        e2.setEid(2);
        e2.setFname("nikhil");
        e2.setlName("sdvora");
        List l=new ArrayList<Employee>();
        l.add(e1);
        l.add(e2);
        Collections.sort(l,new FirstName());
        for (Object object : l) {
            Employee emp=(Employee)object;
            System.out.println(emp.getEid()+"\t" + emp.getFname()+ "\t" + emp.getlName());
        }
        System.out.println((Employee)l.get(0));
        System.out.println(l.get(1));


        Employee e[]=new Employee[4];
        e[0]=new Employee();
        e[0].setEid(1);
        e[0].setFname("anurag");
        e[0].setlName("singh");
        e[1]=new Employee();
        e[1].setEid(2);
        e[1].setFname("shailesh");
        e[1].setlName("payasi");
        e[2]=new Employee();
        e[2].setEid(3);
        e[2].setFname("nikhil");
        e[2].setlName("vora");
        e[3]=new Employee();
        e[3].setEid(4);
        e[3].setFname("ratchit");
        e[3].setlName("sony");
        Arrays.sort(e,new EidShort());
        for(int i=0; i < e.length; i++){
            System.out.println( e[i].getEid() + "\t" + e[i].getFname()+ "\t" + e[i].getlName());
        }
        System.out.println("==============================================");
        Arrays.sort(e,new FirstName());
        for(int i=0; i < e.length; i++){
            System.out.println( e[i].getEid() + "\t" + e[i].getFname()+ "\t" + e[i].getlName());
        }
    }
}
class EidShort implements Comparator<Employee>{
    //@Override
    public int compare(Employee o1, Employee o2) {
        Employee e1=(Employee)o1;
       Employee e2=(Employee)o2;
        return e1.getEid()-e2.getEid();
    }
}
class FirstName implements Comparator<Employee>{
    //@Override
    public int compare(Employee o1, Employee o2) {
        Employee e1=(Employee)o1;
        Employee e2=(Employee)o2;
        return e1.getFname().compareTo(e2.getFname());
    }
}
class LastName implements Comparator<Employee>{
    //@Override
    public int compare(Employee o1, Employee o2) {
        Employee e1=(Employee)o1;
        Employee e2=(Employee)o2;
        return e1.getlName().compareTo(e2.getlName());
    }
}
class Employee{
    private int eid;
    private String Fname;
    private String lName;

    public int getEid() {
        return eid;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }
    public String getFname() {
        return Fname;
    }
    public void setFname(String fname) {
        Fname = fname;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }

}