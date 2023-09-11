package Fabricas;

public class FabricaSilla extends FabricaMuebles {

	@Override
	public Mueble Cracion() {
		// TODO Auto-generated method stub
		return new Silla();
	}

}
