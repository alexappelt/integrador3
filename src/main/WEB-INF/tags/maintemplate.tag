<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="tag"%>

<%@ attribute name="title" required="true"%>

<html>

    <body>
        <tag:menu title="<%= title %>" />
        <div class="container mt-5">
            <jsp:doBody/>
        </div>
    </body>
    <tag:footer />
</html>