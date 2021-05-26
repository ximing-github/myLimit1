<%--
  Created by IntelliJ IDEA.
  User: 惜名
  Date: 2021/5/25
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询学生信息</title>
</head>
<body>
    <div align="center">
        <form action="select" method="post">
            姓名           <input type="text" name="name"><br/>
            年龄           <input type="text" name="age"/><br/>
            条数           <input type="text" name="pageSize"/><br/>
            页码           <input type="text" name="pageNo"/><br/>
                          <input type="submit" value="提交">

        </form>
    </div>
</body>
</html>
