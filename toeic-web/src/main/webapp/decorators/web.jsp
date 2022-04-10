<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp" %>
<html>
<head>
    <title><fmt:message key="label.home" bundle="${lang}" /> </title>
    <!-- Bootstrap -->
    <link href="<c:url value="/template/web/css/bootstrap.css"/>" rel="stylesheet">
    <link href="<c:url value="/template/web/css/bootstrap-responsive.css"/>" rel="stylesheet">
    <link href="<c:url value="/template/web/css/style.css"/>" rel="stylesheet">
    <!--Font-->
    <link rel="stylesheet" href="<c:url value='/template/admin/assets/font-awesome/4.2.0/css/font-awesome.min.css'/>" />
    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <!-- Fav and touch icons -->
    <!-- SCRIPT
    ============================================================-->
    <script src="http://code.jquery.com/jquery.js"></script>
    <script src="<c:url value="/template/web/js/bootstrap.min.js"/>"></script>
    <dec:head/>
</head>
<body>
<%--<%@ include file="/common/admin/header.jsp"%>--%>
<%--<%@ include file="/common/admin/menu.jsp"%>--%>
<%--<dec:body/>--%>
<%--<%@ include file="/common/admin/footer.jsp"%>--%>
    <%@ include file="/common/web/header.jsp"%>
    <div class="container">
        <dec:body/>
    </div>
    <%@ include file="/common/web/footer.jsp"%>
</body>
</html>
