package Model;

public class PetCreator extends Creator {

    @Override
    protected Pet createNewPet (PetType type) {

        switch (type) {
            case Cat:
                return new Cat();
            case Dog:
                return new Dog();
            case Hamster:
                return new Hamster();
            case Horse:
                return new Horse();
            case Camel:
                return new Camel();
            case Donkeys:
                return new Donkeys();
        }
        return null;
    }
}