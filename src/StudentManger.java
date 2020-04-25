import java.util.ArrayList;
import java.util.Scanner;
public class StudentManger {
	static Scanner scanner = new Scanner(System.in);
    static ArrayList<Student> arrayList = new ArrayList<>();
    
    public static void addStu(int ID,String name,String birDate,boolean gender)
    {

        Student student = new Student();
        student.setBirDate(birDate);
        student.setID(ID);
        student.setName(name);
        student.setGender(gender);
        System.out.println("��ɲ�����");
        arrayList.add(student);

    }

    public static void findStu(String name1)
    {

        boolean isFind = false;

        for (Student student1 : arrayList)
        {
            if (student1.getName().equals(name1) )
            {
                isFind =true;
                System.out.println("ѧ�ţ�" + student1.getID()  + "������" + student1.getName() + "�������ڣ�"+student1.getBirDate()+"�Ա�"+(student1.isGender()?"��":"Ů"));
            }
        }
        if (!isFind){
            System.out.println("�޴���");
        }
        System.out.println("��ɲ�����");
        
    }

    public static void delStu(String name2)
    {
        boolean isFindremove = false;

        for (int i = 0; i <arrayList.size();i++)
        {
            Student student1 = arrayList.get(i);
            if (student1.getName().equals(name2) )
            {
                isFindremove =true;
                arrayList.remove(student1);
            }
        }
        if (!isFindremove){
            System.out.println("�޴���");
        }
        System.out.println("��ɲ�����");
    }
    public static void changeStu(String name3){

        boolean isFindchange = false;
        for (int i = 0; i <arrayList.size();i++)
        {
            Student student1 = arrayList.get(i);
            if (student1.getName().equals(name3) )
            {
                isFindchange =true;
                System.out.println("�޸��˵ĳ�������");
                String birdh = scanner.nextLine();
                student1.setBirDate(birdh);
                System.out.println("�޸��˵��Ա�");
                boolean sex = scanner.nextLine().equals("��")?true:false;
                student1.setGender(sex);

            }
        }
        if (!isFindchange ){
            System.out.println("�޴���");
        }
        System.out.println("��ɲ�����");
    }
    public static void findAll()
{
    for (Student student1 : arrayList){
        System.out.println("ѧ�ţ�" + student1.getID()  + "������" + student1.getName() + "�������ڣ�"+student1.getBirDate()+"�Ա�"+(student1.isGender()?"��":"Ů"));
    }
    System.out.println("��ɲ�����");
}
public  static  void withdraw()
{
	System.out.println("��лʹ�ã������˳�");
    System.exit(0);
}
    public static void App()
    {
        boolean withdraw = true;
        while (withdraw)
        {
        	 System.out.println("�˴���Ϊ���޸�github�Ĵ������ã���������ʡ�Բ���������������");
            System.out.println("*****************************");
            System.out.println("*          1.����                    *");
            System.out.println("*          2.����                    *");
            System.out.println("*          3.ɾ��                    *");
            System.out.println("*          4.�޸�                    *");
            System.out.println("*          5.���                    *");
            System.out.println("*          6.�˳�                    *");
            System.out.println("*****************************");
            System.out.println("�������Ӧ�����ı�ţ�");
            String a = scanner.nextLine();
            switch (a){
                case "1":
                    int ID = arrayList.size()+1;
                    System.out.println("������");
                    String name = scanner.nextLine();
                    System.out.println("�������ڣ�");
                    String birDate = scanner.nextLine();
                    System.out.println("�Ա�");
                    boolean gender = (scanner.nextLine().equals("��"))?true:false;
                    addStu(ID,name,birDate,gender);
                    break;
                case "2":
                    System.out.println("��Ҫ���ҵ��˵�������");
                    String name1 = scanner.nextLine();
                    findStu(name1);
                    break;
                case "3":
                    System.out.println("��Ҫɾ�����˵�������");
                    String name2 = scanner.nextLine();
                    delStu(name2);
                    break;
                case "4":
                    System.out.println("��Ҫ�޸ĵ��˵�������");
                    String name3 = scanner.nextLine();
                    changeStu(name3);
                    break;
                case "5":
                    findAll();
                    break;
                case "6":
                    withdraw();
                    break;
            }
        }
    }
    public static void main(String[] args) {
                App();
               
    }
    

}
