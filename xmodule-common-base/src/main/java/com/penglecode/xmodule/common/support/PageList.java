package com.penglecode.xmodule.common.support;

import java.util.List;

/**
 * 分页数据模型
 *
 * @author 	pengpeng
 * @date   		2017年6月6日 下午5:17:39
 * @version 	1.0
 */
public class PageList<T> implements DtoModel {

	private static final long serialVersionUID = 1L;

    /** 当存在分页查询时此值为总记录数 */
	private int totalRowCount = 0;
	
	/** 数据结果集 */
	private List<T> dataList;

	public PageList() {
		super();
	}
	
	public PageList(List<T> dataList, int totalRowCount) {
		super();
		this.dataList = dataList;
		this.totalRowCount = totalRowCount;
	}

	public int getTotalRowCount() {
		return totalRowCount;
	}

	public void setTotalRowCount(int totalRowCount) {
		this.totalRowCount = totalRowCount;
	}

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}

	@Override
	public String toString() {
		return "PageList [totalRowCount=" + totalRowCount + ", dataList=" + dataList + "]";
	}
	
}
