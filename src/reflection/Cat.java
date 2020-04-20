package reflection;

public class Cat {


    private String name;
    private int age;

    private static int catNumber=0;

    public int cost;

    //

    public Cat(){
        age=0;
        name="NoName";
        cost=0;
        catNumber++;

    }

    public Cat(String name,int age){
        this.name=name;
        this.age=age;
        cost=100;
        catNumber++;
    }


    protected Cat(String name){
        this.name=name;
        age=0;
    }

    private Cat(int age){
        this.name=" ";
        age=age;
        cost=10000;
    }

    public String getName(){
        return name;

    }
    public int getAge(){
        return age;
    }



    public void display(){
        System.out.println("name : "+name+"\nage : "+age);
    }


}
