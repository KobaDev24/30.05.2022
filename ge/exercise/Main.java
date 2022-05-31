package ge.exercise;

public class Main {
    public static void main(String[] args) {
        Rectangle a1 = new Rectangle();
        Rectangle a2 = new Rectangle(1, 1);
        Rectangle b1 = new Rectangle(2, 2);
        Rectangle b2 = new Rectangle(3, 3);
        Rectangle b3 = new Rectangle(4, 4);
        Rectangle a3 = new Rectangle(23);


        Rectangle[] ar = new Rectangle[]{a2, b1, b2, b3};

        System.out.println("ge.exercise.Rectangle.maxArea = " + Rectangle.maxArea(ar).area());
    }
}
