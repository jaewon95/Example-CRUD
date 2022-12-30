package org.zerock.controller;

import org.apache.ibatis.annotations.Update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

@Controller
public class BoardController {
	

	@Autowired
	private BoardService boardService;

	@GetMapping("/")
	public String main() {
		return "index";
	}

	// 전체조회 START ────────────────────────────────────────┐
	@GetMapping("board/listAll")
	public String main(Model model) throws Exception {
		model.addAttribute("list", boardService.listAll());
		return "board/list";
	}

	// 상세조회 START ──────────────────────────────────────────────────────────┐
	@GetMapping("board/selectOne/{bno}")
	public String selectOne(@PathVariable("bno") Integer bno, Model model) {
		BoardVO vo = boardService.selectOne(bno);
		model.addAttribute("vo", vo);
		return "board/select";
	}

	// 글쓰기 START ────────────────────┐
	@GetMapping("board/create")
	public String goCreatePage() {
		return "board/create";
	}

	@PostMapping("board/createPro") // Post요청 매핑
	public String createPro(BoardVO vo) throws Exception {
		boardService.create(vo);
		return "redirect:listAll"; // redirect 모르겠으면 검색하기
	}

	// 수정 START ───────────────────────┐
	@PostMapping("board/updatePro")
	public String update(BoardVO vo) {
		boardService.update(vo);
		return "redirect:listAll";
	}

	// 삭제
	@GetMapping("board/delete/{bno}")
	public String delete(@PathVariable("bno") Integer bno) {
		boardService.delete(bno);
		return "redirect:../listAll";
	}
}
