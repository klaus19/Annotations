import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreateAnnotations {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

       @SuppressWarnings("unused")
        Cat mycat = new Cat("Stella");
        Dog dj = new Dog();

      if (mycat.getClass().isAnnotationPresent(VeryImportant.class)){
          System.out.println("This thing is very important");
      }else{
          System.out.println("This thing is not very important");
      }

      if (dj.getClass().isAnnotationPresent(VeryImportant.class)){
          System.out.println("This thing is very important");
      }else{
          System.out.println("This thing is not very important");
      }

      for(Method method :mycat.getClass().getDeclaredMethods()){
          method.invoke(mycat);
      }
    }

}
