package fill.jma.Lesson5;

public enum Сosmonaut {

    JHON_JONSON(1, 80),
    SAMANTA_SMHIT(2, 60),
    ALEKSANDR_KOLESNIKOW(3, 80),
    JULIA_ORLOVA(4, 60);

    private Integer id;
    private Integer manMassInKg;

    Сosmonaut(Integer id, Integer manMassInKg) {
        this.id = id;
        this.manMassInKg = manMassInKg;
    }

    public Integer getId() {
        return id;
    }

    public Integer getManMass() {
        return manMassInKg;
    }
}
