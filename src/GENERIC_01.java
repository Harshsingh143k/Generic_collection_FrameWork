import com.sun.jdi.PathSearchingVirtualMachine;
import org.w3c.dom.html.HTMLObjectElement;

class test<T>{
    private static Object Abc;
    private static final Object T = Abc ;
    T obj;


    public test(T tobj) {
        obj=tobj;

    }

    public test() {
        
    }

    public void apple(){
    System.out.println("i m from "+T +" type data type");
        System.out.println(obj);
        System.out.println(" ");
        
}
}
public class GENERIC_01{


    public static void main(String[] args) {
        test <String>obj= new test<String>();
        test <Integer>obj1=new test<Integer>();
        obj.apple();


    }
}
