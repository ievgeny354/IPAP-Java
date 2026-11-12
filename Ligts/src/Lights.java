import java.util.Scanner;

public class Lights {
    public static void main(String[] args) {
        int n = input(), x;
        if (n >= 1 && n <= 100) {
            int t = getT();
            x = n - t;
            if (x < 0) {
                System.out.println("введены некорректные данные");
            } else {
                calc(t, x, n);
            }
        }
    }

    private static void calc(int t, int x, int n) {
        intersecQty(t, x);
        int light = t * 3 + x * 4;
        int tunnel = n * (n - 1) / 2;
        output(tunnel, light);
    }

    private static void intersecQty(int t, int x) {
        System.out.println("Перекрестков Т-типа (4е светофора):" + t);
        System.out.println("Перекрестков X-типа (3и светофора):" + x);
    }

    private static int getT() {
        Scanner st = new Scanner(System.in);
        System.out.println("Введите кол-во перекрестков Т-типа:");
        int t = st.nextInt();
        return t;
    }

    private static void output(int tunnel, int light) {
        System.out.println("Всего туннелей:" + tunnel);
        System.out.println("Всего светофоров:" + light);
    }

    static int input () {
            Scanner sn = new Scanner(System.in);
            System.out.println("Введите общее кол-во перекрестков:");
            int n = sn.nextInt();
            return n;
        }
    }


