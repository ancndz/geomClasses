package figures;

public class Square extends Rectangle {
    public Square(double posUpperLeftX, double posUpperLeftY, double a) {
        super(posUpperLeftX, posUpperLeftY, a, a);
        super.setName("Квадрат");
    }
}
