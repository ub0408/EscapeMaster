package room;

import java.util.List;

public interface RoomDAO {
	//public List<RoomDTO> list();//모든방 정보
		public List<RoomDTO> list(Integer branch_id);//지점방 정보
		public RoomDTO getRoom(Integer branch_id, Integer room_id);
		public void insertRoom(RoomDTO dto);
		public void deleteRoom(Integer room_id);
		//방수정
		//방삭제
}
