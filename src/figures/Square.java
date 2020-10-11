package figures;

public class Square {
    private double posUpperLeftX; //координата верхнего левого угла
    private double posUpperLeftY; //координата верхнего левого угла
    private double posUpperRightX; //координата верхнего правого угла
    private double posUpperRightY; //координата верхнего правого угла
    private double posBottomLeftX; //координата нижнего левого угла
    private double posBottomLeftY; //координата нижнего левого угла
    private double posBottomRightX; //координата нижнего правого угла
    private double posBottomRightY; //координата нижнего правого угла

    private double a; //сторона a
    private double rotationDegree;

    public Square(double posUpperLeftX, double posUpperLeftY, double a) {
        this.posUpperLeftX = posUpperLeftX;
        this.posUpperLeftY = posUpperLeftY;
        calculatePos(a, a);
        this.a = a;
        this.rotationDegree = 0;
    }


    private void calculatePos(double a, double b) {
        this.posUpperRightX = this.posUpperLeftX + a;
        this.posUpperRightY = this.posUpperLeftY;

        this.posBottomLeftX = this.posUpperLeftX;
        this.posBottomLeftY = this.posUpperLeftY - b;

        this.posBottomRightX = this.posUpperRightX;
        this.posBottomRightY = this.posBottomLeftY;
    }


    private void calculateRotation(double r) {
        double oldPosX, oldPosY;

        oldPosX = this.posUpperLeftX;
        oldPosY = this.posUpperLeftY;
        this.posUpperLeftX = (oldPosX * Math.cos(r)) - (oldPosY * Math.sin(r));
        this.posUpperLeftY = (oldPosX * Math.sin(r)) + (oldPosY * Math.cos(r));

        oldPosX = this.posUpperRightX;
        oldPosY = this.posUpperRightY;
        this.posUpperRightX = (oldPosX * Math.cos(r)) - (oldPosY * Math.sin(r));
        this.posUpperRightY = (oldPosX * Math.sin(r)) + (oldPosY * Math.cos(r));

        oldPosX = this.posBottomLeftX;
        oldPosY = this.posBottomLeftY;
        this.posBottomLeftX = (oldPosX * Math.cos(r)) - (oldPosY * Math.sin(r));
        this.posBottomLeftY = (oldPosX * Math.sin(r)) + (oldPosY * Math.cos(r));

        oldPosX = this.posBottomRightX;
        oldPosY = this.posBottomRightY;
        this.posBottomRightX = (oldPosX * Math.cos(r)) - (oldPosY * Math.sin(r));
        this.posBottomRightY = (oldPosX * Math.sin(r)) + (oldPosY * Math.cos(r));
    }

    public void move(double x, double y) {
        this.posUpperLeftX += x;
        this.posUpperLeftY += y;
        calculatePos(x, y);
    }

    public void scale(double size) {
        calculatePos(a * size - a, a * size - a);
        this.a *= size;
    }

    public void rotate(double angle) {
        this.rotationDegree += angle;
        angle = angle % 360;
        this.rotationDegree = this.rotationDegree % 360;
        calculateRotation(angle);
    }

    public String info() {
        String name = "Квадрат";
        return String.format("Информация:\n%s:\n\tКоординаты:\n\t\tВЛ угол: %f, %f\tВП угол: %f, %f\n\t\tНЛ угол: %f, %f\tНП угол: %f, %f" +
                        "\n\tСторона a: %f\n\tПоворот: %f o",
                name,
                this.posUpperLeftX, this.posUpperLeftY,
                this.posUpperRightX, this.posUpperRightY,
                this.posBottomLeftX, this.posBottomLeftY,
                this.posBottomRightX, this.posBottomRightY,
                this.a,
                this.rotationDegree);
    }

}
