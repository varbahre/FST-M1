package activities;

abstract class Book{
    String title;
    abstract void setTitle(String v);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{
public void setTitle(String v){
    title=v;
}
}
public class Activity5 {
    public static void main(String[] args) {
        String title="Racer Car";
        MyBook math=new MyBook();
        math.setTitle(title);
        System.out.println("This title is :"+math.getTitle());



    }
}
