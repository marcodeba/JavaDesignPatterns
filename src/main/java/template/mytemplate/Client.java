package template.mytemplate;

/**
 * Created by marcopan on 17/9/26.
 */
public class Client {
    public static void main(String[] args) {
        QueryRunner queryRunner = new OracleQueryRunner();
        try {
            queryRunner.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
