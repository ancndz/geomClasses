package figures;

public interface Figure {
    /**
     * Изменение координат верхнего левого угла (движение всей фигуры)
     * @param x - координата X
     * @param y - координата Y
     */
    void move(double x, double y);
    /**
     * Изменение размера фигуры
     * @param size - множитель
     */
    void scale(double size);

    /**
     * Вращение относительно левого верхнего угла
     * @param angle - угол наклона
     */
    void rotate(double angle);

    /**
     * Вывод параметров фигуры
     * @return Строка
     */
    String info();
}
