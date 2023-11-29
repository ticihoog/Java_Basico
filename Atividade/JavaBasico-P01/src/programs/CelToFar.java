	package programs;
	
	public class CelToFar {
		private float temperature;
		private char option;
	
		public CelToFar(float temperature, char option) {
			super();
			this.temperature = temperature;
			this.option = option;
		}
	
		public float getTemperature() {
			return temperature;
		}
	
		public void setTemperature(float temperature) {
			this.temperature = temperature;
		}
	
		public char getOption() {
			return option;
		}
	
		public void setOption(char option) {
			this.option = option;
		}
	
		public float convertTemperature() {
		    if (getOption() == 'F') {
		        return (getTemperature() * 9/5) + 32;
		    } else if (getOption() == 'C') {
		        return (getTemperature() - 32) * 5/9;
		    }
		    return 0;
		}
		
	}
