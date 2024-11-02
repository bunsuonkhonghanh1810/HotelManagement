var ctx = document.getElementById("myPieChart").getContext("2d");
var myPieChart = new Chart(ctx, {
    type: "pie", // Loại biểu đồ là "pie" (biểu đồ tròn)
    data: {
        labels: ["Quảng cáo", "Lượt khách", "Dịch vụ"], // Các nhãn cho biểu đồ tròn
        datasets: [
            {
                data: [18, 53, 29], // Dữ liệu cho biểu đồ
                backgroundColor: ["#FF6384", "#36A2EB", "#FFCE56"], // Màu sắc cho mỗi phần
                hoverBackgroundColor: ["#FF6384", "#36A2EB", "#FFCE56"],
            },
        ],
    },
    options: {
        responsive: false, // Tắt responsive để Chart.js không ghi đè kích thước
        maintainAspectRatio: true, // Giữ đúng tỷ lệ khung hình
        plugins: {
            legend: {
                position: "left", // Chú giải sẽ xuất hiện ở bên trái biểu đồ (ngang)
                labels: {
                    boxWidth: 40, // Kích thước hộp màu
                    padding: 60, // Khoảng cách giữa các chú giải
                    font: {
                        size: 50,
                    },
                },
            },
        },
    },
});
// SỐ KHÁCH TRONG TUẦN
var ctx = document.getElementById("myBarChart").getContext("2d");
var myBarChart = new Chart(ctx, {
    type: "bar", // Loại biểu đồ là "bar" (biểu đồ cột)
    data: {
        labels: ["Thứ 2", "Thứ 3", "Thứ 4", "Thứ 5", "Thứ 6", "Thứ 7", "Chủ nhật"], // Các nhãn
        datasets: [
            {
                label: "Số khách trong tuần",
                data: [65, 59, 90, 81, 56, 155, 190], // Dữ liệu cho biểu đồ
                backgroundColor: [
                    "rgba(255, 99, 132, 0.2)",
                    "rgba(54, 162, 235, 0.2)",
                    "rgba(255, 206, 86, 0.2)",
                    "rgba(75, 192, 192, 0.2)",
                    "rgba(153, 102, 255, 0.2)",
                    "rgba(255, 159, 64, 0.2)",
                    "rgba(25, 259, 64, 0.2)",
                ],
                borderColor: [
                    "rgba(255, 99, 132, 1)",
                    "rgba(54, 162, 235, 1)",
                    "rgba(255, 206, 86, 1)",
                    "rgba(75, 192, 192, 1)",
                    "rgba(153, 102, 255, 1)",
                    "rgba(255, 159, 64, 1)",
                    "rgba(25, 259, 64, 1)",
                ],
                borderWidth: 1, // Độ rộng của đường viền cột
            },
        ],
    },
    options: {
        scales: {
            y: {
                beginAtZero: true, // Bắt đầu trục y từ số 0
            },
        },
    },
});
// SEARCH TRAFFIC
var ctx = document.getElementById("myMultiLineChart").getContext("2d");
var myMultiLineChart = new Chart(ctx, {
    type: "line", // Loại biểu đồ là "line"
    data: {
        labels: ["January", "February", "March", "April", "May", "June"], // Nhãn cho trục X
        datasets: [
            {
                label: "Total Impressions",
                data: [65, 59, 80, 81, 56, 55], // Dữ liệu cho đường thứ 1
                fill: false,
                borderColor: "rgba(255, 99, 132, 1)", // Màu cho đường thứ 1
                tension: 0.1,
            },
            {
                label: "Total Clicks",
                data: [28, 48, 40, 19, 86, 27], // Dữ liệu cho đường thứ 2
                fill: false,
                borderColor: "rgba(54, 162, 235, 1)", // Màu cho đường thứ 2
                tension: 0.1,
            },
            {
                label: "Unique Visitors from Search",
                data: [18, 48, 77, 9, 100, 43], // Dữ liệu cho đường thứ 3
                fill: false,
                borderColor: "rgba(75, 192, 192, 1)", // Màu cho đường thứ 3
                tension: 0.1,
            },
        ],
    },
    options: {
        scales: {
            y: {
                beginAtZero: true, // Bắt đầu trục Y từ 0
            },
        },
    },
});
// TỔNG DOANH THU
var ctx = document.getElementById("Tdoanhthu").getContext("2d");
var myLineChart = new Chart(ctx, {
    type: "line", // Loại biểu đồ là "line" (biểu đồ đường)
    data: {
        labels: ["January", "February", "March", "April", "May", "June"], // Các nhãn
        datasets: [
            {
                label: "Doanh thu theo tháng",
                data: [20, 59, 43, 71, 56, 65], // Dữ liệu cho biểu đồ
                fill: false, // Không tô màu dưới đường
                borderColor: "rgba(75, 192, 192, 1)", // Màu của đường
                tension: 0.1, // Độ cong của đường
            },
        ],
    },
    options: {
        scales: {
            y: {
                beginAtZero: true, // Bắt đầu trục y từ số 0
            },
        },
    },
});
var ctx = document.getElementById("allKhach").getContext("2d");
var myLineChart = new Chart(ctx, {
    type: "line", // Loại biểu đồ là "line" (biểu đồ đường)
    data: {
        labels: ["January", "February", "March", "April", "May", "June"], // Các nhãn
        datasets: [
            {
                label: "Tất cả lượng khách hàng",
                data: [105, 256, 180, 281, 275, 315], // Dữ liệu cho biểu đồ
                fill: false, // Không tô màu dưới đường
                borderColor: "rgba(75, 192, 192, 1)", // Màu của đường
                tension: 0.1, // Độ cong của đường
            },
        ],
    },
    options: {
        scales: {
            y: {
                beginAtZero: true, // Bắt đầu trục y từ số 0
            },
        },
    },
});
// NHẬP HÀNG
var ctx = document.getElementById("Nhaphang").getContext("2d");
var myBarChart = new Chart(ctx, {
    type: "bar", // Loại biểu đồ là "bar" (biểu đồ cột)
    data: {
        labels: ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"], // Các nhãn
        datasets: [
            {
                label: "Lượng nhập hàng trong năm",
                data: [65, 159, 180, 105, 256, 155, 394, 255, 206, 305, 283, 194], // Dữ liệu cho biểu đồ
                backgroundColor: [
                    "rgba(255, 99, 132, 0.2)",
                    "rgba(54, 162, 235, 0.2)",
                    "rgba(255, 206, 86, 0.2)",
                    "rgba(75, 192, 192, 0.2)",
                    "rgba(153, 102, 255, 0.2)",
                    "rgba(390, 159, 64, 0.2)",
                    "rgba(35, 259, 64, 0.2)",
                    "rgba(28, 95, 189, 0.2)",
                    "rgba(43, 120, 100, 0.2)",
                    "rgba(255, 159, 643, 0.2)",
                    "rgba(189, 149, 64, 0.2)",
                    "rgba(25, 159, 164, 0.2)",
                ],
                borderColor: [
                    "rgba(255, 99, 132, 1)",
                    "rgba(54, 162, 235, 1)",
                    "rgba(255, 206, 86, 1)",
                    "rgba(75, 192, 192, 1)",
                    "rgba(153, 102, 255, 1)",
                    "rgba(255, 159, 64, 1)",
                    "rgba(35, 259, 64, 1)",
                    "rgba(28, 95, 189, 1)",
                    "rgba(43, 120, 100, 1)",
                    "rgba(255, 159, 643, 1)",
                    "rgba(189, 149, 64, 1)",
                    "rgba(25, 159, 164, 1)",
                ],
                borderWidth: 1, // Độ rộng của đường viền cột
            },
        ],
    },
    options: {
        scales: {
            y: {
                beginAtZero: true, // Bắt đầu trục y từ số 0
            },
        },
    },
});
// XUẤT HÀNG
var ctx = document.getElementById("Xuathang").getContext("2d");
var myBarChart = new Chart(ctx, {
    type: "bar", // Loại biểu đồ là "bar" (biểu đồ cột)
    data: {
        labels: ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"], // Các nhãn
        datasets: [
            {
                label: "Lượng xuất hàng trong năm",
                data: [65, 159, 180, 105, 256, 155, 394, 255, 206, 305, 283, 194], // Dữ liệu cho biểu đồ
                backgroundColor: [
                    "rgba(255, 99, 132, 0.2)",
                    "rgba(54, 162, 235, 0.2)",
                    "rgba(255, 206, 86, 0.2)",
                    "rgba(75, 192, 192, 0.2)",
                    "rgba(153, 102, 255, 0.2)",
                    "rgba(390, 159, 64, 0.2)",
                    "rgba(35, 259, 64, 0.2)",
                    "rgba(28, 95, 189, 0.2)",
                    "rgba(43, 120, 100, 0.2)",
                    "rgba(255, 159, 643, 0.2)",
                    "rgba(189, 149, 64, 0.2)",
                    "rgba(25, 159, 164, 0.2)",
                ],
                borderColor: [
                    "rgba(255, 99, 132, 1)",
                    "rgba(54, 162, 235, 1)",
                    "rgba(255, 206, 86, 1)",
                    "rgba(75, 192, 192, 1)",
                    "rgba(153, 102, 255, 1)",
                    "rgba(255, 159, 64, 1)",
                    "rgba(35, 259, 64, 1)",
                    "rgba(28, 95, 189, 1)",
                    "rgba(43, 120, 100, 1)",
                    "rgba(255, 159, 643, 1)",
                    "rgba(189, 149, 64, 1)",
                    "rgba(25, 159, 164, 1)",
                ],
                borderWidth: 1, // Độ rộng của đường viền cột
            },
        ],
    },
    options: {
        scales: {
            y: {
                beginAtZero: true, // Bắt đầu trục y từ số 0
            },
        },
    },
});
// SỐ LƯỢNG ĐẶT PHÒNG TRÊN WEBSITE
var ctx = document.getElementById("Datweb").getContext("2d");
var myBarChart = new Chart(ctx, {
    type: "bar", // Loại biểu đồ là "bar" (biểu đồ cột)
    data: {
        labels: ["January", "February", "March", "April", "May", "June"], // Các nhãn
        datasets: [
            {
                label: "Doanh thu theo tháng",
                data: [65, 59, 80, 81, 56, 55], // Dữ liệu cho biểu đồ
                backgroundColor: [
                    "rgba(255, 99, 132, 0.2)",
                    "rgba(54, 162, 235, 0.2)",
                    "rgba(255, 206, 86, 0.2)",
                    "rgba(75, 192, 192, 0.2)",
                    "rgba(153, 102, 255, 0.2)",
                    "rgba(255, 159, 64, 0.2)",
                ],
                borderColor: [
                    "rgba(255, 99, 132, 1)",
                    "rgba(54, 162, 235, 1)",
                    "rgba(255, 206, 86, 1)",
                    "rgba(75, 192, 192, 1)",
                    "rgba(153, 102, 255, 1)",
                    "rgba(255, 159, 64, 1)",
                ],
                borderWidth: 1, // Độ rộng của đường viền cột
            },
        ],
    },
    options: {
        scales: {
            y: {
                beginAtZero: true, // Bắt đầu trục y từ số 0
            },
        },
    },
});
// SỐ LƯỢNG ĐẶT PHÒNG TRỰC TIẾP
var ctx = document.getElementById("Tructiep").getContext("2d");
var myBarChart = new Chart(ctx, {
    type: "bar", // Loại biểu đồ là "bar" (biểu đồ cột)
    data: {
        labels: ["January", "February", "March", "April", "May", "June"], // Các nhãn
        datasets: [
            {
                label: "Doanh thu theo tháng",
                data: [65, 59, 80, 81, 56, 55], // Dữ liệu cho biểu đồ
                backgroundColor: [
                    "rgba(255, 99, 132, 0.2)",
                    "rgba(54, 162, 235, 0.2)",
                    "rgba(255, 206, 86, 0.2)",
                    "rgba(75, 192, 192, 0.2)",
                    "rgba(153, 102, 255, 0.2)",
                    "rgba(255, 159, 64, 0.2)",
                ],
                borderColor: [
                    "rgba(255, 99, 132, 1)",
                    "rgba(54, 162, 235, 1)",
                    "rgba(255, 206, 86, 1)",
                    "rgba(75, 192, 192, 1)",
                    "rgba(153, 102, 255, 1)",
                    "rgba(255, 159, 64, 1)",
                ],
                borderWidth: 1, // Độ rộng của đường viền cột
            },
        ],
    },
    options: {
        scales: {
            y: {
                beginAtZero: true, // Bắt đầu trục y từ số 0
            },
        },
    },
});
