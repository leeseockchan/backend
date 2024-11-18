package a1118;

import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        int[] ball =new int[45];

        for(int i=0; i<ball.length;i++){
            int random=(int)(Math.random()*100);
            int lotto = ball[0];
            ball[0] = lotto;
        }
        System.out.println(Arrays.toString(ball));
        
        for(int i = 0; i<6;i++){
            System.out.printf("ball%d\=%d\",i,ball[i]);
        }
    }
}
