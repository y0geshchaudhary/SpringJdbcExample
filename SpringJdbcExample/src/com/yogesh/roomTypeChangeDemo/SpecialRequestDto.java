package com.yogesh.roomTypeChangeDemo;

public class SpecialRequestDto {

	private String room_id;
	private String special_req;
	
	
	public String getRoom_id() {
		return room_id;
	}
	public String getSpecial_req() {
		return special_req;
	}
	public void setRoom_id(String room_id) {
		this.room_id = room_id;
	}
	public void setSpecial_req(String special_req) {
		this.special_req = special_req;
	}
	
	@Override
	public String toString() {
		return "SpecialRequestDto [room_id=" + room_id + ", special_req="
				+ special_req + "]";
	}
	
	
	
	
}
