package Model;

public enum PetType {

    Cat,
    Dog,
    Hamster,
    Horse,
    Camel,
    Donkeys;


    public static PetType getType(int typeId) {
        switch (typeId) {
            case 1:
                return PetType.Cat;
            case 2:
                return PetType.Dog;
            case 3:
                return PetType.Hamster;
            case 4:
                return PetType.Horse;
            case 5:
                return PetType.Camel;
            case 6:
                return PetType.Donkeys;
            default:
                return null;
        }
    }
}