package com.hrmsys.dao;

import java.util.List;

import com.hrmsys.bean.PageBean;
import com.hrmsys.bean.TrainBean;
import com.hrmsys.model.Train;

public interface TrainDAO {
	/**
	 * 查询全部
	 * @return
	 */
	List<Train> findAll();
	/**
	 * 按条件查询模糊查询
	 * @param condition
	 * @return
	 */
	PageBean findAllByCondition(String condition, int start, int limit);
	/**
	 * 保存
	 * @param trainBean
	 * @return
	 */
	boolean save(Train train);
	/**
	 * 删除
	 * @param trainIds
	 * @return
	 */
	boolean delete(String[] trainIds);
	/**
	 * 按id查询
	 * @param trainId
	 * @return
	 */
	List<Train> findTrainById(int trainId);
	PageBean findAll(String start, String limit);
	List<Train> getExtralItem();
}
