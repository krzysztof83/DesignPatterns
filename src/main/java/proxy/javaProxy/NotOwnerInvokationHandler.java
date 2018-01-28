import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Professional on 2018-01-28.
 */
public class NotOwnerInvokationHandler implements InvocationHandler{
    PersonBean personBean;

    public NotOwnerInvokationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(personBean, args);
            } else if (method.getName().startsWith("setHotOrNotRating")) {
                return method.invoke(personBean, args);
            } else if (method.getName().startsWith("set")) {
                throw new IllegalAccessException();
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
