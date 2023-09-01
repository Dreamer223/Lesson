package russian.gb.lessonOOP;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Vector {
    private double x;
    private double y;
    private double z;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    /**
     * @param vector2 Принимает в качестве параметры вектора.
     * @return Новый вектор
     */
    public Vector vecpd(Vector vector2) {
        return new Vector(y * vector2.z - z * vector2.y,
                z * vector2.x - x * vector2.z,
                x * vector2.y - y * vector2.x);
    }
}
