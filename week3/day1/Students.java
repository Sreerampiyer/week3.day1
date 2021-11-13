package week3.day1;

public class Students {

	 public void getStudentInfo(int id) {
		 System.out.println(id);
	 }
	 
	 public void getStudentInfo(int id, char name) {
		 System.out.println(id  );
		 System.out.println(name);
	 }
	 
	 public void getStudentInfo(int id , String email) {
		 System.out.println(id );
		 System.out.println(email);
	 }
	 
	 public void getStudentInfo(int id, long phn) {
		 System.out.println(id);
		 System.out.println(phn);
	 }
	 
	public static void main(String[] args) {
		
		Students stu=new Students();
		stu.getStudentInfo(17);
		stu.getStudentInfo(11, "Sree");
		stu.getStudentInfo(7, 988998992);
		
		
	}

}
