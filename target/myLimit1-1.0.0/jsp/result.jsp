<%--
  Created by IntelliJ IDEA.
  User: 惜名
  Date: 2021/5/25
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>查询结果</title>
    </head>
    <body>
        <h1 align="center">结果显示</h1>
        <hr/>
        ${result.total}
        ${result.dataList[0].name}
    </body>
</html>
