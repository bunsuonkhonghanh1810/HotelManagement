document.querySelectorAll('.carousel-nav .carousel-cell1').forEach(cell => {
    cell.addEventListener('click', function() {
        // Bỏ chọn tất cả các ảnh nhỏ
        document.querySelectorAll('.carousel-nav .carousel-cell1').forEach(navCell => {
            navCell.classList.remove('is-selected');
        });

        // Chọn ảnh nhỏ đã click
        this.classList.add('is-selected');

        // Lấy chỉ số của ảnh nhỏ được chọn
        const index = this.getAttribute('data-index');

        // Bỏ chọn tất cả các ảnh lớn
        document.querySelectorAll('.carousel-main .carousel-cell').forEach(mainCell => {
            mainCell.classList.remove('is-selected');
            mainCell.setAttribute('aria-hidden', 'true');
        });

        // Hiện ảnh lớn tương ứng với ảnh nhỏ được chọn
        const selectedMainCell = document.querySelector(`.carousel-main .carousel-cell[data-index="${index}"]`);
        selectedMainCell.classList.add('is-selected');
        selectedMainCell.setAttribute('aria-hidden', 'false');
    });
});
