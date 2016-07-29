package kr.pe.dk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kr.pe.dk.mappers.GenericMapper;
import kr.pe.dk.vo.CriteriaVO;

public abstract class GenericServiceImpl <E, ID, M extends GenericMapper<E, ID>> implements GenericService<E, ID>{

	protected M mapper;
	
	@Autowired
	public void setMapper(M mapper){
		this.mapper = mapper;
	}

	@Override
	public void regist(E vo) throws Exception {
		// TODO Auto-generated method stub
		mapper.create(vo);
		
	}

	@Override
	public E view(ID key) throws Exception {
		// TODO Auto-generated method stub
		return mapper.read(key);
	}

	@Override
	public void modify(E vo) throws Exception {
		// TODO Auto-generated method stub
		mapper.update(vo);
		
	}

	@Override
	public void remove(ID key) throws Exception {
		// TODO Auto-generated method stub
		mapper.delete(key);
		
	}

	@Override
	public List<E> getSearch(CriteriaVO cri) throws Exception {
		// TODO Auto-generated method stub
		return mapper.list(cri);
	}
	

	
}
