class Cat {

    // write static and instance variables
    String name;
    int age;
    public static int counter = 0;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;

        if(getNumberOfCats() > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }
}