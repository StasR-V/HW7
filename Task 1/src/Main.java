import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )
        boolean isTrue = false;
        //todo реализовать ввод пользователем кол-ва ингредиентов.
        System.out.println("Количество ингредиента 'Жабьи глаза'");
        toadEyesCount = new Scanner(System.in).nextInt();
        System.out.println("Количество ингредиента 'Слёзы вурдалака'");
        ghoulTearsCount = new Scanner(System.in).nextInt();
        System.out.println("Количество ингредиента 'Кости ворона'");
        ravenBonesCount = new Scanner(System.in).nextInt();
        System.out.println("Количество ингредиента 'Пельмени'");
        dumplingsCount = new Scanner(System.in).nextInt();

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда
        if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
            System.out.println("Элексир зоркости");
            isTrue = true;
        }
        if (ravenBonesCount > 1 && dumplingsCount >= 4) {
            System.out.println("Элексир стойкости");
            isTrue = true;
        }
        if ((toadEyesCount > 1 && dumplingsCount >= 1) && ghoulTearsCount >= 7) {
            System.out.println("Элексир скрытности");
            isTrue = true;
        }
        if ((toadEyesCount >= 4 && dumplingsCount >= 10) && (ghoulTearsCount >= 5 && ravenBonesCount >= 3)) {
            System.out.println("Элексир запретный");
            isTrue = true;
        }
        if (isTrue == false){
            System.out.println("У вас не хватает ингредиентов ни на один элексир. Доставайте оружие из широких штанин" +
                    " и чешите на данж!");
        }
    }
}
