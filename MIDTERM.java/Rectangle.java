public class Rectangle {
    public int height = 0;
    public int width = 0;
    public int area = 0;
    public int perimeter = 0;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int areaCalc(){
        area = width * height;
        return area;
    }

    public int perimeterCalc(){
        perimeter = (height * 2) + (width * 2);
        return perimeter;
    }
}
