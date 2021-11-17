import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Объявляем "функцию", присваиваем ее переменной intToString.
       // Получаем детермированную функцию, т.к. результат зависит только от входных параметров.
        Function<String, List<String>> intToString = (x) ->
         // Используем Stream API для реализации монад.
                Arrays.stream(x.split(" "))
                        .distinct()
                        .sorted()
                        .collect(Collectors.toList());

        String str = "раз два три четыре пять шесть семь";

        // Вызываем нашу функцию.

        intToString .apply(str).forEach(System.out::println);
    }
}
