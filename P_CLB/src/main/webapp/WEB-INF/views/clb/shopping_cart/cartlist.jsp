<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>상품장바구니 목록</title>
<%@ include file="../include/header.jsp" %>
<script>
    $(document).ready(function(){
        // 리스트 페이지로 이동
        $("#btnList").click(function(){
            location.href="${path}/shop/product/list.do";
        });
    });
</script>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
    <h2>장바구니 확인</h2>
    <c:choose>
        <c:when test="${map.count == 0}">
            장바구니가 비어있습니다.
        </c:when>
        <c:otherwise>
        <!-- 장바구니에 담긴 상품이 0이면 "장바구니가 비어있습니다."를 출력 -->
        <!-- 0이 아니면 장바구니 목록을 출력 -->
        <form name="form1" id="form1" method="post" action="${path}/shop/cart/update.do">
            <!-- 장바구니에 담긴 상품수량 업데이트 처리 -->
            <table border="1">
                <tr>
                    <th>상품명</th>
                    <th>단가</th>
                    <th>수량</th>
                    <th>금액</th>
                    <th>취소</th>
                </tr>
                <c:forEach var="row" items="${map.list}" varStatus="i">
                <!-- 장바구니 레코드 출력 -->
                <tr>
                    <td>
                        ${row.productName}
                    </td>
                    <td style="width: 80px" align="right">
                        <fmt:formatNumber pattern="###,###,###" value="${row.productPrice}"/>
                    </td>
                    <td>
                        <input type="number" style="width: 40px" name="amount" value="${row.amount}" min="1">
                        <!-- 상품수량 변경, 최소값을 1로 설정 -->
                        <input type="hidden" name="productId" value="${row.productId}">
                    	<!-- 상품수량 변경을 위해 상품id번호를 hidden으로 설정 -->
                    </td>
                    <td style="width: 100px" align="right">
                        <fmt:formatNumber pattern="###,###,###" value="${row.money}"/>
                    </td>
                    <td>
                        <a href="${path}/shop/cart/delete.do?cartId=${row.cartId}">삭제</a>
                    	<!-- 장바구니에 담긴 상품 삭제 처리 -->
                    </td>
                </tr>
                </c:forEach>
                <tr>
                    <td colspan="5" align="right">
                        장바구니 금액 합계 : <fmt:formatNumber pattern="###,###,###" value="${map.sumMoney}"/><br>
                        배송료 : ${map.fee}<br>
                        전체 주문금액  :<fmt:formatNumber pattern="###,###,###" value="${map.allSum}"/>
                    </td>
                </tr>
            </table>
            <input type="hidden" name="count" value="${map.count}">
            <button type="submit" id="btnUpdate">수정</button>
        </form>
        </c:otherwise>
    </c:choose>
    <button type="button" id="btnList">상품목록</button>
</body>
</html>