# BASE PROJECT - ĐỀ THI CUỐI MÔN MICROSERVICES SYSTEM DESIGN (ĐỀ 002 - MỨC ĐỘ VỪA PHẢI / ĐƠN GIẢN)

Dự án này chứa mã nguồn cơ sở cho bài thi Hệ Thống Quản Lý Mượn Sách Thư Viện (`Library Management System`).

## Cấu trúc dự án Microservices:
1. `eureka-server` (Port 8761): Service Registry (Đã cấu hình sẵn)
2. `api-gateway` (Port 8080): Cổng API Gateway định tuyến request (Đã cấu hình sẵn)
3. `book-service` (Port 8081): Dịch vụ quản lý thông tin sách & Caching Redis
4. `borrow-service` (Port 8082): Dịch vụ mượn sách, gọi `book-service` qua OpenFeign & phát sự kiện Kafka
5. `notification-service` (Port 8083): Dịch vụ nhận sự kiện Kafka & gửi thông báo

## Hướng dẫn các phần thí sinh cần thực hiện:

### 1. `borrow-service`:
- Trong class `BorrowServiceImpl.java`:
  - Gọi `BookClient` lấy thông tin sách.
  - Kiểm tra xem sách có sẵn không (`availableQuantity > 0`). Nếu sập dịch vụ trả về lỗi 503, nếu hết sách trả về lỗi 400.
  - Lưu `BorrowRecord` vào Database.
  - Gọi `KafkaProducerService` để phát sự kiện.
- Trong class `KafkaProducerService.java`:
  - Hoàn thiện phương thức gửi message `studentEmail` đến topic `borrow-created`.

### 2. `book-service`:
- Trong class `BookServiceImpl.java`:
  - Thêm annotation `@Cacheable(value = "books", key = "#id")` trên phương thức `getBookById`.

### 3. `notification-service`:
- Trong class `NotificationConsumer.java`:
  - Khai báo `@KafkaListener(topics = "borrow-created")` lắng nghe sự kiện từ Kafka.
