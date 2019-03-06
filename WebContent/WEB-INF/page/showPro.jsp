<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>展示页面</title>
</head>
<body>
<form>
产品名称： ${pro.name}<br>
产品价格： ${pro.price}
	产品名：<input type="text" value="${product.name}"/>
	价格：<input type="text" value="${product.price}"/>
</form>
</body>
</html>