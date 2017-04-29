/**
 * Created by valora on 2017/3/19.
 */

public class ClassTranslation {
    static class A {
        A () {
            System.out.println("class A!");
        }
    }
    static class B extends A {
        B () {
            System.out.println("class B!");
        }
    }
    
    static class C extends  B {
        C() {
            System.out.println("class C!");
        }
    }

    public static void main(String[] args) {
        C c = new C();
        B b = c;
    }
}
