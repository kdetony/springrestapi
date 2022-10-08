package FirstApp.Dao;

import FirstApp.Model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setStudentId(rs.getInt("Id"));
        student.setStudentName(rs.getString("Name"));
        student.setStudentCourse(rs.getString("Course"));
        student.setStudentEmail(rs.getString("Email"));
        return student;
    }
}
