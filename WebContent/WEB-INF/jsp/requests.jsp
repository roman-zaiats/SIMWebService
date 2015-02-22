<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="myTag" uri="/tlds/ContestTags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
    <jsp:include page="fragments/staticHead.jsp"/>
    <%-- my css --%>
    <link rel="stylesheet" href="resources/css/userRequests.css">
    <%-- busy progress bar: --%>
    <link rel="stylesheet" href="resources/css/busyInput.css">
    <%-- angular requests script --%>
    <script src="resources/js/created/profileRequests.js"></script>
    <%-- angular --%>
</head>
<body ng-app="myApp">
<jsp:include page="fragments/header.jsp"/>
<div class="container">
    <ul class="nav nav-pills nav-stacked col-sm-5 col-md-5 col-lg-offset-2 col-lg-4">
        <li role="presentation" class="active"><a href="#">My requests</a></li>
        <li role="presentation"><a href="#">Balance history</a></li>
    </ul>
    <div class="col-sm-offset-1 col-sm-18 col-md-offset-1 col-md-14 col-lg-offset-1 col-lg-12">
        <div class="panel panel-primary">
            <div class="panel-heading">
                Your current requests
            </div>
            <div class="panel-body">
                <div class="myRequest panel panel-default" ng-controller="requestsController">
                    <div class="list-group" ng-repeat="request in requests">
                        <myTag:serviceRequest/>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>