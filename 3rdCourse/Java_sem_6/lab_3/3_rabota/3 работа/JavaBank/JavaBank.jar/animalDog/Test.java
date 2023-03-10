package animalDog;

class Animal{
    public void makeNoise(){
        System.out.println("talk");
    }
}

class Dog extends Animal{
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Bark");
    }
}

class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = new Animal();
        Animal animalDog = new Dog();
        dog.makeNoise();
        animal.makeNoise();
        animalDog.makeNoise();
        animalDog.makeNoise();
    }
}
