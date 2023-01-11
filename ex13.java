






import java.util.HashMap;
import java.util.Map;

import org.junit.Test;



public class ex13 {

    public static void main(String[] args) {
    	

}


@Test
public void test5() {

	     // Map<String ,Integer> map1= Map.of("tom", 25, "memo" ,45);
	       // Map.of("tom", 25, "memo" ,45);
	        
           Map map=new HashMap();
           map.put("BB", 123);
           boolean isExist = map.containsKey("bb");
	      //不能添加
	      //map1.put("Lilei",34);

	       
		  
	
		System.out.println(map);
}
}