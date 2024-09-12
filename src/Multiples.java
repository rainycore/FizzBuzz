class Multiples {
    public static void main(String args[])
    {
        int x = 1;
        int count = 0;

        // Exit when x becomes greater than 1000
        while (x < 1000) {
            // check if it is divisible by 3 or 5
            if (x % 3 == 0 || x % 5 == 0)
            {count = count + 1;}


            // next iteration
            x++;
        }
        System.out.println(count);
    }
}