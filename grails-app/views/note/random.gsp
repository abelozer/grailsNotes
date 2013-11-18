<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>Random Note</title>
    <g:javascript library="jquery" />
</head>
<body>
<ul id="menu">
    <li><g:remoteLink action="ajaxRandom" update="note">
        Next Note
    </g:remoteLink>
    </li>
    <li><g:link action="list">
        Admin
    </g:link>
    </li>
</ul>
<div id="note">
    <q>${note.content}</q>
    <p>${note.author}</p>
</div>
</body>
</html>