<%@ page pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Kết quả</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body>

    <div class="container">
        <nav class="navbar navbar-expand-lg bg-body-tertiary">
            <div class="container-fluid">
                <a class="navbar-brand" href="index">LAB 2</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link" href="tam-giac">Tính diện tích và chu vi hình tam giác</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="dang-ky">Đăng ký</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="hit-counter">Hit Counter</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <div class="container">
            <h3>Thông tin đăng ký</h3>
            <ul class="list-group">
                <li class="list-group-item">Tên đăng nhập: <b>${param.username}</b></li>
                <li class="list-group-item">Mật khẩu: <b>${param.password}</b></li>
                <li class="list-group-item">Giới tính: <b>${param.gender}</b></li>
                <li class="list-group-item">Tình trạng hôn nhân: <b>${param.married}</b></li>
                <li class="list-group-item">Quốc tịch: <b>${param.country}</b></li>
                <c:if test="${not empty param.hobbies}">
                    <li class="list-group-item">Sở thích:
                        <c:forEach items="${paramValues.hobbies}" var="hobby">
                            <b>${hobby}</b>
                        </c:forEach>
                    </li>
                </c:if>
                <li class="list-group-item">Ghi chú: <b>${param.notes}</b></li>
            </ul>
        </div>
        
    </div>

    <!-- Bootstrap Bundle with Popper.js -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>

</html>
