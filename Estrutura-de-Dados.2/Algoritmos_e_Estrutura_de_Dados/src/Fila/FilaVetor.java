package Fila;

public class FilaVetor <T> implements Fila<T>{
    /*
     * formula para inserir de forma circular
     * 
     * tamanho + inicio
     * quando o limite for < que tamanho + inicio
     * (tamanho + inicio) - limite
     * ou 
     * (tamanho + inicio)%limite(resto da divisão)
     * tamanho-1;
     */
	
	    @SuppressWarnings("unchecked")
		private T[] info;
	    private int limite;
	    private int inicio;
	    private int tamanho;
	    
	    @SuppressWarnings("unchecked")
		public FilaVetor(int limite) {
	        this.info = (T[]) new Object[limite];
	        this.limite = limite;
	        this.tamanho = 0;
	        this.inicio = 0;
	    }
	    
	    @Override    
	    public void inserir(T v) {
	        if (limite == tamanho) {
	            throw new FilaCheiaException();
	        }
	        info[((inicio + tamanho) % limite)] = v;
	        tamanho++;
	    }
	    
	    public int getLimite() {
			return limite;
		}

	    @Override    
	    public boolean estaVazia() {
	        return (tamanho == 0);
	    }
	    
	    @Override    
	    public T peek() {
	        if (estaVazia())
	            throw new FilaVaziaException();
	        return info[inicio];
	    }
	    
	    @Override    
	    public T retirar() {
	        T backup = peek();
	        
	        info[inicio] = null;
	        inicio = (inicio+1) % limite;
	        tamanho--;
	        
	        return backup;
	    }
	    
	    
	    @SuppressWarnings("unchecked")
		@Override    
	    public void liberar() {
	        info = (T[]) new Object[limite];
	        tamanho = 0;
	        inicio = 0;
	    }
	    
	    
	    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2){
	        FilaVetor<T> nova = new FilaVetor<>(this.limite + f2.limite);
	        int indice = this.inicio;
	        for (int i = 0; i < tamanho; i++) {
	           nova.inserir(this.info[indice]);
	           indice = (indice+1)%limite;
	        }
	        indice = f2.inicio;
	        for (int i = 0; i < f2.tamanho; i++) {
	           nova.inserir(f2.info[indice]);
	           indice = (indice+1)%limite;
	        }
	        return nova;
	    }
	    
	    
		@Override    
	    public String toString() {
			String retorno = "";
			int indice = inicio;
	        for (int i = 0; i < this.tamanho; i++) {
	            if(i > 0) {
	            	retorno += ", "; 
	            }
	            retorno = retorno + info[indice].toString();
	            indice = (indice + 1) % limite;
	        }
	        
	        return retorno.toString();
	    }
		
	
		
		

		public void encolher() {
			@SuppressWarnings("unchecked")
			T[] newlistfila = (T[]) new Object[tamanho];
			int indice = inicio;
			int auxilia = 0;

			while (auxilia < tamanho) {
				newlistfila[auxilia] = info[indice];
				indice = (indice + 1) % limite;
				auxilia++;
			}

			info = newlistfila;
			limite = tamanho;
			inicio = 0;
		}
}
	
	
	

