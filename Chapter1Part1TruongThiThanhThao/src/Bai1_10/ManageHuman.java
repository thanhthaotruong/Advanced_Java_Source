package Bai1_10;

public class ManageHuman {
	Student[] st;
	Teacher[] teacher;
	public ManageHuman(Student[] st, Teacher[] teacher) {
		this.st = st;
		this.teacher = teacher;
	}
	public ManageHuman() {
	}
	public Student[] getSt() {
		return st;
	}
	public void setSt(Student[] st) {
		this.st = st;
	}
	public Teacher[] getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher[] teacher) {
		this.teacher = teacher;
	}
	
	public void outputStudent(){
        for (int i = 0; i < st.length; i++) {
            if(st[i]!=null)
                System.out.println(st[i].printInformation());
        }
    }
	public void outputTeacher(){
        for (int i = 0; i < teacher.length; i++) {
            if(teacher[i]!=null)
                System.out.println(teacher[i].printInformation());
        }
    }
	
}
