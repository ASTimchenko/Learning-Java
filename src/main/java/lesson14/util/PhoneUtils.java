package lesson14.util;

import lesson14.operator.MobileOperators;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PhoneUtils {

    public static String generatePhone() {
        String suffPhoneix = IntStream.range(0, 7).boxed().map(value -> new Random().nextInt(10) + "").collect(Collectors.joining());
        return "+7" + MobileOperators.generateCode() + suffPhoneix;

    }
}
