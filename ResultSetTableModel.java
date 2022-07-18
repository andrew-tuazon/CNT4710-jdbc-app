//A TableModel that supplies ResultSet data to a JTable.

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;
import java.util.Properties;
import com.mysql.cj.jdbc.MysqlDataSource;

//ResultSet rows and columns are counted from 1 and JTable
//rows and columns are counted from 0 When processing
//ResultSet rows or columns for use in a JTable, it is
//necessary to add 1 to the row or column number to maniupulate
//the appropriate ResultSet column (i.e., JTable column 0 is
//ResultSet column 1 and JTable row 0 is ResultSet row 1).

public class ResultSetTableModel extends AbstractTableModel
{
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private ResultSetMetaData metaData;
    private int numberofRows;
    private String checkQuery;
    private Statement statement;
    private Statement statement;
    private Statement statement;
    
    
    
    
}