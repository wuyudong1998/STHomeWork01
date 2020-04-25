public class SMTest {
	public static void main(String[] args) {
		StudentManger StudentManger = new StudentManger();
        StudentManger.addStu(1,"ÎâÓñ¶«","19980805",true);
        StudentManger.findStu("ÎâÓñ¶«");
        StudentManger.changeStu("ÎâÓñ¶«");
        StudentManger.findAll();
        StudentManger.withdraw();
    }


}
