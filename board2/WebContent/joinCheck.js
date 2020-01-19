function  infoConfirm(){
	
	let pattern_spc = /[~!@#$%^&*()_+|<>?:{}]/;
	let pattern_kor = /[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/;
	let str = document.join_form.userID.value;
	var frm = document.join_form;
	
	if(frm.userID.value.length == 0){
		alert('아이디를 입력해주세요');
		join_form.userID.focus();
		return false;
	}
	if(frm.userID.value.length < 3){
		alert('아이디는 3글자 이상이어야합니다.');
		join_form.userID.focus();
		return false;
	}
	if(!(pattern_spc.test(str)) && !(pattern_kor.test(str))){
	
	}else{
		alert('아이디는 특수문자, 한글을 포함할 수 없습니다.');
		frm.userID.focus();
		return false;
	}
	if(frm.userPW.value.length == 0 ){
		alert('비밀번호를 입력해주세요');
		frm.userPW.focus();
		return false;
	}
	if(frm.userPW.value.length < 4){
		alert('비밀번호는 4글자 이상이어야 합니다.');
		frm.userPW.focus();
		return false;
	}
	if(frm.userPW.value != frm.userPW_check.value){
		alert('비밀번호가 일치하지 않습니다.');
		frm.userPW.focus();
		return false;
	}
	if(frm.userName.value.length == 0 ){
		alert('이름을 입력해주세요');
		frm.userName.focus();
		return false;
	}
	if(frm.userEmail.value.length == 0 ){
		alert('이메일을 입력해주세요');
		frm.userEmail.focus();
		return false;
	}
	frm.submit();	
}
function writeFrm(){
	
	let frm = document.w_frm;
	if(frm.bbsTitle.value.length == 0){
		alert('글 제목을 입력해주세요');
		frm.w_frm.bbsTitle.focus();
		return;
	}
	if(frm.bbsContent.value.length == 0){
		alert('글 내용을 입력해주세요');
		frm.w_frm.bbsContent.focus();
		return;
	}
	frm.submit();
}
