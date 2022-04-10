<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
<c:url var="requestUrl" value="/admin-guideline-listen-list.html"/>
<html>
<head>
    <title><fmt:message key="label.guideline.listen.list" bundle="${lang}"/></title>
</head>
<body>
<div class = "main-content">
    <div class="main-content-inner">
        <div class="breadcrumbs" id="breadcrumbs">
            <script type="text/javascript">
                try{ace.settings.check('breadcrumbs', 'fixed')}catch (e){}
            </script>
            <ul class="breadcrumbs">
                <li>
                    <i class="ace-icon fa fa-home home-icon"></i>
                    <a href="#"><fmt:message key="label.home" bundle="${lang}"/></a>
                </li>
                <li class="active"><fmt:message key="label.guideline.listen.list" bundle="${lang}"/></li>
            </ul>
        </div>
        <div class="page-content">
            <div class="row">
                <div class="col-xs-12">
                    <div class="table-responsive">
                        <fmt:bundle basename="ApplicationResource">
                            <display:table id="tableList" name="items.listResult" partialList="true" size="${items.totalItems}"
                            pagesize="${items.maxPageItems}" sort="external" requestURI="${requestUrl}"
                            class="table table-fcv-ace table -striped table-bordered table-hover dataTable no-footer"
                            style="margin: 3em 0 1.5em;">
                                <display:column property="title" titleKey="lable.guideline.listen.title" sortable="true" sortName="title"/>
                                <display:column property="content" titleKey="lable.guideline.listen.content" sortable="true" sortName="content"/>
                            </display:table>
                        </fmt:bundle>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
