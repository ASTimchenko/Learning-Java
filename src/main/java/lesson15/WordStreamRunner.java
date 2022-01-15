package lesson15;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WordStreamRunner {

        public static void main(String[] args) {

       //Текст для обработки
        final String TEKST =
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus." +
                        "Donec mi quam, tempor vel ipsum non, faucibus suscipit massa." +
                        "Morbi lacinia velit blandit tincidunt efficitur." +
                        "Vestibulum eget metus imperdiet sapien laoreet faucibus. " +
                        "Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit." +
                        "Integer vel odio nec mi tempor dignissim.";

        //Преобразование текста с использованием регулярного выражения в список слов
        //Нашёл в Internet
        Pattern pattern = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS
                        | Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(TEKST);
        List<String> words = new LinkedList<>();

        while (matcher.find())
            words.add(matcher.group().toLowerCase());

        words.stream()
                // собираем спиок слов в Map<String, Integer>
                // и считаем количество вхождений каждого слова
                .collect(Collectors.toMap(key -> key, val -> 1, Integer::sum))
                .entrySet().stream()
                // сортировка в порядке убывания количества использования слов
                .sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()) * -1)
                // вывод слов по количеству упоминаний в порядке убывания
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}
