import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Person> clients = new ArrayDeque<>(generateClients());

        while (!clients.isEmpty()) {
            Person c = clients.poll();
            if (c.tickets != 1) {
                c.tickets--;
                System.out.println(c.name + " " + c.surname + " посетил(а) аттракцион.");
                clients.add(c);
            } else {
                c.tickets--;
                System.out.println(c.name + " " + c.surname + " посетил(а) аттракцион, билеты закончились.");
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> list = new LinkedList<>();
        list.add(new Person("Петя", "Фролов", 3));
        list.add(new Person("Оля", "Петрова", 7));
        list.add(new Person("Юля", "Семенова", 3));
        list.add(new Person("Вова", "Викторов", 1));
        list.add(new Person("Жанна", "Иванова", 10));
        return list;
    }
}