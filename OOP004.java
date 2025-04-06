import java.util.Scanner;

class Point{
    private int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }

    public void SetX(int x){
        this.x = x;
    }

    public void SetY(int y){
        this.y = y;
    }

    public void move(int dx, int dy){
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    public float distanceTo(Point p){
        return (float) Math.sqrt((Math.pow((this.x - p.x),2))+ (Math.pow((this.y - p.y),2)));
    }
}

public class OOP004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            Point A = new Point(sc.nextInt(), sc.nextInt());
            Point B = new Point(sc.nextInt(), sc.nextInt());
            A.move(1,1);

            float value = A.distanceTo(B);
            String result = String.format("%.2f",value);
            System.out.println(result);
        }
    }
}
