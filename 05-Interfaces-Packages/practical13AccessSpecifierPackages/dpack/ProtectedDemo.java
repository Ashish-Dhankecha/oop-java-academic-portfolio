package dpack;
import bpack.B;
import cpack.C;
public class ProtectedDemo {
    public static void main(String[] args) {
            B objb = new B(50,51,52);
            C objc = new C();
            objb.display();
            objc.display();
    }
}
