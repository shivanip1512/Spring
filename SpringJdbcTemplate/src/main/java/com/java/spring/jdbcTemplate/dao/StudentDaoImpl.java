package com.java.spring.jdbcTemplate.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.java.spring.jdbcTemplate.entity.Student;

@Component("studentDAO")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student s) {
		String iq = "insert into student (id,name, address) values (?,?,?)";
		int res = this.jdbcTemplate.update(iq, s.getId(), s.getName(), s.getAddress());
		return res;
	}

	public int change(Student s) {
		String uq = "update student set name=?, address=? where id=?";
		int res = this.jdbcTemplate.update(uq, s.getName(), s.getAddress(), s.getId());
		return res;
	}

	public int delete(int id) {
		String dq = "delete from student where id=?";
		int res = this.jdbcTemplate.update(dq, id);
		return res;
	}

	public Student getStudent(int id) {
		String sq = "select * from student where id=?";
		RowMapper<Student> rowMapper = (rs, rowNum) -> {
			Student s = new Student();
			s.setId(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setAddress(rs.getString(3));
			return s;
		};
		return this.jdbcTemplate.queryForObject(sq, rowMapper, id);
	}

	@Override
	public List<Student> getAllStudents() {
		String sq = "select * from student";
		RowMapper<Student> rowMapper = (rs, numRows) -> {
			Student s = new Student();
			s.setId(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setAddress(rs.getString(3));
			return s;
		};
		List<Student> query = this.jdbcTemplate.query(sq, rowMapper);
		return query;
	}

}
