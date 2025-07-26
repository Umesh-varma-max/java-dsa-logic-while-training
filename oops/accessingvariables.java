class first{
    int a=10;
    first(){
        System.out.println("first class");
    }
}
class second extends first{
    int a=15;
    second(){
        System.out.println("second class");

    }
    void display(){
        System.out.println(a);
        System.out.println(super.a);
        System.out.println(a*super.a);
    }
}


public class accessingvariables {
    public static void main(String[] args) {
        second ob =new second();
        ob.display();
    }
    
}
