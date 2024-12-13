package a1213;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Brain implements Interface {

    static HashMap<String, String> Word = new HashMap<>();
    static final String FILE_NAME = "C:\\seokchan\\vs_Java\\JAVA\\src\\a1213\\a1213\\words2.txt";

    public Brain() {
        loadWordsFromFile();
    }

    private void loadWordsFromFile() {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(FILE_NAME), "UTF-8"))) {
            // charsetName == 한글로 변환 해준다.
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=");
                if (parts.length == 2) {
                    Word.put(parts[0], parts[1]);
                }
            }

        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류가 발생했습니다.");
        }
    }

    @Override
    public void Menu() {
        System.out.println("등록된 단어 수: \n" + Word.size());
        System.out.println("---- 선택 해주세요. ----");
        System.out.println("1. 단어 등록 ");
        System.out.println("2. 단어 조회 ");
        System.out.println("3. 단어 삭제 ");
        System.out.println("4. 테스트 ");
        System.out.println("5. 단어 목록보기 ");
        System.out.println("6. 종료 ");
        System.out.println("-----------------------");
    }

    @Override
    public void AddWord() { // 단어 등록
        String Eng = null;
        String Kor = null;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("등록할 영단어를 입력하세요 (목록으로 돌아가려면 Menu 입력 : )");
            Eng = scanner.nextLine();
            if (Eng.equalsIgnoreCase("menu")) {
                break;
            } else {

            }
            if (Word.containsKey(Eng) == true) { // Word라는 맵에 입력한 단어가 있으면
                System.out.println(" 이미 입력된 단어입니다. 수정을 원하시면 삭제 후 다시 입력해주세요.");
            } else {
                System.out.print(" 뜻(한글로)을 입력하세요 : ");
                Kor = scanner.nextLine();
            }
            try {
                Word.put(Eng, Kor); // key, value
                saveWordsToFile();
            } catch (Exception e) {
                System.out.println("다시 입력해 주세요");
                e.printStackTrace();
            } finally {
                System.out.println(" 입력되었습니다. ");
            }
        }
    }

    private void saveWordsToFile() {
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(FILE_NAME), StandardCharsets.UTF_8))) {
            for (Map.Entry<String, String> entry : Word.entrySet()) {
                writer.write(entry.getKey() + "=" + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("파일 저장중 오류가 났습니다.");
        }
    }

    @Override
    public void WordSearch() { // 단어 조회
        while (true) {
            System.out.println("");
            Scanner scanner = new Scanner(System.in);
            System.out.print("조회할 영단어를 입력하세요 (목록으로 돌아가려면 Menu 입력 : )");
            String Eng = scanner.nextLine();
            if (Eng.equalsIgnoreCase("menu")) {
                break;
            } else {
                if (Word.containsKey(Eng) == true) {
                    System.out.println(Word.get(Eng));
                } else {
                    System.out.println("등록되지 않은 단어 입니다.");

                }
            }
        }
    }

    @Override
    public void WordList() { // 단어 목록 보기
        System.out.println("====단어목록====");
            for (Map.Entry<String, String> entry : Word.entrySet()) {
                System.out.println("# " + entry.getKey() + " : " + entry.getValue());
            }
            System.out.println("=================");
            while (true) {
                System.out.println("목록으로 돌아가려면 menu 입력");
                Scanner scanner = new Scanner(System.in);
                String Menu = scanner.nextLine();
                if(Menu.equalsIgnoreCase("menu")){
                    break;
                }else{
                    System.out.println("오류");
                }
            }
    }

    @Override
    public void DeleteWord() { // 단어 삭제
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("====단어목록====");
            for (Map.Entry<String, String> entry : Word.entrySet()) {
                System.out.println("# " + entry.getKey() + " : " + entry.getValue());
            }
            System.out.println("=================");

            System.out.print("삭제 할 영단어를 입력하세요 (목록으로 돌아가려면 Menu 입력 : )");
            String EngDel = scanner.nextLine();
            if (EngDel.equalsIgnoreCase("menu")) {
                break;
            } else {
                if (Word.containsKey(EngDel) == true) {
                    System.out.println("입력한 영단어는 " + EngDel + "입니다.");
                    Word.remove(EngDel);
                    System.out.println("삭제 되었습니다.");
                    saveWordsToFile();

                } else {
                    System.out.println("등록되지 않은 단어 입니다.");

                }
            }
        }

    }

    @Override
    public void Test() {    // 단어 테스트
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. 시작하기");
            System.out.println("2. 종료하기");
            int a = scanner.nextInt();
            scanner.nextLine();
            if(a==1){
                int count = 0;
                int totalCount = 0;
                System.out.println("=== 뜻에 맞는 영단어를 입력하세요 ");
                for(Map.Entry<String, String>entry : Word.entrySet()){  // <get Key, getValue>
                    String ValueVar = entry.getValue(); // 한글만 불러옴
                    System.out.println(ValueVar);
                    String Answer = scanner.nextLine();
                    if(Answer.equals(entry.getKey())){  // 영어 단어. 입력한 영단어와 일치하면
                        count++;
                    }else{
                        System.out.println("틀렸습니다. (답 : "+entry.getKey()+")\n");
                    }
                    totalCount++;
                }
                System.out.println("결과 : "+count+"/"+totalCount+"\n");
            }else if(a==2){

            }else{
                System.out.println("1 또는 2 중에 골라주세요");
            }
        }
    }

    @Override
    public void Exit() {
       
    }

}
