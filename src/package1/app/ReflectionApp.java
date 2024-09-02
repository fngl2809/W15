package package1.app;

import package1.data.CreatUserRequest;
import package1.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreatUserRequest request = new CreatUserRequest();
        request.setUsername("null");
        request.setPassword("null");
        request.setAddress(null);
        ValidationUtil.ValidationReflection(request);
    }
}
