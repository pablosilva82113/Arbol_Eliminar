
public class Prueva {
	public static void main(String args []) {
		boolean b;
		Arbol bonsai = new Arbol();
		bonsai.insertar(new Nodo(10));
		if(bonsai.buscar(new Nodo(10))){
			System.out.println("El 10 si se encuentra");
		}
		/////////////////////////////////////
		Nodo ab;
		////////////////////////////////
		ab=new Nodo(0);
		if(bonsai.buscar(ab)){ 
			System.out.println("El "+ab+" si se encuentra");
		}else {
			System.out.println("El "+ab+" no se encuentra");
		}
		//////////////////////////////////////////////////
		ab=new Nodo(5);
		bonsai.insertar(ab);
		if(bonsai.buscar(ab)){ 
			System.out.println("El "+ab+" si se encuentra");
		}else {
			System.out.println("El "+ab+" no se encuentra");
		}
		//////////////////////////////////////////////////
		ab=new Nodo(15);
		bonsai.insertar(ab);
		if(bonsai.buscar(ab)){ 
			System.out.println("El "+ab+" si se encuentra");
		}else {
			System.out.println("El "+ab+" no se encuentra");
		}
		//////////////////////////////////////////////////
		ab=new Nodo(4);
		bonsai.insertar(ab);
		if(bonsai.buscar(ab)){ 
			System.out.println("El "+ab+" si se encuentra");
		}else {
			System.out.println("El "+ab+" no se encuentra");
		}
		//////////////////////////////////////////////////
		ab=new Nodo(16);
		bonsai.insertar(ab);
		if(bonsai.buscar(ab)){ 
			System.out.println("El "+ab+" si se encuentra");
		}else {
			System.out.println("El "+ab+" no se encuentra");
		}
		//////////////////////////////////////////////////
		ab=new Nodo(8);
		bonsai.insertar(ab);
		if(bonsai.buscar(ab)){ 
			System.out.println("El "+ab+" si se encuentra");
		}else {
			System.out.println("El "+ab+" no se encuentra");
		}
		//////////////////////////////////////////////////
		ab=new Nodo(11);
		bonsai.insertar(ab);
		if(bonsai.buscar(ab)){ 
			System.out.println("El "+ab+" si se encuentra");
			if(bonsai.elim(8)) {
				System.out.println("Nodo eliminado");
			}else {
				System.out.println("Nodo no encontrado");
			}
			
		}else {
			System.out.println("El "+ab+" no se encuentra");
		}
		//////////////////////////////////////////////////
		ab=new Nodo(11111);
		
		if(bonsai.buscar(ab)){ 
			System.out.println("El "+ab+" si se encuentra");
		}else {
			System.out.println("El "+ab+" no se encuentra");
		}
		System.out.println("PreOrder");
		System.out.println(bonsai.toStringPreorder());
		System.out.println("InOrder");
		System.out.println(bonsai.toStringInOrder());
		System.out.println("PostOrder");
		System.out.println(bonsai.toStringPostOrder());
	}
}
