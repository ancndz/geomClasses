import figures.Circle;
import figures.Figure;
import figures.Rectangle;
import figures.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean flag2 = true;
            System.out.println("######\nВыбери фигуру для работы:\n\t1 - Окружность\n\t2 - Прямоугльник\n\t3 - Квадрат\n\t0 - exit");

            double posX, posY, radius, a, b;
            Figure figure;

            switch (scanner.nextInt()) {
                case 0:
                    return;
                case 1:
                    System.out.println("Введите координаты центра:\n X: ");
                    posX = scanner.nextDouble();
                    System.out.println("Y: ");
                    posY = scanner.nextDouble();
                    System.out.println("Введите радиус: ");
                    radius = scanner.nextDouble();
                    figure = new Circle(posX, posY, radius);
                    break;
                case 2:
                    System.out.println("Введите координаты верхнего левого угла:\n X: ");
                    posX = scanner.nextDouble();
                    System.out.println("Y: ");
                    posY = scanner.nextDouble();
                    System.out.println("Введите сторону a: ");
                    a = scanner.nextDouble();
                    System.out.println("Введите сторону b: ");
                    b = scanner.nextDouble();
                    figure = new Rectangle(posX, posY, a, b);
                    break;
                case 3:
                    System.out.println("Введите координаты верхнего левого угла:\n X: ");
                    posX = scanner.nextDouble();
                    System.out.println("Y: ");
                    posY = scanner.nextDouble();
                    System.out.println("Введите сторону: ");
                    a = scanner.nextDouble();
                    figure = new Square(posX, posY, a);
                    break;
                default:
                    figure = new Square(0, 0, 5);
                    break;
            }

            System.out.println(figure.info());

            while (flag2) {
                System.out.println("Выбери действие:\n\t1 - Перемещение\n\t2 - Изменение размера\n\t3 - Вращение\n\t0 - back");
                switch (scanner.nextInt()) {
                    case 0:
                        flag2 = false;
                        break;
                    case 1:
                        System.out.println("Введите смещение по оси X: ");
                        posX = scanner.nextDouble();
                        System.out.println("Y: ");
                        posY = scanner.nextDouble();
                        figure.move(posX, posY);
                        break;
                    case 2:
                        System.out.println("Введите множитель: ");
                        posX = scanner.nextDouble();
                        figure.scale(posX);
                        break;
                    case 3:
                        System.out.println("Введите градус наклона относительно верхнего левого угла: ");
                        posX = scanner.nextDouble();
                        figure.rotate(posX);
                        break;
                    default:
                        System.out.println("Ничего не выбрано.");
                        break;
                }
                System.out.println(figure.info());
            }
        }
    }
}
