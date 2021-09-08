package com.saraya;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarService {
	
	private static ArrayList<Car> cars = new ArrayList<Car>();
	private static int count = 10;
	
	static {
		cars.add(new Car(1, 2020,"Bmw","Red Coupe","https://images.unsplash.com/photo-1593460354583-4224ab273cfe?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8Ym13fGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));
		cars.add(new Car(2, 2021, "Mercedes", "Benz","https://images.unsplash.com/flagged/photo-1553505192-acca7d4509be?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8Ym13fGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));
		cars.add(new Car(3, 2022, "Bugati","Chirron"," https://images.unsplash.com/photo-1555215695-3004980ad54e?ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8Ym13fGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));
		cars.add(new Car(4, 2019, "Range Rover", "Sport","https://images.unsplash.com/photo-1549399542-7e3f8b79c341?ixid=MnwxMjA3fDB8MHxzZWFyY2h8N3x8Ym13fGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));	
		cars.add(new Car(5, 2020, "Chrysler"," Mini Van","https://images.unsplash.com/photo-1560253787-9c3babc1fab2?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTN8fGJtd3xlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));
		cars.add(new Car(6, 2018, "Tesla","Model 3","https://images.unsplash.com/photo-1618843479313-40f8afb4b4d8?ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8bWVyY2VkZXMlMjBhbWd8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));
		cars.add(new Car(7, 2016, "Ford", "Mustang","https://images.unsplash.com/photo-1617814076367-b759c7d7e738?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8bWVyY2VkZXMlMjBhbWd8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));
		cars.add(new Car(8, 2021, "Chevy", "Camaro","https://images.unsplash.com/photo-1616875491585-8e2464195d5f?ixid=MnwxMjA3fDB8MHxzZWFyY2h8OHx8bWVyY2VkZXMlMjBhbWd8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));
		cars.add(new Car(9, 2022, "Kia", "Sportage" ,"https://images.unsplash.com/photo-1616789916664-dce56d9009da?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTF8fG1lcmNlZGVzJTIwYW1nfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));
		cars.add(new Car(10, 2020, "Hyundai", "Santa Fe","https://images.unsplash.com/photo-1615441484279-eef5d94bdf43?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjF8fG1lcmNlZGVzJTIwYW1nfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));
		
	}
	
	public List<Car> getAllCars(){
		return cars;
	}  
	
	public void addCar(int year, String make, String model, String image) {
		cars.add(new Car(++count, year, make, model, image));
	}
	public void deleteById(int id) {
		 Iterator<Car> iterator =cars.iterator();
		 while(iterator.hasNext()) {
			 Car car = iterator.next();
			 if(car.getId()==id) {
				 iterator.remove();
			 }
		 }
	}



}


