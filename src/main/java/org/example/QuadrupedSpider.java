package org.example;

public class QuadrupedSpider {
    public int leg = 20; //позиция лапки робота в градусах, может быть любой изначальной
    public int hip = 30; //позиция "бедра" робота в градусах, может быть любой изначальной
    public static int neck = 90; /* позиция шеи робота в градусах. Всегда должна быть изначально на 90 градусах
    (для того, чтобы робот видел препятствия сразу после запуска) */

    public static void moveNeck(int newPosition) {
        neck = newPosition;
    } //создаем метод, который будет изменять положение сервопривода шеи для сканирования пространства вокруг робота

  public static int getNeckServo () {
        return neck;
  } //метод getNeckServo возвращает значение положения сервопривода шеи робота при запуске
}




