class Prime {
    public static void main(String[] args) {
        int n = 7, i;

        for (i = 2; i < n; i++) {
            if (n % i == 0)
                break;
        }

        if (i == n)
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");
    }
}
