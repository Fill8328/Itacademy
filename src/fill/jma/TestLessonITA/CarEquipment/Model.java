package fill.jma.TestLessonITA.CarEquipment;

public enum Model {
    SEDAN("Sedan"),
    PICUP("Pic Up"),
    MIMIVAN("Minivan");
    private final String i;

    Model(String i) {
        this.i = i;
    }

    public String getI() {
        return i;
    }
}
