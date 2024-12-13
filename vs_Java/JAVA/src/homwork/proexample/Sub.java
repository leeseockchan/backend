package homwork.proexample;

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

import a1213.Word;

public class Sub implements CustomerInter {
    static HashMap<String, String> product = new HashMap<>();
    static final String FILE_NAME = "C:\\seokchan\\vs_Java\\JAVA\\src\\homwork\\proexample\\product.txt";

    public Sub() {
        loadWordsFromFile();
    }

    private void loadWordsFromFile() {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(FILE_NAME), "UTF-8"))) {
            // charsetName == 한글로 변환 해준다.
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("-");
                if (parts.length == 2) {
                    product.put(parts[0], parts[1]);
                }
            }

        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류가 발생했습니다.");
        }
    }

    @Override
    public void Logo() {
        System.out.println(
                "#\t\t#" + "\t#\t" + "#######" +
                        "#\t\t#" + "\t#\t" + "   #   " +
                        "######" + "\t###" + "  # #  " +
                        "#\t\t#" + "\t#\t" + " #   # " +
                        "######" + "\t#\t" + "#     #\n");
    }

    @Override
    public void Menu() {
        System.out.println("등록된 상품 수: \n" + product.size());
        System.out.println("---- 선택 해주세요. ----");
        System.out.println("1. 상품 등록 ");
        System.out.println("2. 상품 조회 ");
        System.out.println("3. 상품 삭제 ");
        System.out.println("4. 상품 목록보기 ");
        System.out.println("5. 종료 ");
        System.out.println("-----------------------");

    }

    @Override
    public void AddProduct() { // 상품 등록
        String kind = null;
        String prod = null;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("등록할 상품 종류 입력하세요 (목록으로 돌아가려면 x 입력 : )");
            kind = scanner.nextLine();
            if (kind.equalsIgnoreCase("x")) {
                break;
            }
            if (product.containsKey(kind) == true) {
                System.out.println("이미 항목에 있습니다.");
            } else {
                System.out.print("상품명을 입력하세요 : ");
                prod = scanner.nextLine();
            }
            try {
                product.put(kind, prod);
                saveWordsToFile();

            } catch (Exception e) {
                System.out.println("재입력 해주세요");
                e.printStackTrace();
            } finally {
                System.out.println("입력 되었습니다.");
            }
        }
    }

    @Override
    public void DeleteProduct() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("====상품 목록====");
            for (Map.Entry<String, String> order : product.entrySet()) {
                System.out.println("# " + order.getKey() + " : " + order.getValue());
            }
            System.out.println("=================");

            System.out.print("삭제 할 상품명을 입력하세요 (목록으로 돌아가려면 x 입력 : )");
            String prodDelete = scanner.nextLine();
            if (prodDelete.equalsIgnoreCase("x")) {
                break;
            } else {
                if (product.containsKey(prodDelete) == true) {
                    System.out.println("입력한 상품 명은 " + prodDelete + "입니다.");
                    product.remove(prodDelete);
                    System.out.println("삭제 되었습니다.");
                    saveWordsToFile();

                } else {
                    System.out.println("등록되지 않은 상품 입니다.");

                }
            }
        }

    }

    @Override
    public void SearchProduct() {
        while (true) {
            System.out.println("");
            Scanner scanner = new Scanner(System.in);
            System.out.print("조회할 상품명을 입력하세요 (목록으로 돌아가려면 x 입력 : )");
            String prod = scanner.nextLine();
            if (prod.equalsIgnoreCase("x")) {
                break;
            } else {
                if (product.containsKey(prod) == true) {
                    System.out.println(product.get(prod));
                } else {
                    System.out.println("등록되지 않은 상품 입니다.");

                }
            }
        }
    }

    @Override
    public void ListProduct() {
        System.out.println("====상품 목록====");
        for (Map.Entry<String, String> ordEntry : product.entrySet()) {
            System.out.println("# " + ordEntry.getKey() + " : " + ordEntry.getValue());
        }
        System.out.println("=================");
        while (true) {
            System.out.println("목록으로 돌아가려면 x 입력");
            Scanner scanner = new Scanner(System.in);
            String Menu = scanner.nextLine();
            if (Menu.equalsIgnoreCase("x")) {
                break;
            } else {
                System.out.println("오류");
            }
        }

    }

    @Override
    public void Exit() {
        System.out.println("프로그램을 종료합니다.");
    }

    private void saveWordsToFile() {
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(FILE_NAME), StandardCharsets.UTF_8))) {
            for (Map.Entry<String, String> order : product.entrySet()) {
                writer.write(order.getKey() + "=" + order.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("파일 저장중 오류가 났습니다.");
        }
    }

}
