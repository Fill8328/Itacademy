package fill.jma.TestLessonITA.CarServes;

import fill.jma.TestLessonITA.CarBrand.BMW;
import fill.jma.TestLessonITA.CarBrand.Ford;
import fill.jma.TestLessonITA.CarBrand.Mersedes;
import fill.jma.TestLessonITA.CarEquipment.EngineForce;
import fill.jma.TestLessonITA.CarEquipment.Model;

import java.util.List;
import java.util.Random;

public class Serves {
    public static final List<Integer> listForce = List.of(EngineForce.BASE.getI(), EngineForce.PRIME.getI(), EngineForce.SPORT.getI());
    public static final List<String> listModel = List.of(Model.SEDAN.getI(), Model.MIMIVAN.getI(), Model.PICUP.getI());
    public static final List<Class> classList = List.of(BMW.class, Mersedes.class, Ford.class);
    private static final Random RANDOM = new Random();

    public static int randomLetter() {
        return RANDOM.nextInt(3);
    }

    public static final Integer temp = randomLetter();

    public static final Integer getForce() {
        Integer force = listForce.get(randomLetter());
        return force;
    }

    public static final String getModel() {
        String model = listModel.get(randomLetter());
        return model;
    }

    public static final Class getBrand() {
        Class brand = classList.get(randomLetter());
        return brand;
    }
}
