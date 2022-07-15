package Lesson_9.Car;

import Lesson_9.Beeper.Beeper;
import Lesson_9.Beeper.Tuu;
import Lesson_9.Engine.Engine;
import Lesson_9.Engine.EngineV18;
import Lesson_9.Seats.Seats;

public abstract class Car {
    public Beeper beeper;
    public Engine engine;
    public Seats seats;


    public Car(Beeper beeper, Engine engine, Seats seats ) {
        this.beeper = beeper;
        this.engine = engine;
        this.seats= seats;
    }


}
