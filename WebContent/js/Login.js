/**
 * 
 */
	function check(){
		$("#UresNameHint").html("");
		$("#PasswordHint").text("");
		var user = $("#UresName").val(); //获取表单元素值
		var psw = $("#Password").val(); 
		if(user==""){
			$("#UresNameHint").html("用户名不能为空!");
			return false;
		}else if(psw == ""){
			$("#PasswordHint").text("密码不能为空！");
			return false;
		}else{
			return true;
		}
	}