package template;

import template.dao.MemberDao;

public class MemberDaoTest {
    public static void main(String[] args) {

        MemberDao memberDao = new MemberDao(new JdbcTemplate(null));
        memberDao.queryResult();
    }
}
