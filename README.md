# Basic Spring Boot Hello World (Dockerized)

## 🚀 Project Overview
This is a simple **Spring Boot 3** application that runs inside a **Docker container**. It exposes a basic REST API that returns a "Hello, World" message.

## 🛠 Tech Stack
- **Java 19**
- **Spring Boot 3**
- **Maven 3**
- **Docker**

## 📂 Project Structure
```

```

## 🚀 Getting Started

### 1️⃣ Clone the Repository
```sh
git clone https://github.com/yourusername/springboot-hello-world.git
cd springboot-hello-world
```

### 2️⃣ Build and Run with Docker
```sh
# Build the Docker image
docker build -t springboot-hello-world .

# Run the container
docker run -p 8080:8080 springboot-hello-world
```

### 3️⃣ Run with Docker Compose (Optional)
```sh
docker-compose up --build
```

### 4️⃣ Test the API
Once the container is running, open your browser or use Postman/cURL:
```sh
curl http://localhost:8080/api/hello
```
Expected output:
```
Hello, World from Dockerized Spring Boot!
```

## 🎯 Next Steps
- Add more REST endpoints
- Implement database integration
- Deploy the container to Kubernetes

## 📜 License
This project is open-source under the **MIT License**.

---
**Happy Coding! 🚀**

