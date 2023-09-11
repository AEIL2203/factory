package Fabricas;

public class FabricaMesas extends FabricaMuebles {

	@Override
	public Mueble Cracion() {
		// TODO Auto-generated method stub
		return new Mesas();
	}

}
