package room;

import java.util.List;

public class RoomDAOImpl implements RoomDAO {

	@Override
	public List<RoomDTO> list(Integer branch_id) {
		List list = Room.listRoom(branch_id);
		return list;
	}

	@Override
	public RoomDTO getRoom(Integer branch_id, Integer room_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertRoom(RoomDTO dto) {
		Room.insertRoom(dto);
	}

	@Override
	public void deleteRoom(Integer room_id) {
		Room.deleteRoom(room_id);
		
	}

}
