public class ToyShopRepo {

    private Bear[] bears = new Bear[10];
    private int bearIndex = 0;
    private Car[] cars = new Car[10];
    private int carIndex = 0;


    public void addBear(Bear bear){
        if(bearIndex < bears.length){
            bears[bearIndex++] = bear;
        } else {
            bearIndex = 0;
        }
    }

    public void addCar(Car car) {
        if (carIndex < cars.length) {
            cars[carIndex++] = car;
        } else {
            carIndex = 0;
        }
    }

    public void displayAll(){
        for (int i = 0; i < bearIndex; i++) {
            bears[i].display();
        }
        for (int i = 0; i < carIndex; i++) {
            cars[i].display();
        }
    }
}
