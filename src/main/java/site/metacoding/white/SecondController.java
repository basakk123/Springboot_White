package site.metacoding.white;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

// 데이터 받기 
// Get -> http body가 없음 -> QueryString, PathVariable(PK), Form (Get), 브라우저(주소 뒤에 ? 붙이기)
// Post, Put -> http body에 담아준다 -> Form(Post), JS
// Delete -> http body가 없음 -> QueryString, PathVariable(PK)

@RestController
public class SecondController {
	
	@GetMapping("/second/{id}") // PK(id)가 1인 것
	public String getData(@PathVariable Integer id) {
		return "id : "+id;
	}
	
	// QueryString 은 x-www-form-urlencoded 타입이다
	@GetMapping("/second") // 쿼리스트링 전송
	public String getData2(String title, String content) {
		return "title : "+title+", content : "+content;
	}
	
	// BR -> title=제목&content=내용, x-www~
	@PostMapping("/second")
	public String postData(String title, String content) { // 스프링 파싱 기본전략 : x-www-form-~
		return "title : "+title+", content : "+content;
	}
	
	@PutMapping("/second")
	public String putData(String title, String content) { // 스프링 파싱 기본전략 : x-www-form-~
		return "title : "+title+", content : "+content;
	}
	
	@DeleteMapping("/second/{id}")
	public String deleteData(@PathVariable Integer id) { // 스프링 파싱 기본전략 : x-www-form-~
		return "delete ok";
	}
}
