import java.util.*;
public class Bombo{
	protected boolean bombo[];
    public Bombo(int n){
		bombo=new boolean[n];
		for(int i=0; i<n; i++){
			bombo[i]=true;
		}
	}
	public int totalBolas(){
		int total=0;
		for(int i=0; i<bombo.length; i++){
			if(bombo[i]==true){
				total++;
			}
		}
		return total;
	}
	public boolean quedanBolas(){
		if(totalBolas()>0){
			return true;
		}else{
			return false;
		}
	}
	public void meteBola(int bola){
		if((bola>=0)&&(bola<bombo.length)){
			bombo[bola]=true;
		}else{
			System.out.println("No se pudo introducir la bola.");
		}
	}
	public int sacaBola(){
		int bola=-1;
		if(quedanBolas()){
			do{
				bola=(int)(Math.random()*bombo.length);
			}while(!bombo[bola]);
			bombo[bola]=false;
		}else{
			System.out.println("No quedan bolas en el interior del bombo.");
		}
		return bola;
	}
}