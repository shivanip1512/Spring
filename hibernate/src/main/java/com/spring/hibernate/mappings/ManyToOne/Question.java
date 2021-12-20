package com.spring.hibernate.mappings.ManyToOne;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "q_id")
	private int questionId;
	private String question;

	@OneToMany(mappedBy = "question")
	private List<Answer> ans;

	public List<Answer> getAns() {
		return ans;
	}

	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

}
