package practico7_Ej1;

import java.util.ArrayList;

public class EmpresaAgricola {
	private ArrayList<ProductoQuimico> productos;
	
	public EmpresaAgricola() {
		productos = new ArrayList<>();
	}
	
	public ArrayList<ProductoQuimico> filtrarProductosPor(Filtro filtro){
		ArrayList<ProductoQuimico> resultado = new ArrayList<>();
		
		for(int i = 0; i < productos.size(); i++) {
			ProductoQuimico productoQuimico = productos.get(i);
			if(filtro.cumpleCondicion(productoQuimico)) { 
				resultado.add(productos.get(i));
			}
		}
		
		return resultado;
	}
	
	//PRIMERA SOLUCION, SE PUEDE VER QUE ESTA MAL PORQUE LOS METODOS SON MUY SIMILARES
	
//	public ArrayList<ProductoQuimico> productosQueTratan(Enfermedad e){ 
//		ArrayList<ProductoQuimico> resultado = new ArrayList<>();
//		for(int i = 0; i < productos.size(); i++) {
//			if(productos.get(i).trataEnfermedad(e)) {
//				resultado.add(productos.get(i));
//			}
//		}
//		
//		return resultado;
//	}
//	
//	public ArrayList<ProductoQuimico> productosQueTratan(Enfermedad enf, Cultivo cult){
//		ArrayList<ProductoQuimico> resultado = new ArrayList<>();
//		for(int i = 0; i < productos.size(); i++) {
//			if(productos.get(i).trataEnfermedad(enf) && !productos.get(i).cultivoEstaDesaconsejado(cult)) {
//				resultado.add(productos.get(i));
//			}
//		}
//		
//		return resultado;
//	}
	
	
}
