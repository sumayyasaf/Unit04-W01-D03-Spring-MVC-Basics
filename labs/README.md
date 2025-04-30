## Lab: Build a Spring Boot Book List Web App

### Learning Objectives:
- Use Spring Initializr to create a Spring Boot project
- Create a model/entity class with at least 6 fields
- Set up a controller with an endpoint to pass data to a view
- Use Thymeleaf to display a list with conditional logic
- Style the view using CSS and apply classes conditionally

---

### Part 1: Set Up the Project

1. Visit [https://start.spring.io](https://start.spring.io)
2. Fill in:
   - **Group**: `com.example`
   - **Artifact**: `booklist`
3. Add dependencies:
   - **Spring Web**
   - **Thymeleaf**
4. Click **Generate**, unzip, and open the project in your IDE.

---

### Part 2: Create the Book Entity

- Inside a `model` package, create a `Book` class.
- This class should have **at least 6 fields**, such as:

  ```
  - title (String)
  - author (String)
  - year (int)
  - genre (String)
  - price (double)
  - inStock (boolean)
  ```

- Add a constructor and getters/setters.


---

### Part 3: Initialize the Book List in the Controller

1. Create a controller class (inside a `controller` package).
2. Add a method mapped to **GET `/books`**.
3. Inside this method, create a list of 8 books using this code snippet:

```java
List<Book> books = Arrays.asList(
    new Book("1984", "George Orwell", 1949, "Dystopian", 9.99, true),
    new Book("Brave New World", "Aldous Huxley", 1932, "Sci-Fi", 12.50, false),
    new Book("To Kill a Mockingbird", "Harper Lee", 1960, "Classic", 14.99, true),
    new Book("The Hobbit", "J.R.R. Tolkien", 1937, "Fantasy", 11.00, true),
    new Book("Fahrenheit 451", "Ray Bradbury", 1953, "Sci-Fi", 10.00, false),
    new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Classic", 13.25, true),
    new Book("Dracula", "Bram Stoker", 1897, "Horror", 8.75, false),
    new Book("The Catcher in the Rye", "J.D. Salinger", 1951, "Fiction", 10.99, true)
);
```

4. Add this book list as an attribute to the `Model` so it can be accessed in the view.

---

### Part 4: Create `book-list.html` Using Thymeleaf

In the `templates` folder, create an HTML page:

1. Use the `th:each` directive to loop through the list of books.
2. Use `th:if` and `th:unless` to display different messages or visuals depending on whether the book is in stock.
3. Display at least 5 fields of each book.

---

### Part 5: Create a CSS File

1. Create a `static/styles.css` file.
2. Style your book items with conditional formatting:
   - If the book is in stock, give it a green background.
   - If the book is not in stock, give it a red background.
3. Link your CSS file inside `book-list.html`.

---

### Testing Instructions

- Run your Spring Boot application.
- Go to: [http://localhost:8080/books](http://localhost:8080/books)
- You should see the styled list of books with visual differences based on their `inStock` value.
