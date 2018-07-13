<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<%@taglib prefix="rich" uri="http://richfaces.org/rich" %>
<%@taglib prefix="a4j" uri="http://richfaces.org/a4j" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consulta Filme</title>
</head>
<body>
	<f:view>
	  <jsp:include page="/menu.jsp"/>
	  <h:form id="formulario">
		<h:panelGrid columns="1">
			<h:messages />
		</h:panelGrid>
		
		<a4j:keepAlive beanName="cursoBacking" ajaxOnly="true"/>
        <rich:spacer height="30" />
        <rich:dataTable width="483" id="cursoList" rows="10" columnClasses="col"
            value="#{cursoBacking.listaCurso}" var="curso">
            <f:facet name="header">
                <rich:columnGroup>
                    <h:column>
                        <h:outputText styleClass="headerText" value="Código" />
                    </h:column>
                    <h:column>
                        <h:outputText styleClass="headerText" value="Nome" />
                    </h:column>
                    <h:column>
                        <h:outputText styleClass="headerText" value="Horas" />
                    </h:column>
                </rich:columnGroup>
            </f:facet>

            <h:column>
                <h:outputText value="#{curso.codigo}" />
            </h:column>
            <h:column>
                <h:outputText value="#{curso.nome}" />
            </h:column>
            <h:column>
                <h:outputText value="#{curso.horas}" />
            </h:column>

        </rich:dataTable>
        <rich:datascroller align="left" for="cursoList" maxPages="20"
            page="#{cursoBacking.scrollerPage}" id="sc2" reRender="cursoList" 
            />
    </h:form>
  </f:view>  
 </body>
</html>