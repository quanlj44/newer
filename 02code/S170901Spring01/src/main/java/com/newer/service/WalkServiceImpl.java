package com.newer.service;

import com.newer.dao.IWalk;

/**
 * 服务层实现
 * 
 * @author QuanLijian
 *
 */
public class WalkServiceImpl implements IWalkService {
	private IWalk iwalk;

	public WalkServiceImpl() {

	}

	public WalkServiceImpl(IWalk iwalk) {
		this.iwalk = iwalk;
	}

	@Override
	public void walk(String name) {
		// 调用DAO层walk方法
		iwalk.walk(name);
	}

	public IWalk getIwalk() {
		return iwalk;
	}

	public void setIwalk(IWalk iwalk) {
		this.iwalk = iwalk;
	}

}
