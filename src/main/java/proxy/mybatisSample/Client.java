package proxy.mybatisSample;

public class Client {
    public static void main(String[] args) {
        UserDao userDao = (UserDao) MybatisFactory.getInstance(UserDao.class);
        userDao.query();
    }
}
