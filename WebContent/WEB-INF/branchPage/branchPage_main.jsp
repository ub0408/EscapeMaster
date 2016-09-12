<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@include file="/branch_top.jsp"%>
<div>
	${dto.branch_name }에 오신것을 환영합니다.<br>
	
	홈페이지 준비중입니다.
	
	<br>
	주소 : ${dto.branch_address}<br>
	연락처 : ${dto.branch_phone}<br>
	영업시간 : ${dto.branch_opentime} ~ ${dto.branch_closetime}<br>
</div>
<%@include file="/branch_bottom.jsp"%>