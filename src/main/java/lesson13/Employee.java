package lesson13;

import java.util.Objects;

public class Employee  implements Comparable <Employee>{

    private String fio;
    private Integer numberId;
    private int workAge;

    public Employee () {
    }

    public Employee(String fio, Integer numberId, int workAge) {
        this.fio = fio;
        this.numberId = numberId;
        this.workAge = workAge;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Integer getNumberId() {
        return numberId;
    }

    public void setNumberId(Integer numberId) {
        this.numberId = numberId;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Фамилия Имя Отчество = '" + fio + '\'' +
                ", Табельный номер = " + numberId +
                ", Стаж работы = " + workAge +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return workAge == employee.workAge && Objects.equals(fio, employee.fio) && Objects.equals(numberId, employee.numberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, numberId, workAge);
    }


    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
