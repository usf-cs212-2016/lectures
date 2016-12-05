# Login Demo

Demonstrates simple user registration, login, and session tracking via Jetty and MySQL. This is a simplified example, and **NOT** secure. A more realistic application would use security-specific libraries for hashing passwords and generating salts, HTTPS, better (more secure) session tracking, and employ more defenses against input validation attacks like XSS and SQL injection.

## Project Setup

Follow the other guides posted in class for setting up Jetty and JDBC, and to connect to the MySQL database on campus.

## Other Resources

- [Login Demo Videos](https://www.youtube.com/playlist?list=PLm6V-0HXZmF3iA7aZw7ueSWIgEahClJPb)
- [The Java Tutorials – Lesson: JDBC Basics](https://docs.oracle.com/javase/tutorial/jdbc/basics/index.html)

## Security Notes

Nothing we do regarding security will be effective unless we use encrypted communication between the client browser and the web server. For this, you should be using HTTPS instead of HTTP. 

Unless you are a security expert, I always recommend you use a package designed by security professionals for handling sensitive information (like username and passwords). However, there are some best practices guides out there. See the [OWASP](https://www.owasp.org/index.php/About_OWASP) [Password Storage Cheat Sheet](https://www.owasp.org/index.php/Password_Storage_Cheat_Sheet) for an example. 