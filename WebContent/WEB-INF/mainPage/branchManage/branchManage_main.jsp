<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@include file="/mainPage_top.jsp"%>
<div>
<table border="1">
	<tr>
		<td>지점ID</td>
		<td>지점명</td>
		<td>지점주소</td>
		<td>지점 연락처</td>
		<td>예약가능 여부</td>
		<td>오픈시간</td>
		<td>마감시간</td>
		<td>바로가기</td>
		<td>수정 | 삭제</td>
	</tr>
	<c:forEach var="dto" items="${list}">
		<tr>
			<td>${dto.branch_id}</td>
			<td>${dto.branch_name}</td>
			<td>${dto.branch_address}</td>
			<td>${dto.branch_phone}</td>
			<td>${dto.branch_reserve}</td>
			<td>${dto.branch_opentime}</td>
			<td>${dto.branch_closetime}</td>
			<td><a href="branchMain.branchPage?branch_id=${dto.branch_id}"> ${dto.branch_name} 홈페이지 바로가기</a></td>
			<td>수정 | 삭제</td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="9">
			지점추가
		</td>
	</tr>
</table>
</div>
<%@include file="/mainPage_bottom.jsp"%>