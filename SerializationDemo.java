import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int rno;
	String sname;
	public Student(int rno, String sname) {
		this.rno = rno;
		this.sname = sname;
	}
	public String toString() {
		return "Roll No : "+rno+"\nStudent Name : "+sname;
	}
}

public class SerializationDemo {

	public static void main(String[] args) throws Exception {
		Student s1=new Student(1, "Jigar");
		FileOutputStream fos=new FileOutputStream("ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		System.out.println("Object Writen Successfully");
		
		FileInputStream fis=new FileInputStream("ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s2=(Student) ois.readObject();
		ois.close();
		System.out.println(s2);
	}
}
