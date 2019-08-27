<%--
  Created by IntelliJ IDEA.
  User: trangduong
  Date: 8/27/2019
  Time: 12:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Create Event</title>
    <style>
        .errorMessage{
            color: red;
        }
    </style>
</head>
<body>
    <h1>Create Event</h1>
    <div>
        <s:form method="POST" action="store">
            <s:textfield type="date" label="When? " name="newEvent.date"/>
            <s:textfield type="time" label="Time" name="newEvent.time"/>
            <s:textfield label=" What are you planning? " name="newEvent.planning"/>
            <s:textfield label="Where? " name="newEvent.location"/>
            <s:textfield label="More info?" name="newEvent.info"/>
            <s:submit value="Create Event" action="store"/>
        </s:form>
    </div>
</body>
</html>
