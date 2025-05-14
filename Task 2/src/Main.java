public class Main {
    public static void main(String[] args) {
        //todo Тут увольняем айтишников(Каждого второго)
        int numberOfEmployees = 100;
        int idPerson = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                idPerson = idPerson + 2;
                System.out.println("Уволен айтишник с ID " + idPerson);
            }
        }
    }
}
