package a1122;

public class WebtoonTest {
    public static void main(String[] args) {
        // 객체 생성
        Webtoon w1 = new Webtoon("나 혼자만 레벨업", "판타지", "추공");
        Webtoon w2 = new Webtoon("스위트 홈", "스릴러", "칸비");
        Webtoon w3 = new Webtoon("이태원 클라쓰", "드라마", "광진");

        // Webtoon 배열에 여러개의 객체 한번에 저장.!
        // 배열 타입 Webtoon 을 지정하면, 이 배열은 Webtoon 객체 저장이 가능
        Webtoon[] webtoons = { w1, w2, w3 };
        for (int i = 0; i < webtoons.length; i++) {
            // System.out.println("제목 : "+ webtoons[i].getTitle());
            // System.out.println("장르 : "+ webtoons[i].getGenre());
            // System.out.println("작가 : "+ webtoons[i].getAuthor());
            System.out.println(webtoons[i].toSt());
        }

    }
}

class Webtoon {
    // 필드 선언
    private String title; // 제목
    private String genre; // 장르
    private String author; // 작가
    private static int count = 0; // 객체의 개수

    // 생성자 선언
    public Webtoon(String title, String genre, String author) {
        Webtoon.count++;
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    public String toSt() {
        return String.format("Webtoon{title:%s, genre:%s, author:%s}",title,genre,author);
    }

    public static int getCount() {
        return count;
    }

    // public String getTitle() {
    // return title;
    // }
    // public void setTitle(String title) {
    // this.title = title;
    // }

    // public String getGenre() {
    // return genre;
    // }
    // public void setGenre(String genre) {
    // this.genre = genre;
    // }

    // public String getAuthor() {
    // return author;
    // }
    // public void setAuthor(String author) {
    // this.author = author;
    // }

}