import java.lang.reflect.*;

/**
 * Created by Professional on 2018-01-28.
 */
public class OwnerInvokationHandler implements InvocationHandler {
    PersonBean personBean;

    public OwnerInvokationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {

        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(personBean, args);
            } else if (method.getName().startsWith("setHotOrNotRating")) {
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("set")) {
                return method.invoke(personBean, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
