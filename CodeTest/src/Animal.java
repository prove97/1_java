public class Animal {
	public String name;
    public int count;
    
    public void cry(){ 
    	System.out.println("소리를 냅니다");
    }
    
    public void cry(String name){
    	System.out.println(name + "가 소리를 냅니다");
    }
    
    public void cry(String name, int count){
    	System.out.println(name + "가 " + count + "번 소리를 냅니다");
    }
        
}

