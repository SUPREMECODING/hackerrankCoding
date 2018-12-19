import java.util.*;
class Student{
    String name;
    double CGPA;
    int id;
    Student(Student s){
        name = s.name;
        CGPA = s.CGPA;
        id = s.id;
    }
    Student(String n, double c, int i){
        name = n;
        CGPA = c;
        id = i;
    }
    public String getName() {
        return name;
    }
}
class StuDescend implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return (s1.CGPA == s2.CGPA)?0:(s1.CGPA > s2.CGPA)?-1:1;
    }
}
class Priorities{
    public ArrayList<Student> SortOnCGPA(ArrayList<Student> stu){        
        Student sorStu[] =new Student[stu.size()];
        Iterator it = stu.iterator();
        int i = 0;
        while(it.hasNext()){
            sorStu[i] = new Student((Student)it.next());
            i++;
        }
        Arrays.sort(sorStu, new StuDescend());
        stu = new ArrayList(Arrays.asList(sorStu));
        return stu;
    }
    public Student findMaxPriority(ArrayList<Student> stu){
        Iterator it = stu.iterator();
        Student temp1,highStu = null;
        double tempCGPA = 0.0;
        while(it.hasNext()){
            temp1 = (Student)it.next();
            if(tempCGPA < temp1.CGPA){
                highStu = temp1;
                tempCGPA = temp1.CGPA;
            }
            else if(tempCGPA == temp1.CGPA){
                int k = temp1.name.compareTo(highStu.name);
                if (k < 0)
                    highStu = temp1;
                else if( k == 0)
                    if(highStu.id > temp1.id)
                        highStu = temp1;
            }
        }
        return highStu;
    }
    
    public List<Student> getStudents(List<String> events){
        ArrayList<Student> stu = new ArrayList<Student>();
        String temp[],str;
        Iterator it = events.iterator();
        
        while(it.hasNext()){            
            str = (String)it.next();
            temp = str.split(" ");
            if(temp[0].equals("SERVED"))
            for(int i = 0 ; i< temp.length; i++){                
                    Student rmClStu;
                    rmClStu = findMaxPriority(stu);                    
                    stu.remove(rmClStu);            
            }
            else{                
                Student clStu = new Student(temp[1],Double.parseDouble(temp[2]),Integer.parseInt(temp[3]));                    
                stu.add(clStu);
            }            
        }
        stu = SortOnCGPA(stu);
        return stu;
    }
}

class JavaPQ{
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}