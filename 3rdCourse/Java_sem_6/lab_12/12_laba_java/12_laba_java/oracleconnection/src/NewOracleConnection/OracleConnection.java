package NewOracleConnection;

import oracle.jdbc.pool.OracleDataSource;
import java.sql.*;

public class OracleConnection {
    public static void main(String[] args){
        OracleDataSource ods;
        try {
            ods = new OracleDataSource();
            ods.setURL("jdbc:oracle:thin:orcluser/jdbcuser@localhost:1521/xe");
            Connection conn = ods.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rset = stmt.executeQuery("Select last_name, first_name from employees");
            int colNum = getColumnNames(rset);
            if(colNum>0){
                while(rset.next()) {
                    for(int i =0; i<colNum; i++) {
                        if(i+1 == colNum)
                            System.out.println(rset.getString(i+1));
                        else
                            System.out.print(rset.getString(i+1)+ ", ");
                    }
                }
            }
            rset.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static int getColumnNames(ResultSet rs) throws SQLException {
        int numberOfColumns = 0;
        if (rs != null) {
            ResultSetMetaData rsMetaData = rs.getMetaData();
            numberOfColumns = rsMetaData.getColumnCount();
            for (int i = 1; i < numberOfColumns + 1; i++) {
                String columnName = rsMetaData.getColumnName(i);
                System.out.print(columnName + ", ");
            }
        }
        System.out.println();
        return numberOfColumns;
    }
}

