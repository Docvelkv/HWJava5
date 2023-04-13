import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class Methods {

    /**
     * Метод проверяет корректность расстановки скобок в строке
     * (задача мозг взорвала)
     * @param inpStr входящая строка
     * @return да или нет
     */
    public static boolean isCorrectParentheses(String inpStr) {
        // достаём все скобки из входящей строки в порядке их расположения
        inpStr = inpStr.replaceAll("[^\\[\\](){}<>]+", "");

        // проверяем длину строки на чётность
        if (inpStr.length() % 2 != 0) return false;
        else {
            // создаём словарь, где ключом будет закрывающая скобка,
            // а значением открывающая
            Map<Character, Character> map = new LinkedHashMap<>();
            map.put(')', '(');
            map.put(']', '[');
            map.put('}', '{');
            map.put('>', '<');
            // создаём очередь, в которую будем добавлять только значения из словаря
            // если символ строки совпал с этим значением,
            // а удалять в порядке очерёдности если есть совпадение символа с ключом
            // и проверять, что удалённая скобка являлась парной
            // (при несовпадении возвращаем false)
            Deque<Character> deq = new LinkedList<>();
            for (char p: inpStr.toCharArray()) {
                if (map.containsValue(p)) {
                    deq.addFirst(p);
                }
                else if (map.containsKey(p)) {
                    if (deq.isEmpty() || deq.pollFirst() != map.get(p)) {
                        return false;
                    }
                }
            }
            // проверяем очередь на отсутствие элементов
            // если очередь пустая возвращаем true, нет - false
            return deq.isEmpty();
        }
    }
}