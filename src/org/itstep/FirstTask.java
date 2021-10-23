package org.itstep;

public class FirstTask {
    static int size = 10;
    public static void main(String[] args) {
        /*
        Массив объектов
        Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы set(), get(), toString().
        Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти
        данные на консоль. В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.

        3. Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.
        Создать массив объектов. Вывести:
        a) список пациентов, имеющих данный диагноз;
        b) список пациентов, номер медицинской карты которых находится в заданном интервале.
         */
        Patient[] patients = new Patient[size];
        patients[0] = new Patient(1,"Иванов", "Иван","Иванович",
                "г. Витебск, пр-т Московский, д.5, кв. 5","555-55-99",45877,
                Diagnosis.Healthy);
        patients[1] = new Patient(2,"Петров", "Василий","Сергеевич",
                "г. Витебск, пр-т Фрунзе, д.45, кв. 54","555-44-88",55711,
                Diagnosis.Ill);
        patients[2] = new Patient(3,"Федоров","Иван",7745);
        patients[3] = new Patient(4,"Иванов", "Сергей","Игоревич",
                "г. Витебск, пр-т Московский, д.55, кв. 88","558-55-97",33568,
                Diagnosis.Healthy);
        patients[4] = new Patient(5,"Маякова", "Светлана","Вячеславна",
                "г. Витебск, пр-т Московский, д.35, кв. 35","111-55-99",4456,
                Diagnosis.Ill);
        patients[5] = new Patient(6,"Иванова", "Наталья","Сергеевна",
                "г. Витебск, ул. Смоленская, д.2, кв. 88","124-22-87",66892,
                Diagnosis.Healthy);
        patients[6] = new Patient(7,"Сергеенко", "Константин","Иванович",
                "г. Витебск, пр-т Московский, д.58, кв. 75","753-98-65",44579,
                Diagnosis.Healthy);
        patients[7] = new Patient(8,"Петров", "Василий","Иванович",
                "г. Витебск, пр-т Правды, д.75, кв. 5","754-95-62",6389,
                Diagnosis.Ill);
        patients[8] = new Patient(9,"Васильев","Иван",44698);
        patients[9] = new Patient(10,"Васильева", "Мария","Ивановна",
                "г. Витебск, пр-т Московский, д.47, кв. 56","741-96-85",65987,
                Diagnosis.Healthy);
        System.out.println("Список больных:");
        for (int i = 0; i < size; i++)
            if (patients[i].getDiagnosis() == Diagnosis.Ill) System.out.print(patients[i].toIllString());
        System.out.println();
        System.out.println("Список пациентов, номер мед. карты которых меньше 50000");
        int count = 0;
        for (int i = 0; i < size; i++)
            if (patients[i].getNumberMedMap() < 50000) {
                System.out.println(patients[i].toString());
                count++;
            }
        System.out.println("ИТОГО: " + count + " пациентов");
    }
}