package adapter.loginadapter.adapters;

import adapter.loginadapter.ResultMsg;

public interface RegistAdapter {
    boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);
}
