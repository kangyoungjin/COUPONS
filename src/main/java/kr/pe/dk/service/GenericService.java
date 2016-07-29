package kr.pe.dk.service;

import java.util.List;
import kr.pe.dk.vo.CriteriaVO;

public interface GenericService<E, K> {
	void regist(E vo) throws Exception;
	E view(K key)throws Exception;
	void modify(E vo)throws Exception;
	void remove(K key)throws Exception;
	List<E> getSearch(CriteriaVO vo) throws Exception;
}
