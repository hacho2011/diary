package kr.co.mlec.scrap;

import kr.co.mlec.vo.ScrapVO;

public interface ScrapDAOInter {
	
	public void scrapCntUp(ScrapVO scrapVO);
	public void scrapCntDown(ScrapVO scrapVO);

}
