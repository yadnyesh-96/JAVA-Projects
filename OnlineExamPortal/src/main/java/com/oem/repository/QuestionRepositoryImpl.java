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

}
