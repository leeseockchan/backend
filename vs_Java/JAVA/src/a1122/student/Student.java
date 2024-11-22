package a1122.student;

public class Student {
    
    private String name;
    private int studentNum;
    private int koScore;
    private int maScore;
    private int enScore;
    int sum = koScore+maScore+enScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public int getKoScore() {
        return koScore;
    }

    public void setKoScore(int koScore) {
        this.koScore = koScore;
    }

    public int getMaScore() {
        return maScore;
    }

    public void setMaScore(int maScore) {
        this.maScore = maScore;
    }

    public int getEnScore() {
        return enScore;
    }

    public void setEnScore(int enScore) {
        this.enScore = enScore;
    }


    public Student(String name, int studentNum, int koScore, int maScore, int enScore) {
        this.name = name;
        this.studentNum = studentNum;
        this.koScore = koScore;
        this.maScore = maScore;
        this.enScore = enScore;
    }
    
    public void averageScore() {
        int avg;
        avg = sum / 3;

        System.out.println("평균 점수는 : "+ avg+" 입니다.");
    }

    public String toStr() {
        return String.format("학생 이름 : %s , 학번 : %d , 국어 점수 :%d, 수학 점수 : %d , 영어 점수 : %d 입니다.",name,studentNum,koScore,maScore,enScore);
    }



  
}
