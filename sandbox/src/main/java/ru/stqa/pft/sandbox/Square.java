package ru.stqa.pft.sandbox;

public class Square {

    public int area;

    public Square(int s1) {
        this.area = s1;
    }

    public int area() {
        return this.area * this.area;
    }
}
