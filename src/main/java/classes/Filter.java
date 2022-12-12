package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Фильтрация списка");

        int count = 0;
        source.stream().forEach(v -> {
            if (v < treshold) logger.log("Элемент " + v + " не проходит");
        });

        List<Integer> result = source.stream().filter(v -> v >= treshold).collect(Collectors.toList());
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        return result;
    }
}
