public class Parameter {
    int id;
    String name;
    Parameter(int i,String n){
        id = i;
        name = n;
    }

    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String [] args){

        Parameter s1 = new   Parameter(111,"Karan");
        Parameter s2 = new  Parameter(222,"Aryan");

        s1.display();
        s2.display();
    }
}
