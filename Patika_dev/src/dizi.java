
public class dizi {
		
    static void yaz(int[] yeni,int a) {
		int maxYak=0;
		int minYak=0;
		
		 for(int i=0;i<yeni.length;i++) {
		   if(yeni[i]>a) maxYak=yeni[i];	 
		   else minYak= yeni[i];	 
			 
			 
		 }
		
		  for(int i=0;i<yeni.length;i++) {
			  
		    if(yeni[i]>a && yeni[i]<maxYak)	{  
			  maxYak=yeni[i];
		    }  
		  
		    if(yeni[i]<a && yeni[i]>minYak)	{  
				  minYak=yeni[i];
		    }  
		  }		
			
		 System.out.println("Girilen sayıdan küçük en yakın sayı :"+ minYak);
		 System.out.println("Girilen sayıdan büyük en yakın sayı :"+ maxYak);
			
		}
		
		
		
	public static void main(String[] args) {
		
		int[] dizi1= {2,7,-2,12,6};
		int sayi=5;
	    yaz(dizi1,sayi);	

	}
		

	}
