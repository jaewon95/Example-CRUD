package org.zerock.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.zerock.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Autowired
	private SqlSession sqlSession;
	// namespace 지정
	private static String namespace = "org.zerock.mapper.BoardMapper";
	
	// 전체조회
	@Override
	public List<BoardVO> listAll() {
		return sqlSession.selectList(namespace+".listAll");
	}

	// 글쓰기
	@Override
	public void create(BoardVO vo) throws Exception {
		sqlSession.insert(namespace+".create", vo);
	}

	// 선택조회
	@Override
	public BoardVO selectOne(int bno) {
		return sqlSession.selectOne(namespace+".selectOne", bno);
	}

	// 수정하기
	@Override
	public void update(BoardVO vo) {
		sqlSession.update(namespace+".update", vo);
	}

	@Override
	public void delete(int bno) {
		sqlSession.delete(namespace+".delete", bno);
	}

	
	


	

}
