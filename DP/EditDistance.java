package DP;

class EditDistance 
{ 
    static int min(int x,int y,int z) 
    { 
        if (x<=y && x<=z) return x; 
        if (y<=x && y<=z) return y; 
        else return z; 
    } 
    
    static int c = 0;
    static int[][] hash = new int[10][10];
  
    static int editDist(String str1 , String str2 , int m ,int n,int[][] hash1) 
    { 
    	
    c += 1;
    if(hash[m][n]!=0) {
    	return hash[m][n];
    }
    
    if (m == 0) {
    	hash[m][n] = n;
    	hash1[m][n] = n;
    	return n; 
    }
   
    if (n == 0) {
    	hash[m][n] = m;
    	hash1[m][n] = m;
    	return m; 
    }
    
    if (str1.charAt(m-1) == str2.charAt(n-1)) {
    	hash[m][n] = editDist(str1, str2, m-1, n-1,hash1);
    	hash1[m][n] = hash[m][n];
    	return hash[m][n];
    }
    	
    hash[m][n] = 1 + min ( editDist(str1,  str2, m, n-1,hash1),    // Insert 
                     editDist(str1,  str2, m-1, n,hash1),   // Remove 
                     editDist(str1,  str2, m-1, n-1,hash1) // Replace                      
                   ); 
    hash1[m][n] = hash[m][n];
    return hash[m][n];
    } 
  
    public static void main(String args[]) 
    { 
        String str1 = "sunday"; 
        String str2 = "saturday"; 
        
        int[][] hash1 = new int[str1.length()+1][str2.length()+1];
        
        System.out.println( editDist( str1 , str2 , str1.length(), str2.length(),hash1) +" "+c); 
       
        for(int[] h : hash){
        	for(int i: h) {
        		System.out.print(i+ " ");
        	}
        	System.out.println();
        }
        System.out.println("-------------------");
        
        for(int[] h : hash1){
        	for(int i: h) {
        		System.out.print(i+ " ");
        	}
        	System.out.println();
        }
    } 
} 