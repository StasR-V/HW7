public class Main {
    public static void main(String[] args) {
        //todo Тут увольняем айтишников(Каждого второго)
        //int numberOfEmployees = 100;
        int idPerson = 2;
        while (idPerson <= 100) {
            System.out.println("Уволен айтишник с ID " + idPerson);
            idPerson+=2;
        }

    }
}
