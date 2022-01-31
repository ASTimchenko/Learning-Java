package lesson18;

import lombok.SneakyThrows;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class FileParserRunner {

    private static final String FILE_LOCATION = "/example.txt";

    public static void main(String[] args) {
        System.out.println("Начало чтения и обработки файла");
        InputStream resourceAsStream = FileParserRunner.class.getResourceAsStream(FILE_LOCATION);
        if (resourceAsStream == null) {
            return;
        }
        final String extension = FilenameUtils.getExtension(FILE_LOCATION);
        AtomicInteger index = new AtomicInteger();
        readAndParse(resourceAsStream, line -> writeToFiles(extension, index, line));
    }

    @SneakyThrows(IOException.class)
    public static void readAndParse(InputStream is, Consumer<String> consumer) {
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(is, StandardCharsets.UTF_8))) {
            bufferedReader.lines().filter(StringUtils::isNotBlank).forEach(consumer);
        }
    }

    @SneakyThrows
    private static void writeToFiles(String extension, AtomicInteger index, Object line) {
        Path path = Paths.get("c:\\Temp\\Java\\18_Lesson\\Output\\", "result" + (index.incrementAndGet())
                            + "." + extension);
        System.out.printf("Начало записи файла %s\n", path.getFileName());
        Path fileParentPath = path.getParent();
        if (!Files.exists(fileParentPath)) {
            if (!fileParentPath.toFile().mkdirs()) {
                System.out.println("Во время создания директорий произошла ошибка");
                return;
            }
        }
        Files.writeString(path, (CharSequence) line, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
    }
}
