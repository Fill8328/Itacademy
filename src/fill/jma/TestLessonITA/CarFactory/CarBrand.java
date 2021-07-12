package fill.jma.TestLessonITA.CarFactory;

import java.util.Random;

public class CarBrand {
}

 class Audi extends CarBrand {
    public Audi(){
    }
}

  class BMW extends CarBrand {
    public BMW(){
    }
}

  class Mersedes extends CarBrand {
    public Mersedes(){
    }
}

class AudiFactory implements CarFactory {
    @Override
    public CarBrand create() {
        return new Audi();
    }
}

class BMWFactory implements CarFactory {
    @Override
    public CarBrand create() {
        return new BMW();
    }
}

class MersedesFactory implements CarFactory {
    @Override
    public CarBrand create() {
        return new Mersedes();
    }
}

 class RandomFactory implements CarFactory{
    CarFactory[] factories;
    Random random = new Random();
    public RandomFactory(CarFactory[] factories){
        this.factories = factories;
    }

    @Override
    public CarBrand create() {
        int ind = random.nextInt(factories.length);
        return factories[ind].create();
    }
}