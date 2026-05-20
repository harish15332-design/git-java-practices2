public class objects {
     int price = 10;
     int price1 = 20;

     String name = "";
     int age = 0;
     String skill = "";
     int number = 0;

    public static void main(String[] args) {
       
        objects obj = new objects();

        int a = obj.price;
        int b = obj.price1;

        System.out.println(a+b);

        obj.name ="Gojo";
        obj.age = 20;
        obj.skill = "no";
        obj.number = 1234567890;

        objects obj1 = new objects();

        obj1.name ="Harish";
        obj1.age = 21;
        obj1.skill = "Yes";
        obj1.number = 1234567890;

        System.out.println(obj.name + " "+ obj.age);

        System.out.println(obj1.name + " "+ obj1.age);

    }
}
