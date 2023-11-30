package KR2;

import java.util.*;



public final class TechnicalUniversity extends University implements Inventory, Workers, Students, Schedule{
    protected TreeMap<String, Integer> inventory;
    private int countWorker;
    private int countStudent;
    private ArrayList<String[]> schedule;
    public static String opisanie;
    {
        countWorker = 0;
        countStudent = 0;
    }
    static{
        opisanie="Класс Технический Университет, наследуемый от класса Университет. В нем дополнительно введены: список" +
                " инвентаря, информация о сотрудниках, студентах и парах.\n";
    }
    TechnicalUniversity(){}
    TechnicalUniversity(String name, int year, String address, int countRoom){
        super(name, year, address, countRoom);
        inventory = invent;
        countWorker = getCountWorker();
        countStudent = getCountStudent();
        schedule = Schedule.schedule;
    }

    @Override
    public void displayInventory() {
        System.out.println(invent);
    }
    Scanner s = new Scanner(System.in);
    @Override
    public void changeInventory() {
        System.out.println("Добавить - 1, Изменить количество - 2, Удалить - 3\n" +
                "Введите цифру: ");
        int a = s.nextInt();
        s.nextLine();
        switch (a){
            case 1:
                System.out.println("Введите название предмета: ");
                String nazvanie = s.nextLine().toLowerCase();
                System.out.println("Введите количество: ");
                int kolvo = s.nextInt();
                invent.put(nazvanie, kolvo);
                System.out.println("Добавлено");
                break;
            case 2:
                System.out.println("Введите название предмета: ");
                String nazvan = s.nextLine().toLowerCase();
                if(invent.containsKey(nazvan)){
                    System.out.println("Введите новое количество: ");
                    int kolv = s.nextInt();
                    invent.put(nazvan, kolv);
                    System.out.println("Изменено");
                    return;
                }else{
                    System.out.println("Такого предмета нет");
                    return;
                }
            case 3:
                System.out.println("Введите название предмета: ");
                String naz = s.nextLine().toLowerCase();
                if(invent.containsKey(naz)){
                    invent.remove(naz);
                    System.out.println("Удалено");
                    return;
                }else{
                    System.out.println("Такого предмета нет");
                    return;
                }
            default:
                System.out.println("Неправильно введена цифра");
                break;
        }
    }

    @Override
    public void displayWorkers() {
        System.out.println(workers);
    }

    @Override
    public void addWorkers() {
        System.out.println("");
        String F = s.nextLine().toLowerCase();
        System.out.println("Введите ФИО сотрудника: ");
        String FIO = s.nextLine().toLowerCase();
        System.out.println("Введите должность сотрудника: ");
        String dol = s.nextLine().toLowerCase();
        workers.put(FIO, dol);
        System.out.println("Добавлено");
    }
    public void addWorkers(String[][] a) {
        for(String[] el: a){
            workers.put(el[0].toLowerCase(), el[1].toLowerCase());
        }
        System.out.println("Добавлено");
    }

    @Override
    public void delWorkers() {
        System.out.println("Введите ФИО сотрудника, которого хотите удалить: ");
        String FIO = s.nextLine().toLowerCase();
        if(workers.containsKey(FIO)){
            workers.remove(FIO);
            System.out.println("Удалено");
        }
        else System.out.println("Такого сотрудника не существует");
    }

    @Override
    public void changeWorkers() {
        System.out.println("Введите ФИО сотрудника, которого хотите изменить: ");
        String FIO = s.nextLine().toLowerCase();
        if(workers.containsKey(FIO)){
            System.out.println("Введите новую должность сотрудника: ");
            String dol = s.nextLine().toLowerCase();
            workers.put(FIO, dol);
            System.out.println("Изменено");
        }
        else System.out.println("Такого сотрудника не существует");
    }

    @Override
    public void displayStudents() {
        System.out.println(students);
    }

