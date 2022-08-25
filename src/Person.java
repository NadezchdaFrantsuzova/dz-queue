public class Person {
    public String name;
    public String surname;
    public int tickets;

    public Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }
        public void setTickets () {
            if (tickets != 0) {
                tickets--;
                System.out.println(name + " "+ surname + " посетил(а) аттракцион.");
            }
        }
    }




