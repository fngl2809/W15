package package1.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(
                new FileReader("README.md")
            );
            while (true){
                String line = reader.readLine();
                if (line == null){
                    break;
                }
                
            }
        }catch (Throwable throwable){
            System.out.println("error membaca file "+throwable.getMessage());
        }finally{
            if(reader != null){
                try{
                    reader.close();
                    System.out.println("sulses menutup");
                }catch (IOException exception){
                    System.out.println("error menutup resource"+exception.getMessage());
                }
            }
        }
    }
    
}
