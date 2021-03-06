package lesson14.util;

import java.util.List;
import java.util.Random;

public class NameUtils {

    //список имён
    private static final List<String> NAMES = List.of("Авдей", "Авксентий", "Агапит", "Агафон", "Акакий", "Александр",
            "Алексей", "Альберт", "Альвиан", "Анатолий", "Андрей", "Аникита", "Антон", "Антонин", "Анфим", "Аристарх",
            "Аркадий", "Арсений", "Артём", "Артемий", "Артур", "Архипп", "Афанасий", "Богдан", "Борис", "Вавила",
            "Вадим", "Валентин", "Валерий", "Валерьян", "Варлам", "Варсонофий", "Варфоломей", "Василий", "Венедикт",
            "Вениамин", "Викентий", "Виктор", "Виссарион", "Виталий", "Владимир", "Владислав", "Владлен", "Влас",
            "Всеволод", "Вячеслав", "Гавриил", "Галактион", "Геласий", "Геннадий", "Георгий", "Герасим", "Герман",
            "Германн", "Глеб", "Гордей", "Григорий", "Магистриан", "Макар", "Максим", "Мамонт", "Марк", "Мартын",
            "Матвей", "Мелентий", "Мирон", "Мирослав", "Митрофан", "Михаил", "Мстислав", "Павел", "Паисий",
            "Панкратий", "Пантелеймон", "Парфений", "Пафнутий", "Пахомий", "Пётр", "Платон", "Поликарп", "Порфирий",
            "Потап", "Пров", "Прокопий", "Протасий", "Прохор", "Тимон", "Яков", "Якун", "Ярослав", "Савва", "Савелий",
            "Самуил", "Святополк", "Святослав", "Севастьян", "Семён", "Серафим", "Сергей", "Сила",  "Сильвестр",
            "Созон","Софрон", "Спиридон", "Станислав", "Степан");

    //список фамилий
    private static final List<String> SURNAMES = List.of("Смирнов", "Иванов", "Кузнецов", "Соколов", "Попов", "Петров",
            "Лебедев", "Козлов", "Новиков", "Морозов", "Волков", "Соловьёв", "Васильев", "Зайцев", "Павлов", "Семёнов",
            "Виноградов", "Богданов", "Воробьёв", "Фёдоров", "Михайлов", "Беляев", "Сидоров", "Белов", "Комаров",
            "Орлов", "Киселёв", "Макаров", "Андреев", "Ковалёв", "Ильин", "Гусев", "Титов", "Кузьмин", "Кудрявцев",
            "Баранов", "Куликов", "Алексеев", "Степанов", "Яковлев", "Сорокин", "Сергеев", "Романов", "Захаров",
            "Борисов", "Королёв", "Денисов", "Пономарёв", "Григорьев", "Лазарев", "Медведев", "Ершов", "Никитин",
            "Соболев", "Рябов", "Поляков", "Цветков", "Данилов", "Жуков", "Фролов", "Журавлёв", "Николаев", "Крылов",
            "Максимов", "Белоусов", "Федотов", "Дорофеев", "Егоров", "Матвеев", "Бобров", "Дмитриев", "Калинин",
            "Анисимов", "Петухов", "Антонов", "Тимофеев", "Никифоров", "Веселов", "Филиппов", "Тарасов", "Марков",
            "Большаков", "Суханов", "Миронов", "Ширяев", "Александров", "Коновалов", "Шестаков", "Казаков", "Ефимов",
            "Громов", "Герасимов", "Фомин", "Давыдов", "Мельников", "Щербаков", "Блинов", "Колесников", "Карпов",
            "Афанасьев", "Власов", "Маслов", "Исаков", "Тихонов", "Аксёнов", "Гаврилов", "Родионов", "Котов",
            "Горбунов", "Кудряшов", "Быков", "Зуев", "Третьяков", "Савельев", "Панов", "Рыбаков", "Суворов", "Абрамов",
            "Воронов",  "Мухин", "Архипов", "Трофимов", "Мартынов", "Емельянов", "Горшков", "Чернов", "Овчинников",
            "Голубев", "Селезнёв", "Панфилов", "Копылов", "Михеев", "Галкин", "Назаров", "Лобанов", "Лукин", "Беляков",
            "Потапов", "Некрасов", "Хохлов", "Жданов", "Наумов", "Шилов", "Воронцов", "Ермаков", "Дроздов", "Игнатьев",
            "Савин", "Логинов", "Сафонов", "Капустин", "Кириллов", "Моисеев", "Елисеев", "Кошелев", "Костин",
            "Горбачёв", "Орехов", "Ефремов", "Исаев", "Евдокимов", "Калашников", "Кабанов", "Носков", "Юдин", "Кулагин",
            "Лапин", "Прохоров", "Нестеров", "Харитонов", "Агафонов", "Муравьёв", "Ларионов", "Федосеев", "Зимин",
            "Пахомов", "Шубин", "Игнатов", "Филатов", "Крюков", "Рогов", "Кулаков", "Терентьев", "Молчанов",
            "Владимиров", "Артемьев", "Гурьев", "Зиновьев", "Гришин", "Кононов", "Дементьев", "Ситников", "Симонов",
            "Мишин", "Фадеев", "Комиссаров", "Мамонтов", "Носов", "Гуляев", "Шаров", "Устинов", "Вишняков", "Евсеев",
            "Лаврентьев", "Брагин", "Константинов", "Корнилов", "Авдеев", "Зыков", "Бирюков", "Шарапов", "Никонов",
            "Щукин", "Осипов", "Дьячков", "Одинцов", "Сазонов", "Якушев", "Красильников", "Гордеев", "Самойлов",
            "Князев", "Беспалов", "Уваров", "Шашков", "Бобылёв", "Доронин", "Белозёров", "Рожков", "Самсонов",
            "Мясников", "Лихачёв", "Буров", "Сысоев", "Фомичёв", "Русаков", "Стрелков", "Гущин", "Тетерин", "Колобов",
            "Субботин", "Фокин", "Блохин", "Селиверстов", "Пестов", "Кондратьев", "Силин", "Меркушев", "Лыткин",
            "Туров");

