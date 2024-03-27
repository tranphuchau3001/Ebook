<%@ page pageEncoding="utf-8" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Đăng ký</title>

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

            <form action="dang-ky" method="post" class="w-50">
                <div class="mb-3">
                    <label for="username" class="form-label">Tên đăng nhập:</label>
                    <input type="text" name="username" id="username" class="form-control" required>
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Mật khẩu:</label>
                    <input type="password" name="password" id="password" class="form-control" required>
                </div>
                <div class="mb-3">
                    <label for="gender" class="form-label">Giới tính:</label>
                    <input type="radio" name="gender" value="true" checked > Nam
                    <input type="radio" name="gender" value="false"> Nữ
                </div>
                <div class="mb-3">
                    <label for="married" class="form-label">Đã có gia đình:</label>
                    <input name="married" type="checkbox">
                </div>
                <div class="mb-3">
                    <label for="country" class="form-label">Quốc tịch:</label>
                    <select name="country">
                        <option value="VN">Việt Nam</option>
                        <option value="US">United States</option>
                    </select>
                </div>
                <div class="mb-3">
                    <label class="form-label">Sở thích:</label><br>
                    <input name="hobbies" type="checkbox" value="R"> Đọc sách<br>
                    <input name="hobbies" type="checkbox" value="T"> Du lịch<br>
                    <input name="hobbies" type="checkbox" value="M"> Âm nhạc<br>
                    <input name="hobbies" type="checkbox" value="O"> Khác<br>
                </div>
                <div class="mb-3">
                    <label for="notes" class="form-label">Ghi chú:</label>
                    <textarea name="notes" rows="3" cols="30" class="form-control"></textarea>
                </div>
                <div class="mb-3">
                    <button formaction="ket-qua" class="btn btn-primary">Đăng ký</button>
                </div>
            </form>

        </div>


        <!-- Bootstrap Bundle with Popper.js -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

    </body>

    </html>