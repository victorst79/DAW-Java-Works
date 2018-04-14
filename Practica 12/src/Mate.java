public class Mate 
{
	public static final double PI=3.1416;
	public static boolean primo(int n) {
		for(int i=2; i<=n/2; i++)
			if(n%i==0)
				return false;
		return true;
	}
	public static long factorial(int n){
		long fac=1;
		for(int i=1; i<=n; i++)
			fac=fac*i;
		return fac;
	}
	public static int elMenor(int n, int m){
		if(n>m)
			return m;
		return n;
	}
	public static int elMayor(int n, int m){
		if(n>m)
			return n;
		return m;
	}
	public static boolean primos(int n, int m) {
		for(int i=2; i<=elMenor(n, m); i++)
			if(n%i==0 && m%i==0)
				return false;
		return true;
	}
	public static int sumaDivisores(int n) {
		int suma=0;
		for(int i=1; i<=n/2; i++)
			if(n%i==0)
				suma=suma+i;
		return suma;
	}
	public static boolean perfecto(int n) {
		if(n==sumaDivisores(n))
			return true;
		return false;
	}
	public static boolean amigos(int n, int m) {
		if(n==sumaDivisores(m) && m==sumaDivisores(n))
			return true;
		return false;
	}
	public static int euler(int n) {
		int cont=0;
		for(int i=1; i<n; i++)
			if(primos(n, i))
				cont++;
		return cont;
	}
        public static double divide(double op1, double op2) throws DivisionPorCeroException{
            if(op2==0) {
                DivisionPorCeroException e = new DivisionPorCeroException();
                throw e;
            } else
                return op1/op2;
        }
}
