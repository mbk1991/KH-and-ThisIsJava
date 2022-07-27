package com.kh.member.run;

import java.util.ArrayList;

import com.kh.member.controller.MemberController;
import com.kh.member.model.vo.Member;
import com.kh.member.view.MemberView;

public class Run {
	public static void main(String[] args) {
		Member member = null;
		MemberView view = new MemberView();
		MemberController mCtrl = new MemberController();
		ArrayList<Member> mList = null;

		EXIT: while (true) {
			char choice = view.showMainMenu();
			switch (choice) {
			case '1': // 전체조회
				// 컨트롤러가 다오에서 얻은 mList를 뷰로 전달
				mList = mCtrl.memberSelectAll();
				if (!mList.isEmpty()) {
					// 처리 성공
					view.showAll(mList);
				} else {
					// 처리실패
					view.systemMessage("조회 실패 : 조회 결과 없음");
				}

				break;
			case '2': // 아이디로 조회
				// 뷰에서 얻은 아이디로 컨트롤러에서 dao를 통해 mList를 가져와
				// 뷰로 다시 전달
				String inputId = view.inputId();
				mList = mCtrl.memberSelectById(inputId);
				if (!mList.isEmpty()) {
					view.showAll(mList);
				} else {
					// 처리실패
					view.systemMessage("조회 실패: 조회 결과 없음");
				}
				break;
			case '3': // 이름으로 조회
				String inputName = view.inputName();
				mList = mCtrl.memberSelectByName(inputName);
				if (!mList.isEmpty()) {
					view.showAll(mList);
				} else {
					// 처리실패
					view.systemMessage("조회 실패: 조회 결과 없음");
				}
				break;
			case '4': // 등록
				// 뷰로부터 받은 member객체를 컨트롤러에서
				// dao로 전달하여 insert하고 수행 결과를
				// 뷰로 출력.

				member = view.insertMemberMenu();
				int result = mCtrl.memberInsertDB(member);
				if (result != 0) {
					view.systemMessage("등록 성공");
				} else {
					view.systemMessage("등록 실패");
				}
				break;
			case '5': // 변경
				// 뷰로부터 입력받은 id가 DB에 있는지 체크하여 체크값을 받아오고
				// 값이 없으면 처리실패, 값이 있으면 수정을 진행함.
				String inputIdForUpdate = view.inputId();
				boolean idIsExist = mCtrl.idCheck(inputIdForUpdate);
				if (idIsExist) {
					// 뷰에서 수정할 값을 member객체로 받고
					// inputId의 필드를 수정하고 결과값을 리턴받음
					member = view.modifyMemberMenu();
					member.setMemberId(inputIdForUpdate);
					result = mCtrl.memberUpdate(member);

					if (result != 0) {
						view.systemMessage("수정 성공");
					} else {
						view.systemMessage("수정 실패");
					}

				} else {
					view.systemMessage("ID가 존재하지 않음");
				}
				break;
			case '6': // 삭제
				//뷰에서 입력받은 아이디가 있는지 확인하고
				//있다면 비밀번호를 확인하고
				//비밀번호가 맞다면 삭제를 진행해보자
				String inputIdForDelete = view.inputId();
				idIsExist = mCtrl.idCheck(inputIdForDelete);
				if(idIsExist) {
					String inputPassword = view.inputPwd();
					boolean isEqualPwd = mCtrl.pwdCheck(inputIdForDelete,inputPassword);
					if(isEqualPwd) {
						result = mCtrl.memberDelete(inputIdForDelete);
						if(result != 0) {
							view.systemMessage("삭제 완료");
						}else {
							view.systemMessage("삭제 실패");
						}
					}else {
						view.systemMessage("비밀번호 불일치!");
					}
					
				}else {
					view.systemMessage("ID가 존재하지 않음");
				}
				
				
				break;
			case '0': // 종료
				System.out.println("종료");
				break EXIT;
			}
		}
	}
}
