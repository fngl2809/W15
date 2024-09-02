package package1.util;

import java.lang.reflect.Field;
import package1.annotation.*;
import package1.error.BlankException;

public class ValidationUtil {
    public static void ValidationReflection(Object object){
        Class<?> aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (Field Field : fields){
            Field.setAccessible(true);
            if(Field.getAnnotation(NotBlank.class)!= null){
                try {
                    String value = (String) Field.get(object);
                    if(value == null || value.isBlank()){
                        throw new BlankException ("field"+Field.getName()+"is Blank");
                    }   
                }catch(IllegalAccessException exception){
                    System.out.println("tidak bisa mengakses field"+Field.getName());
                }
            }
        }
    }
    
}
