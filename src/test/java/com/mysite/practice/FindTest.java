package com.mysite.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;



import java.util.List;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.practice.question.Question;
import com.mysite.practice.question.QuestionRepository;

@SpringBootTest
public class FindTest {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Test
	void testJpa() {
		/*
		 * List<Question> all = this.questionRepository.findAll(); assertEquals(4,
		 * all.size());
		 * 
		 * Question q = all.get(0); assertEquals("sbb가 무엇인가요?",q.getSubject());
		 */
		
//		Optional<Question>oq = this.questionRepository.findById(1);
//		if(oq.isPresent()) {
//			Question q = oq.get();
//			assertEquals("sbb가 무엇인가요?", q.getSubject());
//		}
		
//		Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
//		assertEquals(1,q.getId());
		
//		Question q = this.questionRepository.findBySubjectAndContent("sbb가 무엇인가요?", "sbb에 대해 알고 싶습니다.");
//		assertEquals(1, q.getId());
		
		List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
		Question q = qList.get(0);
		assertEquals("sbb가 무엇인가요?",q.getSubject());
	}
		

}
