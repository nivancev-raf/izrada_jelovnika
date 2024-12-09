
// Animation observer
document.addEventListener("DOMContentLoaded", function () {
    // Postojeći reveal kod
    const revealElements = document.querySelectorAll('.hero-section, .service-display, .content-section, .footer-section');

    const observer = new IntersectionObserver((entries, observer) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                entry.target.classList.add('active');
                observer.unobserve(entry.target);
            }
        });
    }, { threshold: 0.1 });

    revealElements.forEach(element => {
        element.classList.add('reveal');
        observer.observe(element);
    });

    // Mobile menu functionality
    const menuToggle = document.querySelector('.menu-toggle');
    const mobileNav = document.querySelector('.mobile-nav');
    const overlay = document.querySelector('.overlay');

    menuToggle.addEventListener('click', function () {
        this.classList.toggle('active');
        mobileNav.classList.toggle('active');
        overlay.classList.toggle('active');
        document.body.style.overflow = mobileNav.classList.contains('active') ? 'hidden' : '';
    });

    overlay.addEventListener('click', function () {
        menuToggle.classList.remove('active');
        mobileNav.classList.remove('active');
        overlay.classList.remove('active');
        document.body.style.overflow = '';
    });

    const mobileLinks = mobileNav.querySelectorAll('a');
    mobileLinks.forEach(link => {
        link.addEventListener('click', function () {
            menuToggle.classList.remove('active');
            mobileNav.classList.remove('active');
            overlay.classList.remove('active');
            document.body.style.overflow = '';
        });
    });
});


document.addEventListener('DOMContentLoaded', (event) => {
    document.getElementById('contactForm').addEventListener('submit', function (e) {
        e.preventDefault();

        var formData = {
            name: this.name.value,
            email: this.email.value,
            subject: this.subject.value,
            message: this.message.value
        };
        console.log('Form data:', formData);

//http://localhost:8081/notifications/sendEmail

        // fetch('https://website-interior-design.onrender.com/notifications/sendEmail', {
        fetch('http://localhost:8081/notifications/sendEmail', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(formData)
        })
            .then(response => response.json())
            .then(data => {
                console.log('Success:', data);
                // Handle success here (e.g., showing a success message)
                // clear the form
                this.reset();

                // show a success message
                alert('Email je uspešno poslat!');
            })
            .catch((error) => {
                console.error('Error:', error);
                // Handle errors here (e.g., showing an error message)
            });
    });
});