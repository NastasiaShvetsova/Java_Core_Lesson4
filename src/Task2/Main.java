package Task2;

public class Main {
    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();

        System.out.println("Phonebook: ");
        System.out.println("-----------------");

        //Добавляем записи
        phonebook.add("Ivanov", "89015556312");
        phonebook.add("Petrov", "89016663142");
        phonebook.add("Ivanov", "89035528513");
        phonebook.add("Popov", "89556663212");
        phonebook.add("Pavlov", "89025556314");

        //Поиск по номеру телефона
        System.out.println("Ivanov: ");
        System.out.println(phonebook.get("Ivanov"));
        System.out.println("Popov: ");
        System.out.println(phonebook.get("Popov"));
        System.out.println("Pavlov: ");
        System.out.println(phonebook.get("Pavlov"));
    }
}

