package CARRO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		carro pm =  new carro();
		pm.dono.setNome("Mateus");
		pm.dono.setEnderešo("Rua de Fogo,130");
		pm.pešaMotor.setMarca("Nissan");
		pm.pešaMotor.setPotencia(400);
		pm.pešaMotor.setCilindros(8);
		pm.pešaMotor.setConbustivel("Gasolina");
		pm.setAno(2000);
		pm.setCor("Azul");
		pm.setModelo("SkyLine");
		pm.setFabricante("Toshiba");
		System.out.println((pm));
		
		
	}

}
