package org.itstep;

public class Patient{
    private int id;
    private String family;
    private String name;
    private String secondName;
    private String address;
    private String telethon;
    private int numberMedMap;
    private Diagnosis diagnosis;

    Patient(int id, String family, String name, String secondName, String address,
            String telethon, int numberMedMap, Diagnosis diagnosis){
        this.id = id;
        this.family = family;
        this.name = name;
        this.secondName = secondName;
        this.address = address;
        this.telethon = telethon;
        this.numberMedMap = numberMedMap;
        this.diagnosis = diagnosis;
    }
    Patient (int id, String family, String name, int numberMedMap){

        this.id = id;
        this.family = family;
        this.name = name;
        this.numberMedMap = numberMedMap;
    }

    public int getId() {
        return id;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelethon() {
        return telethon;
    }

    public void setTelethon(String telethon) {
        this.telethon = telethon;
    }

    public int getNumberMedMap() {
        return numberMedMap;
    }

    public void setNumberMedMap(int numberMedMap) {
        this.numberMedMap = numberMedMap;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }
    public String toString() {
        String sTelethon = new String();
        String sAddress = new String();
        String sDiagnosis = new String();
        String sSecondName = new String();
        if (secondName == null) sSecondName = "не указано";
        else sSecondName = secondName;
        if (telethon == null) sTelethon = "не указан";
        else sTelethon = telethon;
        if (address == null) sAddress = "не указан";
        else sAddress = address;
        if (diagnosis == Diagnosis.Healthy) sDiagnosis = "здоров";
        else if (diagnosis == Diagnosis.Ill) sDiagnosis = "болен";
        else sDiagnosis = "не указан";
        return String.format("Личный номер пациента: %d%n" +
                             "       Фамилия: %s, Имя: %s, Отчество: %s%n" +
                             "       Телефон: %s, Адрес: %s%n" +
                             "       Номер медицинской карты: %d%n" +
                             "       Диагноз: %s%n",
                id,
                family,
                name,
                sSecondName,
                sTelethon,
                sAddress,
                numberMedMap,
                sDiagnosis);
    }
    public String toIllString() {
        String sSecondName = new String();
        if (secondName == null) sSecondName = "";
        else sSecondName = secondName;
        return String.format("Пациент №%s: %s %s %s%n",
                id,
                family,
                name,
                sSecondName);

    }
}
