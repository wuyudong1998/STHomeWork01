public class SMTest {
	public static void main(String[] args) {
		StudentManger StudentManger = new StudentManger();
        StudentManger.addStu(1,"����","19980805",true);
        StudentManger.findStu("����");
        StudentManger.changeStu("����");
        StudentManger.findAll();
        StudentManger.withdraw();
    }


}
