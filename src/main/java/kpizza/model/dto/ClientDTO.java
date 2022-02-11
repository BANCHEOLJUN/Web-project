/** --client insert 주문자 저장 (손님사장구분번호, id, pw, 이름, 닉네임, 연락처, 주소)
CREATE table client (
       sort_no              NUMBER(5) NOT NULL,  
       client_id          	VARCHAR2(20)  PRIMARY KEY,
       password         	VARCHAR2(20) NOT NULL,
       name               	VARCHAR2(20) NOT NULL,
       nickname             VARCHAR2(20) NOT NULL,
       contact             VARCHAR2(20) NOT NULL,
       address             VARCHAR2(30) NOT NULL
); */
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


public class ClientDTO {
	private int sort_no;
	private String client_id;
	private String password;
	private String name;
	private String nickname;
	private String contact;
	private String address;
}
