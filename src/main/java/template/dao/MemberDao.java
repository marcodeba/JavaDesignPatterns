package template.dao;

import template.JdbcTemplate;
import template.RowMapper;
import template.entity.Member;

import java.sql.ResultSet;
import java.util.List;

public class MemberDao {

    public JdbcTemplate JdbcTemplate;

    public MemberDao(JdbcTemplate jdbcTemplate) {
        JdbcTemplate = jdbcTemplate;
    }

    public List<?> queryResult() {
        String sql = "select * from t_member";
        return JdbcTemplate.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));
                return member;
            }
        }, null);
    }
}
