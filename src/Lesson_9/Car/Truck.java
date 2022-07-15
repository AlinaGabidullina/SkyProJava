package Lesson_9.Car;

import Lesson_9.Beeper.Beeper;
import Lesson_9.Engine.Engine;
import Lesson_9.Seats.Seats;

public class Truck extends Car{
    public Truck(Beeper beeper, Engine engine, Seats seats) {
        super(beeper, engine, seats);
    }
   public String wheels(){
        return " 5 " ;
   }
}
