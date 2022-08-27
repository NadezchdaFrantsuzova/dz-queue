import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Person> clients = new ArrayDeque<>(generateClients());

        while (!clients.isEmpty()) {
            Person c = clients.poll();
            if (c.tickets != 0) {
                c.tickets--;
                System.out.println(c.name + " " + c.surname + " посетил(а) аттракцион.");
                clients.add(c);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> list = new LinkedList<>();
        list.add(new Person("Петя", "Фролов", 5));
        list.add(new Person("Оля", "Петрова", 15));
        list.add(new Person("Юля", "Семенова", 3));
        list.add(new Person("Вова", "Викторов", 10));
        list.add(new Person("Жанна", "Иванова", 21));
        return list;
    }
}