<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<span>输入账号:</span>
<input id="name" name="name" onkeyup="check()" type="text">
<span id="checkResult"></span>

<script>
var xmlhttp;
function check()
{
	var name = document.getElementById("name").value;
	var url = "AJAXCheckName.jsp?name="+name;
	xmlhttp = new XMLHttpRequest();
	xmlhttp.onreadystatechange=checkResult;
	xmlhttp.open("GET",url,true);
	xmlhttp.send(null);
}
function checkResult()
{
	if(xmlhttp.readyState==4 && xmlhttp.status==200)
	{
		document.getElementById('checkResult').innerHTML=xmlhttp.responseText;
	}
}
</script>