package figures;

public class Circle {

    private String name = "Окружность";
    private double posX; //координата центра
    private double posY; //координата центра
    private double r; //радиус

    public Circle(double posX, double posY, double r) {
        this.posX = posX;
        this.posY = posY;
        this.r = r;
    }

    public void move(double x, double y) {
        this.posX += x;
        this.posY += y;
    }

    public void scale(double size) {
        this.r *= size;
    }

    public void rotate(double angle) {
        // ))))
    }

    public String info() {
        return String.format("Информация:\n%s:\n\tКоординаты: %f, %f\n\tРадиус: %f", this.name, this.posX, this.posY, this.r);
    }
}
