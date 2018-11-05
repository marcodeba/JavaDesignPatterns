package template.mytemplate;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 * Created by marcopan on 17/9/26.
 */
public abstract class QueryRunner {
    public abstract Connection createConnection();

    public abstract String createSQL();

    public abstract ResultSet runSQL(Connection conn, String sql);

    public ResultSet run() throws Exception {
        Connection conn = null;
        String sql = "";
        try {
            conn = this.createConnection();
            sql = this.createSQL();
            return runSQL(conn, sql);
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
}
