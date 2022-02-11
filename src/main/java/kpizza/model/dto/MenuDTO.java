/**--menu insert 메뉴 저장 (음식id, 음식이름, 종류, 가격)
CREATE table menu (
       food_id          	VARCHAR2(20) PRIMARY KEY,
       food_name          	VARCHAR2(20) NOT NULL,
       sort		            VARCHAR2(20) NOT NULL,
       price		        NUMBER(5) NOT NULL
);
 */
package kpizza.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class MenuDTO {
	private String food_id;
	private String food_name;
	private String sort;
	private int price;
	
	

	
}
