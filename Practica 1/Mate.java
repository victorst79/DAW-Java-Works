public class Mate{

	public static int factorial(int n){
		int fact = 1;
		for( int i = 1; i <= n; i--){
			fact = fact *i;
		}
		return fact;
	}

	public static boolean primo(int n){
		boolean primo = false;
		for (int i = 2; i < n ;i++ ) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int sumaDivisores(int n){
		int cont = 0;
		for (int i = 1; i < n - 1 ; i++ ) {
			if (n % i == 0) {
				cont = cont + i;
			}
		}
		return cont;
	}

	public static boolean perfecto(int n){
		boolean perfecto = false;
		if (sumaDivisores(n) == n) {
			return true;
		}else{
			return false;
		}
	}

	public static boolean amigos(int a, int b){
		boolean amigos = false;
		if (sumaDivisores(a) == b && sumaDivisores(b) == a) {
			amigos = true;
		}
		return amigos;		
	}

	public static int elMenor(int a, int b){
		if (a > b) {
			return b;
		}else{
			return a;
		}
	}
    
    // FUNCION ORDENAR ARRAY
    public static int[] ordenarArray(int[] n) {
        int aux;
        for (int i = 0; i < n.length - 1; i++) {
            for (int x = i + 1; x < n.length; x++) {
                if (n[x] < n[i]) {
                    aux = n[i];
                    n[i] = n[x];
                    n[x] = aux;
                }
            }
        }
    	return n;
    }

	public static boolean primos(int a, int b){
		boolean primos = true;
		for (int i = 2; i <= elMenor(a,b) ;i++ ) {
			if (a % i == 0 && b % i == 0) {
				primos = false;
			}
		}
		return primos;
	}

	public static int euler(int n){
		int cont = 0;
		for (int i = 1; i <= n-1 ;i++ ) {
			if ( primos(i,n) == true) {
				cont++;
			}
		}
		return cont;
	}

	public static int potencia(int a, int b){
		int potencia = a;
		for (int i = 1; i <= b ;i++ ) {
			potencia *= b;
		}
		return potencia;
	}


}