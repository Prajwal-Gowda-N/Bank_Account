class AltPrime {
    public static void main(String[] args) {
        int count = 0;

        for (int n = 2; n <= 100; n++) {
            int i;
            for (i = 2; i < n; i++) {
                if (n % i == 0)
                    break;
            }

            if (i == n) {
                count++;
                if (count % 2 != 0)
                    System.out.print(n + " ");
            }
        }
    }
}
