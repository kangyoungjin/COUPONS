package kr.pe.dk.mappers;

import java.util.List;

import kr.pe.dk.vo.CriteriaVO;

public interface GenericMapper <E, K>{
	void create(E vo) throws Exception;
	E read(K key) throws Exception;
	void update(E vo)throws Exception;
	void delete(K key) throws Exception;
	List<E> list(CriteriaVO cri) throws Exception;
}
