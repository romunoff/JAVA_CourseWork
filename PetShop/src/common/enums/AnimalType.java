package common.enums;

public enum AnimalType {

    BIRD(1),
    MAMMAL(2);

    private final int type;

    AnimalType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
