package a1120;

public class Hak01 {
    public static void main(String[] args) {
        int[][] array = {
            {95,86},
            {83,92,96},
            {78,89,93,87,88}
        };
        int sum = 0;
        double avg = 0.0;
        int count = 0;

        for(int i=0; i<array.length;i++){
            for(int j= 0; j<array[i].length;j++){
                // System.out.println("array["+i+"]["+j+"] : "+array[i][j]);
                sum += array[i][j];
                count ++;
            }
            avg = (double)sum/count;
        }
        System.out.println("전체 합 : "+ sum);
        System.out.println("전체 평균 : "+ avg);

    }
}
