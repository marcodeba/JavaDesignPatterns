package proxy.mybatisSample;

public class Client {
    public static void main(String[] args) {
        UserDao userDao = (UserDao) MybatisFactory.getMapper(UserDao.class);
        userDao.query();
    }
}
