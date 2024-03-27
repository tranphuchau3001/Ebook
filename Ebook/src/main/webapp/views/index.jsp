<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="#">Nhà Sách Miễn Phí</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <form class="d-flex" role="search">
                            <input class="form-control me-2" type="search" placeholder="Tìm kiếm sách" aria-label="Search" style="width: 350px;">
                            <button class="btn btn-outline-success" type="submit">Tìm kiếm</button>
                        </form>
                    </li>
                </ul>
                <ul class="navbar-nav ms-auto">
                    
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="index">Trang chủ</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Tác giả</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Thể loại</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Liên hệ</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="login">Đăng nhập</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Đăng ký</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Header -->
    <header class="bg-light p-5 text-center">
        <div class="container">
            <h1 class="fw-bolder">Nhà Sách Miễn Phí</h1>
            <p class="lead fw-normal">Đọc sách trực tuyến với hàng ngàn tác phẩm đa dạng</p>
        </div>
    </header>

    <!-- Danh sách sách -->
    <section class="py-5">
        <div class="container">
            <h2 class="fw-bolder mb-4">Sách mới</h2>
            <div class="row">
                <div class="col-lg-3 col-md-6 mb-4">
                    <div class="card h-100">
                        <img src="https://via.placeholder.com/300" class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title">Tên sách</h5>
                            <p class="card-text">Mô tả sách ngắn gọn</p>
                        </div>
                        <div class="card-footer text-end">
                            <a href="#" class="btn btn-primary">Đọc ngay</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- Footer -->
    <footer class="bg-dark text-light py-4">
        <div class="container text-center">
            <p class="mb-0">&copy; 2024 Nhà Sách Miễn Phí. All rights reserved.</p>
        </div>
    </footer>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
