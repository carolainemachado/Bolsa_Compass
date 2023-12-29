package entities;

import entities.enums.Color;

/*
aqui a classe ficou como abstrata pq o metodo
esta como abstrato, entao vc e obrigado a falar que a classe
e abstrata pq ela nao tem a implementação do metodo entao ela
nao pode ser instanciada
 */
public abstract class Shape {
    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    /*
    metodo abstrato
     */
    public abstract double area();
}