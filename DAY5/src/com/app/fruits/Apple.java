package com.app.fruits;

public class Apple extends Fruit{
		public Apple(double w) {
			super("Red", w, "Apple");
		}
		@Override
		public String toString() {
			return super.toString();
		}
		public String taste() {
			return "sweet n sour";
		}
		public void jam() {
			System.out.println(super.getName() + " a making jam");
		}
}
