<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="/branch_top.jsp"%>
<div align="center">

<form name="f" action="roomInsertPro.branchPage" method="post">
<!-- branch_id, room_id, room_name, room_difficulty, room_maxuser, room_price, room_opentime, room_closetime, room_content -->
	<table border="1">
		<tr bgcolor="yellow">
				<th colspan="2">방 등 록</th>
			</tr>
			<tr>
				<th bgcolor="yellow">방이름</th>
				<td><input type="text" name="room_name"></td>
			</tr>
			<tr>
				<th bgcolor="yellow">난이도</th>
				<td><input type="text" name="room_difficulty"></td>
			</tr>
			<tr>
				<th bgcolor="yellow">최대인원</th>
				<td><input type="text" name="room_maxuser"></td>
			</tr>
			<tr>
				<th bgcolor="yellow">1인당 가격</th>
				<td><input type="text" name="room_price"></td>
			</tr>
			<tr>
				<th bgcolor="yellow">오픈시간</th>
				<td><input type="text" name="room_opentime"></td>
			</tr>
			<tr>
				<th bgcolor="yellow">마감시간</th>
				<td><input type="text" name="room_closetime"></td>
			</tr>
			<tr>
				<th bgcolor="yellow">방설명</th>
				<td><input type="text" name="room_content"></td>
			</tr>
			<tr>
				<td colspan="3" bgcolor="yellow" align="center">
					<input type="hidden" name="branch_id" value="<%=request.getParameter("branch_id") %>">

					<input type="submit" value="방등록">
					<input type="reset" value="다시쓰기">
					<input type="button" value="목록보기" onClick="window.location='roomManage.branchPage?branch_id=<%=request.getParameter("branch_id") %>'">
				</td>
			</tr>
	</table>
</form>
</div>
<%@include file="/branch_bottom.jsp"%>