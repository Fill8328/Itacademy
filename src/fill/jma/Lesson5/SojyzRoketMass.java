package fill.jma.Lesson5;

public enum SojyzRoketMass {

    DRY_WEIGHT(26650),
    FUEL_WEIGHT(273900);

    SojyzRoketMass(Integer massInKg) {
        this.massInKg = massInKg;
    }
    private Integer massInKg;

    public Integer getMassInKg() {
        return massInKg;
    }

}
