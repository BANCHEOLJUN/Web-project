/**--order list 주문 내역 (시퀀스, 주문이름, 손님id, 피자id, 수량, 추가주문음식id, 수량, 총가격, 추가메세지)
CREATE SEQUENCE order_list_id_seq;
CREATE table order_list (
       order_list_id        NUMBER(5)  PRIMARY KEY,
       order_list_name      VARCHAR2(20) NOT NULL,
       client_id            VARCHAR2(20) NOT NULL,
       food_id	         	VARCHAR2(20) NOT NULL,
       food_quantity        NUMBER(1) 	NOT NULL,
       food_id2	         	VARCHAR2(20) NOT NULL,
       food2_quantity       NUMBER(2) 	NOT NULL,
       total_price 			NUMBER(7) NOT NULL,
       message              VARCHAR2(30) NOT NULL
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

public class OrderDTO {

	private int order_list_id;      
    private String order_list_name; 
    private String client_id;         
    private String food_id;	       
    private int food_quantity;    
    private String food_id2;	        
    private int food2_quantity;     
    private int total_price; 	
    private String message;           
}
