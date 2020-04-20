package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo {

    public static void main(String []args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {


        //1.加载Class 对象



        try{
            //方法1: Class.forName()
            //注意此方法需要指明完整路径名
            Class class1 = Class.forName("reflection.Cat");


            //方法2: className.class

            Class class2 = Cat.class;

            //方法3: instance.getClass()

            Class class3 = new Cat("Jim",2).getClass();

            //

        }catch (ClassNotFoundException e){
            e.printStackTrace();

        }

        // 2.利用反射机制创建对象



        // 2.1.加载Class对象

        Class claz=Class.forName("reflection.Cat");

        // 2.2.获取构造方法

        Constructor[] conArray;
        Constructor con;

        // 2.2.1.获取公有构造方法
        System.out.println("==获取公有构造方法==");
        conArray = claz.getConstructors();
        for(Constructor c : conArray){
            System.out.println(c);
        }

        // 2.2.2.获取所有构造方法
        System.out.println("==获取所有构造方法==");
        conArray = claz.getDeclaredConstructors();
        for(Constructor c : conArray){
            System.out.println(c);
        }



        //2.2.3.获取公有,无参的构造方法
        // getConstructor() 需要参数类型

        System.out.println("==获取公有无参的构造方法==");
        con = claz.getConstructor(null);
        System.out.println(con);



        //2.2.通过获得的构造方法创建对象

        //使用 newInstance()调用构造方法
        System.out.println("==创建对象==");
        Object obj=con.newInstance();
        ((Cat)obj).display();




        //3.获取成员变量


        //3.1.获取对象
        Object cat = Class.forName("reflection.Cat").getConstructor().newInstance();

        //3.2.获取属性









    }
}


