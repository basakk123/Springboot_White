package site.metacoding.white;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.white.domain.Four;
import site.metacoding.white.domain.dto.RespDto;

@RestController
public class FourController {

	@GetMapping("/four")
	public Four getData() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return four; // DS가 Four 오브젝트를 리턴받고, 해당 오브젝트를 MessageConverter에게 전달
	}

	@GetMapping("/four/data")
	public ResponseEntity<Four> getData2() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		ResponseEntity<Four> response = new ResponseEntity<>(four, HttpStatus.OK);
		return response; // DS가 Four 오브젝트를 리턴받고, 해당 오브젝트를 MessageConverter에게 전달
	}

	@GetMapping("/four/data1")
	public ResponseEntity<?> getData2_1() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return new ResponseEntity<>(four, HttpStatus.OK); // DS가 Four 오브젝트를 리턴받고, 해당 오브젝트를 MessageConverter에게 전달
	}

	@GetMapping("/four/dto")
	public RespDto<Four> getData3() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return new RespDto<>(1, "성공", four);
	}
}
