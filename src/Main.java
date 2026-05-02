import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        ExampleService service = new ExampleService();

        Method method = ExampleService.class.getMethod("printHello");
        Info info = method.getAnnotation(Info.class);

        System.out.println("Info: " + info.value());
        method.invoke(service);
    }
}
