package ge.exercise;

public class Rectangle {
    private int height;
    private int width;

    private static int maxHeight;
    private static int maxWidth;

    static{
        maxWidth = 50;
        maxHeight = 100;
    }

    public Rectangle(int height, int width){
        if(height >= maxHeight){
            this.height = maxHeight;
        }else {
            this.height = height;
        }

        if(width>= maxWidth){
            this.width = maxWidth;
        }else {
            this.width = width;
        }
    }
         public Rectangle(int height){
             if(height >= maxHeight){
                 this.height = maxHeight;
             }else {
                 this.height = height;
             }
        }
         public Rectangle(){
          width = 25;

        }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight(){
          return height;
        }
        public int getWidth(){
        return width;
        }

        public int area(){
          return height * width;
        }

        public static Rectangle maxArea( Rectangle[] array){
         Rectangle max = array[0];
        for (Rectangle a: array) {
                if(a.area()>max.area()){
                    max = a;
                }
            }
        return max;
        }

}
