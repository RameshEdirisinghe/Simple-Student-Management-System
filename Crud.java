

class Crud {
	public static void main(String args[]){
		StudentCollection studentc = new StudentCollection();
		new addStudent(studentc).setVisible(true);
		new searchStudent(studentc).setVisible(true);
		new updateStudent(studentc).setVisible(true);
		new deleteStudent(studentc).setVisible(true);
		new viewStudent(studentc).setVisible(true);
		
	}
}

class StudentCollection{
	public Student[] studentar;
	private String OderID;
	private int num=1;
	
	StudentCollection(){
		
	studentar = new Student[0];	
	}
	
	public String getOrderID(){

		OderID ="STD"+num++;
		return OderID;
		
	}
	public void addStudent(Student st){
		Student[] tempstudentar = new Student[studentar.length+1];
		
		for(int i=0; i<studentar.length;i++){
				tempstudentar[i]=studentar[i];
		}
		
		tempstudentar[studentar.length]=st;
		studentar=tempstudentar;
	}
	
	public int searchStudent(String odrID){
		
		System.out.println(studentar[0].getOderID()+""+studentar[0].getName()+""+studentar[0].getContactNum());
		for(int i=0;i<studentar.length;i++){
			if(odrID.equals(studentar[i].getOderID())){
				return i;
			}
		}
		return -1;
	}
	
	public void deleteStudent(int index){
		Student[] tempstudentar = new Student[studentar.length-1];
		
		for(int i=0;i<index;i++){
			tempstudentar[i] = studentar[i];
		}
		
		for(int i=index;i<tempstudentar.length;i++){
			tempstudentar[i] = studentar[i+1];
		}
		
		studentar=tempstudentar;
		
	}
	
}

class Student{
	private String OderID;
	private String Name;
	private String ContactNum;
	private int age;
	
	
	
	public void setValues(String OderID,String Name,String ContactNum,int age){
		this.OderID = OderID;
		this.Name=Name;
		this.ContactNum=ContactNum;
		this.age=age;
	}
	public void setOderID(String OderID){
		this.OderID = OderID;
	}
	public void setName(String Name){
		this.Name = Name;
	}
	public void setContactNum(String ContactNum){
		this.ContactNum = ContactNum;
	}
	public void setage(int age){
		this.age = age;
	}
	
	public String getOderID(){
		return OderID;
	}
	public String getName(){
		return Name;
	}
	public String getContactNum(){
		return ContactNum;
	}
	public int getage(){
		return age;
	}

}
