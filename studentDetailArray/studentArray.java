package CoreJavaYouTube.studentDetailArray;

class Students{
    // instance variables
    int rollno;
    String name;
    int marks;
}
public class studentArray {
    public static void main(String args[]){
        Students s1 = new Students();// Creating object
        s1.rollno=1;   // Calling object
        s1.name="Rani";
        s1.marks=34;
        Students s2 = new Students();
        s2.rollno=2;
        s2.name="Sai";
        s2.marks=57;
        Students s3 = new Students();
        s3.rollno=3;
        s3.name="Manu";
        s3.marks=88;
        Students s4 = new Students();
        s4.rollno=4;
        s4.name="Raju";
        s4.marks=22;
        // In class creating students array
        Students students[] = new Students[4];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        students[3]=s4;
        System.out.println("SNo  Name  Marks");
       // for(int i=0;i<students.length;i++){
       //     System.out.println(students[i].rollno+"   "+students[i].name+"   "+students[i].marks);
       // }
       //Enhanced For Loop
       for(Students stud : students)System.out.println(stud.rollno+"   "+stud.name+"   "+stud.marks);
       // here stud variable storing the students[] array details
        // and loop iteration runs till the array elements printing.
    }
    
}
