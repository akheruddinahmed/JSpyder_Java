class C{
    public static void m3()
    {
        System.out.println("m3 in class c");
    }
}

class Main{
    public static void main(String[] args) {
        System.out.println("execution starts");
        C.m3();
        System.out.println("ends");
    }

}