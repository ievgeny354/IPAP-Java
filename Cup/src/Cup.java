import java.util.Scanner;

public class Cup {
    public static void main(String[] args) {
        //cups();
        //bolts();
        bus();
    }

    private static void bus() {
        System.out.println("введите кол-во мостов: ");
        Scanner scanner = new Scanner(System.in);
        int qty = scanner.nextInt();

        int height;
        int i=0;
        boolean crashed=false;
        while (i< qty && !crashed)

        {
            i++;
            System.out.println("введите высоту моста №"+i);
            height= scanner.nextInt();
            if (height<=437) {
                System.out.println("crash под мостом "+i);
                crashed =true;
            }
        }
        if(!crashed)
            System.out.println("no Crash!");

    }

    private static void bolts() {
        for (int x = 1; x <= 2; x++) {
            System.out.println("Введите данные по складу" + x);
            System.out.println("Начальное число болтов:");
            Scanner scanner = new Scanner(System.in);
            int k1 = scanner.nextInt();
            System.out.println("Процент потерь:");
            scanner = new Scanner(System.in);
            int l1 = scanner.nextInt();
            System.out.println("Стоимость одного болта:");
            scanner = new Scanner(System.in);
            int m1 = scanner.nextInt();

            System.out.println("Начальное число гаек:");
            scanner = new Scanner(System.in);
            int k2 = scanner.nextInt();
            System.out.println("Процент потерь:");
            scanner = new Scanner(System.in);
            int l2 = scanner.nextInt();
            System.out.println("Стоимость одной гайки:");
            scanner = new Scanner(System.in);
            int m2 = scanner.nextInt();

            System.out.println("Данные по Складу" + x + ":\n" + k1 + " " + l1 + " " + m1 + "\n" + k2 + " " + l2 + " " + m2);
            int lossbolts = k1-(k1*l1/100);            //сколько болтов осталось в шт.
            int lossbolts1 = k1-lossbolts;             //потери болтов в шт.
            int lossbolts2 = lossbolts1 * m1;         //потери болтов в деньгах
            int lossnuts = k2-(k2*l2/100);             //сколько гаек осталось в шт.
            int lossnuts1 = k2-lossnuts;              //потери гаек в шт.
            int lossnuts2 = lossnuts1 * m2;           //потери гаек в деньгах
            if (lossbolts == lossnuts) {
                System.out.println("Потери по Складу№" + x + " составили=" + (lossbolts2 + lossnuts2));
            } else if (lossbolts < lossnuts) {
                double optionaloss = (lossnuts - lossbolts) * m2;
                System.out.println("Потери по Складу№" + x + " составили=" + (lossbolts2 + lossnuts2 + optionaloss));
            } else {
                double optionaloss = (lossbolts-lossnuts) * m1;
                System.out.println("Потери по Складу№" + x + " составили=" + (lossbolts2 + lossnuts2 + optionaloss));
            }

        }
    }

    private static void cups() {
        System.out.println("Сколько стоит чашка кофе?");
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextInt();

        if (price > 300) {
            System.out.println("дороговато");
        } else {
            if (price > 150 && price < 300) {
                System.out.println("норм");
            } else {
                if (price > 80 && price < 150) {
                    System.out.println("дешево");
                } else {
                    if (price < 80) {
                        System.out.println("А это в рублях? А это вообще кофе?");
                    }
                }
            }
        }
    }
}