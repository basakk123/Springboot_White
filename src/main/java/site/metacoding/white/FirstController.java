package site.metacoding.white;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

// Http Method -> Mapping 기술
// Get -> 주소창, 하이퍼링크
// Post -> form 태그
// Put, Delete, Get, Post -> Java Script

// 포스트맨 -> 4가지 요청을 쉽게 테스트 해볼 수 있다

@RestController // data를 응답
public class FirstController {
	
	@GetMapping("/first")
	public String getData() {
		return "<h1>data</h1>";
	}
	
	@PostMapping("/first")
	public String postData() {
		return "<h1>insert date</h1>";
	}
	
	@PutMapping("/first")
	public String putData() {
		return "<h1>update date</h1>";
	}
	
	@DeleteMapping("/first")
	public String deleteData() {
		return "<h1>delete date</h1>";
	}
}
