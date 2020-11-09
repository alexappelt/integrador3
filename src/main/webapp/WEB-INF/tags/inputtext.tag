<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ attribute name="label" required="true"%>
<%@ attribute name="name" required="true"%>

<div class="form-group row">
    <label class="col-sm-3 text-right"> <c:out value="${label}" />: </label>
    <input class="col-sm-9 form-control" name="<c:out value="${name}" />" />

</div>