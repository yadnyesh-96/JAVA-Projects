package com.oem.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.oem.model.Question;
import com.oem.utility.DBConnection;

public class QuestionRepositoryImpl implements QuestionRepository {

	@Override
	public List<Question> getAllQuestion(int subId) {

		List<Question> ls = new ArrayList<>();

		try {

			Connection conn = DBConnection.getConnection();

			PreparedStatement ps = conn.prepareStatement("SELECT *FROM question_set WHERE sub_id=?");

			ps.setInt(1, subId);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Question que = new Question();

				que.setQueId(rs.getInt("que_id"));
				que.setSubId(rs.getInt("sub_id"));
				que.setQuestion(rs.getString("question"));
				que.setOption1(rs.getString("option_1"));
				que.setOption2(rs.getString("option_2"));
				que.setOption3(rs.getString("option_3"));
				que.setOption4(rs.getString("option_4"));
				que.setAnswer(rs.getString("answer"));

				ls.add(que);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return ls;
	}

	@Override
	public boolean addQUestion(Question question) {

		try {

			Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement(
					"INSERT INTO question_set (sub_id,question,option_1,option_2,option_3,option_4,answer) VALUES (?,?,?,?,?,?,?)");

			ps.setInt(1, question.getSubId());
			ps.setString(2, question.getQuestion());
			ps.setString(3, question.getOption1());
			ps.setString(4, question.getOption2());
			ps.setString(5, question.getOption3());
			ps.setString(6, question.getOption4());
			ps.setString(7, question.getAnswer());

			int result = ps.executeUpdate();

			if (result > 0) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteQuestion(int queId) {

		try {

			Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("DELETE FROM question_set WHERE que_id = ?");

			ps.setInt(1, queId);

			return ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public Question getQuestionById(int queId) {
		Question q = null;

		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM question_set WHERE que_id=?");
			ps.setInt(1, queId);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				q = new Question();
				q.setQueId(rs.getInt("que_id"));
				q.setSubId(rs.getInt("sub_id"));
				q.setQuestion(rs.getString("question"));
				q.setOption1(rs.getString("option_1"));
				q.setOption2(rs.getString("option_2"));
				q.setOption3(rs.getString("option_3"));
				q.setOption4(rs.getString("option_4"));
				q.setAnswer(rs.getString("answer"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return q;
	}

	@Override
	public boolean updateQuestion(Question que) {
		try {

			Connection conn = DBConnection.getConnection();

			PreparedStatement ps = conn.prepareStatement(
					"UPDATE question_set SET sub_id=?, question=?, option_1=?, option_2=?, option_3=?, option_4=?, answer=? WHERE que_id=?");

			ps.setInt(1, que.getSubId());
			ps.setString(2, que.getQuestion());
			ps.setString(3, que.getOption1());
			ps.setString(4, que.getOption2());
			ps.setString(5, que.getOption3());
			ps.setString(6, que.getOption4());
			ps.setString(7, que.getAnswer());
			ps.setInt(8, que.getQueId());

			return ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
