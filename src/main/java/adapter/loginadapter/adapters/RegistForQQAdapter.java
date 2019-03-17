package adapter.loginadapter.adapters;

import adapter.loginadapter.ResultMsg;

public class RegistForQQAdapter implements RegistAdapter, LoginAdapter {
    public boolean support(Object adapter) {
        return false;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
