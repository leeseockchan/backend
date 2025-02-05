package a1202.filewrite;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite2 {
    public static void main(String[] args) throws IOException{
        FileOutputStream output = new FileOutputStream("c:/abc/out.txt");
        for(int i = 1; i< 11 ; i++){
            String data = i + " 번째 줄입니다. \r\n";
            output.write(data.getBytes());
        }
        output.close();
    }
}
// OutputStream은 InputStream 과 마찬가지로 byte 단위로 데이터 처리
// FileOutputStream 은 OutputStream 클래스를 상속 받아 역시 byte 단위로 데이터 처리
// FileOutputStream 은 byte 단위로 처리해야 하므로
// String -> byte 배열로 바꾸어 주는 getByte() 메소드 사용
// \r\n 은 줄바꿈 문자이다.
// 유닉스 \n만 있으면 되지만 윈도우에서는 \r\n 으로 작성해야
// 노트패드 같은 에디터에서도 줄바꿈이 제대로 표시된다.