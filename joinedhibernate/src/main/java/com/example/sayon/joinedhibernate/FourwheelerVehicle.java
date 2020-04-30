package com.example.sayon.joinedhibernate;


import javax.persistence.Entity;

       @Entity
      public class FourwheelerVehicle extends Vehicle {
	
	
		private String Steeringwheel;

		public String getSteeringwheel() {
			return Steeringwheel;
		}

		public void setSteeringwheel(String steeringwheel) {
			Steeringwheel = steeringwheel;
		}
		
	}
