import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// домашнее задание по теме «Коллекции Queue»
public class Main {
    public static void main(String[] args) {

        // Далее, в main, создайте очередь на аттракцион и заполните её людьми из списка,
        // который вам вернёт метод generateClients().
        Queue<Person> queue = new LinkedList<>();
        List<Person> customers = new ArrayList<>();
        customers = generateClients();
        queue.addAll(customers);
        // Теперь заведите бесконечный цикл, который делает итерации пока очередь не пуста.
        // На каждой итерации вытаскивается из очереди следующий клиент,
        // выводится на экран сообщения вида Алексей Нетоложко прокатился на аттракционе.
        // При этом у клиента уменьшается количество билетов на 1 и, если оно не стало нулевым,
        // он вставляется обратно в очередь в её конец.

        while (!queue.isEmpty()) {
            Person client = queue.poll();
            System.out.println(client.getNameSurname() + " прокатился на аттракционе");
            client.deleteTicket();
            if (client.getNumberTickets() != 0) {
                queue.add(client);
            }
        }
    }

    //Создайте в Main статический метод List<Person> generateClients() {,
    // который бы возвращал список из порядка 5 людей, который вы заполняете прямо в коде
    // (спрашивать пользователя что-то вводить в этой задаче не нужно).
    // Придумайте данные поразнообразнее - т.е. чтобы не звали их всех одинаково и
    // чтобы не было у всех по одному билету.
    public static List<Person> generateClients() {
        List<Person> clients = new ArrayList<>();
        Person Vasiliy = new Person("Vasiliy", "Vasiliev", 3);
        Person Petya = new Person("Petya", "Pupkin", 1);
        Person Harry = new Person("Harry", "Potter", 4);
        Person Hermione = new Person("Hermione", "Granger", 5);
        Person Ronald = new Person("Ronald", "Weasley", 2);
        Person Luna = new Person("Luna", "Lovegood", 7);
        clients.add(Vasiliy);
        clients.add(Petya);
        clients.add(Harry);
        clients.add(Hermione);
        clients.add(Ronald);
        clients.add(Luna);

        return clients;
    }
}
