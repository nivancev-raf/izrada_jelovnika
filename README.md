# Professional Menus Website

**Professional Menus** is a modern, responsive website designed to showcase high-quality, customizable restaurant menus. The website provides an elegant and user-friendly interface that allows users to explore various menu designs and request personalized menu solutions. Built with a focus on performance and usability, the website utilizes HTML, CSS, and JavaScript for frontend development. Additionally, a backend service built with Java Spring Boot handles inquiries and customer requests.

## Project Overview

The **Professional Menus** website serves as a platform for restaurants and businesses to discover, preview, and order customized menus. It offers a seamless browsing experience with a mobile-first design, ensuring accessibility on all devices. The backend system manages user inquiries and facilitates communication with potential clients.

### Key Features:
- **Responsive Design**: Fully optimized for all screen sizes, from mobile to desktop.
- **Interactive UI**: Smooth transitions, animations, and an intuitive navigation system.
- **Java Spring Boot Backend**: Handles customer inquiries and requests.
- **High-Quality Visuals**: Showcases professional menu designs with high-resolution images.

## Technologies Used

- **Frontend**:
  - HTML5
  - CSS3
  - JavaScript (ES6+)
  - Bootstrap (optional)
- **Backend**:
  - Java Spring Boot
- **DevOps**:
  - Docker (for containerization and deployment)

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Docker
- Web browser (Chrome, Firefox, etc.)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/nivancev-raf/izrada_jelovnika.git
   ```

2. Navigate to the project directory:
   ```bash
   cd izrada_jelovnika
   ```

3. **Run the Frontend**:
   - Open `index.html` in your preferred web browser to view the website.

4. **Run the Backend Inquiry Service**:
   - Ensure Docker is installed and running on your machine.
   - Build and start the Docker container for the Spring Boot service:
     ```bash
     docker build -t profesionalni_jelovnici .
     docker run -d -p 8080:8080 profesionalni_jelovnici
     ```

5. Access the website through your browser and test the inquiry submission feature.

### Usage

- **Explore Menu Designs**: Browse a collection of customizable menu templates.
- **Submit Inquiries**: Contact the service provider directly through the website’s inquiry form.
- **Mobile-Friendly Experience**: Enjoy a seamless experience across different devices.

## Contact
For any questions or feedback, please reach out to [nivancev02@gmail.com](mailto:your-email@example.com).

