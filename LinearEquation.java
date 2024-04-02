/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas6;

/**
 *
 * @author Nadila Suci P
 */
import java.util.Scanner;
public class LinearEquation {
    private double a, b, c, d, e, f;

    public LinearEquation() {
        // Constructor tanpa argumen (kosong)
    }

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable() {
        return ((getA() * getD()) - (getB() * getC())) != 0;
    }

    public double getX() {
        return ((getE() * getD()) - (getB() * getF())) / ((getA() * getD()) - (getB() * getC()));
    }

    public double getY() {
        return ((getA() * getF()) - (getE() * getC())) / ((getA() * getD()) - (getB() * getC()));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nilai a, b, c, d, e, dan f untuk sistem persamaan linear:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            System.out.println("Solusi untuk persamaan linear adalah:");
            System.out.println("x = " + equation.getX());
            System.out.println("y = " + equation.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi numerik.");
        }

        scanner.close();
    }
}