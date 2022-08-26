package com.AdminPage.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.AdminPage.model.Criteria;
import com.AdminPage.model.InputVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class InputMapperTests {

	@Autowired
	private InputMapper mapper;
	
	/*입고등록*/
	/*@Test
	public void productsInputTest() throws Exception{
		
		InputVO input = new InputVO();
		
		input.setProductId("001");
		input.setInputAmount(55);
		
		mapper.productsInput(input);
	}*/
	
	/*입고목록 및 상품 총 개수*/
	@Test
	public void inputGetList(){
		Criteria cri = new Criteria();
		
		/*검색조건*/
		cri.setKeyword("010");
		
		/*검색리스트*/
		
		List<InputVO> list = mapper.inputGetList(cri);
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println("list"+i+"..........."+list.get(i));
		}
		
		/*상품 총 개수*/
		int result = mapper.inputGetTotal(cri);
		System.out.println("result.........."+ result);
	}
	
	
	
}
