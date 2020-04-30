package com.example.sayon.TableperClass;

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



