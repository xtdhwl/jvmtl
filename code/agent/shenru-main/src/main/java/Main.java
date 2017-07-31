/**
 * Created by xtdhwl on 7/30/17.
 */
public class Main {

    public static void main(String[] args){
        System.out.println("main run");
        System.out.println(Main.class.getClassLoader().getResource(".").getPath());

    }
}
