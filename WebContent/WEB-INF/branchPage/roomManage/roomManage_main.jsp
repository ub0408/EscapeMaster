<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/branch_top.jsp"%>
<div>
<table border="1">
	<tr>
		<td>방ID</td>
		<td>방이름</td>
		<td>난이도</td>
		<td>허용인원</td>
		<td>가격</td>
		<td>오픈시간</td>
		<td>마감시간</td>
		<td>방설명</td>
		<td>수정 | 삭제</td>
	</tr>
	<c:forEach var="dto" items="${list}">
		<tr>
			<td>${dto.room_id}</td>
			<td>${dto.room_name}</td>
			<td>${dto.room_difficulty}</td>
			<td>${dto.room_maxuser}</td>
			<td>${dto.room_price}</td>
			<td>${dto.room_opentime}</td>
			<td>${dto.room_closetime}</td>
			<td>${dto.room_content}</td>
			<td>
				수정 | 
				<a href="roomDelete.branchPage?branch_id=<%=request.getParameter("branch_id") %>&room_id=${dto.room_id}">삭제</a>
			</td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="9">
			<a href="roomInsert.branchPage?branch_id=<%=request.getParameter("branch_id") %>">방추가</a>
		</td>
	</tr>
</table>
</div>
<%@include file="/branch_bottom.jsp"%>