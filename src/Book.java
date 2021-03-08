public class Book extends Toy{

    private int pagesAmount;
    private int age;

    public Book(String name, double price, int pagesAmount, int age) {
        super(name, price);
        this.pagesAmount = pagesAmount;
        this.age = age;
    }

    public void display(){
        super.display();
        System.out.println(pagesAmount);
        System.out.println(age);
    }
}
