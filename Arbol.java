
public class Arbol {
	private Nodo raiz;
	private String Recorrido;
	public Arbol() {
		raiz=null;
		Recorrido="";
	}
	//////metodo a envolver
	private void insertarDesde(Nodo noda,Nodo Desde) {
		//esto pasa cuando la raiz es null
		//es el primer elemento
	if(Desde.obtenerData()==noda.obtenerData()) {
					return;
			}
	if(noda.obtenerData()>Desde.obtenerData()) {
	//colocar ala derecha
	if(Desde.Der==null) {
			Desde.Der=noda;
			return;
	}else {
		insertarDesde(noda,Desde.Der);
		return;
	}
	}else {
		//colocar en la izquierda
		if(Desde.Izq==null) {
				Desde.Izq=noda;
				return;
				}else {
					insertarDesde(noda,Desde.Izq);
					return;
				}
			}
	}
	//metodo que envuelve wrapper
	public void insertar(Nodo noda) {
		if(raiz==null) {
			raiz=noda;
			return; 
		}
		///////////////////////////////////
		//cuando la raiz no es nula
		insertarDesde(noda,raiz);
	}
	public boolean buscar(Nodo noba) {
		return buscarDesde(noba,raiz);
	}
	private boolean buscarDesde(Nodo noba,Nodo Desde) {
		if(Desde==null) {
			return false;
		}
		//cuando el nodo es el encontrado
		if(Desde.obtenerData()==noba.obtenerData()) {
			return true;
	}
		if(noba.obtenerData()>Desde.obtenerData()) {
			//derecha
			return buscarDesde(noba,Desde.Der);
		}else {
			//izquierda
			return buscarDesde(noba,Desde.Izq);
		}
	}
	public String toStringPreorder() {
		Recorrido="";
		//////////////////////////////
		preOrder(raiz);
		/////////////////////////////
		return Recorrido;
	}
	//VID
	private void preOrder(Nodo Desde) {
		if(Desde==null) {
			return ;
		}
		Recorrido=Recorrido + " " + Desde;
		//Izq
		preOrder(Desde.Izq);
		//Der
		preOrder(Desde.Der);
	}
	//IVD
	public String toStringInOrder() {
		Recorrido="";
		//////////////////////////////
		inOrder(raiz);
		/////////////////////////////
		return Recorrido;
	}
	///////////////////////////////
	private void inOrder(Nodo Desde) {
		if(Desde==null) {
			return ;
		}
		//Izq
		inOrder(Desde.Izq);
		////
		Recorrido=Recorrido + " " + Desde;
		//Der
		inOrder(Desde.Der);
	}
	//IDV
	public String toStringPostOrder() {
	Recorrido="";
	//////////////////////////////
	postOrder(raiz);
	/////////////////////////////
	return Recorrido;
	}
	///////////////////////////////
	private void postOrder(Nodo Desde) {
		if(Desde==null) {
			return ;
		}
		//Izq
		postOrder(Desde.Izq);
		//Der
		postOrder(Desde.Der);
		////
		Recorrido=Recorrido + " " + Desde;
	}
	public boolean elim(int d) {
		Nodo aux=raiz;
		Nodo padre= raiz;
		boolean esIzq=true;
		while(aux.Data!=d) {
			padre= aux;
			if(d<aux.Data) {
				esIzq=true;
				aux=aux.Izq;
			}else {
				esIzq=false;
				aux=aux.Der;
			}
			if(aux==null) {
				return false;
			}
		}//fin del while
		////////////////////////////////////////
		// Es una hoja
		Nodo remp=obtenerNodoRemp(aux);
		if(aux.Izq==null&aux.Der==null) {
			if(aux==raiz) {
				raiz=null;
			}else if(esIzq) {
				padre.Izq=null;
			}else {
				padre.Der=null;
			}
			return true;
			/////////////////////////////////////////////
			// rama con hijo en Izq
		}else if(aux.Der == null) {
			System.out.println("rama con hijo en Izq");
			if(esIzq) {
				padre.Izq=aux.Izq;
				padre.Izq=remp;
			}else {
				padre.Der=aux.Izq;
				padre.Der=remp;
			}
			return true;
	///////////////////////////////////////////////////////
	// rama con hijo en Der
	}else if(aux.Izq == null){
	System.out.println("rama con hijo en Der");
	if(esIzq) {
	padre.Izq=aux.Der;
	padre.Izq=remp;
	}else {
	padre.Der=aux.Der;
	padre.Der=remp;
	}
	return true;
	}
	return false;
	}
	public Nodo obtenerNodoRemp(Nodo remp) {
        Nodo rempPadre=remp;
        Nodo remplazo = remp;
        Nodo aux=remp.Der;
        while(aux!=null) {
            rempPadre=remplazo;
            remplazo=aux;
            aux=aux.Izq;
        }
        // Si se encontro inmediatamente

        if(remplazo!=remp.Der) {
            remp.Der = null;
        }else{
            rempPadre.Izq = null;
        }
        ////////////////////////////
        System.out.println("El nodo remplazo es " + remp);
        return remp;
    }
	
}
