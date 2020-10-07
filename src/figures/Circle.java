package figures;

public class Circle implements Figure {

    private String name = "Окружность";
    private double posX; //координата центра
    private double posY; //координата центра
    private double r; //радиус

    public Circle(double posX, double posY, double r) {
        this.posX = posX;
        this.posY = posY;
        this.r = r;
    }

    @Override
    public void move(double x, double y) {
        this.posX += x;
        this.posY += y;
    }

    @Override
    public void scale(double size) {
        this.r *= size;
    }

    @Override
    public void rotate(double angle) {
        // ))))
    }

    @Override
    public String info() {
        return String.format("Информация:\n%s:\n\tКоординаты: %f, %f\n\tРадиус: %f", this.name, this.posX, this.posY, this.r);
    }
}
