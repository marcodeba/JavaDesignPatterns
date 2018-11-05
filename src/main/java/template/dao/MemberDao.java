package template.dao;

import template.JdbcTemplate;
import template.RowMapper;
import template.entity.Member;

import java.sql.ResultSet;
import java.util.List;

/**
 * 解耦
 * Created by Tom on 2018/3/11.
 */
public class MemberDao {

    public JdbcTemplate JdbcTemplate = new JdbcTemplate(null);

    public MemberDao(JdbcTemplate jdbcTemplate) {
        JdbcTemplate = jdbcTemplate;
    }

    public List<?> query() {
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
