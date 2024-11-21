package a1121.homework;

public class Tetragonal {
    
    int width = 0;
    int height = 0;

  

    public int getArea(int width, int height){
        return width*height;
    }   // 사각형 넓이 메소드

    public int getPerimeter(int width, int height){
        return width*2+height*2;
    }   // 사각형 둘레 메소드

    public int getArea(int width){
        return width;
    } 
    
}
