package fill.jma.TestLessonITA.CarEquipment;

public enum EngineForce {
    BASE(200),
    PRIME(250),
    SPORT(350);
    private final Integer i;

    EngineForce(Integer i) {
        this.i = i;
    }

    public Integer getI() {
        return i;
    }
}
