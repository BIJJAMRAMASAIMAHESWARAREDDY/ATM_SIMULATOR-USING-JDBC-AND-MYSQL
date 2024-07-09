# ATM_SIMULATOR-USING-JDBC-AND-MYSQL

# JDBC(JAVA DATABASE CONNECTIVITY) : 
1) JDBC (Java Database Connectivity) is an API (Application Programming Interface) in Java that defines how a client may access a database.
2) It provides methods for querying and updating data in a database, and it is part of the Java Standard Edition platform.

# JDBC Process Flow:

1. *Loading the JDBC Driver*: 
   - Before connecting to a database, the JDBC driver for the database must be loaded. This can be done using Class.forName("com.mysql.cj.jdbc.Driver"); for MySQL, for instance.

2. *Establishing a Connection*:
   - Using the DriverManager.getConnection(url, user, password); method, a connection to the database is established. The url specifies the database location, and user and password are the credentials.

3. *Creating a Statement*:
   - Once a connection is established, a Statement or PreparedStatement object is created. This object is used to execute SQL queries. Statement stmt = conn.createStatement(); or PreparedStatement pstmt = conn.prepareStatement(sql);.

4. *Executing a Query*:
   - Using the executeQuery() method for SELECT queries or executeUpdate() for INSERT, UPDATE, or DELETE queries, SQL statements are executed. For example, ResultSet rs = stmt.executeQuery("SELECT * FROM users");.

5. *Processing the Results*:
   - For queries that return results, the results are stored in a ResultSet object, which can be iterated to retrieve the data. while (rs.next()) { System.out.println(rs.getString("name")); }.

6. *Closing the Connection*:
   - Finally, the ResultSet, Statement, and Connection objects should be closed to free up resources. This can be done using rs.close();, stmt.close();, and conn.close();.

# APACHE XAMPP : 
  Apache XAMPP is a free and open-source cross-platform web server solution stack package developed by Apache Friends, consisting mainly of the Apache HTTP Server, MariaDB (or MySQL), and interpreters for scripts written in the PHP and Perl programming languages. It is an easy-to-install and use package for setting up a local web server for development and testing purposes.

### Key Components of XAMPP:

1. *Apache*:
   - The Apache HTTP Server is a widely used web server software that serves web pages over the Internet. It is included in XAMPP to handle web requests and serve web pages.

2. *MariaDB/MySQL*:
   - MariaDB is a popular open-source relational database management system that is a fork of MySQL. It is included in XAMPP to provide database functionalities for web applications.

3. *PHP*:
   - PHP is a server-side scripting language designed for web development. XAMPP includes the PHP interpreter to run PHP scripts on the server.

4. *Perl*:
   - Perl is a high-level, general-purpose, interpreted programming language. XAMPP includes Perl to allow for scripting and server-side programming.

### Installing XAMPP:

1. *Download XAMPP*:
   - Download the XAMPP installer for your operating system from the [official Apache Friends website](https://www.apachefriends.org/index.html).

2. *Run the Installer*:
   - Run the downloaded installer and follow the installation instructions. You can choose the components you want to install, such as Apache, MySQL, PHP, and Perl.

3. *Start XAMPP*:
   - After installation, open the XAMPP Control Panel. From here, you can start and stop the Apache and MySQL services, among others.

4. *Testing the Installation*:
   - Open a web browser and navigate to http://localhost/. You should see the XAMPP welcome page, indicating that the installation was successful.

### Using XAMPP:

1. *Creating a Database*:
   - Open the XAMPP Control Panel and start the MySQL service.
   - Click on the "Admin" button next to MySQL to open phpMyAdmin, a web-based database management tool.
   - Use phpMyAdmin to create and manage your databases.

2. *Deploying Web Applications*:
   - Place your web application files (HTML, PHP, etc.) in the htdocs directory inside the XAMPP installation folder (e.g., C:\xampp\htdocs on Windows).
   - Access your web application by navigating to http://localhost/your-app-folder/ in a web browser.

3. *Configuration*:
   - Configuration files for Apache, PHP, and MySQL can be found in the XAMPP installation folder.
   - Common configuration tasks include setting up virtual hosts, changing the default port, and modifying PHP settings.

### Example:

Suppose you have a PHP file named index.php that you want to run on your local XAMPP server. Follow these steps:

1. Place index.php in the htdocs directory (e.g., C:\xampp\htdocs\index.php).
2. Start Apache from the XAMPP Control Panel.
3. Open a web browser and navigate to http://localhost/index.php.

If everything is set up correctly, the browser will execute the PHP script and display the output.

