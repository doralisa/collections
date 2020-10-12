package ar.com.ada.online.second.collections;

import java.util.Objects;

public class Employee {
    private String name;
    private Integer dni;
    private Integer age;

    public Employee () {}

    public Employee(String name, Integer dni, Integer age) {
        this.name = name;
        this.dni = dni;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee that = (Employee) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(dni, that.dni) &&
                Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dni, age);
    }

    @Override
    public String toString() {
        return String.format (" { Nombre: %s DNI: %d Edad: %d } ", name, dni, age);
    }
}
