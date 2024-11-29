package a1126.Doseo;

public class Ebook extends Book {
    private double fileSize; // 파일의 크기(MB단위)
    private String format; // 파일 포맷(예 - pdf, epub)

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Ebook(String title, String author, String iSBN, double fileSize, String format) {
        super(title, author, iSBN); // 부모(Book) 생성자 호출
        this.fileSize = fileSize;
        this.format = format;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("file Size : " + fileSize + "MB");
        System.out.println("Format : " + format);
    }

}