    @Override
    public void addStudents() {
        System.out.println("Введите группу студента: ");
        String group = s.nextLine().toLowerCase();
        if(students.containsKey(group)){
            System.out.println("Введите ФИО студента: ");
            String FIO = s.nextLine().toLowerCase();
            TreeSet<String> novoe = new TreeSet<>();
            novoe.addAll(students.get(group));
            novoe.add(FIO);
            students.put(group, novoe);
            System.out.println("Добавлено");
        }else{
            System.out.println("Введите ФИО студента: ");
            String FIO = s.nextLine().toLowerCase();
            TreeSet<String> novoe = new TreeSet<>();
            novoe.add(FIO);
            students.put(group, novoe);
            System.out.println("Добавлено");
        }
    }

    @Override
    public void delStudents() {
        System.out.println("Введите группу студента: ");
        String group = s.nextLine().toLowerCase();
        if(students.containsKey(group)){
            System.out.println("Введите ФИО студента: ");
            String FIO = s.nextLine().toLowerCase();
            if(students.get(group).contains(FIO)){
                TreeSet<String> novoe = new TreeSet<>();
                novoe.addAll(students.get(group));
                novoe.remove(FIO);
                students.put(group, novoe);
                System.out.println("Удалено");
            }else System.out.println("Такого студента не существует");
        }else System.out.println("Такой группы не существует");
    }

    @Override
    public void displaySchedule() {
        System.out.println("Просмотреть по группе - 1, По преподавателю - 2, Просмотреть всё - 3\n" +
                "Введите цифру: ");
        int a = s.nextInt();
        s.nextLine();
        switch (a) {
            case 1:
                System.out.println("Введите группу: ");
                String group = s.nextLine().toLowerCase();
                for (String[] el : Schedule.schedule) {
                    if (el[1].equals(group)) System.out.println(Arrays.toString(el));
                }
                break;
            case 2:
                System.out.println("Введите ФИО преподавателя: ");
                String FIO = s.nextLine().toLowerCase();
                for (String[] el : Schedule.schedule) {
                    if (el[0].equals(FIO)) System.out.println(Arrays.toString(el));
                }
                break;
            case 3:
                for(String[] el: Schedule.schedule){
                    System.out.println(Arrays.toString(el));
                }
                break;
            default:
                System.out.println("Неправильно введена цифра");
                break;
        }
    }

    @Override
    public void addSchedule() {
        System.out.println("Введите ФИО преподавателя: ");
        String FIO = s.nextLine().toLowerCase();
        System.out.println("Введите группу: ");
        String group = s.nextLine().toLowerCase();
        System.out.println("Введите название дисциплины: ");
        String dis = s.nextLine().toLowerCase();
        System.out.println("Введите день недели: ");
        String day = s.nextLine().toLowerCase();
        System.out.println("Введите время пары (формат hh:mm - hh:mm): ");
        String time = s.nextLine().toLowerCase();
        String[] reader = {FIO, group, dis, day, time};
        Schedule.schedule.add(reader);
    }

    @Override
    public void delSchedule() {
        System.out.println("Введите ФИО преподавателя: ");
        String FIO = s.nextLine().toLowerCase();
        System.out.println("Введите группу: ");
        String group = s.nextLine().toLowerCase();
        System.out.println("Введите название дисциплины: ");
        String dis = s.nextLine().toLowerCase();
        System.out.println("Введите день недели: ");
        String day = s.nextLine().toLowerCase();
        for(String[] el : Schedule.schedule) {
            if (el[0].equals(FIO) && el[1].equals(group) && el[2].equals(dis) && el[3].equals(day)) Schedule.schedule.remove(el);
        }
    }

    public int getCountWorker() {
        return workers.size();
    }

    public int getCountStudent() {
        return students.size();
    }
    public void displayAll(){
        System.out.printf("Название: %s\nГод постройки: %d\nАдрес: %s\nКоличсетво аудиторий: %d\nИнвентарь: " + invent
                        + '\n' + "Количество сотрудников: %d\nКоличество студентов: %d\n\n",
                getName(), getYear(), getAddress(), getCountRoom(), getCountWorker(), getCountStudent());
    }
}

