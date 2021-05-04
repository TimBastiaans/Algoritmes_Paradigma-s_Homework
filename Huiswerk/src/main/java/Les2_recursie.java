public class Les2_recursie {
    public static void main(String[] args) {
        System.out.println(getalfacultijd(10));
        System.out.println(somvangetal(10));
        System.out.println(Telbinary1nen(65));
        System.out.println(reverse("appel"));

    }

    static int getalfacultijd(int n) { //dus bijvoorbeeld 5!
        if (n == 0) {
            return 1;
        } else {
            return (n * getalfacultijd(n - 1));
        }
    }

    static int somvangetal(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n + somvangetal(n - 1));
        }
    }

    static int Telbinary1nen(int n) {
        int i = 0;
        if (n > 0) {
            if ((n % 2) == 1) {
                i++;
            }
            i += Telbinary1nen(n / 2);
        }
        return i;
    }

    static String reverse(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);

    }

}
