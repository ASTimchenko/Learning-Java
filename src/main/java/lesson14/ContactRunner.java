package lesson14;

import lesson14.contact.Contact;
import lesson14.contact.ContactsWithOther;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ContactRunner {

    private static  final Integer LIMIT  = 1_000;
    private static  final Integer LIMIT_OF_LINKED_CONTACTS  = 100;

    public static void main(String[] args) {

        ContactsWithOther[] contacts = generateElementsInArrayAndMeasureTime(ContactRunner::fillContactArrays);
        Collection<ContactsWithOther> contacstList = generateElementsAndMeasureTime(ContactRunner::fillContactList);
        Collection<ContactsWithOther> contactsSet = generateElementsAndMeasureTime(ContactRunner::fillContactSet);

        fillLinkedContacts(contacstList);
        fillLinkedContacts(contactsSet);

        Map<Contact, Collection<Contact>> mapOfContactsWitchLinkedContacts =
                contacstList.stream().collect(Collectors.toMap(Contact::new, ContactsWithOther::getLinkedContacts));
        System.out.println(mapOfContactsWitchLinkedContacts);
        System.out.println("-------------------------------");

        Map<Contact, Integer> mapOfContacts = contacstList.stream().map(ContactsWithOther::getLinkedContacts)
                .flatMap(Collection::stream)
                .collect(Collectors.toMap(Function.identity(), contact -> 1, Integer::sum));

        System.out.println(contacstList);
        System.out.println("-------------------------------");
        System.out.println("Самый популярный контакт: ");

        mapOfContacts.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);
    }

    private static void fillLinkedContacts(Collection<ContactsWithOther> contacstList) {
        long now = System.currentTimeMillis(); //текущее время в миллисекундах
        for (ContactsWithOther contact : contacstList) {
            IntStream.range(0, LIMIT_OF_LINKED_CONTACTS).boxed()
               .map(i -> randomElement(contacstList)).forEach(contact.getLinkedContacts()::add);
        }
        long spendTime = System.currentTimeMillis() - now;
        System.out.printf("Заполнение связанных контактов %s из %d элементов потребовало %.3f секунд\n",
                contacstList instanceof List ? "списка" : "множества",
                LIMIT_OF_LINKED_CONTACTS, spendTime / 1000d);
    }

    //заполнение массива контактов
        public static ContactsWithOther[] generateElementsInArrayAndMeasureTime(Supplier<ContactsWithOther[]> supplier) {
            long now = System.currentTimeMillis(); //текущее время в миллисекундах
            ContactsWithOther[] collection = supplier.get(); //заполнение списка контактов
            long spendTime = System.currentTimeMillis() - now; //вычисление времени выполнения по заполнению списка контактов
            System.out.printf("Заполнение массива из %d элементов потребовало %.3f секунд\n", collection.length,
                    spendTime / 1000d);
            return collection;
        }

        //заполнение списка и коллекции контактов
        public static Collection<ContactsWithOther> generateElementsAndMeasureTime(Supplier<Collection<ContactsWithOther>> supplier) {
            long now = System.currentTimeMillis(); //текущее время в миллисекундах
            Collection<ContactsWithOther> collection = supplier.get(); //заполнение списка контактов
            long spendTime = System.currentTimeMillis() - now; //вычисление времени выполнения по заполнению списка контактов
            System.out.printf("Заполнение %s из %d элементов потребовало %.3f секунд\n",
                    collection instanceof List ? "списка" : "множества", collection.size(), spendTime / 1000d);
            return collection;
        }

        private static ContactsWithOther[] fillContactArrays(){
            ContactsWithOther[] contacts = new ContactsWithOther[LIMIT];
            for (int i = 0; i < contacts.length; i++) {
                contacts[i] = new ContactsWithOther();
            }
            return contacts;
        }

        private static List<ContactsWithOther> fillContactList(){
            List<ContactsWithOther> contacts = new ArrayList<>(LIMIT);
            IntStream.range(0, LIMIT).forEach(value -> contacts.add(new ContactsWithOther()));
            return contacts;
        }

        private static Set<ContactsWithOther> fillContactSet(){
            Set<ContactsWithOther> contacts = new HashSet<>(LIMIT);
            IntStream.range(0, LIMIT).forEach(value -> contacts.add(new ContactsWithOther()));
        return contacts;
    }

    private static Contact randomElement(Collection<ContactsWithOther> collection) {
        int counter = 0;
        int randomCounter = new Random().nextInt(collection.size());
        for (Contact contact: collection) {
            if (counter++ == randomCounter) {
                return contact;
            }
        }
        throw new IllegalStateException("Мы сюда зайти не должны!");
    }
}
