class TypeConversion {
    public static void main(String[] args) {

        // implicit widening
        int a = 10;
        double b = a;
        System.out.println(b);

        // explicit narrowing
        double x = 3.9;
        int y = (int)x;
        System.out.println(y);

        // string to int
        String s = "25";
        int n = Integer.parseInt(s);
        System.out.println(n);

        // int to string
        String s2 = String.valueOf(n);
        System.out.println(s2);
    }
}

