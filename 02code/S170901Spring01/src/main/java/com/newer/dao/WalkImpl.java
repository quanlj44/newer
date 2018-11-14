package com.newer.dao;

/**
 * DAO实现
 * @author QuanLijian
 *
 */
public class WalkImpl implements IWalk {

	@Override
	public void walk(String name) {
		System.out.println(name+":正在步行...");
	}

}
