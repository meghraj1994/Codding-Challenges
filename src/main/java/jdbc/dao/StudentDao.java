package jdbc.dao;

import jdbc.connection.ConnectionProvider;
import jdbc.entity.Student;

import java.sql.*;

public class StudentDao {

    public boolean flag = false;

    public boolean saveStudent(Student student) {

        try {
            //step 1 : get connection
            Connection connection = ConnectionProvider.createConnection();

            //step 2 : prepare statement for Dynamic query
            String query = "insert into students(sname,sphone,scity) values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // step 3 : set the values
            preparedStatement.setString(1, student.getStudentName());
            preparedStatement.setString(2, student.getStudentPhone());
            preparedStatement.setString(3, student.getStudentCity());

            //step 4 : execute statement
            // for prepare statement(dynamic query) = executeUpdate()
            // for statement (static query) = excuteQuery()

            preparedStatement.executeUpdate();
            flag = true;

//            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return flag;
    }

    //to delete student

    public boolean deteleStudent(int sid) {
        boolean f = false;

        try {
            //step 1 : get Connection
            Connection connection = ConnectionProvider.createConnection();

            //write prepare stement
            String query = "delete from students where sid = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, sid);

            preparedStatement.executeUpdate();
            f = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return f;
    }

    public void displayStudent() {

        try {
            Connection connection = ConnectionProvider.createConnection();

            String query = "select * from students";

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println("id :"+resultSet.getInt(1) +"sname : "+resultSet.getString(2));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
