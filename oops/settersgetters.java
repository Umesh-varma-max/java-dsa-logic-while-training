class details{
    private String name;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }

}



public class settersgetters {
    public static void main(String[] args) {
        details s=new details();
        s.setName("Varma");
        System.out.println(s.getName());

    }
    
}
