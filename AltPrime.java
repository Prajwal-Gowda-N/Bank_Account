class AltPrime {
    public static void main(String[] args) {
        int c = 0;
        for (int n = 2; n <= 50; n++) {
            boolean p = true;
            for (int i = 2; i <= Math.sqrt(n); i++)
                if (n % i == 0) p = false;
            if (p && ++c % 2 == 1)
                System.out.print(n + " ");
        }
    }
}
