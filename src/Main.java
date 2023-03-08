
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new ArrayDeque<>(generateClients());
        while (!queue.isEmpty()) {
            Person person = queue.poll();
            int ticket = person.getTicket();
            if (ticket > 0) {
                person.setTicket(ticket - 1);
                System.out.println(person + " -прокатился(-лась) на аттракционе. " +
                        "Осталось " + person.getTicket() + " билет(-a,-ов)");
            }
            if (ticket == 0) {
                System.out.println(person + "- билеты закончились");
            } else if (ticket > 0) {
                queue.offer(person);
            }
        }
    }
    public static List<Person> generateClients() {
        List<Person> client = new ArrayList<>();
        client.add(new Person("Кристина", "Войтова", 3));
        client.add(new Person("Станислав", "Сергиенко", 4));
        client.add(new Person("Каролина", "Максимова", 2));
        client.add(new Person("Виталий", "Иванов", 1));
        client.add(new Person("Любовь", "Коралёва", 5));
        return client;
    }
}