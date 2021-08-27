package com.example.demo.demo1.copy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
public class Itemservice {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

//	public Map<String, Object> insertItems(Item item) {
//
//		
//		Map<String, String> data = new HashMap<String, String>();
//		int result = 0;
//		String sql = "INSERT INTO items (id,name,age) VALUES (:id,:name,:age)";
//		try
//		{
//			SqlParameterSource parameters = new MapSqlParameterSource()
//					.addValue("id", item.getId())
//					.addValue("name",item.getName())
//					.addValue("age", item.getAge());
//
//			result = namedParameterJdbcTemplate.update(sql, parameters);
//			if (result > 0)
//				data.put("success", "Record inserted successfully");
//			else
//				data.put("failed", "Record failed to insert, please try again!");
//		} catch (Exception e) {
//			data.put("error", "Error occured, please try again!");
//			
//		}
//		
//		return data;
//
//	}
	

	public List getAll() {
		
		Map dataMap = new HashMap();;
		List responseList = new ArrayList();
		List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
		String sql = "select * from Items";

		try {
			System.out.println("hello");
			dataList = jdbcTemplate.queryForList(sql); 
			System.out.println(dataList);
			for (Map<String, Object> row : dataList) {
				dataMap.put("id", row.get("id"));
				dataMap.put("name", row.get("name"));
				dataMap.put("Age", row.get("age"));
				dataMap.put("Email", row.get("email;"));
				responseList.add(dataMap);
			}

		} catch (Exception e) {
			dataMap.put("error", "Error occured"); 
			System.out.println("error");

		}
		
		return responseList;
	}
public List get(Item i) {
		
		Map dataMap = new HashMap();
		List responseList = new ArrayList();
		List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
		String sql = "select * from Items where id = ?";
		try {
			dataList = jdbcTemplate.queryForList(sql, new Object[] {i.getId()});

			for (Map<String, Object> row : dataList) {
				dataMap.put("id", row.get("id"));
				dataMap.put("name", row.get("name"));
				dataMap.put("age", row.get("age"));
				dataMap.put("email", row.get("email"));
				responseList.add(dataMap);
			}

		} catch (Exception e) {
			dataMap.put("error", "Error occured");
		}
		
		return responseList;
	}


public List getMultiple(Item i) {
	
	Map dataMap = new HashMap();
	List responseList = new ArrayList();
	List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>(); 
	
	String sql = "select * from Items where 1=1"; 
	if(i.getId()!=0)
	{
		sql=sql+"and  id="+i.getId()+" ";	
	}

	
	if(i.getName()!=null)
	{

	    sql=sql+" and name='"+i.getName()+"'";	
	}
	System.out.println(sql);
	try {
		dataList = jdbcTemplate.queryForList(sql);

		for (Map<String, Object> row : dataList) {
			dataMap.put("id", row.get("id"));
			dataMap.put("name", row.get("name"));
			dataMap.put("age", row.get("age"));
			dataMap.put("email", row.get("email"));
			responseList.add(dataMap);
		}

	} catch (Exception e) {
		dataMap.put("error", "Error occured");
	}
	
	return responseList;
}

}