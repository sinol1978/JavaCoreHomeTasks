package lesson16.task06heavyboxqueue;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public Box() {
        width = -1;  // ���������� -1 ���
        height = -1; // ����������� �����������������������
        depth = -1;  // �������
    }

    Box(double len) {
        width = len;
        height = len;
        depth = len;
    }

    double getVolume() {
        return width * height * depth;
    }

}
