<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>service</title>
</head>
<body>
    <h1>service 메소드의 역할</h1>
    <h3>GET 방식의 요청</h3>
    <a gref="request-service">서비스 메소드 요청하기</a>
    <h4>a 태그의 href 속성 값 요청</h4>
    <form action="request-service" method="get">
        <input type="submit" value="GET 방식 요청 전송">
    </form>

    <h3>POST 방식의 요청</h3>
    <h4>form 태그의 nethod 속성을 post로 성정</h4>
    <form action="request-service" method="post">
        <input type="submit" value="POST 방식 요청전송">
    </form>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>