package metamong;

public class Room {
	private String roomType;		//객실 타입
	private int roomCount;		//남은 객실 개수
	private int roomPrice;		//객실 가격
//	private String roomNo;
	
	public Room() {}

	public Room(String roomType, int roomCount, int roomPrice) {
		super();
		this.roomType = roomType;
		this.roomCount = roomCount;
		this.roomPrice = roomPrice;
	}
	
	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}

	public int getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}

	@Override
	public String toString() {
		return "객실 [타입 : " + roomType + ", 잔여 객실 수 : " + roomCount + ", 가격 : " + roomPrice + "]";
	}
	
}
