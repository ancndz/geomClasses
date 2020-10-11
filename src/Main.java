import figures.Circle;
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
                    Circle circle = new Circle(posX, posY, radius);
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
                                circle.move(posX, posY);
                                break;
                            case 2:
                                System.out.println("Введите множитель: ");
                                posX = scanner.nextDouble();
                                circle.scale(posX);
                                break;
                            case 3:
                                System.out.println("Введите градус наклона относительно верхнего левого угла: ");
                                posX = scanner.nextDouble();
                                circle.rotate(posX);
                                break;
                            default:
                                System.out.println("Ничего не выбрано.");
                                break;
                        }
                        System.out.println(circle.info());
                    }
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
                    Rectangle rectangle = new Rectangle(posX, posY, a, b);
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
                                rectangle.move(posX, posY);
                                break;
                            case 2:
                                System.out.println("Введите множитель: ");
                                posX = scanner.nextDouble();
                                rectangle.scale(posX);
                                break;
                            case 3:
                                System.out.println("Введите градус наклона относительно верхнего левого угла: ");
                                posX = scanner.nextDouble();
                                rectangle.rotate(posX);
                                break;
                            default:
                                System.out.println("Ничего не выбрано.");
                                break;
                        }
                        System.out.println(rectangle.info());
                    }
                    break;
                case 3:
                    System.out.println("Введите координаты верхнего левого угла:\n X: ");
                    posX = scanner.nextDouble();
                    System.out.println("Y: ");
                    posY = scanner.nextDouble();
                    System.out.println("Введите сторону: ");
                    a = scanner.nextDouble();
                    Square square = new Square(posX, posY, a);
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
                                square.move(posX, posY);
                                break;
                            case 2:
                                System.out.println("Введите множитель: ");
                                posX = scanner.nextDouble();
                                square.scale(posX);
                                break;
                            case 3:
                                System.out.println("Введите градус наклона относительно верхнего левого угла: ");
                                posX = scanner.nextDouble();
                                square.rotate(posX);
                                break;
                            default:
                                System.out.println("Ничего не выбрано.");
                                break;
                        }
                        System.out.println(square.info());
                    }
                    break;
                default:
                    Square square1 = new Square(0, 0, 5);
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
                                square1.move(posX, posY);
                                break;
                            case 2:
                                System.out.println("Введите множитель: ");
                                posX = scanner.nextDouble();
                                square1.scale(posX);
                                break;
                            case 3:
                                System.out.println("Введите градус наклона относительно верхнего левого угла: ");
                                posX = scanner.nextDouble();
                                square1.rotate(posX);
                                break;
                            default:
                                System.out.println("Ничего не выбрано.");
                                break;
                        }
                        System.out.println(square1.info());
                    }
                    break;
            }
        }
    }
}
