package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {
	
	// dao 주입받기
	@Autowired
	private BoardDAO boardDAO;

	// 전체조회
	@Override
	public List<BoardVO> listAll() throws Exception {
		return boardDAO.listAll();
	}

	// 글 작성
	@Override
	public void create(BoardVO vo) throws Exception {
		boardDAO.create(vo);
	}

	// 선택조회
	@Override
	public BoardVO selectOne(int bno) {
		return boardDAO.selectOne(bno);
	}

	// 수정
	@Override
	public void update(BoardVO vo) {
		boardDAO.update(vo);
	}

	// 삭제
	@Override
	public void delete(int bno) {
		boardDAO.delete(bno);
	}




}
