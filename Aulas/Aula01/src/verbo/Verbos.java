package verbo;

public class Verbos {

	private String radical;
	private String sufixo;
	public Verbos(String radical, String sufixo) {
		super();
		this.radical = radical;
		this.sufixo = sufixo;
	}
	public String getRadical() {
		return radical;
	}
	public void setRadical(String radical) {
		this.radical = radical;
	}
	public String getSufixo() {
		return sufixo;
	}
	public void setSufixo(String sufixo) {
		this.sufixo = sufixo;
	}
	
	public void conjugar() {
		System.out.println("Eu " +radical+"o");
		System.out.println("Tu "+radical+"as");
		System.out.println("Ele "+radical+"a");
		System.out.println("Nos "+radical+"amos");
		System.out.println("Vos "+radical+"ais");
		System.out.println("Eles "+radical+"am");
	}
	
	public static void main(String[] args) {
		Verbos verbo = new Verbos ("Program" , "ar");
		verbo.conjugar();
	}
}
