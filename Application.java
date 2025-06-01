public class Application{
    public static void main(String[] args){
        sayHello();
        System.out.println(get());
    }

    public static void sayHello(){
        System.out.println("Hello!");
    }

    public static int get(){
        return 5;
    }
    // some comment 

    public static void experimentalMethod(){
        System.out.println("This is an experimental method.");
    }
}