package Main;


public class Sport {
	private String name;
	private Training training;
	private String summary;
	public Sport() {

	}
	
	
	
	public Sport(String name, String summary) {
		this.name=name;
		this.summary=summary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSum(String sum) {
		this.summary = sum;
	}
	
	public void setTraining(Training training) {
		this.training=training;
	}
	
	public Training getTraining() {
		return training;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSum() {
		return summary;
	}
}
