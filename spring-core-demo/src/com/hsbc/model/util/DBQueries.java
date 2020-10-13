package com.hsbc.model.util;

public class DBQueries {
	private String insertQuery;
	private String selectAllQuery;
	private String deleteQueryById;
	private String selectQueryById;
	public String getInsertQuery() {
		return insertQuery;
	}
	public void setInsertQuery(String insertQuery) {
		this.insertQuery = insertQuery;
	}
	public String getSelectAllQuery() {
		return selectAllQuery;
	}
	public void setSelectAllQuery(String selectAllQuery) {
		this.selectAllQuery = selectAllQuery;
	}
	public String getDeleteQueryById() {
		return deleteQueryById;
	}
	public void setDeleteQueryById(String deleteQueryById) {
		this.deleteQueryById = deleteQueryById;
	}
	public String getSelectQueryById() {
		return selectQueryById;
	}
	public void setSelectQueryById(String selectQueryById) {
		this.selectQueryById = selectQueryById;
	}
	
	
}