    //список отчеств
    private static final List<String> PATRONYMIC = List.of("Ааронович", "Абрамович", "Августович", "Авдеевич",
            "Аверьянович", "Адамович", "Адрианович", "Акимович", "Аксёнович", "Александрович", "Алексеевич",
            "Анатольевич", "Андреевич", "Андроникович", "Анисимович", "Антипович", "Антонович", "Ануфриевич",
            "Аркадьевич", "Арсенович",  "Арсеньевич", "Артёмович", "Артемьевич", "Артурович", "Архипович",
            "Афанасьевич", "Бедросович", "Бенедиктович", "Богданович", "Бориславич", "Бориславович", "Борисович",
            "Борисыч", "Брониславович", "Ваганович", "Вадимович", "Валентинович", "Валерианович", "Валерьевич",
            "Валерьянович", "Васильевич", "Вахтангович", "Венедиктович", "Вениаминович", "Викентьевич", "Викторович",
            "Виленович", "Вилорович", "Виссарионович", "Витальевич", "Владиленович", "Владимирович", "Владиславович",
            "Владленович",  "Власович", "Вольфович", "Всеволодович", "Вячеславович", "Гавриилович", "Гаврилович",
            "Гаджиевич", "Геннадиевич", "Геннадьевич", "Генрихович", "Георгиевич", "Герасимович", "Германович",
            "Гертрудович", "Глебович", "Гордеевич", "Григорьевич", "Гурьевич", "Давидович", "Давыдович", "Даниилович",
            "Данилович", "Демидович", "Демьянович", "Денисович", "Димитриевич", "Дмитриевич", "Дорофеевич",
            "Евгеньевич", "Евграфович", "Евдокимович", "Евсеевич", "Евстигнеевич", "Егорович", "Елизарович",
            "Елисеевич", "Емельянович", "Еремеевич", "Ермилович", "Ермолаевич", "Ерофеевич", "Ефимович", "Ефимьевич",
            "Ефремович", "Ефстафьевич", "Жанович", "Жоресович", "Захарович", "Захарьевич", "Зиновьевич", "Ибрагимович",
            "Иванович", "Иваныч", "Игнатович", "Игнатьевич", "Игоревич", "Измаилович", "Изотович", "Израилевич",
            "Иларионович", "Ильгизович", "Ильич", "Ильмирович", "Ильнурович", "Ильсурович", "Ильясович", "Иоаннович",
            "Иосипович",  "Иосифович", "Исаевич", "Исидорович", "Каллиникович", "Каллистратович", "Константинович",
            "Леонидович", "Леонович", "Леонтьевич", "Львович", "Магомедович", "Магометович", "Макарович",
            "Максимилианович", "Максимович", "Маркович", "Матвеевич", "Михайлович", "Михалыч", "Натанович", "Наумович",
            "Никандрович", "Никанорович", "Никитич", "Никитович", "Никифорович", "Никодимович", "Николаевич",
            "Никонович", "Олегович", "Осипович",  "Павлович", "Петрович", "Платонович", "Прохорович", "Романович",
            "Ростиславович", "Рудольфович", "Русланович", "Рустамович", "Семёнович", "Сергеевич", "Сидорович",
            "Сильвестрович", "Соломонович", "Степанович", "Тарасович", "Теймуразович", "Терентьевич", "Тимофеевич",
            "Тимурович", "Тихонович", "Трифонович", "Трофимович", "Устинович", "Фадеевич", "Фёдорович", "Федосеевич",
            "Федосьевич", "Федотович", "Феликсович", "Феодосьевич", "Феоктистович", "Феофанович", "Филатович",
            "Филимонович",  "Филиппович", "Фокич", "Фомич", "Фролович", "Харитонович", "Харламович", "Харлампович",
            "Харлампьевич", "Чеславович", "Эдгардович",  "Эдгарович");

    public static String randomizeName(){
        return randomize(NAMES);
    }

    public static String randomizeSurname(){
        return randomize(SURNAMES);
    }

    public static String randomizePatronymic(){
        return randomize(PATRONYMIC);
    }

    public static String randomize(List<String> values){
        return values.get(new Random().nextInt(values.size()));
    }

}