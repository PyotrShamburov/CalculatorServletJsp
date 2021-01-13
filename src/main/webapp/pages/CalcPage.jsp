<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1 style="font-size: medium">Welcome to Calculator</h1>
You can do there follow operations:
<br>
1.sum - summing;
<br>
2.div - division;
<br>
3.dif - difference;
<br>
4.mul - multiplication;
<form action="/" method="post">
    <input type="text" name="num1" placeholder="FirstNumber">
    <br>
    <input type="text" name="num2" placeholder="SecondNumber">
    <br>
    <input type="text" name="sign" placeholder="Operation">
    <br>
    <button type="submit">Calculate</button>
</form>
Result : ${result}
</body>
</html>
