class MyEmployee{
    private int id;
    private String name;
    public void setId(int i){
        id=i;
    }
    public void setName(String n){
        name=n;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    MyEmployee(int i1,String n1){
        id=i1;
        name=n1;
    }
}
public class gsc {
    public static void main(String[] args) {
        MyEmployee x,y;
        x=new MyEmployee();
        x.setId(1);
        x.setName("Getter&Setter");
        System.out.println(x.getId());
        System.out.println(x.getName());
    }
}
//Merge Conflict
