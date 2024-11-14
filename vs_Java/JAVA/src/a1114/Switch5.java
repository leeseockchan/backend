
public class Switch5 {
    public static void main(String[] args) {
       String grade = "B";
       
       int score1 = 0;
    //    JAVA 12 이전 문법
       switch(grade){
        case "A":
            score1 = 100;
            break;
        case "B":
            int result = 100 - 20;
            score1 = result;
            break;
        default:
            score1 =60;
       }
       System.out.println("score1 : "+ score1);
    // JAVA 13 부터 가능한 문법
       int score2 = switch(grade){
        case "A" -> 100;
        case "B" -> {
            int result = 100 -20;
            yield result;
        }
        default -> 60;
       };
       System.out.println("score2 : "+ score2);
    //    단일 라인 케이스는 
    }
}
