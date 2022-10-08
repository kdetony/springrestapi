package FirstApp.Dao;

import FirstApp.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value = "studentDao")
public class StudentDaoImpl implements StudentDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Student getStudent(Integer studentId) {
        String sqlQuery = "select * from STUDENT where Id = ?";
        try{
            return jdbcTemplate.queryForObject(sqlQuery, new Object[] { studentId }, new StudentRowMapper());
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
