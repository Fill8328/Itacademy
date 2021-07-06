package fill.jma.Lesson5;

public class RocketLaunches  {
    private Integer payLoad = 7100;
    private Integer id;

    public Integer massRocket(){
        Integer massRocket = SojyzRoketMass.DRY_WEIGHT.getMassInKg() + SojyzRoketMass.FUEL_WEIGHT.getMassInKg() + payLoad;
        return massRocket;
    }

//    public Integer massMenOnRocket(Сosmonaut id) {
//        this.id =id;
//    }

}
