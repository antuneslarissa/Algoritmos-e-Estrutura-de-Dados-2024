package Arvore;
/**
 * 
 * @autor Larissa Zózimo Antunes
 */
public class ArvoreBinaria<T> {
    private NoArvoreBinaria<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }

    public boolean estaVazia() {
        return (raiz == null);
    }

    public boolean pertence(T info) {
        return pertence(raiz, info);
    }

    private boolean pertence(NoArvoreBinaria<T> no, T info) {
        if (no == null) {
            return false;
        }
        if (no.getInfo().equals(info)) {
            return true;
        }
        return pertence(no.getEsquerda(), info) || pertence(no.getDireita(), info);
    }

    public String toString() {
        return arvorePre(raiz);
    }

    private String arvorePre(NoArvoreBinaria<T> no) {
        if (no == null) {
            return "<>";
        }
        return "<" + no.getInfo() + arvorePre(no.getEsquerda()) + arvorePre(no.getDireita()) + ">";
    }

    public int contarNos() {
        return contarNos(raiz);
    }

    private int contarNos(NoArvoreBinaria<T> no) {
        if (no == null) {
            return 0;
        }
        return 1 + contarNos(no.getEsquerda()) + contarNos(no.getDireita());
    }

    // extra methods
    public int profundidade(T info) {
        return profundidade(raiz, info, 0);
    }

    private int profundidade(NoArvoreBinaria<T> no, T info, int depth) {
        if (no == null) {
            return -1;
        }
        if (no.getInfo().equals(info)) {
            return depth;
        }
        int profundidadeEsquerda = profundidade(no.getEsquerda(), info, depth + 1);
        if (profundidadeEsquerda != -1) {
            return profundidadeEsquerda;
        }
        return profundidade(no.getDireita(), info, depth + 1);
    }

    public int contarFolhas() {
        return contarFolhas(raiz);
    }

    private int contarFolhas(NoArvoreBinaria<T> no) {
        if (no == null) {
            return 0;
        }
        if (no.getEsquerda() == null && no.getDireita() == null) {
            return 1;
        }
        return contarFolhas(no.getEsquerda()) + contarFolhas(no.getDireita());
    }

    @SuppressWarnings("unused")
	private boolean isDegenerada(NoArvoreBinaria<T> no) {
        if (no == null) {
            return true;
        }
        if ((no.getEsquerda() != null && no.getDireita() != null)
                || (!isDegenerada(no.getEsquerda())) || (!isDegenerada(no.getDireita()))) {
            return false;
        }
        return true;
    }
}
