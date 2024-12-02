package a1202.file1;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
        try{
            File file = new File("newfile.txt");
            if(file.createNewFile()){
                System.out.println("파일 생성 : "+ file.getName());
            }else{
                System.out.println("파일 이미 존재");
            }
        }catch(IOException e){
            System.out.println("예외발생 : "+ e.getMessage());
        }
    }
}
