import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Erstelle eine Liste von Personen, Jobs und Accounts
        ArrayList<Person> personen = new ArrayList<>();
        ArrayList<Job> jobs = new ArrayList<>();
        ArrayList<Account> accounts = new ArrayList<>();

        //Personen Daten
        //
        personen.add(new Person("Max Mustermann", 30, "New York"));
        personen.add(new Person("Anna Schmidt", 25, "Berlin"));

        jobs.add(new Job("Clerk", 1000, "Esslingen"));
        jobs.add(new Job("Hausfrau", 200, "Vaihingen"));

        accounts.add(new Account("DE 66 638163 7312783 73", 545465, "Kreissparkasse"));
        accounts.add(new Account("DE 66 765163 8254934 73", 846342, "BW - Bank"));

        Scanner scanner = new Scanner(System.in);

        while (true) {

            // Fordere den Benutzer auf, eine Nummer einzugeben
            System.out.println("Gib die Nummer des Mitarbeiters ein, deren Daten du sehen möchtest (1-" + personen.size() + "):");
            int num = scanner.nextInt();

            // Überprüfe, ob die Nummer gültig ist
            if (num < 1 || num > personen.size()) {
                System.out.println("Ungültige Nummer! Bitte gib eine Zahl zwischen 1 und " + personen.size() + " ein.");
                continue;
            }

            // Greife auf die Eigenschaften der Person, des Jobs und des Accounts zu, die mit der Nummer übereinstimmen
            Person person = personen.get(num - 1);
            Job job = jobs.get(num - 1);
            Account account = accounts.get(num - 1);

            String name = person.getName();
            int age = person.getAge();
            String adress = person.getAdress();
            String jobName = job.getName();
            double salary = job.getSalary();
            String jobAdress = job.getAdress();
            String iban = account.getIban();
            int blz = account.getBlz();
            String bankName = account.getBankName();

            // Gib die Eigenschaften aus
            System.out.println("Name: " + name);
            System.out.println("Alter: " + age);
            System.out.println("Adresse: " + adress);
            System.out.println("Job: " + jobName);
            System.out.println("Gehalt: " + salary + "€");
            System.out.println("Adresse: " + jobAdress);
            System.out.println("IBAN: " + iban);
            System.out.println("BLZ: " + blz);
            System.out.println("Bankname: " + bankName);


            }
        }
    }
