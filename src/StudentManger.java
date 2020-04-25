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
        System.out.println("完成操作！");
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
                System.out.println("学号：" + student1.getID()  + "姓名：" + student1.getName() + "出生日期："+student1.getBirDate()+"性别"+(student1.isGender()?"男":"女"));
            }
        }
        if (!isFind){
            System.out.println("无此人");
        }
        System.out.println("完成操作！");
        
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
            System.out.println("无此人");
        }
        System.out.println("完成操作！");
    }
    public static void changeStu(String name3){

        boolean isFindchange = false;
        for (int i = 0; i <arrayList.size();i++)
        {
            Student student1 = arrayList.get(i);
            if (student1.getName().equals(name3) )
            {
                isFindchange =true;
                System.out.println("修改人的出生日期");
                String birdh = scanner.nextLine();
                student1.setBirDate(birdh);
                System.out.println("修改人的性别");
                boolean sex = scanner.nextLine().equals("男")?true:false;
                student1.setGender(sex);

            }
        }
        if (!isFindchange ){
            System.out.println("无此人");
        }
        System.out.println("完成操作！");
    }
    public static void findAll()
{
    for (Student student1 : arrayList){
        System.out.println("学号：" + student1.getID()  + "姓名：" + student1.getName() + "出生日期："+student1.getBirDate()+"性别"+(student1.isGender()?"男":"女"));
    }
    System.out.println("完成操作！");
}
public  static  void withdraw()
{
	System.out.println("感谢使用！您已退出");
    System.exit(0);
}
    public static void App()
    {
        boolean withdraw = true;
        while (withdraw)
        {
        	 System.out.println("此处是为了修改github的代码所用！！！！请省略不看！！！！！！");
            System.out.println("*****************************");
            System.out.println("*          1.插入                    *");
            System.out.println("*          2.查找                    *");
            System.out.println("*          3.删除                    *");
            System.out.println("*          4.修改                    *");
            System.out.println("*          5.输出                    *");
            System.out.println("*          6.退出                    *");
            System.out.println("*****************************");
            System.out.println("请输入对应操作的编号：");
            String a = scanner.nextLine();
            switch (a){
                case "1":
                    int ID = arrayList.size()+1;
                    System.out.println("姓名：");
                    String name = scanner.nextLine();
                    System.out.println("出生日期：");
                    String birDate = scanner.nextLine();
                    System.out.println("性别：");
                    boolean gender = (scanner.nextLine().equals("男"))?true:false;
                    addStu(ID,name,birDate,gender);
                    break;
                case "2":
                    System.out.println("您要查找的人的姓名：");
                    String name1 = scanner.nextLine();
                    findStu(name1);
                    break;
                case "3":
                    System.out.println("您要删除的人的姓名：");
                    String name2 = scanner.nextLine();
                    delStu(name2);
                    break;
                case "4":
                    System.out.println("需要修改的人的姓名：");
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
