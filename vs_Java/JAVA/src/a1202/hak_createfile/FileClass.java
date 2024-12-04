package a1202.hak_createfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileClass {
    private File file;
    private String dir;
    private String flieName;

    public FileClass(String dir, String flieName) {
        file = new File("c:\\" + dir + "\\" + flieName + ".txt");
        this.dir = "c:\\"+dir;
        this.flieName = flieName + ".txt";
        // 디렉토리 경로와 파일 이름을 받아서 파일 객체를 초기화 한다.
        // 디렉토리가 없는 경우 디렉토리도 생성한다.
        // file = c:\\student\\student_Grade.txt
        // dir = c:\\student
        // fileName = student_Grade.txt
    }   

    public FileClass() {
        file = new File("c:\\");
        // 기본 생성자로 게본 디렉토리 c:\\ 로 설정
    }

    private boolean check(File file){
        if(file.exists()){  // 파일이 존재한다면
            return true;
        }
        return false;
    }
    public void create() throws Exception{
        boolean exist = check(file);
        if(exist){
            file.delete();  // 파일이 있으면 파일을 지움
            file.createNewFile();   // 새로운 파일 생성
        }else{
            file = new File(dir);   // c:\\dir
            file.mkdir();   // 디렉토리 생성
            file = new File(dir+"\\"+flieName); // c:\\student\\student_Grade.txt
            file.createNewFile();   // 새로운 파일을 생성
        }
    }
    public void write(String str) throws Exception{
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(str);
        fw.close();
    }

    public void read() throws Exception {
        boolean exist = check(file);
        if(exist){
            FileReader fr = new FileReader(file);
            BufferedReader bw = new BufferedReader(fr);
            String str;
            while ((str = bw.readLine()) != null) {
                System.err.println(str);
            }
            bw.close();
        }else{
            System.out.println("읽을 파일이 존재 하지 않습니다.");
        }
    }
}
