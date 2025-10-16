package org.example;


public class Main {
    public static void main(String[] args) {

         QuadrupedSpider quadrupedSpider = new QuadrupedSpider(); // создаем экземпляр класса
        quadrupedSpider.leg = 75; // переопределяем значение переменной leg
        quadrupedSpider.hip = 65; // переопределяем значение переменной hip
        QuadrupedSpider.moveNeck(35); //переопределяем значение статической переменной. Шея робота поворачивается на 35 градусов
    }
}