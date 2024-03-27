<%@ page pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Chào mừng</title>
    <!-- Link CSS của Bootstrap 5 -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="row justify-content-center mt-5">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-body">
                        <h1 class="card-title text-center mb-4">Chào mừng <%= session.getAttribute("username") %></h1>
                        <p class="card-text">Bạn đã đăng nhập thành công!</p>
                        <a href="logout" class="btn btn-danger">Đăng xuất</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Link JS của Bootstrap 5 -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
