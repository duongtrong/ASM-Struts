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
    <title>List event</title>
</head>
<body>
    <h1>List Event</h1>
    <br>
    <ul>
        <s:iterator value="eventList">
            <li>
                <div>
                    <label>When?  : </label>
                    <s:property value="date"/>
                </div>
                <div>
                    <label>Time  : </label>
                    <s:property value="time"/>
                </div>
                <div>
                    <label>What are you planning : </label>
                    <s:property value="planning"/>
                </div>
                <div>
                    <label>Where : </label>
                    <s:property value="location"/>
                </div>
                <div>
                    <label>More info : </label>
                    <s:property value="info"/>
                </div>
                <div>
                    <s:form action="edit">
                        <s:textfield name="newEvent.info" value="%{info}" type="hidden"/>
                        <s:textfield name="newEvent.location" value="%{location}" type="hidden"/>
                        <s:textfield name="newEvent.planning" value="%{planning}" type="hidden"/>
                        <s:textfield name="newEvent.date" value="%{date}" type="hidden"/>
                        <s:textfield name="newEvent.time" value="%{time}" type="hidden"/>
                        <s:submit action="edit" value="Edit"/>
                    </s:form>
                </div>
                <div>
                    <s:form action="delete">
                        <s:textfield name="newEvent.info" value="%{info}" type="hidden"/>
                        <s:textfield name="newEvent.location" value="%{location}" type="hidden"/>
                        <s:textfield name="newEvent.planning" value="%{planning}" type="hidden"/>
                        <s:textfield name="newEvent.date" value="%{date}" type="hidden"/>
                        <s:textfield name="newEvent.time" value="%{time}" type="hidden"/>
                        <s:submit action="delete" value="Delete"/>
                    </s:form>
                </div>
            </li>
        </s:iterator>
    </ul>
</body>
</html>
