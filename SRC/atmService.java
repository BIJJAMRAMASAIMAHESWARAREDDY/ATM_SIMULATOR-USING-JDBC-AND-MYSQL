package serviceView;

import DaoView.AtmDaoView;
import atmModal.modalView;

public class atmService {
	private AtmDaoView atmDao;
	public atmService() {
		atmDao = new AtmDaoView();
	}
	public modalView accountDetails(int accountNo) {
		return atmDao.fetchAccountDetails(accountNo);
	}

}
