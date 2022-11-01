import java.util.HashMap;
import java.util.Map;

public class ArbitraryMaps {
    private final Map<String, Integer> arbitraryMap = new HashMap<>();

    public ArbitraryMaps() {
        arbitraryMap.put("Пятница", 13);
        arbitraryMap.put("Одиночка", 7);
        arbitraryMap.put("Иссекай", 9);
        arbitraryMap.put("Прошлое", 78);
        arbitraryMap.put("Рок", 2);
        arbitraryMap.put("Шутка", 64);
        arbitraryMap.put("Завтра", 99);
        arbitraryMap.put("Прогресс", 1);
        arbitraryMap.put("Игра", 5);
        arbitraryMap.put("Мир", 0);
        arbitraryMap.put("str1", 2);
    }

    public void setArbitraryMap (String newKey, Integer newValue)
    {
        if(this.arbitraryMap.get(newKey) == null)
        {
            this.arbitraryMap.put(newKey, newValue);
        }
        else if (this.arbitraryMap.get(newKey) != newValue)
        {
            this.arbitraryMap.replace(newKey, newValue);
        }
        else {
            throw new IllegalArgumentException("Такой ключ с таким значением уже существует.");
        }

    }
}
