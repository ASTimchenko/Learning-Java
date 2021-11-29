package lesson8;

public class AnimalsRun {
    public static void main(String[] args) {
        Cat CatPersik = new Cat("Персик", "мальчик", "британская кошка", 6,
                "мяу-мяу-мяу", "ловит мышей");
        Cat CatMusya = new Cat("Муся", "мальчик", "сиамская кошка", 5,
                "мяу-мяу-мяу", "поддаётся дрессировке");

        Dog DogRex = new Dog("Рекс", "мальчик", "водолаз", 4,
                "гав-гав-гав", "отлично плавает");
        Dog DogPalma = new Dog("Пальма", "девочка", "немецкая овчарка", 5,
                "гав-гав-гав", "хороший охранник");

        Parrot ParrotKesha = new Parrot("Кеша", "мальчик", "волнистый попугай", 20,
                "чик-чирик", "умеет говорить");
        Parrot ParrotRosa = new Parrot("Роза", "девочка", "голубой Ара", 30,
                "чик-чирик", "любит детей");

        Hamster HamsterMars = new Hamster("Марс", "мальчик", "сирийский хомяк", 1,
                "фыр-фыр-фыр", "любит поиграть");
        Hamster HamsterSima = new Hamster("Сима", "девочка", "джунгарский хомяк", 2,
                "фыр-фыр-фыр", "любит крутить колесо");

        Animals[] animals = new Animals[6];
        animals[0] = CatPersik;
        animals[1] = CatMusya;
        animals[2] = DogRex;
        animals[3] = DogPalma;
        animals[4] = HamsterMars;
        animals[5] = HamsterSima;

        for (Animals Animals: animals) {
            System.out.println(Animals.getVoice());
        }
    }
}
