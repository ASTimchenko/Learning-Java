package lesson13;

import java.util.*;

public class EmployeeRunner {

    public static void main(String[] args) {
        String lastName = "Тимченко ";
        String firstName = "Андрей ";
        String patronymic = "Сергеевич";
        String fio = lastName + firstName + patronymic;

        List<Employee> employees = new LinkedList<>();

        employees.add(new Employee(fio, 1, 10));
        employees.add(new Employee("Сидоров Семён Семёнович", 2, 6));
        employees.add(new Employee("Петров Пётр Петрович", 3, 8));
        employees.add(new Employee("Новиков Александр Ильич", 10, 12));
        employees.add(new Employee("Смирнов Иван Георгиевич", 12, 1));
        employees.add(new Employee("Волков Андрей Викторович", 5, 9));
        employees.add(new Employee("Лебедев Николай Владимирович", 4, 14));
        employees.add(new Employee("Морозов Егор Константинович", 11, 2));
        employees.add(new Employee("Федоров Назар Романович", 7, 11));

        System.out.println("Полный список сотрудников");
        System.out.println(employees);

        System.out.println("--------------------------------");
        System.out.println("ФИО сотрудников, стаж которых не менее 10 лет/года");
        System.out.println();

        ListIterator<Employee> iterator = employees.listIterator();
        while (iterator.hasNext()) {
            Employee currentEmployee = iterator.next();
            if (currentEmployee.getWorkAge() >= 10) {
                System.out.println(currentEmployee.getFio() + ", стаж работы = " + currentEmployee.getWorkAge() + " лет/года");
            }
        }

        while (iterator.hasPrevious()) {
            int currentEmployeeIndex = iterator.previousIndex();
            iterator.previous();
            if (currentEmployeeIndex % 2 != 0) {
                iterator.remove();
            }
        }

        System.out.println("--------------------------------");
        System.out.println("Cписок сотрудников, у которых табельный номер является нечётным числом");
        System.out.println();
        System.out.println(employees);


    }
}

