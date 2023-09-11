package Fabricas;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FabricaMuebles fabrica;
		fabrica = new FabricaMesas();
		Mueble Mesa = fabrica.Cracion();
		Mesa.Fabricacion();
		fabrica = new FabricaSilla();
		Mueble Silla = fabrica.Cracion();
		Silla.Fabricacion();
	}

}
