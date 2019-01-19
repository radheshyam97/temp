package app;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

 import vo.DirectMarketingCardNotPresentAddendumRecord;
import vo.PurchasingCardAddendumRecord;
import vo.PurchasingCardFreightORShippingAddendumForVisa;

public class ClassUtil {
	public static void main(String[] args) {
		printAllMethod();
	}

public   static void printAllMethod() {
	
	Class curClass = PurchasingCardFreightORShippingAddendumForVisa.class;
	Method[] allMethods = curClass.getMethods();
	List<Method> setters = new ArrayList<Method>();
	for(Method method : allMethods) {
	    if(method.getName().startsWith("get")) {
	        setters.add(method);
	        System.out.println("sb.append(formatValue(rec."+method.getName()+"(),00,SPACE,LEFT));");
	    }
	}
}
}
