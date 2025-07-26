class first{
    int a,b;
    first(int x,int y){
        System.out.println("first class");
        a=x;
        b=y;

    }
    void sum(){
        System.out.println(a+b);
    }
}

class second extends first{
    second(){
        super(10,20);
        System.out.println("second class");
    }
}

public class inheritance {
    public static void main(String[] args) {
        second ob=new second();
        ob.sum();
    }
}
