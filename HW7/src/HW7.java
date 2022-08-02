public class HW7{	
	//car class
	static class Car{
		public int yearModel;
		//declaring variables
		public String make;
		public int speed;
		//constructor
		public Car(double year, String mk){
			yearModel = (int)year;
			make = mk;
			speed = 0;
		}
		//accelerate method
		public void accelerate(){
			speed += 5;
		}
		//brake method
		public void brake(){
			speed -= 5;
			if (speed < 0) 
				speed = 0;
		}
		//accessors
		public int getYearModel() {
			return yearModel;
		}

		public void setYearModel(int yearModel) {
			this.yearModel = yearModel;
		}

		public String getMake() {
			return make;
		}

		public void setMake(String make) {
			this.make = make;
		}

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}
	}
	//FuelGauge class
	static class FuelGauge{
		//declaring variables
		public static int max = 15;
		public double gallons;
		//constructor
		public FuelGauge() {
			gallons = 0;
		}
		
		public FuelGauge(int gallons) {
			if (gallons <= max) {
				this.gallons = gallons;
			} else {
				gallons = max;
			}
		}
		//first method
		public double getGallons() {
			return gallons;
		}
		//second method
		public void addGallons() {
			if (gallons < max) {
				gallons++;
			} else {
				System.out.println("Fuel Overflow");
			}
		}
		//burn fuel method
		public void burnFuel() {
			if (gallons > 0.0) {
				gallons--;
				//Math.random implementation
				gallons+=Math.random();
			} else {
				System.out.println("Fuel Empty");
			}
		}
	}
	//Odometer method
	 static class Odometer {
		 //declaring variables
		public int maxim = 999999;
		public int MPG = 24;
		public int initialMileage;
		public int mileage;
		public FuelGauge fuelGauge;
		//constructor
		public Odometer(int mileage, FuelGauge fuelGauge) {
			this.initialMileage = mileage;
			this.mileage = mileage;
			this.fuelGauge = fuelGauge;
		}
		//first method
		public int getMileage() {
			return mileage;
		}
		//second method
		public void addMileage() {
			if (mileage < maxim) {
				mileage++;
			} else {
				mileage = 0;
			}
			int driven = initialMileage - mileage;
			if (driven % MPG == 0) {
				fuelGauge.burnFuel();
			}
		}
	}
	//main method
	public static void main(String[]args){
		//calling classes
		Car car = new Car(2000,"Toyota");
		FuelGauge fuel = new FuelGauge();
		Odometer odometer = new Odometer(0, fuel);

		for (int x = 0; x < FuelGauge.max; x++) {
			fuel.addGallons();
		}
		//counter for speed
		int i =0;
		int j =0;
		while (fuel.getGallons() >0) {
			odometer.addMileage();
			//increments at multiples of 5
			if(i%5==0){
				car.accelerate();
			}
			if(j%5!=0){
				car.brake();
			}
	
			System.out.println("Mileage: " + odometer.getMileage());
			System.out.println("Fuel level: "+fuel.getGallons()+ " gallons");
			System.out.println("Speed: " + car.getSpeed() + " mph");
			System.out.println("------------------------------");
			i*=5;
			j++;
			}
	}
}