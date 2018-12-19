import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}
class StuSort implements Comparator<Student> {
    public int compare(Student s1, Student s2){
        if(s1.getCgpa() == s2.getCgpa()){
            if(s1.getFname().equals(s2.getFname())){
                return (s1.getId() > s2.getId())?1:-1;
            }
            else{
                return s1.getFname().compareTo(s2.getFname());
            }
        }
        else
            return (s2.getCgpa()>s1.getCgpa())?1:-1;        
    }
}
//Complete the code
public class JavaSort
{
    public static List<Student> sortStudentList(List<Student> studentList){
        Student stu[] = new Student[studentList.size()],str;
        
        Iterator it = studentList.iterator();
        for(int i = 0; i< stu.length;i++){
            str = (Student)it.next();
            stu[i] = new Student(str.getId(),str.getFname(),str.getCgpa());
        }
        Arrays.sort(stu, new StuSort());
        studentList.clear();
        for(Student s: stu){
            studentList.add(s);
        }
        return studentList;

    }
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        studentList = sortStudentList(studentList);
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



