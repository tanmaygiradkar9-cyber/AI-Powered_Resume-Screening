# AI-Powered Resume Analyzer

An AI-powered Resume Analyzer developed using Java Full Stack technologies. The application helps users analyze their resumes and receive AI-generated feedback and suggestions for improvement.

## About the Project

The AI-Powered Resume Analyzer is designed to help job seekers improve their resumes using Artificial Intelligence. It uses Ollama for local AI model integration and MySQL for database management.

## Tech Stack

### Backend
- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- REST APIs

### Frontend
- React.js
- JavaScript
- HTML5
- CSS3

### Database
- MySQL

### AI Integration
- Ollama
- Llama 3.2 (if this is the model configured in your project)

### Tools & Technologies
- Docker
- Git & GitHub
- Maven
- VS Code

## Features

- Resume Upload
- AI-Powered Resume Analysis
- Resume Content Evaluation
- AI-Generated Feedback and Suggestions
- User Authentication
- Database Management with MySQL
- Local AI Processing using Ollama

## Project Structure

```text
AI-Powered-Resume-Analyzer/
├── analyzer/       # Spring Boot Backend
├── frontend/       # React Frontend
├── storage/        # Resume File Storage
└── Dockerfile.frontend
```

## Installation & Setup

### 1. Clone Repository

```bash
git clone https://github.com/YOUR_USERNAME/AI-Powered-Resume-Analyzer.git
```

### 2. Backend Setup

```bash
cd analyzer
```

Configure MySQL database credentials in `application.yml`.

### 3. Start Ollama

Install Ollama and download the required model.

```bash
ollama pull llama3.2
```

Start Ollama:

```bash
ollama serve
```

### 4. Frontend Setup

```bash
cd frontend
npm install
npm run dev
```

### 5. Run Backend

Run the Spring Boot application using Maven or your IDE.

## Future Improvements

- Advanced Resume Scoring
- Job Description Matching
- Resume Improvement Recommendations
- Downloadable Analysis Reports

## Author

Tanmay Giradkar

---

⭐ If you find this project useful, don't forget to give it a star!
