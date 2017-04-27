import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ObjectFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String className = "ConfigParser";

		try {
			Class instance = Class.forName(className);
			Object obj = instance.newInstance();
			Method methods[] = instance.getDeclaredMethods();
			int len = methods.length;
			for (int i = 0; i < len; i++) {
				if(methods[i].getName().equals("main")){
					methods[i].invoke(obj, new String[1]);
				}
			}
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
