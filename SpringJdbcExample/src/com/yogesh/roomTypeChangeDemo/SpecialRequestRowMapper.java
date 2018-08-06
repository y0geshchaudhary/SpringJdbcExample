package com.yogesh.roomTypeChangeDemo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SpecialRequestRowMapper implements RowMapper<SpecialRequestDto> {

	@Override
	public SpecialRequestDto mapRow(ResultSet rs, int arg1)
			throws SQLException {
		
		SpecialRequestDto specialReqDto = new SpecialRequestDto();
		
		specialReqDto.setRoom_id(rs.getString("room_id"));
		specialReqDto.setSpecial_req(rs.getString("special_request_code"));
		
		return specialReqDto;
	}

}
