package notice;

import java.util.List;

public interface NoticeDAO {
	public List<NoticeDTO> list(String kind);
}
