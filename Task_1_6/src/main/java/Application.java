import jdk.internal.org.objectweb.asm.Handle;
public class Application {

    public static void main(String[] args) {
      Test test = new Test();
      int result = test.hashCode();

        System.out.println(result);
    }
}
