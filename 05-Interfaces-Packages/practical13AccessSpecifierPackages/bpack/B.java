package bpack;
import apack.A;
public class B extends A {
    public B(int pub,int prot,int priv){
        super(pub,prot,priv);
    }
    public void display(){
        System.out.println("Publick variable of A:"+pubVar);
        System.out.println("Proteced variable of A:"+protVar);
//        System.out.println("Publick variable of A:"+privVar);
    }
}
