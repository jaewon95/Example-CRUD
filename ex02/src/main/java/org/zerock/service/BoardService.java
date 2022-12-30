package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardService {
	// 전체조회
	public List<BoardVO> listAll() throws Exception;
	
	// 글쓰기
	public void create(BoardVO vo) throws Exception;
	
	// 상세조회
	public BoardVO selectOne(int bno);
	
	// 수정
	public void update(BoardVO vo);
	
	// 삭제
	public void delete(int bno);
}
