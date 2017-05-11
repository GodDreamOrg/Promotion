package com.ares.promotion.dao.pagination;

import java.io.Serializable;

public class Pagination implements Serializable{
	public Pagination() {
		super();
	}
	public Pagination(int currentPage, int pagesize) {
		super();
		this.currentPage = currentPage;
		this.pagesize = pagesize;
	}
	private static final long serialVersionUID = 1L;
	
	private static final int PAGESIZE = 20;
	private int currentPage;
	private int pagesize;
	private int totalRows;
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPagesize() {
		return pagesize==0?PAGESIZE:pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}
	public int getPageCount(){
		if(totalRows%getPagesize()!=0){
			return totalRows/getPagesize()+1;
		}else{
			return totalRows/getPagesize();
		}
		
	}
}
