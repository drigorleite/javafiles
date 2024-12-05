public class Car {
    private int yearModel;
    private String make;
    private int speed;

    public Car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }
    
    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }
    
    public int getYearModel() {
        return yearModel;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public String getMake() {
        return make;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    //aumenta a velocidade
    public void accelerate() {
        speed += 5;
    }
    
    public void brake() {
            if (speed >= 5) {
                speed -= 5;
        } else {
            speed = 0;
        }
    }
    
    
    
    public static void main(String[] args) {
        Car myCar = new Car(2022, "Toyota"); //criando objetos da classe car, ou seja, deixando tudo alinhado para prosseguirnmos
        
        //acelerando o carro. o for
        for (int i = 0; i < 5; i++) {
            myCar.accelerate();
            System.out.println("Speed after accelerating: " + myCar.getSpeed() + "mph");
        }
        
        //freando o carro 
        for (int i = 0; i < 5; i++) {
            myCar.brake();
            System.out.println("Speed after braking: " + myCar.getSpeed() + "mph" );
        }
    }
}
