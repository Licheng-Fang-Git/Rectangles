public class Rectangle {
    private int length;
    private int width;
    private int xTopLeft;
    private int yTopLeft;
    private int xTopRight;
    private int yTopRight;
    private int xBottomLeft;
    private int yBottomLeft;
    private int xBottomRight;
    private int yBottomRight;
    public Rectangle(int xPos, int yPos, int length, int width){
        this.length = length;
        this.width = width;
        this.xTopLeft = xPos;
        this.yTopLeft = yPos;
        this.xTopRight = xPos + length;
        this.yTopRight = yPos;
        this.xBottomLeft = xPos;
        this.yBottomLeft = yPos - width;
        this.xBottomRight = xTopRight;
        this.yBottomRight = yBottomLeft;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getxTopLeft() {
        return xTopLeft;
    }

    public int getyTopLeft() {
        return yTopLeft;
    }

    public int getxTopRight() {
        return xTopRight;
    }

    public int getyTopRight() {
        return yTopRight;
    }

    public int getxBottomLeft() {
        return xBottomLeft;
    }

    public int getyBottomLeft() {
        return yBottomLeft;
    }

    public int getxBottomRight() {
        return xBottomRight;
    }

    public int getyBottomRight() {
        return yBottomRight;
    }

    public String toString(){
        String s = "Length: " + length + " Width: " + width + " Xpos: " + xTopLeft + " Ypos: " + yTopLeft;
        return s;
    }

}
